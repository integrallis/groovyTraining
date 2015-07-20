package com.tekspike.music

import static com.tekspike.music.Genre.ROCK
import static com.tekspike.music.Genre.RAP
import static com.tekspike.music.Genre.POP

class MusicGenerator {
    
    def static generateTestData() {
        def a = new Artist(name : 'Don McClean')
        def a1 = new Artist(name : 'Disturbed')        
        def a2 = new Artist(name : 'Shakira')
        def a3 = new Artist(name : 'Ice T')
        
        [
            new Album(artist : a, genre : ROCK, title : 'American Pie'),
            new Album(artist : a1, genre : ROCK, title : 'Believe'), 
            new Album(artist : a1, genre : ROCK, title : 'Indestructible'),             
            new Album(artist : a2, genre : POP, title : 'Laundry Service'), 
            new Album(artist : a3, genre : RAP, title : 'Home Invasion')
        ]
    }    
}