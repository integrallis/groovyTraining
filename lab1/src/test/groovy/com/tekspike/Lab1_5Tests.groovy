package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo

import com.tekspike.Lab1_0_Iterations

/**
 * Extend Collections so that we can add a method to the class called “eachCollect”. 
 * Have this item call the closure we created in the previous lab so the end result is that we 
 * can put “eachCollect” on all the List/Maps and iterate through. 
 */
class Lab1_5Tests extends Specification {

    def testMetaClassing() {
      given :
        Lab1_0_Iterations.metaClassCollection()
        
      when :
        def list = [1,2,3]

      and :
        def result = list.eachCollect() {
            it * 2
        }

      then :
        assert result == [2,4,6]
    }
        
    def testMetaClassingWithAMap() {
      given :
        Lab1_0_Iterations.metaClassCollection()
        
      when :
        def map = [a:1, b:2, c:3]

      and : 
        def result = map.eachCollect() { key, value ->
            value * 2
        }

      then :
        assert result == [2,4,6]
    }    
}