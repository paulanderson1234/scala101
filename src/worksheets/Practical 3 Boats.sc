class Boat(val length: Int,
           val width: Int,
           val topSpeed: Int) {

  val speed = topSpeed

  def isFasterThan(otherBoat: Boat): Boolean = {
    if (otherBoat.topSpeed > topSpeed) false

    else if (otherBoat.topSpeed < topSpeed) true

    else false //same speed
  }

}

class Sailboat(length: Int,
               width: Int,
               topSpeed: Int,
               val numSails: Int,
               val hasOars: Boolean,
               val canTack: Boolean)
  extends Boat(
    length,
    width,
    topSpeed)

class MotorBoat(length: Int,
                width: Int,
                topSpeed: Int,
                val engineDisplacement: Int,
                val fuelType: String)
  extends Boat(
    length,
    width,
    topSpeed
  )

val myBoat: Sailboat = new Sailboat(
  numSails = 2,
  length = 10,
  width = 2,
  topSpeed = 100,
  hasOars = true,
  canTack = true
)


myBoat.numSails
myBoat.length
myBoat.width
myBoat.topSpeed
myBoat.hasOars
myBoat.canTack


class LuxurySailBoat(
                      length: Int,
                      width: Int,
                      topSpeed: Int,
                      numSails: Int,
                      hasOars: Boolean,
                      canTack: Boolean,
                      val hasJacussi: Boolean,
                      val hasBooze: Boolean) extends Sailboat(
  length,
  width,
  topSpeed,
  numSails,
  hasOars,
  canTack
)


class PirateShip(
                  length: Int,
                  width: Int,
                  topSpeed: Int,
                  numSails: Int,
                  hasOars: Boolean,
                  canTack: Boolean,
                  val numGangPlanks: Int,
                  val guns: Int
                )
  extends Sailboat(
    length,
    width,
    topSpeed,
    numSails,
    hasOars,
    canTack
  ) {

  def canOutgun(otherPirateShip: PirateShip): Boolean = {

    if (otherPirateShip.guns > guns) false

    else if (otherPirateShip.guns < guns) true

    else false //same number of guns

    }

  }

val myPirateShip: PirateShip = new PirateShip(
  length = 100,
  width = 60,
  topSpeed = 60,
  numSails = 4,
  hasOars = true,
  canTack = false,
  numGangPlanks = 2,
  guns = 10
)

class WarShip(
               length: Int,
               width: Int,
               topSpeed: Int,
               engineDisplacement: Int,
               fuelType: String,
               val country: String) extends MotorBoat(
  length,
  width,
  topSpeed,
  engineDisplacement,
  fuelType
)

class PacerBoat(val sponsor: String, val quarterMileTime: Int) extends MotorBoat(
  length = 10,
  width = 20,
  topSpeed = 90,
  engineDisplacement = 2000,
  fuelType = "Diesel"
)

val pacerBoatNew = new PacerBoat("PPL PLC", 20)

//compare myBoat top speed with passed in topSpeed from PacerBoat
myBoat.isFasterThan(pacerBoatNew)

val myBoat2: Sailboat = new Sailboat(
  numSails = 2,
  length = 10,
  width = 2,
  topSpeed = 110,
  hasOars = true,
  canTack = true
)

//myBoat topSpeed = 100 myBoat2 topSpeed = 110
myBoat.isFasterThan(myBoat2)

val myBoat3: Sailboat = new Sailboat(
  numSails = 2,
  length = 10,
  width = 2,
  topSpeed = 100,
  hasOars = true,
  canTack = true
)

//myBoat topSpeed = 100 myBoat2 topSpeed = 100 - same speed therefosre false
myBoat.isFasterThan(myBoat3)

val myNewPirateShip = new PirateShip(
  length = 100,
  width = 60,
  topSpeed = 60,
  numSails = 4,
  hasOars = true,
  canTack = false,
  numGangPlanks = 2,
  guns = 15
)

myPirateShip.canOutgun(myNewPirateShip)

val myNewPirateShip2 = new PirateShip(
  length = 100,
  width = 60,
  topSpeed = 60,
  numSails = 4,
  hasOars = true,
  canTack = false,
  numGangPlanks = 2,
  guns = 2
)

myPirateShip.canOutgun(myNewPirateShip2)
