package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo

import com.tekspike.Lab1_0_Iterations

/**
 * Pick and use the correct collection iterator that will best solve each Spock test.
 *
 * The item marked "ADJUST" will be the item you have to mark.
 */
class Lab1_4Tests extends Specification {

    def list = [1,2,3,4,5]

    def test1() {
        when :
            int i = 0        
            // TODO iterate through each list adding to "i"
            list.each { i += it }
        then :
            i == 15
    }
    
    def test2() {
        when :
            // TODO iterate through each of them this time returning a list
            // that has multiplied each value by 2
            def result
            
        then :
            result == [2,4,6,8,10]
    }
    
    def test4() {
        when :
            // Iterate through the list, returning items in the list with a value greater than 2
            def result
            
        then :
            result == [3,4,5]
    }   
    
    def test5() {
        when :
            // iterate through the list
            // returning a summation of the values
            def i
            
        then :
            i == 15
    }     
    
    def test6() {
        when :
            // Find the max value in the list
            def i
            
        then :
            i == 5
    }
    
    def test7() {
        when :
            // Find the min value in the list
            def i
            
        then :
            i == 1
    }
    
    def test8() {
        when :
            // reutrn a string of all the values
            // with the items seperated by a comma
            def s
            
        then :
            s == "1,2,3,4,5"
    }            
}