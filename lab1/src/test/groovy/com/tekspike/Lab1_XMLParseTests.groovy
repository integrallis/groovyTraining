package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo
import com.tekspike.music.MusicXMLParser
import com.tekspike.music.Genre

/** 
 * The MusicXMLParser has the method on it parseXML. Parse the incoming XML, 
 * creating Album/Artist objects and return the parsed XML to pass the tests in Lab1_5Tests.groovy.
 */
 class Lab1_XMLParseTests extends Specification {
    
    MusicXMLParser parser = new MusicXMLParser()

    private static XML = """
        <music>
          <album>
            <artist name='Don McClean' />
            <name>American Pie</name>
            <genre>ROCK</genre>
            <year>2000</year>
          </album>
          <album>
            <artist name='Disturbed' />
            <name>Believe</name>
            <genre>ROCK</genre>
            <year>2000</year>
          </album>
        </music>
    """
    
    def testParseXML() {     
      when:
        def result = parser.parseXML(XML)
        
      then :
        // check the database 
        assert result[0].artist.name == 'Don McClean'
        assert result[0].title == 'American Pie'
        assert result[0].genre == Genre.ROCK
        assert result[0].year == 2000
        
        assert result[1].artist.name == 'Disturbed'
        assert result[1].title == 'Believe'
        assert result[1].genre == Genre.ROCK
        assert result[1].year == 2000        
    }
 }