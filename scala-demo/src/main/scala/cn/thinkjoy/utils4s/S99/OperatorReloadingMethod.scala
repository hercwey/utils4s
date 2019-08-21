package cn.thinkjoy.utils4s.S99

/*
运算符重载成方法
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object OperatorReloadingMethod {
  def main(args: Array[String]): Unit = {
    var res1 = 1 + 2
    println(res1)
    //上面的运算符“+”其实是运算符重载成方法，即".+"
    var res2 = 1.+(2)
    println(res2)

    val res3 = 1 to 10
    println(res3)
    //上面的运算符“to”其实也是运算符重载成方法，即".to"
    val res4 = 1.to(10)
    println(res4)

  }
}

/*
以上代码输出结果如下 :
3
3
Range 1 to 10
Range 1 to 10
 */
