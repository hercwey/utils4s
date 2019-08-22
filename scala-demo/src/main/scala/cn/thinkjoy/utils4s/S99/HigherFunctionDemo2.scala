package cn.thinkjoy.utils4s.S99

/*
高阶函数demo2
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object HigherFunctionDemo2 {

  /**
    * 该函数用于计算幂函数
    * powx :
    *     这个是定义高阶函数的名称。
    * n:Int :
    *     这个是高阶函数的参数。
    * (Double)=>Double :
    *     这个是高阶函数返回的匿名函数签名，第一个“(Double)”表示匿名函数的参数，第二个“Double”表示的是返回值类型。
    * (x:Double) =>
    *     从该行往后都是匿名函数的函数体。
    */
  def powx(n: Int): (Double) => Double = {
    (x: Double) => {
      var sum: Double = 1 //定义Double类型的变量sum
      for (i <- 1 to n) sum *= x //定义运算过程
      sum //返回计算的结果
    }: Double //返回值类型为:Double，我们也可以省略不写哟
  }

  def main(args: Array[String]): Unit = {
    //计算4的二次幂
    val res1 = powx(2)(3)  // 没看懂？？
    println(res1)
  }
}


/*
以上代码执行结果如下:
16.0
 */
