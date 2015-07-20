package com.tekspike.music

class Album {
    String title
    Artist artist
    Genre genre
    int year = 2000
}

enum Genre { 
    RAP, ROCK, POP 

    static Genre find(String s) {
        Genre.values().find { it.toString() == s }
    }
}