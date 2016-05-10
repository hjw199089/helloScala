package com.hjw.oop

/**
  * Created by hjw on 16/5/10.
  */


class ApplyTest{
  def apply() = println("I am the class ApplyTest")

  def haveATry(): Unit ={
    println("Have a try on the class ApplyTest")
  }
}

object ApplyTest{

  def apply() = {
    println("I am the object ApplyTest")
    new ApplyTest //  返回一个class ApplyTest
  }
}





object ApplyOperation {
  def main(args: Array[String]) {
    val array= Array(1,2,3,4) // 这里使用伴生对象生成的

    //同理
    val a1 = ApplyTest()
    a1.apply()
    a1.haveATry()
    println("------------------------")
    val a2 = new ApplyTest()
    a2.haveATry()
   /*输出结果
    I am the object ApplyTest
    I am the class ApplyTest
    Have a try on the class ApplyTest
    ------------------------
    Have a try on the class ApplyTest
    */

  }

}
