import org.scalatest.funsuite.AnyFunSuite


class testOfSecondFun extends AnyFunSuite{
  test("Integral without TailRec"){
    val a:Double=1
    val b:Double=3
    val deltaX:Double=0.5
    assert(part2_2.integral(0, deltaX, a, b)===(-0.25))
  }

  test("Integral with TailRec"){
    val a:Double=1
    val b:Double=3
    val deltaX:Double=0.5
    assert(part2.integralTailRec(0, deltaX, a, b)===(-0.25))
  }

  test("Equal of 2 result"){
    val a:Double=1
    val b:Double=3
    val deltaX:Double=0.5
    assert(part2.integralTailRec(0, deltaX, a, b)===(-0.25))
    assert(part2_2.integral(0, deltaX, a, b)===part2.integralTailRec(0, deltaX, a, b))
  }
}

