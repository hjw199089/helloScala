package com.hjw.hello

import scala.io.Source

/**
  * Created by hjw on 16/5/7.
  */
object LazyOps {
  def main(args: Array[String]) {


    /*
     //惰性值
     下面直接报错,因为文件不存在
     */
//    lazy val file = Source.fromFile("E:\\SparkHanjunWei")
//    println("Spark")
//
//    for(line<-file.getLines ) println(line)
    /*
      //惰性值 第一次用的时候才求值
      下面不会报错,不求值
     */
    lazy val file = Source.fromFile("E:\\SparkHanjunWei")
    println("Spark")



  }

}
