package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo
import static com.tekspike.music.MusicGenerator.generateTestData
import com.tekspike.music.*

/**
 * The MusicXMLGenerator will parse the Album classes into XML. 
 * Their are two methods to fill out parseAlbum and parseAlbums that need to be filled in to 
 * make the tests Lab1_4Tests.groovy to pass.
 *
 * <music>
 	<album>
        <artist name="[bandName]">
 		<name>[title]</name>
 		<genre>[genre]</genre>
 		<year>[year]</year>
 	</album>
 </music>
 *
 */
class Lab1_XMLTests extends Specification {
    
    MusicXMLGenerator generator = new MusicXMLGenerator()

    def testGenerateAlbumXML() {
      given :
        def data = generateTestData()        
        def testItem = data[0]
     
      when:
        def result = generator.generateAlbumXML(testItem)
        result = result.replaceAll('\n','')
        result = result.replaceAll(' ','')        
                
      then :
        // check the database 
        assert result == "<music><album><artistname='DonMcClean'/><name>AmericanPie</name><genre>ROCK</genre><year>2000</year></album></music>"
    }
    
    def testGenerateAlbumsXML() {
      given :
        def data = generateTestData()        
        def testItem = [data[0], data[1]]
     
      when:
        def result = generator.generateAlbumsXML(testItem)
        println " JOE :: $result"  
        result = result.replaceAll('\n','')
        result = result.replaceAll(' ','')        
        println " JOE :: $result"
                
      then :
        // check the database 
        assert result == "<music><album><artistname='DonMcClean'/><name>AmericanPie</name><genre>ROCK</genre><year>2000</year></album><album><artistname='Disturbed'/><name>Believe</name><genre>ROCK</genre><year>2000</year></album></music>"
    }    
}