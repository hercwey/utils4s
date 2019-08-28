package cn.thinkjoy.utils4s.S99

/**
  * 在这个例子中，catch处理程序有两种情况。 第一种情况将只处理算术类型异常。 第二种情况有Throwable类，它是异常层次结构中的超类。
  * 第二种情况可以处理任何类型的异常在程序代码中。有时当不知道异常的类型时，可以使用超类 - Throwable类。
  */
class ExceptionExample2 {
  def divide(a: Int, b: Int) = {
    try {
      a / b
      var arr = Array(1, 2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: Throwable => println("found a unknown exception" + ex)
    }
    println("Rest of the code is executing...")
  }
}

object Demo2 {
  def main(args: Array[String]) {
    var e = new ExceptionExample2()
    e.divide(100, 10)

  }
}
