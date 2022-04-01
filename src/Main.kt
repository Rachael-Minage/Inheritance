fun main() {
    var car = Car("Subaru", "Outback", "white", 15)
    car.carry(12)
    car.identity()
    var parkingFees = car.calculateParkingFees(10)
    println(parkingFees)
    var bus= Bus("Isuzu","Canter","White",4)
var maximum=bus.maxTripFare(100.00)
    println(maximum)
var pFees= bus.calculateParkingFees(10)
    println(pFees)
}

open class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var x = people-capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else println("Over capacity by $x people")


    }

    fun identity() {
        println("I am a $color ,$make, $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        var fee = hours * 20
        return fee

    }

}

class Bus(make: String, model: String, color: String, capacity: Int) : Car(make, model, color, capacity) {
    fun maxTripFare(fare: Double) : Double{
    var maxFare = fare*capacity
        println(maxFare)
        return maxFare
    }

    override fun calculateParkingFees(hours: Int): Int {
       // return super.calculateParkingFees(hours)
        var parkfees = hours*capacity
        return parkfees
    }

}