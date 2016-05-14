package com.hjw.oop

//=======com.hjw.oop.com.scala.spark=======
package com.scala.spark



import java.awt.{Color,Font} //部分引用
import java.util.{HashMap=>JavaHashMap} //重标识
import scala.{StringBuilder => _}//忽略




//==============================包对象
package object peopel{
  val defaultName = "Scala"
  def getDefaultName  =  {
    defaultName
  }
}

package peopel{
  class peopel{
    var name = getDefaultName //  直接用包对象中成员
  }
}

//=======================包嵌套中类和包并行
package spark.navigation {
  //---抽象类
  abstract class Navigator{
    def act
  }
  //---测试包
  package tests {

    // ÔÚspark.navigation.tests°üÀï
    class NavigatorSuite
  }
  //----实现包
  package impls {
    class Action extends Navigator{
      def act = println("Action")
    }
  }
}

//=========================包的引用
package hadoop {

  package navigation {
    class Navigator
  }

  package launch {
    class Booster {
      val nav = new navigation.Navigator //包的引用

    }
  }

}



/**
  * Created by hjw on 16/5/14.
  */
object PackageOps {
  def main(args: Array[String]) {


  }
}
