package Acuario
import kotlin.math.PI

open class Acuario (open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {

    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma = "rectángulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

    fun imprimirTamano() {
        println(forma)

        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")

        println("Volumen: $volumen l Agua: $agua l (${agua / volumen * 100.0}% lleno)")
    }
}

// Subclase de Acuario para un tanque cilíndrico.
class TanqueTorre (override var alto: Int, var diametro: Int): Acuario(alto = alto, ancho = diametro, largo = diametro) {
    // Calcula el volumen de un cilindro.
    override var volumen: Int
        get() = (ancho / 2 * largo / 2 * alto / 1000 * PI).toInt()
        set(valor) {
            // Ajusta el alto basado en el volumen dado.
            alto = ((valor * 1000 / PI) / (ancho / 2 * largo / 2)).toInt()
        }

    // Calcula el agua como el 80% del volumen.
    override var agua = volumen * 0.8

    // Define la forma como "cilindro".
    override val forma = "cilindro"
}



