package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 1>.使用关键字abstract定义一个抽象类
  * 2>.抽象类可以具体实现方法
  * 3>.也可以有具体实现的方法
  */
abstract class AbstractFinalClass {
  def eat(food: String): String

  /**
    * 由于sayHello方法被我加了关键字final，因此这个方法没法重写（override）！
    */
  final def sayHello() = {
    println("I'm zhangsan!")
  }
}