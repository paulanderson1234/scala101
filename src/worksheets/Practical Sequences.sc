//Practical
//
//Create a Seq of the numbers 1 to 11
//Create a Map of “rose”-“red”, “sunflower”-“yellow”, “violet”-“blue”, and play
//with accessing the elements
//write a function to double the values of all numbers in a Seq
//write a function to strip all Strings from a collection except those that contain
//  the letter “y” (to check if a string contains a character use .contains("y") )
//write a function that returns true if a Seq has a number greater than 5 in it

val seqOfNumbers: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10,11)

val rangeNumbers: Seq[Int] = 1 to 11

val flowerColour: Map[String, String] = Map(
  "rose" -> "red",
  "sunflower" -> "yellow",
  "violet" -> "blue"
)

def doubleSequence(numbers: Seq[Int]): Seq[Int] = {
  numbers.map{
    number => number * 2

  }

}

//test function to double numbers in a sequence
doubleSequence(Seq(1,2,3,4,5))

def stripStringOfY(strings: Seq[String]): Seq[String] = {
  strings.filterNot{
    string => string  contains "y"

  }

}

//test function return only strings not containing a "y"
stripStringOfY(Seq("abc", "def", "xyz"))

def resultFive(numbers: Seq[Int]): Boolean = {
  numbers.exists{
    number => number > 5
  }

}

//test boolean where sequence contains number > 5
resultFive(Seq(1,2,3,4,5,6,7,8,9,0))


