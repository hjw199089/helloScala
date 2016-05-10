package com.hjw.hello

/**
  * Created by hjw on 16/5/7.
  */
object Map_Tuple {
  def main(args: Array[String]) {

    //======================MAP============================
    //immutable Map
    val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 1000)
    val map_2 = for ((k, v) <- map) yield (k, v * 0.1)

    //mutable Map
    val scores = scala.collection.mutable.Map("Scala" -> 7, "Hadoop" -> 8, "spark" -> 10)
    //若有键则返回值,否则返回0
    val hadoopSore = scores.getOrElse("Hadoop", 0)
    val hadopSore = scores.getOrElse("Hadop", 0)
    //插入新键值对
    scores += ("R" -> 9)
    //删除
    scores -= ("Hadoop")

    //排序
    val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "spark" -> 10)
    // Map(Hadoop -> 8, Scala -> 7, spark -> 10)  按照键值排序

    //=====================TUPLE============================
    val tuple = (1, 2, 3, "Rocky", "Spark")
    val third = tuple._3
    val (first, second, thirda, fourth, fifth) = tuple
    val (one, two, _, _, _) = tuple
    //    tuple: (Int, Int, Int, String, String) = (1,2,3,Rocky,Spark)
    //    three: Int = 3
    //    first: Int = 1
    //    second: Int = 2
    //    third: Int = 3
    //    fourth: String = Rocky
    //    fifth: String = Spark
    //    one: Int = 1
    //    two: Int = 2

    //=====================ZIP============================
    val symbols = Array("[", "-", "]")
    val counts = Array(2,5,2)
    val pairs = symbols.zip(counts)
    for ((x,y) <- pairs) print(x*y)
    // [[-----]]


  }

}


//
//val tuple =(1,2,3.14,"Rocky","Spark")
//val third = tuple._3
//val (first,second,thirda,fourth,fifth) = tuple
//val (f, s, _, _, _) = tuple
//
//"Rocky Spark".partition(_.isUpper)
//
//val symbols = Array("[", "-", "]")
//val counts = Array(2,5,2)
//val pairs = symbols.zip(counts)
//for ((x,y) <- pairs) print(x*y)