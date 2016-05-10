package com.hjw.hello

import scala.collection.mutable.ArrayBuffer

/**
  * Created by hjw on 16/5/7.
  */
object ArrayOps {
  def main(args: Array[String]) {

    //数组的声明等
    val nums = new Array[Int](10)
    val str = new Array[String](10)
    val str_2 = Array("hello", "woorld")
    str_2(1) = "world"

    //ArrayBuffer
    val b = ArrayBuffer[Int]()

    b += 1
    b +=(2, 3, 4)
    b ++= Array(5, 6)
    b.trimEnd(1)
    b.insert(0, 0)
    b.insert(5, 6)
    b.remove(0)
    b.remove(0, 1)
    b.toArray

    //数组的遍历
    val a = Array(1, 2, 3, 4)
    for (i <- 0 until a.length) {
      print(a(i) + "\t")
    }
    //必须有yield
    val res_1   = for (elem <- a) yield 2 * elem

    val res_2 = for (elem <- a if elem % 2 == 0) yield 2 * elem

    val res_3 = a.filter(_ % 2 == 0).map(2 * _)

    //方法使用
    val res_sum = Array(1,3,2,4).sum

    val res_max = ArrayBuffer("b","a","c").max

    val e = ArrayBuffer(2,4,1,5)

    val res_sorted = e.sorted

    val d = Array(2,6,5,1)
    scala.util.Sorting.quickSort(d)

    d.mkString(" and ")
    //String = 1 and 2 and 5 and 6

    d.mkString("<",",",">")
    //String = <1,2,5,6>

    //多为数组
    val matrix = Array.ofDim[Double](3,4)
    matrix(0)(0) = 1

    val triangle = new  Array[Array[Int]](10)
        for(i <- 0 until triangle.length){
          triangle(i) = new Array[Int](i + 1)
        }
    //    triangle(0)
    //    triangle(1)
    //    triangle(2)
    //    triangle(3)
    //    triangle(4)
    //    triangle(5)
    //    triangle(6)
    //    triangle(7)
    //    res1: Array[Int] = Array(0)
    //    res2: Array[Int] = Array(0, 0)
    //    res3: Array[Int] = Array(0, 0, 0)
    //    res4: Array[Int] = Array(0, 0, 0, 0)
    //    res5: Array[Int] = Array(0, 0, 0, 0, 0)
    //    res6: Array[Int] = Array(0, 0, 0, 0, 0, 0)
    //    res7: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0)
    //    res8: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0)



  }

}
