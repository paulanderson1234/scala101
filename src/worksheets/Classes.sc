class Apple(val brand: String,
            var colour: String){

  val size = "Big"
}

val smith = new Apple("Granny Smith", "Green")
val lady = new Apple("Pink Ladyellow", "PinkishLady")

smith.colour = "Y" //can change value if set as var
//smith.brand = "changeMe" //cannot change value as set as val and defined
//
lady.size
