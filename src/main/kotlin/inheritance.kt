open class Vehicle (var wheels : Int , var maxspeed : Int) //Open Keyword is used to signify that class is extensible .IMPORTANT
{
    //Class Method
    fun drive()
    {
        println("It drives (this is a Parent Class method)")
    }
}

class Bike : Vehicle(2, maxspeed = 100) //class Bike extends class Vehicle by using ':' symbol
{
    var brand : String = "KTM"
}

class Train(var duration : Int /*Like here Child Classes can have their constructors as well*/, maxspeed: Int) : Vehicle(60, maxspeed)
{
    fun train() //Child's own method
    {
        println("Train Journey is suitable for Long Distances")
    }
}

fun main ()
{
    var v1 = Vehicle(2,10)
    var b1 = Bike()
    var t1 = Train(6, 200)

    b1.drive() // Since Bike is subclass of Vehicle its object can easily use Vehicle's method 'drive'


    println("Vehicle has wheels = " + v1.wheels + " and max speed of " + v1.maxspeed)
    println("Bike has wheels = " + b1.wheels + " and max speed of " + b1.maxspeed + " and is of brand " + b1.brand)
    println("Train has wheels = " + t1.wheels + " and max speed of " + t1.maxspeed + " and has duration " + t1.duration + " hours")

    t1.train()

}


/*
Output :
It drives (this is a Parent Class method)
Vehicle has wheels = 2 and max speed of 10
Bike has wheels = 2 and max speed of 100 and is of brand KTM
Train has wheels = 60 and max speed of 200 and has duration 6 hours
Train Journey is suitable for Long Distances
 */