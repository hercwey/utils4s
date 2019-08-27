package cn.thinkjoy.utils4s.S99

/*
Scala中得模式匹配---match case
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object People {
  val (name, age) = ("张三", 26)

  def sayHello(): Unit = {
    println("I'm zhangsan!")
  }

  def init(): String = {
    s"姓名:$name,年龄:${age}"
  }
}