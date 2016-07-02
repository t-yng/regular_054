
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt

    val list = List.fill(n)(sc.nextInt)
    val sorted = list.sorted.reverse
 
    sorted map(x => list.indexOf(x) + 1) foreach(println)
  }
 
}