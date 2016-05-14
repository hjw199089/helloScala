package com.hjw.oop

import scala.xml.dtd.ContentModel._labelT

/**
  * Created by hjw on 16/5/14.
  */


class AbstractClassOps{
  var id: Int = _
  // val id : Int = _ //error

}

abstract class SuperTeacher(val  name : String){
  //抽象变量不给出值
  var id : Int
  var age : Int

  val  title : String = "Teacher"

  //抽象方法不给出方法体
  def teach
}

class TeacherForMath(name : String ) extends SuperTeacher(name){
  override var id = name.hashCode
  override var age = 29
  override def teach: Unit ={
    println("I'm a Math Teacher and I teach Math")
  }
}



object AbstractClassOps {

  def main(args: Array[String]) {
    val teacher = new TeacherForMath("Spark")
    teacher.teach
    println("id:\t" + ":" + teacher.id)
    println(teacher.name + ":" + teacher.age)

  }

}
