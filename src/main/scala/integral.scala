import scala.annotation.tailrec
import scala.io.StdIn

object part2 {
  @tailrec
  def integralTailRec (acc: Double, deltaX: Double, a: Double, b: Double): Double = {
    if (a>=b) acc
    else integralTailRec(acc+(f(a) * deltaX + (f(a + deltaX) - f(a)) * deltaX / 2), deltaX, a+deltaX, b)
  }

  def f (x: Double): Double = {
    -3 * x*x + 2 * x + 9
  }

  def main(args: Array[String]): Unit = {
    println("Enter first border:")
    val a: Double= StdIn.readDouble()
    println("Enter second border")
    val b: Double=StdIn.readDouble()
    println("Enter incrementation of X (X+deltaX):")
    val deltaX: Double=StdIn.readDouble()
    val result = integralTailRec(0, deltaX, a, b)
    System.out.println(result)
  }
}


object part2_2{
  def integral (acc: Double, deltaX: Double, a: Double, b: Double): Double = {
    if (a>=b) acc
    else acc+integral(f(a) * deltaX + (f(a + deltaX) - f(a)) * deltaX / 2, deltaX, a+deltaX, b)
  }

  def f (x: Double): Double = {
    -3 * x*x + 2 * x + 9
  }

  def main(args: Array[String]): Unit = {
    println("Enter first border:")
    val a: Double= StdIn.readDouble()
    println("Enter second border")
    val b: Double=StdIn.readDouble()
    println("Enter incrementation of X (X+deltaX):")
    val deltaX: Double=StdIn.readDouble()
    val result = integral(0, deltaX, a, b)
    System.out.println(result)
  }
}
