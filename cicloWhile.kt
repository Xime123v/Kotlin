fun main() {
    print("Ingrese la cantidad de personas a saludar")
    val saludarCant = readLine()!!.toInt()
    var contador = 1


    while (contador <= saludarCant){
        print("Ingrese el nombre de la persona $contador")
        val nombre= readLine()!!
        println("Hola $nombre, Bienvenido ")
        contador++
    }
}