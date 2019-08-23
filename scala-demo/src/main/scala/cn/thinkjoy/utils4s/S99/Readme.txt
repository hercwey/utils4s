scala语法实例快速学习，实例来自：https://www.cnblogs.com/yinzhengjie/p/9346524.html

Scala 的集合有三大类：序列 Seq、集 Set、映射 Map，所有的集合都扩展自 Iterable 特质在 Scala 中集合有
可变（“scala.collection.mutable” 包下存放）和不可变（“scala.collection.immutable” 包下存放）两种类型，
immutable 类型的集合初始化后就不能改变了（注意与 val 修饰的变量进行区别）。