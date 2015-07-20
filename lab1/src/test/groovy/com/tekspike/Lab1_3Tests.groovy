package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo

import static com.tekspike.Lab1_0_Iterations.eachCollect

/**
 * In this exercise we are going to create our own custom method that uses a closure. 
 * The method will iterate through a list, each time applying the closure and adding that item to a new list. 
 * This new list is then returned from the method.
 * The skeleton of the code is in Lab1_0_Iterations.eachCollect
 * The test case in Lab1_0Tests must pass to have the correct implementation.
 */
class Lab1_3Tests extends Specification {

    def testCustomIteration() {      
      when :
        def list = [1,2,3]

      and :
        def result = eachCollect(list) {
            it * 2
        }

      then :
        assert result == [2,4,6]
    }
}