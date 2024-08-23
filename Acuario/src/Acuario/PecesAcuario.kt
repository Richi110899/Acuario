package acuario

// Interfaz que define un método comer()
interface AccionPez {
    fun comer()  // Método abstracto que deben implementar las clases
}

// Clase abstracta Pez que implementa la interfaz AccionPez
abstract class Pez : AccionPez {
    abstract val color: String  // Propiedad abstracta de tipo String

    // Método para obtener el nombre del pez (puede ser sobreescrito en subclases si se desea)
    abstract fun nombre(): String
}

// Clase Tiburón que extiende Pez e implementa AccionPez
class Tiburón : Pez() {
    override val color: String = "gris"  // Implementación de la propiedad abstracta

    // Implementación del método comer() de la interfaz AccionPez
    override fun comer() {
        println("${nombre()}: cazar y comer peces")
    }

    // Implementación del método nombre()
    override fun nombre(): String {
        return "Tiburón"
    }
}

// Clase PezPayaso que extiende Pez e implementa AccionPez
class PezPayaso : Pez() {
    override val color: String = "dorado"  // Implementación de la propiedad abstracta

    // Implementación del método comer() de la interfaz AccionPez
    override fun comer() {
        println("${nombre()}: comer algas")
    }

    // Implementación del método nombre()
    override fun nombre(): String {
        return "Pez Payaso"
    }
}
