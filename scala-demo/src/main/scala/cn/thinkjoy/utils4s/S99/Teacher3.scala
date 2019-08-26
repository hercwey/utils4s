package cn.thinkjoy.utils4s.S99

/*
Scala类的成员属性访问权限
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 关于类的成员属性访问权限 :
  * 如果类的主构造器中成员变量是private修饰的，它的setter和getter方法都是私有的，外部不能访问
  */
class Teacher3(var name: String, private val age: Int) {

}
