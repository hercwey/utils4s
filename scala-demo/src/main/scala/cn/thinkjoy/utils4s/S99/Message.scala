package cn.thinkjoy.utils4s.S99

/*
Scala中样例类和样例对象
样例类是特殊类，经过了优化处理，经常用于模式匹配。好处是内置实现了众多scala常用的功能，比如serializable、compare、apply、unapply
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 样例类:
  * 1>.在类前加关键字case就是一个样例类
  * 2>.它支持模式匹配，默认实现了Serializable接口
  * 3>.具体格式为:case class Message(属性......)
  *
  * 定义变量规则:
  * 1>.类名的定义首字母大写推荐使用驼峰式；
  * 2>.属性名称第一个字母小写；
  * 一个标准的命名规则是一个资深开发的基础。
  */
case class Message(name: String, content: String) {

}


/**
  * 样例对象:
  * 1>.用于模式匹配
  * 2>.样例对象不能封装数据
  * 3>.样例对象格式:case opject 对象名
  */
case object MonitorServer

object CaseDemo {
  def main(args: Array[String]): Unit = {
    val message = new Message("张三", "今天晚上要拍戏......")
    println(message.name)
    println(message.content)
  }
}

/*
以上代码输出结果如下 :
张三
今天晚上要拍戏......
 */