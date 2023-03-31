package com.knoldus

object Driver extends App {
  val sumOfElementsObject = new SumOfElements
  val list = List(1,2,3,4)
  println(sumOfElementsObject.sumWithRecursion(list,0))
}