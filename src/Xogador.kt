package boletin13
class Xogador (var dorsal : Int, var demarcacion : String,  id : Int, nome : String, edade : Int): //constructor principal. Hereda de seleccion
    Seleccion (id , nome, edade) {

    // Métodos override para coger los métodos de la clase heredada
    override fun concentrarse () : String{
        return "Concentrase o xogador: $nome"
    }

    override fun viaxar(): String {
        return "Viaxa o xogador: $nome"
    }

    override fun toString () : String{
        return "id: $id , nome: $nome , edade: $edade , dorsal: $dorsal, demarcacion: $demarcacion"
    }

}
