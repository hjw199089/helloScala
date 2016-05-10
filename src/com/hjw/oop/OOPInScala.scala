package com.hjw.oop

import com.hjw.hello.For_Function_Advanced

/**
  * Created by hjw on 16/5/9.
  */

//构造函数
class Teacher {
  var name: String = _
  //这里用占位符
  private var age = 27
  private[this] val gender = "male"

  //  构造函数
  def this(name: String) {
    this
    this.name = name
  }

  def sayHello(): Unit = {
    println(this.name + ":" + this.age + ":" + this.gender)
  }
}

//私有构造函数
class TeacherConstuct private(val name: String, val age: Int) {

  println("This is the primary constructor!!!")
  var gender: String = _

  def this(name: String, age: Int, gender: String) {
    this(name, age)

    this.gender = gender
  }
}

//内部类
class Outer(val name: String) {
  outer =>

  //内部类
  class Inner(val name: String) {
    def foo(b: Inner) = println("Outer: " + outer.name +
      "Inner: " + b.name)
  }

}


object OOPInScala {
  def main(args: Array[String]) {

    val p = new Teacher("Scala")
    //p.name = "Spark"
    p.sayHello()
    //Scala:27:male

    //val p0 = new TeacherConstuct("Spark", 5) // 错误 私有

    val p1 = new TeacherConstuct("Spark", 5, "man")
    println(p1.age + "\t" + p1.gender + "\t" + p1.name)
    //This is the primary constructor!!!
    //5	man	Spark

    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")
    // 注意内部类属于对象和java不同:java  outer1.new Inner("Scala")
    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer2.Inner("Java")
    inner1.foo(inner1)
    inner2.foo(inner2)
    //    Outer: SparkInner: Scala
    //    Outer: HadoopInner: Java

  }


}
