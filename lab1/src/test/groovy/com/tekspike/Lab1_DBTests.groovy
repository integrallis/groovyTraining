package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo
import com.tekspike.music.*

import com.tekspike.sql.MusicDBCaller

import static com.tekspike.music.MusicGenerator.generateTestData

/**
 * In Lab 1.3 our goal will be to store some music objects in the database
 * In the src folder com.tekspike.music you will notice an Album and Artist class. 
 * Also in the test case Lab1_3Tests we have referenced a MusicService. 
 * This service has methods that must be completed in order to make the tests pass. 
 * Follow the instructions on the method signatures.
 *
 * The database strucutre will be the same as the class Struture:
 *      Artists : name
 *      Albums : title, artist, genre
 */
class Lab1_DBTests extends Specification {
    
    def caller = new MusicDBCaller()
    
    def testInsertingIntoTheDatabase() {
      given :
        caller.createConnection()
        caller.createTables()
        
      and:
        def data = generateTestData()
        def testItem = data[0]
     
      when:
        caller.saveMusic(testItem)
        
      then :
        // check the database
        caller.sql.eachRow("SELECT * FROM Artists", { 
            assert it.name == testItem.artist.name
        })
        caller.sql.eachRow("SELECT * FROM Albums") { 
            assert it.artist == testItem.artist.name
            assert it.genre == testItem.genre?.toString()
            assert it.title == testItem.title
        }   
        
      cleanup:
        caller.closeConnection()     
    }
}