fun main() {
    var opcion:Int
    var num1:Float
    var num2:Float

    do{
       print("ingrese el primer numero")
        num1= readLine()!!.toFloat()
        println("Ingrese el segundo numero")
        num2= readLine()!!.toFloat()
        print("EIJA UNA OPCION \n1. sumar \n2.Restar \n3.dividir \n4.multiplicar \n5. finalizar")
        opcion= readLine()!!.toInt()

        when(opcion){
            1 -> println("La suma es: ${num1+num2}")
            2 -> println("La resta es: ${num1-num2}")
            3 -> println("La multiplicacion es: ${num1*num2}")
            4 ->{
                if(num2<=0){
                    println("El segundo numero no puede ser negativo o igual a cero")
                }else{
                    println("La division es: ${num1/num2}")
                }
            }
            5 -> println("Finalizo")
            else -> println("Opcionn inavlida")
        }


    }while (opcion != 5)


}