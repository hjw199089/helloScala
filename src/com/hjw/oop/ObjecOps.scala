package com.hjw.oop

/**
  * Created by hjw on 16/5/9.
  */

class University{
  val id = University.newStudentNo
  private var number = 0
  def aClass(number: Int) =  {
    this.number += number
    this.number
  }
}


/*
object 是静态的,是镜像
 */
object University{
  private var studentNo = 0
  def newStudentNo = {
    studentNo += 1
    studentNo
  }
}

object ObjecOps {
  def main(args: Array[String]) {
    //静态的
    println(University.newStudentNo)
    println(University.newStudentNo)
    //1
    //2

    var uiv = new University
    println(uiv.id + "\t"+uiv.aClass(10) + "\t" )
    //3	10

  }


}
