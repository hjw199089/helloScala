package com.hjw.oop

/**
  * Created by hjw on 16/5/7.
  */

class Person{
  //必须有初始值
  private var age = 0
  def increment(): Unit ={
    age += 1
  }
  def current = age


}

class Student{
  var age = 0;
}


class Scala(){
   private var privatAge = 0;
   val name = "Scala"
  // 手动get函数
   def age = privatAge
   def Scala(age: Int)   = {
     privatAge = age
   }
  //类的函数可以访问该类所有的[非自私有] 成员
   def isYounger(other:Scala) = privatAge < other.privatAge
 }


object HelloOOP {
  def main(args: Array[String]) {

    val person = new Person
    person.increment()
    person.increment()
    println(person.current)

   val student = new Student
    println(student.age)
    student.age = 10
    println(student.age)

    val scala  = new Scala
    println(scala.age)

    val scala_older = new Scala()
    println(scala_older.age)
     println(scala.isYounger(scala_older))



  }

}
