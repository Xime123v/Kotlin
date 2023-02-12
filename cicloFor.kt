fun main() {

    var sumaPromedios = 0.0
    println("Ingrese la cantidad de estudiantes:")
    var cantidadEstudent= readLine()!!.toInt()

    for (i in 1..cantidadEstudent){
        println("Ingrese el promedio del estudiante $i")
        var promedio = readLine()!!.toDouble()
        sumaPromedios += promedio
    }

    var promedioTotal = sumaPromedios / cantidadEstudent
    println("cantidad de estudiantes son : $cantidadEstudent")
    println("Promedio total de los promedios es $promedioTotal")


}