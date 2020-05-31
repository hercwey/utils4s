package cn.interview

/**
  * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
  * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
  */
object FirstRabbit extends App {
  var (f, f1, f2) = (1L, 1L, 1L)
  val MONTH = 15L

  for (i <- 1L to MONTH) {
    if (i < 3) {
      f2 = 1
    } else {
      f = f1 + f2
      f1 = f2
      f2 = f
    }
    println("第" + i + "个月兔子的对数位：" + f)

  }
}
