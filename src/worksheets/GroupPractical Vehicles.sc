class Vehicle(val name: String,
              val maxSpeed: Int)


class Land(name: String,
           maxSpeed: Int,
           val numWheels: Int)
    extends Vehicle(name, maxSpeed)

class Car(name: String,
          maxSpeed: Int,
          numWheels: Int,
          val capacity: Int)
    extends Land (name, maxSpeed, numWheels) with FuelBurning



val myCar: Car = new Car(
  name = "avensis",
  maxSpeed = 150,
  numWheels = 4,
  capacity = 15)

myCar.maxSpeed
myCar.numWheels
myCar.name
myCar.capacity

trait Spoiler {
  val size: String = "Large"
}

trait FuelBurning{
  val capacity: Int
}
