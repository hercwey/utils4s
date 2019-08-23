package cn.thinkjoy.utils4s.S99

import java.util.Date

/*
部分参数应用函数
部分参数应用函数定义：如果函数传递所有预期的参数，则表示已完全应用它。
如果只传递几个参数并不是全部参数，那么将返回部分应用的函数。这样就可以方便地绑定一些参数，其余的参数可稍后填写补上。
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object PartialParameter {
  /**
    * 定义个输出的方法, 参数为date, message
    */
  def log(date: Date, message: String) = {
    println(s"$date, $message")
  }

  def main(args: Array[String]): Unit = {
    //定义一个日期对象
    val date = new Date()
    /**
      * 调用log 的时候, 传递了一个具体的时间参数, message为待定参数。logBoundDate成了一个新的函数,它需要传递一个String对象。
      *
      */
    val logBoundDate: (String) => Unit = {
      //我们在调用log函数时，值传递了第一个参数，第二个参数我们空出来了，并没有传递，而是指定第二个参数的类型。
      log(date, _: String)  // 注意这种写法
    }

    // 调用logBoundDate 的时候, 只需要传递待传的message 参数即可
    logBoundDate("I'm zhangsan!")

    //当然你想要传递两个参数，直接调用log函数也是可以的哟！
    log(date, "I'm zhangsan")
  }
}


/*
以上代码执行结果如下 :
Mon Jul 23 15:56:44 CST 2018, I'm Yinzhengjie!
Mon Jul 23 15:56:44 CST 2018, I'm Yinzhengjie
 */
