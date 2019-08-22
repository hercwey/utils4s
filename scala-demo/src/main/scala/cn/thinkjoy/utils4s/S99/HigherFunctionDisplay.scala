package cn.thinkjoy.utils4s.S99

/*
高阶有用的函数用法展示
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object HigherFunctionDisplay {
  def main(args: Array[String]): Unit = {
    var res1 = (1 to 10).map(_ * 0.1)
    print(s"res1 =====> $res1\n")
    println("==========我是分割线=========")
    (1 to 10).map("*" * _).foreach(println)
    println("==========我是分割线=========")
    val arr = Array[Int](1, 2, 3, 4)
    val res2 = arr.reduceLeft(_ - _)
    val res3 = arr.reduceRight(_ - _)
    println("==========我是分割线=========")
    print(s"res2 =====> $res2 \n")
    println("==========我是分割线=========")
    print(s"res3 =====> $res3 \n")
  }
}


/*
以上代码执行结果如下:
res1 =====> Vector(0.1, 0.2, 0.30000000000000004, 0.4, 0.5, 0.6000000000000001, 0.7000000000000001, 0.8, 0.9, 1.0)
==========我是分割线=========
*
**
***
****
*****
******
*******
********
*********
**********
==========我是分割线=========
==========我是分割线=========
res2 =====> -8
==========我是分割线=========
res3 =====> -2
 */