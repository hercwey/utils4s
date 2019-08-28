package cn.thinkjoy.utils4s.S99

/**
  * Spark记录-Scala异常与处理
  * Scala try-catch语句
  * Scala提供try和catch块来处理异常。try块用于包含可疑代码。catch块用于处理try块中发生的异常。可以根据需要在程序中有任意数量的try...catch块。
  *
  * Scala try catch示例1
  *
  * 在下面的程序中，我们将可疑代码封装在try块中。 在try块之后使用了一个catch处理程序来捕获异常。如果发生任何异常，catch处理程序将处理它，程序将不会异常终止。
  */

class ExceptionExample {
  def divide(a: Int, b: Int) = {
    try {
      a / b
    } catch {
      case e: ArithmeticException => println(e)
    }
    println("Rest of the code is executing...")
  }
}

object Demo {
  def main(args: Array[String]) {
    var e = new ExceptionExample()
    e.divide(100, 0)

  }
}
