package cn.thinkjoy.utils4s.S99

/*
单词统计案例（wold count）
Blog:http://www.cnblogs.com/zhangsan/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object MyArrayWordCount {

  def main(args: Array[String]): Unit = {
    /**
      * 定义一个数组，里面存放两个字符串
      */
    val arr = Array.apply[String]("zhangsan,张三,zhangsan,Scala", "Python,Shell,Golang,Java,Scala,zhangsan")


    /**
      * flatMap:
      * 进行扁平化操作，通过flatMap(_.split(","))可以将2个字符串按照空格切割成单词
      * groupBy:
      * 自然是排序操作了，即按照每个传进来的参数进行分组，即将相同的单词包装成一个数组
      * mapValues:
      * 传递的参数是一个数组，我们将传入的数组的长度取出
      */
    val arr2 = arr.flatMap(_.split(",")).groupBy(x => x).mapValues(x => x.length)
    arr2.foreach(x => print(x + "\t"))
    println("\n=======我是分割线=======")
    /**
      * 排序功能：
      * 又有map默认是无序的，因此我们可以将其转换成数组，然后在进行排序操作
      * toList:
      * 将arr3这个map类型转换成一个list类型
      * sortBy:
      * 排序操作，注意，x._1，其中x表示的是arr3转换成的list对象，而“_1”表示的是每一个元素的第一个参数，因此排序是按照字母来排序的哟，如果你想按照长度来排序的话把1改成2就好
      */
    val arr3 = arr2.toList.sortBy(x => x._1)
    arr3.foreach(x => print(x + "\t"))
  }
}


/*
以上代码执行结果如下 :
(Shell,1)    (Scala,1)    (zhangsan,3)    (Python,1)    (张三,1)    (Golang,1)    (Java,1)
=======我是分割线=======
(Golang,1)    (Java,1)    (Python,1)    (Scala,1)    (Shell,1)    (zhangsan,3)    (张三,1)
 */
