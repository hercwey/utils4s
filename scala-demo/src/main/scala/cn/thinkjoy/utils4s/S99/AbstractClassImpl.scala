package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 1>.在Scala中第一个继承抽象类或者特质，只能使用关键字extends
  * 2>.如果想继承多个独特的话，可以在extends之后使用with关键字。
  */
object AbstractClassImpl extends AbstractClass with TeacherTraint {
  override def sayHello(): Unit = {
    super.sayHello()
  }

  def eat(food: String): String = {
    "炒着吃" + food
  }

  override def palyGame(name: String): String = {
    s"$name 正在打王者荣耀哟......."
  }

  def main(args: Array[String]): Unit = {
    AbstractClassImpl.sayHello()
    val res1 = AbstractClassImpl.eat("腊肉")
    println(s"res1 =====> ${res1}")
    AbstractClassImpl.teaching("体育老师")
  }
}
