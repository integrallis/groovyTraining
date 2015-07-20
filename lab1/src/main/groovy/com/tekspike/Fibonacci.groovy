package com.tekspike

/**
 * Lifted from : http://groovybargrill.wordpress.com/2008/12/09/fibonaccigroovy/
 */
class Fibonacci {
  // Keep adding the previous numbers together
  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
  public static execute(int num) {
    if (num < 2) throw new RuntimeException("Need at least 2 numbers to make it worth it")    
    def list = [0, 1]

    (num - 2).times {
      list << list.sum()
      list = list.tail()
    }
    println "the tail : " + list.tail()    
    println "the tail : " + list.tail().class
    
    list.tail()[0]
  }
}