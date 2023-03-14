fun main() {
    //Q1.
var vehicle = Vehicle("Toyota","Voxy","white",10)
    vehicle.carry(10)
    vehicle.carry(13)
    vehicle.identity()
    println(vehicle.calculateParkingFees(3))

//Q2.
    var bus = Bus("Toyota","Nissan","white",45)
println(bus.carry(55))
    println(bus.identity())
    println(bus.maxTripFare(400.0))
    println(bus.calculateParkingFees(4))


}
//Q1.
open class Vehicle(var make: String,var model: String,var color: String,var capacity: Int){
 fun carry(people:Int) {
     var y = people-capacity
     if (people<=capacity){
         println("carrying $people passagers")
     }else{
         println("Overcapacity by $y people")
     }
 }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours * 20
        return parkingFees
    }
}

//Q1.
class Car(make: String, model: String, color: String, capacity: Int):Vehicle(make,model,color,capacity)
//Q2.
class Bus(make: String, model: String,color: String,capacity: Int):Vehicle(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var  maxFare = fare*capacity
        return maxFare
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity


















    }
    }

