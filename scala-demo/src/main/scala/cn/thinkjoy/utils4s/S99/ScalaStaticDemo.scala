package cn.thinkjoy.utils4s.S99

/*
接下来我们一起测试如何访问一个Object的成员变量和方法
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object ScalaStaticDemo {
  def main(args: Array[String]): Unit = {
    //直接“类名.成员变量”就可以访问非私有的变量
    var res1 = ScalaStatic.age
    print(s"res1=====> ${res1}\n")
    //对单例模式的类中的非私有成员变量进行修改操作，但前提是这个变量需要用关键字var来声明
    ScalaStatic.age = 26
    print(s"res1=====> ${res1}\n")

    ScalaStatic.sayHello()

    //如果没有指定方法，默认会调用apply方法哟！
    ScalaStatic.apply("篮球")
    ScalaStatic("乒乓球")
  }
}
