package cn.thinkjoy.utils4s.S99

/*
高阶函数demo
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object HigherFunctionDemo {

  def op(f: (Int, Int) => Int, a: Int, b: Int): Int = {
    f(a, b)
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def sub(a: Int, b: Int): Int = {
    a - b
  }

  def main(args: Array[String]): Unit = {
    val res1 = op(add, 10, 2)
    val res2 = op(sub, 10, 2)

    print(s"res1=====> ${res1}\n")
    print(s"res2=====> ${res2}\n")
  }
}

/*
以上代码执行结果如下 :
res1=====> 12
res2=====> 8
 */
