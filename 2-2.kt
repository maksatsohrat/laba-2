import kotlin.math.sqrt
fun length(x: Double, y: Double): Double
{
    return sqrt(x*x+y*y)
}

fun main(args: Array<String>)
{
    println("Enter coordinates of the first point:")
    val x1 = readLine()!!.toDouble()
    val y1 = readLine()!!.toDouble()
    println("Enter coordinates of the second point:")
    val x2 = readLine()!!.toDouble()
    val y2 = readLine()!!.toDouble()
    println("Enter coordinates of the third point:")
    val x3 = readLine()!!.toDouble()
    val y3 = readLine()!!.toDouble()
    val p = length(x1,y1)+length(x2,y2)+length(x3,y3)
    print("Perimeter is $p")
}