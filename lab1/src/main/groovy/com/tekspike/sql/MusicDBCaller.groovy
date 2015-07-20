package com.tekspike.sql

import groovy.sql.Sql
import java.sql.*
import com.tekspike.music.*

class MusicDBCaller {
    def sql
    def protocol = "jdbc:derby:"
    static props = new Properties()
    static {
        props.put("user", "user1")
        props.put("password", "user1")
    }
//    def driver = DriverManager.getConnection("jdbc:derby:;shutdown=true")
    
    def createConnection() {
// initiate the instance
        sql.execute("drop table artists")
        sql.execute("drop table albums")        
    }
    
    def closeConnection() {
// create the close connection routie
    }
    
    def createTables() {
        sql.execute("create table artists(name VARCHAR(100))")        
        sql.execute("create table albums(title VARCHAR(100), artist VARCHAR(100), genre VARCHAR(100))")
    }
    
    def saveMusic(Album album) {
// TODO save an album
    }
    
    def saveMusic(List<Album> albums) {
// TODO Save all the albums
    }    
}