package scala101.example

object Game {

//  def fizzBuzz(number: Int): String = (number % 3, number % 5) match {
//
//    case (0, 0) => "FizzBuzz"
//    case (0, _) => "Fizz"
//    case (_, 0) => "Buzz"
//    case _ => number.toString
//
//  }

  def fizzBuzz(number: Int): String = {

    if (number == 0) 0.toString

    else if (number % 15 == 0) "FizzBuzz"
    else if (number % 3 == 0) "Fizz"
    else if (number % 5 == 0) "Buzz"

    else number.toString

  }

}
