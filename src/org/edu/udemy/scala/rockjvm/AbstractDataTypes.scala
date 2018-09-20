package org.edu.udemy.scala.rockjvm

/**
  * Created by felipe on 20/09/2018.
  */
object AbstractDataTypes extends App{

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }

  // traits

  trait ColdBlooded

  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "croc"
    override def eat: Unit = "nomnomnomnom"
    override def eat(animal: Animal): Unit = println(s"croc eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"
}
