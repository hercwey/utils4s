package cn.thinkjoy.utils4s.S99

/*
Scala中得final和type
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
trait TeacherFinal {

  /**
    * 使用type关键字定义一个自定义类型Zhangsan，这个类型并没有被确定，而是让继承者自己去指定。
    */
  type Zhangsan

  final def Bodybuilding(s:Zhangsan)={
    println(s"${s} 正在健身....")
  }


  def palyGame(name:String):String

  /**
    * 由于teaching方法被我加了关键字final，因此这个方法没法重写（override）！
    */
  final def teaching(name:String): Unit ={
    println(s"${name} 正在教学生！")
  }
}

