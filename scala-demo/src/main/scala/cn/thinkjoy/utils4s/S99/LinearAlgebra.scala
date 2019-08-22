package cn.thinkjoy.utils4s.S99

/*
线性代数的高阶函数
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object LinearAlgebra {
  /**
    * 定义线性代数的高阶函数,模拟:y = ax + b
    */
  def line(x1: (Int, Int) => Int, x2: Int, x3: Int, x4: (Int, Int) => Int, x5: Int, x6: Int): Int => Int = {
    val a = x1(x2, x3)
    val b = x4(x5, x6)

    def f(args: Int): Int = a * args + b
    //返回函数
    f _
  }

  /**
    * 上面的也可以写成一行，就是返回匿名函数，具体代码如下:
    */
  def line2(x1: (Int, Int) => Int, x2: Int, x3: Int, x4: (Int, Int) => Int, x5: Int, x6: Int): Int => Int = {
    //我们也可以返回匿名函数
    (x: Int) => {
      x1(x2, x3) * x + x4(x5, x6)
    }
  }

  def add(x: Int, y: Int) = x + y

  def sub(x: Int, y: Int) = x - y

  def main(args: Array[String]): Unit = {
    //调用函数
    var res1 = line(add, 1, 2, sub, 3, 4)(5)
    var res2 = line2(add, 1, 2, sub, 3, 4)(5)
    print(s"res1 =====> ${res1}\n")
    print(s"res2 =====> ${res2}\n")
  }
}


/*
以上代码执行结果如下:
res1 =====> 14
res2 =====> 14
 */