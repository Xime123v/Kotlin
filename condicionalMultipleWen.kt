fun main() {
    var menu = """
        Menu de opciones 
        1. saludar
        2.sumar dos numeros
        3. pedir el nombre de una persona
        Ingrese una opcion : """

    println(menu)

    var opcion= readLine()!!.toInt()

    when(opcion){
        1 -> println("Hola que mas")
        2 -> { println("Ingrese el primer numero:")
        val num1 = readLine()!!.toInt()
        println("Ingrese el segundo numero:")
            val num2 = readLine()!!.toInt()
            val suma = (num1+num2)
            println("La suma de $num1 y $num2 es $suma")
        }
        3-> {
            println("Ingrese su nombre")
            val nombre = readLine()!!
            println("Hola $nombre")
        }
        else -> println("Ingrese una opcion valida")



    }
}