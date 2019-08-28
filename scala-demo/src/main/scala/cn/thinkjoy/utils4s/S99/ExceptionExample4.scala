package cn.thinkjoy.utils4s.S99

/**
  * Scala throw关键字
  * 可以在代码中明确地抛出异常。Scala提供throw关键字来抛出异常。 throw关键字主要用于抛出自定义异常。下面给出了使用scala throw异常关键字的例子。
  *
  * Scala Throw示例
  */
class ExceptionExample4 {
  def validate(age: Int) = {
    if (age < 18)
      throw new ArithmeticException("You are not eligible")
    else println("You are eligible")
  }
}

object Demo4 {
  def main(args: Array[String]) {
    var e = new ExceptionExample4()
    e.validate(10)
  }
}