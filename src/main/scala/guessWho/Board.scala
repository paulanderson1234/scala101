package guessWho

object Board {

  val targetPerson: String = "Joey"

  val peopleStillStanding: Seq[String] = Seq("Joey", "Paul", "Wayne")

  def knockDownPersonCalled(guess: String): Seq[String] = peopleStillStanding.filterNot {
    personInList =>
      if (personInList == guess) true
      else false

  }

  def knockDownPersonNotCalled(guess: String): Seq[String] = peopleStillStanding.filter {
    personInList =>
      if (personInList == guess) true
      else false
  }

  def isItCorrect(guess: String): Seq[String] = {

    if (guess != targetPerson) knockDownPersonCalled(guess)
    else knockDownPersonNotCalled(guess)

  }




}
