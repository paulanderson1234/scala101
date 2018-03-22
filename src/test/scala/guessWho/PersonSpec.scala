package guessWho

import base.UnitSpec

class PersonSpec extends UnitSpec {

  "Call Person person.name()" when {

    "name Joey exists" should {
      "return Joey" in {
        val result = new Person("Joey").name
        result shouldBe "Joey"

      }
    }

    "name Paul exists" should {
      "return Paul" in {
        val result = new Person("Paul").name
        result shouldBe "Paul"

      }
    }


  }
}

