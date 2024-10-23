fun main() {

    val day = Days.Sunday
    println("$day ${day.number}")


    val day2 = Days.entries
    println("$day2")

    day.printEnumDetails()


    val red = Red("Mushroom",25)
    val red2 = Red("Fire",30)

    println("${red.type} ${red.points}")
    println("${red2.type} ${red2.points}")

    val tile:Tile = Red("Mushroom",20)
    val point = when(tile){
        is Red -> tile.points * 2
        is Blue -> tile.points * 1
    }

    println(point)
}
enum class Days(val number:Int){

    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),


    Thursday(4),
    Friday(5),
    Saturday(6);

    fun printEnumDetails(){
        println("Day is $this")
    }
}

sealed class Tile
class Red(val type:String, val points:Int) :Tile()
class Blue(val points:Int): Tile()
