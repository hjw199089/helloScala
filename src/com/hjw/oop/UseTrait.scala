package com.hjw.oop

/**
  * Created by hjw on 16/5/14.
  */



// ===========当做接口=====
trait Logger{
  def log(msg: String)
}

class ConcreteLogger extends Logger with Cloneable{

  override  def log(msg : String): Unit = {
    println("当做接口用")
  }
  def concreteLog: Unit ={
      println("This is CnocreteLogger")
  }
}

// ===========混入接口=====
trait Logger_child extends Logger{
  override def log (msg : String){
    println( msg)
  }
}
// ===========混入抽象接口=====
trait Logger_abstract_child extends Logger{

}


//trait继承类,类混入接口,构造顺序从左往右
class Human{
  println("Human")
}
trait TTeacher extends Human {
  println("TTeacher")
  def teach
}

trait PianoPlayer extends Human {
  println("PianoPlayer")
  def playPiano = {println("I¡¯m playing piano. ")}
}

class PianoTeacher extends Human with TTeacher with PianoPlayer {
  override def teach = {println("I¡¯m training students. ")}//重写TTeacher中的抽象方法
}



//AOP
trait Action {
  def doAction
}
trait TBeforeAfter extends Action {
  abstract override def doAction {
    println("Initialization")
    super.doAction // 这个是抽象的
    println("Destroyed")
  }
}
class Work extends Action{
  override def doAction = println("Working...")
}


object UseTrait {
  def main(args: Array[String]) {

    val a = new ConcreteLogger
    a.log("当做接口用")

    val b = new ConcreteLogger with Logger_child()
    b.log("混入接口")
    //打印最后一次的重写 : 混入接口


    val c = new ConcreteLogger with Logger_abstract_child {
      override def log(msg: String) {
        println(msg)
      }
    }
    c.log("定义时重写抽象方法")
//    定义时重写抽象方法

    val d = new PianoTeacher
//    构造顺序
//    Human
//    TTeacher
//    PianoPlayer

    val work = new Work with TBeforeAfter
    work.doAction
//    Initialization
//    Working...
//    Destroyed
  }
}
