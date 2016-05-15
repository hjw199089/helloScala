package com.hjw.basic

import scala.io.Source

/**
  * Created by hjw on 16/5/14.
  */
object FunctionOps {
  def main(args: Array[String]) {

    // 函数调用
    val width = args(0).toInt
    for (arg <- args.drop(1))
      processData(arg, width)

    //函数是一等公民,函数变量,匿名函数
    var increase = (x: Int) => x + 1
    println(increase(10))

    increase = x => x * 100
    println(increase(1))


    val someNum = List(-11, -10, 1, 2, 3)
    someNum.foreach((x: Int) => print(x+"\t"))
    println
    someNum.filter((x: Int) => x > 0).foreach(x => print(x+"\t"))
    println
    someNum.filter(_ > 1).foreach(x => print(x+"\t"))

    println
    val f = (_: Int) + (_: Int)
    println(f(5,10))

  }

  /*
  读取文件filename中的每一行,若改行长度>width,则打印
   */
  def processData(filename: String, width: Int): Unit = {

    //=========本地函数
    def processLine(Line: String): Unit = {
      if (Line.length > width)
        println(filename + ": " + Line)
    }
    val sourceFile = Source.fromFile(filename)
    for (line <- sourceFile.getLines())
      processLine(line)

  }
}
