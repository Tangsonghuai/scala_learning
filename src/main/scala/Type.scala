/**
 * scala_learning
 *
 * @author tangsonghuai
 * @date 2021/1/2 9:57
 */
object Type {

  def main(args: Array[String]): Unit = {


    //AnyVal代表值类型。有9个预定义的非空的值类型分别是：Double、Float、Long、Int、Short、Byte、Char、Unit和Boolean。
    val list: List[Any] = List(
      "a string",
      732,  // an integer
      'c',  // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element))

  }

}
