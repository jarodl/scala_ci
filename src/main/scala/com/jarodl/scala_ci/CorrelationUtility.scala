package com.jarodl.scala_ci

import scala.Math.pow
import scala.Math.sqrt

object CorrelationUtility {

  def get_shared_items(prefs: Map[String, Map[String, Double]],
    person1: String, person2: String): Iterable[String] = {
    val sharedItems = for {
      (item, value) <- prefs.get(person1).get
      if prefs.get(person2).get.contains(item)
    } yield item

    return sharedItems
  }

  // Returns a distance-based similarity score for person1 and person2
  def sim_distance(prefs: Map[String, Map[String, Double]],
    person1: String, person2: String): Double = {
    // Get the list of shared items
    val sharedItems = get_shared_items(prefs, person1, person2)

    val squares = sharedItems map { value => 
      pow(prefs.get(person1).get.get(value).get - 
        prefs.get(person2).get.get(value).get, 2)
    }

    val sumOfSquares = squares.foldLeft(0.0) { (x, y) => x + y }

    return 1/(1 + sumOfSquares)
  }

  // Returns the Pearson correlation coefficient for person1 and person2
  //def sim_pearson(prefs: Map[String, Map[String, Double]],
    //person1: String, person2: String): Double = {

    //val sharedItems = get_shared_items(prefs, person1, person2)

    //val p1Values = for {
      //item <- sharedItems
      //value = prefs.get(person1).get.get(item).get
    //} yield value

    //val p2Values = for {
      //item <- sharedItems
      //value = prefs.get(person2).get.get(item).get
    //} yield value

    //val p1Sum = p1Values.foldLeft(0.0) { (x, y) => x + y }
    //val p2Sum = p2Values.foldLeft(0.0) { (x, y) => x + y }

    //val p1Squares = p1Values.foldLeft(0.0) { (x, y) => x + pow(y, 2) }
    //val p2Squares = p2Values.foldLeft(0.0) { (x, y) => x + pow(y, 2) }

    //val mult = for(i <- 0 to p1Values.length - 1)
      //yield (p1Values(i) * p2Values(i))

    //val pSum = mult.foldLeft(0.0) { (x, y) => x + y }
    
    //val n = sharedItems.length
    //val num = pSum - (p1Sum*p2Sum/n)
    //val den = sqrt((p1Squares-pow(p1Sum, 2)/n)*(p2Squares-pow(p2Sum,2)/n))

    //if (den == 0) {
      //return 0
    //}

    //return num/den
  //}
}
