package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/zhangsan/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object WordCount {
  def main(args: Array[String]): Unit = {
    val words: Array[String] = Array("hello zhangsan hello zhangsan Python", "hello Python hello zhangsan Scala Golang")
    // words 数组中的每个元素按照空格(" ")进行切分。
    val wordSplit: Array[Array[String]] = words.map((x: String) => x.split(" "))
    // 将数组中的Array扁平化
    val fltWords: Array[String] = wordSplit.flatten
    // 分组操作 : hello -> Array(hello, hello, hello, hello)
    val mapWords: Map[String, Array[String]] = fltWords.groupBy((wd: String) => wd)
    //生成map对象，得到类型这样的数据 : (hello, 4), (zhangsan,1).....
    val wrdResult: Map[String, Int] = mapWords.map(wdKV => (wdKV._1, wdKV._2.length))
    // Map不支持排序，需要将map转换成List， 调用sortBy方法按照单词数量降序排序(默认是升序，我们在前面加一个负号就可以实现倒序排列)
    val sortResult: List[(String, Int)] = wrdResult.toList.sortBy(t => -t._2)
    //遍历每一个元素
    sortResult.foreach(i => println(i))
  }
}


/*
以上代码实现结果如下 :
(hello,4)
(zhangsan,3)
(Python,2)
(Scala,1)
(Golang,1)
 */