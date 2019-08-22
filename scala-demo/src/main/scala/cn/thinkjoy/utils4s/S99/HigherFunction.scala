package cn.thinkjoy.utils4s.S99

/*
高阶函数的定义：将其他函数作为参数或其结果是函数的函数。要注意的是传入的函数必须符合高阶函数参数中定义的函数签名。
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object HigherFunction {
  /**
    * 定义一个高级函数：
    * f: (Int) => String
    *     第一个参数是带一个整型参数返回值为字符串的函数f
    * v: Int
    *     第二个参数是一个整型参数v
    * f(v)
    *      返回值为一个函数“f(v)”。
    */
  def apply(f: (Int) => String, v: Int) = {
    //返回的函数“f(v)”，即将第二个参数作为第一个函数的参数。
    f(v)
  }

  // 定义一个方法, 参数为一个整型参数, 返回值为String
  def layout(args: (Int)):String = {
    "[" + args.toString() + "]"
  }

  def main(args: Array[String]): Unit = {
    //注意，layout传入的参数个数以及返回值类型都必须符合高阶函数apply中定义的第一个参数的函数签名。
    println (apply (layout , 150))
  }
}



/*
以上代码执行结果如下:
[150]
 */
