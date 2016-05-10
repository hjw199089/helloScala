package com.hjw.hello

/**
  * Created by hjw on 16/5/7.
  */
object For_Function_Advanced {
  def main(args: Array[String]) {

    //-------------------for------------------
    //for循环使用_1
    println("for_1")
    for (i <- 1 to 2; j <- 1 to 2) print((i * 100) + j + "\t")
    println

    println("for_2")
    for (i <- 1 to 2; j <- 1 to 2 if i != j) println((i * 100) + j + "\t")


    //-------------------函数------------------
    def addA(x: Int) = x + 100

    //匿名函数

    val add_1 = (x: Int) => x + 100

    println("普通函数\t" + addA(2) + "\n" + "匿名函数\t" + add_1(2))

    /*
     函数一般可以不指定返回值得类型
     但是,当递归函数时要指定
     */
    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
    println("This is the result of a fac:" + fac(10))

    /*
    函数默认值
     */
    def combine(content: String, left: String = "[", right: String = "]") = left + content + right
    println("函数参数默认值\t" + combine("hjw"))
    println("函数参数默认值\t" + combine("hjw", "<<"))
    println("函数参数默认值\t" + combine("hjw", "<<", ">>"))
    //    输出如下:
    //    函数参数默认值	[hjw]
    //    函数参数默认值	<<hjw]
    //    函数参数默认值	<<hjw>>

    /*
    多参数
     */
    def connected(args: Int*) = {
      var result = 0;
      for (arg <- args) result += arg
      result
    }
    println("This is the result of connected(1,2,3,4)=" + connected(1, 2, 3, 4))
    // This is the result of connected(1,2,3,4)=10


  }


}
