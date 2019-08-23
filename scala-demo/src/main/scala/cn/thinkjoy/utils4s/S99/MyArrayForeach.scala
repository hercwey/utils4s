package cn.thinkjoy.utils4s.S99

/*
遍历方法（foreach）
Blog:http://www.cnblogs.com/zhangsan/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object MyArrayForeach {

  def main(args: Array[String]): Unit = {
    /**
      * 定义一个数组，里面存放两个字符串
      */
    val arr = Array.apply[String]("zhangsan,张三", "Python,Shell,Golang,Java,Scala")

    /**
      * 使用flatMap将arr数组中的数据扁平化
      */
    val arr2 = arr.flatMap(_.split(","))

    /**
      * 这个时候我们就可以用foreach方法遍历arr2数组中里面的每一个元素，foreach方法需要传递一个返回空值的方法。首先我们会想到打印的方法
      */
    arr2.foreach(x => print(x + "\t"))
    arr2.foreach(println)
  }
}


/*
以上代码执行结果如下 :
zhangsan    张三    Python    Shell    Golang    Java    Scala    zhangsan
张三
Python
Shell
Golang
Java
Scala
 */
