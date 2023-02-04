class Car(var brand : String , var build : Int ) //Primary Constructor
{
    var maxSpeed : Int = 100 //Class Property or Class variable

    init { // init block to execute code when object is created
        println("$brand object created.")
    }
    //Secondary Constructor(Completely Optional)
    constructor/*constructor keyword*/(brand : String , build : Int, maxSpeed : Int/*dont use var or val here*/) : this(brand, build) //calling primary const.
    {
        this.maxSpeed = maxSpeed
    }

    //class methods
    fun details()
    {
        println("Car is a $brand $build")
    }
    fun detailsExtra()
    {
        println("Car is a $brand $build and can go upto $maxSpeed kmph")
    }
}

fun main ()
{
    var c1 = Car("Maruti",2008) //Object Creation with Primary Constructor
    var c2 = Car("Toyota",2011, 200) //Object Creation with Secondary Constructor
   
    //Calling Object's methods
    c1.details()
    c2.detailsExtra()

    println("Above Lines were details of a " + c2.brand + " " + c1.build) //Using Class variables
}


/*
Output :
Maruti object created.
Toyota object created.
Car is a Maruti 2008
Car is a Toyota 2011 and can go upto 200 kmph
Above Lines were details of a Toyota 2008
 */