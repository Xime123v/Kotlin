fun main() {
    println("Ingrese su nombre")
    val nombre = readLine().toString()

    println("Ingrese la materia")
    val materia = readLine().toString()

    println("Ingrese la nota 1")
    val nota1= readLine()!!.toFloat()

    println("Ingrese la nota 2")
    val nota2= readLine()!!.toFloat()

    println("Ingrese la nota 3")
    val nota3= readLine()!!.toFloat()

    val prom = (nota1+nota2+nota3)/3

    println("El promedio de $nombre es $prom de la materia $materia")

    if (prom >= 3.5){
        println("Gano la materia en $prom")
    }else{
        println("Perdio la materia en $prom")
    }


}