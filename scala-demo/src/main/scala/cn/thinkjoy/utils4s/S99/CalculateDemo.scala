package cn.thinkjoy.utils4s.S99

/*
传值调用和传名调用
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object CalculateDemo {

  /**
    * 定义传值的方法 :
    *     add方法拥有2个Int类型的参数， 返回值为2个Int的和。
    */
  def add(a: Int, b: Int) () = {
    a + b
  }

  /**
    * 定义传参的方法 :
    *     add2方法拥有3个参数，第一个参数是一个函数(它拥有2个Int类型的参数，返回值为Int类型的函数)， 第二个，第三个为Int类型的参数
    */
  def add2(f:(Int, Int) => Int, a: Int, b: Int) = {
    f(a, b) // f(1, 2) => 1 + 2
  }

  /**
    * 定义传参的方法 :
    *     第一个参数是一个函数(它拥有1个Int类型的参数，返回值为Int类型的函数),第二个为Int类型的参数。
    */
  def add3(a:(Int) => Int, b: Int) = {
    //这里我们将第二个参数作为第一个函数的签名传递进去
    a(b) + b
  }
  /**
    * fxx你们函数是符合add2中的“f:(Int, Int) => Int”这个方法签名的，因此我们可以把它当做第一个参数进行传递
    */
  val f1 = (a: Int, b: Int) => a + b

  /**
    * 定义一个匿名函数，它需要传递一个参数，函数体的返回值是将传入的值乘以10并返回，返回值类型为Int。
    */
  val f2 = (x: Int) =>  (x * 10):Int

  def main(args: Array[String]): Unit = {

    //传值方式调用
    val res1 = add(100, 10 + 20)
    println(res1)

    //传参方式调用一,我们给匿名函数传参数，最终返回的结果和第二个参数以及第三个参数进行运算
    var res2 = add(f1(10, 20), 30)
    println(res2)

    //传参方式调用二,我们给匿名函数传参数，
    var res3 = add2(f1, 10, 20)
    println(res3)

    //传参方式调用
    val res4 = add3(f2, 8)
    println(res4)
  }
}



/*
以上代码执行结果如下 :
130
60
30
88
 */