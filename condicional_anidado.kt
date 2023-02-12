fun main() {
    println("Ingrese su nombre")
    val nombre = readLine()!!.toString()

    println("Ingrese la materia")
    val materia= readLine()!!.toString()

    println("Ingrese la nota 1")
    val nota1 = readLine()!!.toFloat()

    println("Ingrese la nota 2")
    val nota2 = readLine()!!.toFloat()

    println("Ingrese la nota 3")
    val nota3 = readLine()!!.toFloat()

    val prom = (nota1+nota2+nota3)/3

    println("El promedio que saco $nombre fue $prom")

    if (prom >= 3.5){
        println("Gano la materia $materia en $prom")
    }else{
        println("Perdio la materia $materia en $prom")
        if(prom >= 2.5){
            println("Puede recuperar")
        }
    }


}