package cn.thinkjoy.utils4s.S99

/*
scala 单例对象
在Scala中，是没有static这个东西的，但是它也为我们提供了单例模式的实现方法，那就是使用关键字object。注意：object 对象是不能带参数的。
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 1>.在scala中的object是一个单例对象，没办法new，因为它的构造方法被私有化了
  * 2>.Object中定义的成员变量和方法都是静态的
  * 3>.可以通过"类名.方法"或者 "对象名.成员变量"
  *
  */
object ScalaStatic {
  val name: String = "张三"
  var age: Int = 18

  def sayHello(): Unit = {
    println("Hi,I'm zhangsan!")
  }

  //注意:如果调用者没有指定方法，默认会调用apply方法哟！
  def apply(habby: String) = {
    println(s"我的爱好是:${habby}")
  }
}
