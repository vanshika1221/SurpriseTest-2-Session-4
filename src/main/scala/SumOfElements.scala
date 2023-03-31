package com.knoldus

class SumOfElements {
  // a method to calculate sum of elements iof list of type Int
  def sumWithRecursion(listElements: List[Int],sum: Int = 0): Int = {
    // Match the input List against two cases
    listElements match {
      // If the List is empty (Nil), return the accumulator value
      case Nil => sum
      // If the List is not empty, then calculate the sum by calling the function tail recursively
      case firstElement :: restElements => sumWithRecursion(restElements, sum + firstElement)
    }
  }
}
