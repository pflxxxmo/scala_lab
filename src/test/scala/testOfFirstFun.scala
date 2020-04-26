import org.scalatest.funsuite.AnyFunSuite


class testOfFirstFun extends AnyFunSuite{
  test("Product of 2 vec"){
    val range: Int= 5
    val vec1: Array[Int] = Array(1,2,3,4,5)
    val vec2: Array[Int] = Array(1,2,3,4,5)
    val vec3: Array[Int] = Array.ofDim(range)
    fun.mul(vec1:Array[Int],vec2:Array[Int],vec3:Array[Int],range:Int)
    assert(vec3===Array(1,4,9,16,25))
  }

  test("Product of 2 vec(TailRec)"){
    val range: Int= 5
    val vec1: Array[Int] = Array(1,2,3,4,5)
    val vec2: Array[Int] = Array(1,2,3,4,5)
    val vec3: Array[Int] = Array.ofDim(range)
    fun2.mulTailRec(vec1:Array[Int],vec2:Array[Int],vec3:Array[Int],range:Int)
    assert(vec3===Array(1,4,9,16,25))
  }

  test("Equal of 2 vec"){
    val range: Int= 5
    val vec1: Array[Int] = Array(1,2,3,4,5)
    val vec2: Array[Int] = Array(1,2,3,4,5)
    val vec3: Array[Int] = Array.ofDim(range)
    val vec3_1: Array[Int] = Array.ofDim(range)
    fun.mul(vec1:Array[Int],vec2:Array[Int],vec3:Array[Int],range:Int)
    fun2.mulTailRec(vec1:Array[Int],vec2:Array[Int],vec3_1:Array[Int],range:Int)
    assert(vec3===vec3_1)
  }
}
