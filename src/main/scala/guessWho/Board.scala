package guessWho

object Board {

  val targetPerson: Person = Person.JOEY

  val peopleStillStanding: Seq[Person] = Seq(Person.JOEY, Person.PAUL, Person.WAYNE)

  def knockDownPersonCalled(guess: String): Seq[Person] = peopleStillStanding.filterNot {
    personInList =>
      if (personInList.name == guess) true
      else false

  }

  def knockDownPersonNotCalled(guess: String): Seq[Person] = peopleStillStanding.filter {
    personInList =>
      if (personInList.name == guess) true
      else false
  }

  def isItCorrect(guess: String): Seq[Person] = {

    if (guess != targetPerson.name) knockDownPersonCalled(guess)
    else knockDownPersonNotCalled(guess)

  }




}
