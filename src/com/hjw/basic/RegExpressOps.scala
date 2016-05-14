package com.hjw.basic

/**
  * Created by hjw on 16/5/14.
  */
object RegExpressOps {
  def main(args: Array[String]) {

    val regex= """([0-9]+) ([a-z]+)""".r
    val numPattern = "[0-9]+".r
    val numberPattern = """\s+[0-9]+\s+""".r

    for(matchString <- numPattern.findAllIn("99345 Scala, 22298 Spark")) {
      println(matchString)
    }
//    99345
//    22298
    for(matchString <- regex.findAllIn("99345 cala")) {
      println(matchString)
    }
//    99345 cala

    println(numberPattern.findFirstIn("g99ss"))

    val reg="""([0-9]+) ([a-z]+)""".r

    val reg(num, item) = "99 hadoop"

    val line = "93459 spark"
    line match{
      case reg(num, blog) => println(num + "\t" + blog)
      case _ => println("Oops...")

    }
  }

}
