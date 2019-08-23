package cn.thinkjoy.utils4s.S99


/*
长度可变数组（ArrayBuffer）
顾名思义，长度可变数组指的是数组的长度是可以变化的，其内容也是可以变化的哟！
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 有可变（mutable包下存放）和不可变（immutable包下存放）两种类型，immutable 类型的集合初始化后就不能改变了,默认情况下使用的是
  * 不可变数组，如果我们想要使用它可变类型数组类型ArrayBuffer，那么就需要导入这个包啦！
  */

import scala.collection.mutable.ArrayBuffer


object ArrayBuffDemo {

  def main(args: Array[String]): Unit = {
    //定义一个可变的数组
    val arr = ArrayBuffer[String]("zhangsan", "张三", "Scala")
    //我们遍历定义的数组
    arr.foreach(i => print(i + "\t"))
    println("\n==========我是分割线===========")
    //我们往可变的数组内容中添加数据
    arr += ("Shell", "Python", "Java", "Golang")
    //我们再次遍历定义的数组
    arr.foreach(i => print(i + "\t"))
  }
}

/*
以上代码执行结果如下:
zhangsan    张三    Scala
==========我是分割线===========
zhangsan    张三    Scala    Shell    Python    Java    Golang
 */