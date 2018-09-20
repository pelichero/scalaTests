package org.edu.udemy.scala.rockjvm

/**
  * Created by felipe on 20/09/2018.
  */
object Inheritance extends App{

  class Animal{
    protected def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  class Person(name: String, age: Int){
    def this(name: String) = this(name,0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog extends Animal {
    override protected def eat: Unit = println("crunch, crunch")
  }

}
