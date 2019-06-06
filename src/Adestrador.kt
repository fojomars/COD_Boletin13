package boletin13

class Adestrador (var idFederacion : String, id : Int, nome : String, edade : Int): //constructor principal. Hereda de seleccion
    Seleccion (id , nome, edade) {

    //Métodos Override para sobrescribir el metodo que heredado
    override fun concentrarse () : String{
        return "Concentrase o adestrador: $nome"
    }

    override fun viaxar(): String {
        return "Viaxa o adestrador: $nome"
    }

    override fun toString () : String{
        return "id: $id , nome: $nome , edade: $edade , idFederacion: $idFederacion"
    }

}