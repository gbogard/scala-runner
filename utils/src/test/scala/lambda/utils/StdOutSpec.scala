package lambda.utils

import org.scalatest._

class StdOutSpec extends FunSpec with Matchers {
  describe("StdOut utils") {
    it("Should capture the standard output as as string along with the expression value") {
      val expectedValue = 1 :: 2 :: 3 :: Nil
      val expectedStdOut = "Lorem ipsum dolor sit amet"
      val (receivedValue, stdOut) = (StdOut.captureStdOut {
        print(expectedStdOut)
        expectedValue
      })
      receivedValue shouldBe expectedValue
      stdOut shouldBe expectedStdOut
    }
  }
}
