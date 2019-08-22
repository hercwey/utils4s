package cn.thinkjoy.utils4s.S99

/*
匿名函数的两种定义和调用方式
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object AnonymousMethod {

  /**
    * 函数定义方式一:
    * f1 :
    *     其中f1是对匿名函数签名的一个引用，我们可以通过f1去调用这个函数，
    * (x : Int) :
    *     其中x是变量的名称，而Int是变量的类型
    * => :
    *     表示的是函数标志
    * x * 2 ：
    *     表示的具体的函数体，即也是最终的返回值哟
    **/
  val f1 = (x: Int) => x * 2


  /**
    * 函数定义方式二:
    * f2 :
    *     其中f2是对匿名函数签名的一个引用，我们可以通过f2去调用这个函数，
    * (Int) :
    *     Int定义的是函数的参数类型，我这个定义了一个Int类型的参数，如果有多个用逗号分隔即可
    * => :
    *     表示的是函数标志
    * Int ：
    *     表示的是返回值类型为Int
    * (x) :
    *     注意，这里的x实际上是形参，这个参数的类型就是前面我们定义的Int类型
    * x * 2 ：
    *     表示的具体的函数体，即也是最终的返回值哟
    **/
  val f2: (Int) => Int = (x) => x * 2

  /**
    * 下面为没有任何参数的匿名函数, 函数的返回值为String类型.
    *
    */
  val f3: () => String = () => "张三"

  def main(args: Array[String]): Unit = {
    //调用匿名函数f1
    var res1 = f1(10)
    println(res1)

    //调用匿名函数f2
    var res2 = f2(20)
    println(res2)

    //调用参数为空的匿名函数f3
    val Name = f3();
    println(Name)

  }
}

/**
  * 以上代码执行结果如下 :
  * 20
  * 40
  * 张三
  */
