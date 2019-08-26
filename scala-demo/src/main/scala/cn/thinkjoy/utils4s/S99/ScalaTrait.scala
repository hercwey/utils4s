package cn.thinkjoy.utils4s.S99

/*
Scala特质Trait定义使用
特质（Trait)相当于Java中的Interface，只不过特质（Trait)要比Java中的interface要强大的多，因为特质（Trait)可以定义已经实现的方法，也可以定义没有实现的方法。
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/


/**
  * Scala的中的接口叫做特质，关键字为trait。
  * 在Scala中也没有“implements”关键字，只有“extends”关键字
  * 在Scala特质中可以定义有实现的方法，也可以定义没有实现的方法
  */
trait ScalaTrait {
  /**
    * 定义有实现的方法
    */
  def sayHello() = {
    println("I'm Zhangsan!")
  }

  /**
    * 定义没有实现的方法
    */
  def playGame(name: String)
}
