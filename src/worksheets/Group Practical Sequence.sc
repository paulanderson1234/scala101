//Group practical

//Create a Seq of the names of everybody on the course
//Create a Map of 1-“red”, 2-“yellow”, 3-“blue”, 4-“refrigerator” and play with
//accessing the elements
//write a function to add 1 to all numbers in a Seq
//write a function to remove all even numbers from a collection
//write a function that returns true if a Seq has a String that contains the letter
//“t” (to check if a string contains a character use .contavains("t") )

val groupSeq: Seq[String] = Seq ("Paul", "Joey", "David", "Wayne")

val stuff: Map[Int, String] = Map(1 -> "red", 2 -> "yellow", 3 -> "blue", 4 -> "refridgerator")

def plusOneToStuff(numbers: Seq[Int]): Seq[Int] = {
  numbers.map{
    number => number + 1
  }

//  numbers.map{
//    _ + 1
//  }

}

//testing the function defind above
plusOneToStuff(Seq(1,2,3,4))

def removeEvenNumbers(numbers: Seq[Int]): Seq[Int] = {
  numbers.filter{
    number => (number % 2) !=0
  }

}

//testing the function defined above
removeEvenNumbers(Seq(1,2,3,4,5,6,7,8,9,10))

//refined way of testing the function asbove
removeEvenNumbers(1 to 10)

def containsLowerCaseT(strings: Seq[String]): Boolean = {
  strings.exists{
    string => string.contains("t")
  }

}

//testing the function defined above
containsLowerCaseT(Seq("ChickenDipper", "Giraffe", "tart"))

