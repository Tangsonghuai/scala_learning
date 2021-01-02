/**
 * scala_learning
 *
 * @author tangsonghuai
 * @date 2021/1/2 10:25
 */
class test(x:String,y:String){
  def get(z:String): Unit ={
    var result=x+y+z
    result.toString
  }

}

object test {

  def main(args: Array[String]): Unit = {
    var ko =new test("a","b")
    println(ko.get("China"))
  }

}
