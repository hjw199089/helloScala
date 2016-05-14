package com.hjw.basic

import java.io.PrintWriter
import java.io.File

import com.sun.tools.javac.code.Printer

import scala.io.Source

/**
  * Created by hjw on 16/5/14.
  */
object FileOps {
  def main(args: Array[String]): Unit = {

    //=========读取文件=========
    val file = Source.fromFile("./src/com/hjw/basic/src/hjw.txt")
//    for (line <- file.getLines){
//      println(line)
//    }
    file.close()
    //=========读取URL=========
    val webFile = Source.fromURL("http://spark.apache.org/")
    //webFile.foreach(print) //or webFile.foreach(print(_))
    webFile.close()

    //=========写入文件=========
    val writer = new PrintWriter(new File("./src/com/hjw/basic/src/writeFile.txt"))
//    writer.println("写入1到10:")
//    for(i<-1 to 10) writer.println(i)
    writer.close()

    //=========由控制台读取=========

    print("Please enter your input : " )
    val line = readLine // Console.readLine()
    println(line)

    val num = readInt()
    println(num)
  }

}
