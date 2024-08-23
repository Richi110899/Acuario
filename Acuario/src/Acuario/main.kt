// Importa las clases Tiburón y PezPayaso desde el paquete acuario
import acuario.Tiburón
import acuario.PezPayaso

// Función para crear instancias de Tiburón y PezPayaso, y mostrar sus colores y comportamientos
fun crearPeces() {
    val tiburon = Tiburón()       // Crea una instancia de Tiburón
    val pezPayaso = PezPayaso()   // Crea una instancia de PezPayaso

    // Imprime el color de cada pez
    println("El color del ${tiburon.nombre()} es: ${tiburon.color}")
    println("El color del ${pezPayaso.nombre()} es: ${pezPayaso.color}")

    // Llama al método comer() para cada pez e imprime el mensaje correspondiente
    tiburon.comer()  // Imprime "Tiburón: cazar y comer peces"
    pezPayaso.comer()  // Imprime "Pez Payaso: comer algas"
}

// Función principal que ejecuta `crearPeces`
fun main() {
    crearPeces()  // Llama a la función `crearPeces` para mostrar los colores y comportamientos de los peces
}
