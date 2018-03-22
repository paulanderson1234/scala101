package scala101.example

import base.UnitSpec

class CalculateTaxSpec extends UnitSpec {

  "Calling calculateTax" when {

    "when input = 0" should {
      "return 0" in {
        val result = CalculateTax.percentageCalc(0)
        result shouldBe 0

      }
    }

    "when input is negative" should {
      "return zero " in {
        val result = CalculateTax.percentageCalc(-1000)
        result shouldBe 0

      }
    }

    "when input =< 10000" should {
      "returns 10% total tax" in {
        val result = CalculateTax.percentageCalc(9999)
        result shouldBe 999

      }
    }

    "when input = 10000" should {
      "returns 10% total tax" in {
        val result = CalculateTax.percentageCalc(10000)
        result shouldBe 1000

        }
      }

    "when input > 10000" should {
      "returns 15% total tax" in {
        val result = CalculateTax.percentageCalc(11000)
        result shouldBe 1650

      }
    }

    "when input > 49999" should {
      "returns 15% total tax" in {
        val result = CalculateTax.percentageCalc(49999)
        result shouldBe 7499

      }
    }

    "when input = 50000" should {
      "returns 15% total tax" in {
        val result = CalculateTax.percentageCalc(50000)
        result shouldBe 7500

      }
    }

    "when input > 50000" should {
      "returns 20% total tax" in {
        val result = CalculateTax.percentageCalc(51000)
        result shouldBe 10200

      }
    }

    "when input = 100000" should {
      "returns 20% total tax" in {
        val result = CalculateTax.percentageCalc(100000)
        result shouldBe 20000

      }
    }

    "when input > 100000" should {
      "returns 40% total tax" in {
        val result = CalculateTax.percentageCalc(101000)
        result shouldBe 40400

      }
    }

    "when input = 1000000" should {
      "returns 40% total tax" in {
        val result = CalculateTax.percentageCalc(1000000)
        result shouldBe 400000

      }
    }


  }
}
