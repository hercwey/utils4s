package cn.thinkjoy.utils4s.S99

/*
柯里化函数(Currying)
柯里化(Currying，以逻辑学家Haskell Brooks Curry的名字命名)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程。
新的函数返回一个以原有第二个参数为参数的函数。因此我们可以说柯里化就是高阶函数的一种，而高阶函数不一定就是柯里化函数。
柯里化的好处：有时候，你想要用柯里化来把某个函数参数单拎出来，以提供更多用于类型推断的信息。
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object MyCurrying {

  /**
    * 常规方法求两个参数和的函数：
    *     我们看下这个方法的定义, 求2个数的和,需要传递两个参数
    */
  def add1(x: Int, y: Int) = x + y

  /**
    * 现在我们把上面的函数变一下形 :
    *     使用柯里化(Currying)两个参数和的函数：
    */
  def add2(x:Int)(y:Int) = x + y  // 注意这种写法

  /**
    * 分析下其演变过程 :
    *     (y: Int) => x + y 为一个匿名函数, 也就意味着 add3 方法的返回值为一个匿名函数.
    */
  def add3(x: Int) = (y: Int) => x + y

  def main(args: Array[String]): Unit = {

    var res1 = add1(10,20)
    println(res1)

    /**
      * 这种方式（过程）就叫柯里化。经过柯里化之后，函数的通用性有所降低，但是适用性有所提高。
      */
    var res2 = add2(10)(20)
    println(res2)

    /**
      * 调用方式需要进行两次传值操作，有点类似我们之前说的部分参数应用函数
      */
    val res3 = add3(10)
    print(res3(20))
  }
}

/*
以上代码输出结果如下:
30
30
30
 */
