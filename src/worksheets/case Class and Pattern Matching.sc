class Boat (val name: String)
class PirateShip (name: String) extends Boat(name)
class Sailboat (name: String) extends Boat(name)


val ship: Boat = new PirateShip("ship")

val test= ship match {
  case x: Sailboat  => x.name + " the sailboat"
  case x: PirateShip => x.name + " it's a pirate ship"
  case _ => "BOAT!!"

}

println(test)

//6 match {
//  case x if(1 to 10).contains(x) => println("it was in 1 to 10"))
//  case 7 => println("it was 7")
//  case _ => println("it was a number that was not expected")
//}

case class Apple(brand: String)

val apple1 = Apple("GrannySmith")
val apple2 = Apple("PinkLady")
val apple3 = Apple("PinkLady")

apple1 == apple2
apple2 == apple3

apple1.brand


val middleName: Option[String] = None

middleName match {
  case Some(mn) => println(mn)
  case None => println ()
}

//curried functions
def addTwoNumbers(num1:Int)(num2:Int): Int = {
  num1 + num2

}

val x = addTwoNumbers(5)(_)
val y = x(16)

