package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

class ScalaTraitImpl extends ScalaTrait {

  /**
    * 如果特质中playGame方法没有实现的话，子类在实现的时候可以不加override关键字也可以加
    */
  def playGame(name: String): Unit = {
    println(s"${name} 正在玩游戏！")
  }

  /**
    * 如果特质中某个方法有具体的实现，在子类继承重写的时候，必须使用override关键字
    */
  override def sayHello(): Unit = {
    //我们的重写过程需要其实就是调用父类的方法
    super.sayHello()
  }

}

/**
  * 注意：“object  ScalaTraitImpl”是“class ScalaTraitImpl”的伴生对象
  */
object ScalaTraitImpl {
  def main(args: Array[String]): Unit = {
    val s1 = new ScalaTraitImpl()
    s1.sayHello()
    s1.playGame("张三")
  }
}


/*
以上代码执行结果如下:
I'm Zhangsan!
张三 正在玩游戏！
 */