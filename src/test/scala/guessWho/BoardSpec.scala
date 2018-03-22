package guessWho

import base.UnitSpec

class BoardSpec extends UnitSpec {

  "Board target person" when {
    "always set to Joey" in {
      Board.targetPerson.name shouldBe "Joey"
    }
  }

  "Board should have an initial state" when {
    "containing all people" in {
      Board.peopleStillStanding shouldBe Seq(Person.JOEY, Person.PAUL, Person.WAYNE)
    }
  }

  "Board should be updated" when {
    "to remove our guess person from sequence" in {
      val guess: String = "Joey"

      Board.knockDownPersonCalled(guess) shouldBe Seq(Person.PAUL, Person.WAYNE)
    }

    "to remove Paul from sequence" in {

      val guess: String = "Paul"

      Board.knockDownPersonCalled(guess) shouldBe Seq(Person.JOEY, Person.WAYNE)
    }
  }

  "Board should be updated" when {
    "to remove all other persons from sequence except guess" in {
      val guess: String = "Joey"

      Board.knockDownPersonNotCalled(guess) shouldBe Seq(Person.JOEY)
    }

    "to remove all persons from sequence except Paul" in {

      val guess: String = "Paul"

      Board.knockDownPersonNotCalled(guess) shouldBe Seq(Person.PAUL)
    }

  "If guess is correct" when {
    "return name of guess" in {
      val guess: String = "Joey"

      Board.isItCorrect(guess) shouldBe Seq(Person.JOEY)
    }
  }

   "If guess is incorrect" when {
     "return name of all persons except guess" in {
       val guess: String = "Paul"

       Board.isItCorrect(guess) shouldBe Seq(Person.JOEY, Person.WAYNE)
     }
   }


  }
}
