package com.jarodl.scala_ci

object Main {
  // A dictionary of movie critics and their ratings of a small
  // set of movies
  val critics = Map(
    "Lisa Rose" -> Map(
      "Lady in the Water" -> 2.5,
      "Snakes on a Plane" -> 3.5,
      "Just My Luck" -> 3.0,
      "Superman Returns" -> 3.5,
      "You, Me and Dupree" -> 2.5,
      "The Night Listener" -> 3.0),
    "Gene Seymour" -> Map(
      "Lady in the Water" -> 3.0,
      "Snakes on a Plane" -> 3.5,
      "Just My Luck" -> 1.5,
      "Superman Returns" -> 5.0,
      "You, Me and Dupree" -> 3.5,
      "The Night Listener" -> 3.0),
    "Michael Phillips" -> Map(
      "Lady in the Water" -> 2.5,
      "Snakes on a Plane" -> 3.0,
      "Superman Returns" -> 3.5,
      "The Night Listener" -> 4.0),
    "Claudia Puig" -> Map(
      "Just My Luck" -> 3.0,
      "Snakes on a Plane" -> 3.5,
      "Superman Returns" -> 4.0,
      "You, Me and Dupree" -> 2.5,
      "The Night Listener" -> 4.5),
    "Mick LaSalle" -> Map(
      "Lady in the Water" -> 3.0,
      "Just My Luck" -> 2.0,
      "Snakes on a Plane" -> 4.0,
      "Superman Returns" -> 3.0,
      "You, Me and Dupree" -> 2.0,
      "The Night Listener" -> 3.0),
    "Jack Matthews" -> Map(
      "Lady in the Water" -> 3.0,
      "Snakes on a Plane" -> 4.0,
      "Superman Returns" -> 5.0,
      "You, Me and Dupree" -> 3.5,
      "The Night Listener" -> 3.0),
    "Jarod" -> Map(
      "Lady in the Water" -> 1.0,
      "Snakes on a Plane" -> 3.2,
      "Superman Returns" -> 5.0,
      "You, Me and Dupree" -> 4.5)
  )

  def main(args: Array[String]) {
    println(CorrelationUtility.sim_distance(critics, "Lisa Rose", "Jarod"))
  }
}
