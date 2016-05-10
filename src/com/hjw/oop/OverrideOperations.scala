package com.hjw.oop

/**
  * Created by hjw on 16/5/10.
  */


class Person1(val name: String, var age: Int){
  println("The primary constructor of Person1")

  val school = "BJU"

  def sleep = "8 hours"

  override def toString = "I am a Person!" + name + "\t" + age + "\t"  + school + "\t" + sleep
}

class Worker(name : String, age : Int, val salary : Long) extends Person1(name,age){
  println("This is the subClass of Person, Primary constructor of Worker")

  override val school = "Spark"
  // 继承了父类的成员
  override def toString = "I am a Worker!" + name + "\t" + age + "\t"  + school + "\t" + sleep + "\t" + salary
}


class OverrideOperations {

}

object OverrideOperations {
  def main(args: Array[String]) {

    val p = new Person1("hjw",12)
    // The primary constructor of Person1
    println(p.toString)
    // I am a Person!hjw	12	BJU	8 hours
    // p.school = "H"  val类型

    val w = new Worker("han",12,100000)
    //The primary constructor of Person1
    //This is the subClass of Person, Primary constructor of Worker
    println(w.toString)
    //I am a Worker!han	12	Spark	8 hours	100000

  }

}
