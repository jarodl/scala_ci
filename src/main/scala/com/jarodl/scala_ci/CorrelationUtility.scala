package com.jarodl.scala_ci

import scala.Math.pow
import scala.Math.sqrt

object CorrelationUtility {

  // Returns a distance-based similarity score for person1 and person2
  def sim_distance(prefs: Map[String, Map[String, Double]],
    person1: String, person2: String): Double = {
    // Get the list of shared items
    val sharedItems = for {
      (item, value) <- prefs.get(person1).get
      if prefs.get(person2).get.contains(item)
    } yield item

    val squares = sharedItems map { value => 
      pow(prefs.get(person1).get.get(value).get - 
        prefs.get(person2).get.get(value).get, 2)
    }

    val sumOfSquares = squares.foldLeft(0.0) { (x, y) => x + y }

    return 1/(1 + sumOfSquares)
  }
}
