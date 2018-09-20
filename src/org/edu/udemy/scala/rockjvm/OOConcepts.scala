package org.edu.udemy.scala.rockjvm

/**
  * Created by felipe on 20/09/2018.
  */
object OOConcepts extends App {

  //Static concept

  object Person {
    def race:String = "human"
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String, val age:Int = 0)


  val john = new Person("John", 25)
  val mary = new Person("Anne", 20)
  val brad = Person(mary, john)

  println(mary == john)

}
