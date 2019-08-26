package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

trait Bird {
  /**
    * 定义有实现的方法
    */
  def fly(name: String): Unit = {
    println(s"${name} 正在天上飞......")
  }

  /**
    * 定义没有实现的方法
    */
  def sing()
}
