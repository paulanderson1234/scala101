package scala101.example

import base.UnitSpec

class GameSpec extends UnitSpec {

  "Calling Game.fizzbuzz()" when {

    "given the number 0" should {
      "return 0" in {
        val result = Game.fizzBuzz(0)
        result shouldBe (0.toString)
      }
    }

        "given the number 1" should {
          "return 1" in {
            val result = Game.fizzBuzz(1)
            result shouldBe(1.toString)
          }
        }

        "given the number 3" should {
          "return Fizz" in {
            val result = Game.fizzBuzz(3)
            result shouldBe "Fizz"
          }
        }

        "given the number 5" should {
          "return Buzz" in {
            val result = Game.fizzBuzz(5)
            result shouldBe "Buzz"
          }
        }

        "given the number 15" should {
          "return FizzBuzz" in {
            val result = Game.fizzBuzz(15)
            result shouldBe "FizzBuzz"
          }
        }

  }
}
