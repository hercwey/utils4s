package cn.thinkjoy.utils4s.S99

object MatchCase {

  def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(3))
  }
}
