fun main() {
    println("Ingrese el nombre del estudiante")
    val nombre= readLine()!!

    println("ingrese la materia")
    val materia= readLine()!!

    println("Ingrese la primera nota ")
    val nota1= readLine()!!.toFloat()

    println("Ingrese la SEGUNDA nota ")
    val nota2= readLine()!!.toFloat()

    println("Ingrese la tercera nota ")
    val nota3= readLine()!!.toFloat()


    val promedio=(nota1+nota2+nota3)/3

    println("El estuadiante $nombre saco en el promedio un $promedio")

    if(promedio<3.5){
        println("El estudiante $nombre  perdio la materia $materia en un promedio $promedio")
    }

}