package com.tekspike

import spock.lang.Specification
import static spock.util.matcher.HamcrestMatchers.closeTo

class BasicExample extends Specification {
  
  def "test a basic example"() {      
    when :
      def x = 2 + 2
      
    and :
      x++
      
    then :
      assert x == 5
  }
  
  def "test fibonaci"() {    
    expect :
      result == Fibonacci.execute(number)
      
    where :
      result | number
      3 | 5
      8 | 7
      34 | 10 
  }
  
  def "test to small of a number"() {
    when : "fibonaci is executed"
      Fibonacci.execute(1)
      
    then : "throw an exception"
      thrown(RuntimeException)
  }
  
  // Borrwed from spock example
  def "comparing two decimal numbers"() {
    def myPi = 3.14

    expect:
    myPi closeTo(Math.PI, 0.01)
  }
}