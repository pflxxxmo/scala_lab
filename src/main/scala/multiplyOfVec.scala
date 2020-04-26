import scala.io.StdIn

object fun {
def mul(v1:Array[Int],v2:Array[Int],v3:Array[Int],range: Int):Unit= {
  for (i <- 0 until (range))
    v3(i) = v1(i) * v2(i)
}

  def main(args: Array[String]): Unit = {
    println("Enter range of array:")
    val range: Int = StdIn.readInt()
    println("Enter first array:")
    val vec1: Array[Int] = Array.fill(range){
      StdIn.readInt()
    }
    println("Enter second array:")
    val vec2: Array[Int] = Array.fill(range){
      StdIn.readInt()
    }
    val vec3: Array[Int] = Array.ofDim(range)

    println("Result:")
    mul(vec1,vec2,vec3,range)
    for (i <- 0 until (range))
      println(vec3(i))
  }
}


object fun2{
  @scala.annotation.tailrec
  def mulTailRec(v1: Array[Int], v2:Array[Int], v3:Array[Int], range: Int, counter: Int=0):Array[Int] ={
    if(counter != range){
      v3(counter)=v1(counter)*v2(counter)
      mulTailRec(v1,v2,v3,range,counter+1)
    }else v3
  }

  def main(args: Array[String]): Unit = {
    println("Enter range of array:")
    val range: Int = StdIn.readInt()
    println("Enter first array:")
    val vec1: Array[Int] = Array.fill(range){
      StdIn.readInt()
    }
    println("Enter second array:")
    val vec2: Array[Int] = Array.fill(range){
      StdIn.readInt()
    }
    val vec3: Array[Int] = Array.ofDim(range)

    println("Result:")
    mulTailRec(vec1,vec2,vec3,range)
    for (i <- 0 until range) {
      println(vec3(i))
    }
  }
}


