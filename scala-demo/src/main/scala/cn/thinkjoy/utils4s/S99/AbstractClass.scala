package cn.thinkjoy.utils4s.S99

/*
Scala中得抽象类abstract
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 1>.使用关键字abstract定义一个抽象类
  * 2>.抽象类可以具体实现方法
  * 3>.也可以有具体实现的方法
  */
abstract class AbstractClass {
  def eat(food: String): String

  def sayHello() = {
    println("I'm zhangsan!")
  }
}