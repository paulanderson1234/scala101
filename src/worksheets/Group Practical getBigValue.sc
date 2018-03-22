def getBigVal(input1: Int, input2: Int): String = {

  if (input1 > input2) "first"

  else if (input1 < input2) "second"

  else "same"

}

val test1 = 12
val test2 = 10

getBigVal(test1, test2)
getBigVal(12, 10)
getBigVal(10, 12)
getBigVal(10, 10)
getBigVal(12, 12)
getBigVal(0, -12)




def nameLength(firstName: String, surname: String): Int = {

  if (firstName.length > surname.length) firstName.length

  else if (firstName.length < surname.length ) surname.length

  else 0

}

val testFirstName = "Arnold"
val testSurname = "Schwarzenegger"
val testFirstname2 = "Bruce"
val testSurname2 = "Lee"
val testFirstname3 = "Ethan"
val testSurname3 = "Hawke"

nameLength(testFirstName, testSurname)
nameLength(testFirstname2,testSurname2)
nameLength(testFirstname3,testSurname3)

