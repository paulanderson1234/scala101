val age: Int = 18

if (age >= 18) {
  println("Certificate 18")
}

else if (age >= 15) {
  println("Certificate 15")
}

else if (age >= 12) {
  println("Certificate 12A")
}

else if (age >= 8) {
  println("Certificate PG")
}

else if (age >= 4) {
  println("Certificate U")
}

else {
  println("Certificate Not Defined")
}





val age2: Int = 18

val listAll: List[String] = List("Certificate U", "Certificate PG", "Certificate 12A", "Certificate 15", "Certificate 18")

println(listAll)

val U = "Certificate U"
val PG = "Certificate PG"
val TwelveA = "Certificate 12A"
val Fifteen = "Certificate 15"
val Eighteen = "Certificate 18"

val All = U + PG + TwelveA + Fifteen + Eighteen
val viewFifiteen = Fifteen + TwelveA + PG + U



if (age2 >= 18) {
  println(s"You can see the following class of films : $listAll")
}

else if (age2 >= 15) {
  println(s"You can see the following class of films : $listAll")
}

else if (age2 >= 12) {
  println("Certificate 12A")
}

else if (age2 >= 8) {
  println("Certificate PG")
}

else if (age2 >= 4) {
  println("Certificate U")
}

else {
  println("Certificate Not Defined")
}