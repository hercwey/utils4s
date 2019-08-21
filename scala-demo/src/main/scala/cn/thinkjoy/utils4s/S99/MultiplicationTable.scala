package cn.thinkjoy.utils4s.S99

/*
打印九九乘法表
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
https://www.cnblogs.com/yinzhengjie/p/9346524.html
*/
object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    for_while_99(9)
    println("=======我是分割线==========")
    while_while_99(10)
    println("=======我是分割线==========")
    for_for_99(9)
    println("=======我是分割线==========")
    senior_for(9)
  }

  /**
    * 使用高级for循环打印99乘法表，当然是在传递的参数为9的情况下
    */
  def senior_for(arg:Int):Unit={
    for(i<-1 to arg;j<-1 to i ){
      print(s"${i} x ${j} = ${i * j}\t")
      if (j == i) {
        println()
      }
    }
  }

  /**
    * 使用for循环嵌套打印99乘法表,我们需要传入一个参数，可以实现任意乘法表
    */
  def for_for_99(arg:Int):Unit={
    for(i <- 1 to arg){
      for (j <- 1 to i){
        print(s"${i} x ${j} = ${i * j}\t")
        if (j == i) {
          println()
        }
      }
    }
  }
  /**
    * 使用while循环嵌套打印99乘法表，我们需要传入一个参数，可以实现任意乘法表
    */
  def while_while_99(arg:Int): Unit ={
    var i = 1
    while (i < arg){
      var j = 1
      while (j <= i){
        printf("%d x %d = %d\t",j,i,(j*i))
        if (j == i){
          println()
        }
        j+=1
      }
      i+=1
    }
  }
  /**
    * 使用while和for循环打印99乘法表，我们需要传入一个参数，可以实现任意乘法表
    */
  def for_while_99(arg:Int):Unit = {
    var i: Int = 1
    for (i <- 1 to arg) {
      var j = 1
      while (j <= i) {
        print(s"${i} x ${j} = ${i * j}\t")
        if (j == i) {
          println()
        }
        j += 1
      }
    }
  }
}


/*
以上代码执行结果如下 :
1 x 1 = 1
2 x 1 = 2    2 x 2 = 4
3 x 1 = 3    3 x 2 = 6    3 x 3 = 9
4 x 1 = 4    4 x 2 = 8    4 x 3 = 12    4 x 4 = 16
5 x 1 = 5    5 x 2 = 10    5 x 3 = 15    5 x 4 = 20    5 x 5 = 25
6 x 1 = 6    6 x 2 = 12    6 x 3 = 18    6 x 4 = 24    6 x 5 = 30    6 x 6 = 36
7 x 1 = 7    7 x 2 = 14    7 x 3 = 21    7 x 4 = 28    7 x 5 = 35    7 x 6 = 42    7 x 7 = 49
8 x 1 = 8    8 x 2 = 16    8 x 3 = 24    8 x 4 = 32    8 x 5 = 40    8 x 6 = 48    8 x 7 = 56    8 x 8 = 64
9 x 1 = 9    9 x 2 = 18    9 x 3 = 27    9 x 4 = 36    9 x 5 = 45    9 x 6 = 54    9 x 7 = 63    9 x 8 = 72    9 x 9 = 81
=======我是分割线==========
1 x 1 = 1
1 x 2 = 2    2 x 2 = 4
1 x 3 = 3    2 x 3 = 6    3 x 3 = 9
1 x 4 = 4    2 x 4 = 8    3 x 4 = 12    4 x 4 = 16
1 x 5 = 5    2 x 5 = 10    3 x 5 = 15    4 x 5 = 20    5 x 5 = 25
1 x 6 = 6    2 x 6 = 12    3 x 6 = 18    4 x 6 = 24    5 x 6 = 30    6 x 6 = 36
1 x 7 = 7    2 x 7 = 14    3 x 7 = 21    4 x 7 = 28    5 x 7 = 35    6 x 7 = 42    7 x 7 = 49
1 x 8 = 8    2 x 8 = 16    3 x 8 = 24    4 x 8 = 32    5 x 8 = 40    6 x 8 = 48    7 x 8 = 56    8 x 8 = 64
1 x 9 = 9    2 x 9 = 18    3 x 9 = 27    4 x 9 = 36    5 x 9 = 45    6 x 9 = 54    7 x 9 = 63    8 x 9 = 72    9 x 9 = 81
=======我是分割线==========
1 x 1 = 1
2 x 1 = 2    2 x 2 = 4
3 x 1 = 3    3 x 2 = 6    3 x 3 = 9
4 x 1 = 4    4 x 2 = 8    4 x 3 = 12    4 x 4 = 16
5 x 1 = 5    5 x 2 = 10    5 x 3 = 15    5 x 4 = 20    5 x 5 = 25
6 x 1 = 6    6 x 2 = 12    6 x 3 = 18    6 x 4 = 24    6 x 5 = 30    6 x 6 = 36
7 x 1 = 7    7 x 2 = 14    7 x 3 = 21    7 x 4 = 28    7 x 5 = 35    7 x 6 = 42    7 x 7 = 49
8 x 1 = 8    8 x 2 = 16    8 x 3 = 24    8 x 4 = 32    8 x 5 = 40    8 x 6 = 48    8 x 7 = 56    8 x 8 = 64
9 x 1 = 9    9 x 2 = 18    9 x 3 = 27    9 x 4 = 36    9 x 5 = 45    9 x 6 = 54    9 x 7 = 63    9 x 8 = 72    9 x 9 = 81
=======我是分割线==========
1 x 1 = 1
2 x 1 = 2    2 x 2 = 4
3 x 1 = 3    3 x 2 = 6    3 x 3 = 9
4 x 1 = 4    4 x 2 = 8    4 x 3 = 12    4 x 4 = 16
5 x 1 = 5    5 x 2 = 10    5 x 3 = 15    5 x 4 = 20    5 x 5 = 25
6 x 1 = 6    6 x 2 = 12    6 x 3 = 18    6 x 4 = 24    6 x 5 = 30    6 x 6 = 36
7 x 1 = 7    7 x 2 = 14    7 x 3 = 21    7 x 4 = 28    7 x 5 = 35    7 x 6 = 42    7 x 7 = 49
8 x 1 = 8    8 x 2 = 16    8 x 3 = 24    8 x 4 = 32    8 x 5 = 40    8 x 6 = 48    8 x 7 = 56    8 x 8 = 64
9 x 1 = 9    9 x 2 = 18    9 x 3 = 27    9 x 4 = 36    9 x 5 = 45    9 x 6 = 54    9 x 7 = 63    9 x 8 = 72    9 x 9 = 81
 */