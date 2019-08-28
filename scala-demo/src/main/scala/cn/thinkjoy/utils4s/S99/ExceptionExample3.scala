package cn.thinkjoy.utils4s.S99

/**
  * Scala finally块
  * finally块用于在异常时释放资源。资源可能是文件，网络连接，数据库连接等，finally块执行代码运行保证。以下程序说明了finally块的用法。
  */
class ExceptionExample3 {
  def divide(a: Int, b: Int) = {
    try {
      a / b
      var arr = Array(1, 2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: Exception => println(ex)
      case th: Throwable => println("found a unknown exception" + th)
    }
    finally {
      println("Finaly block always executes")
    }
    println("Rest of the code is executing...")
  }
}


object Demo3 {
  def main(args: Array[String]) {
    var e = new ExceptionExample3()
    e.divide(100, 10)

  }
}
