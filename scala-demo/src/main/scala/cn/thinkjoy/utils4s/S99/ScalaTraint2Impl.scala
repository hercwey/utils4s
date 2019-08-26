package cn.thinkjoy.utils4s.S99

/*
Scala中混入特质的两种方式
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 在定义类时，我们可以用将多个特质混在一起，第一个特质使用extends连接，后续的特质依次使用with连接即可。
  */
class ScalaTrait2Impl extends ScalaTrait with Bird {

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

  /**
    * 定义有实现的方法
    */
  override def fly(name: String): Unit = super.fly(name)

  def sing(): Unit = {
    println("Sing a song!")
  }
}


/**
  * 注意：“object  ScalaTrait2Impl”是“class ScalaTrait2Impl”的伴生对象
  */
object ScalaTrait2Impl {
  def main(args: Array[String]): Unit = {
    /**
      * 在Scala中可以动态混入N个特质，各个特质之间使用关键字with连接即可
      */
    val s1 = new ScalaTrait2Impl with Bird with ScalaTrait
    s1.sayHello()
    s1.playGame("张三")
    s1.sing()
    s1.fly("猫头鹰")
  }
}


/*
以上代码执行结果如下:
I'm Zhangsan!
张三 正在玩游戏！
Sing a song!
猫头鹰 正在天上飞......
 */