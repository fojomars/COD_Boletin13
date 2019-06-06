package boletin13
open class Seleccion(var id : Int, var nome : String, var edade : Int) { //este sería el constructor primario. Open es para que pueda usarse el sistema de herencias

    // Métodos
    open fun concentrarse (): String{
        return " Concentrase a seleccion"
    }

    open fun viaxar () : String{
        return "viaxa a Seleccion"
    }

    // el $variable se utliza para llamar a las variables del constructor
    override fun toString() : String{
        return "id: $id , nome: $nome , edade: $edade"
    }


}