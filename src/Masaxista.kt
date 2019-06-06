package boletin13

class Masaxista (var titulacion : String, var anosExperiencia : Int, id : Int, nome : String, edade : Int): //constructor principal. Hereda de seleccion
    Seleccion (id , nome, edade) {

    //Métodos Override para sobrescribir el metodo que heredado
    override fun concentrarse () : String{
        return "Concentrase o masaxista: $nome"
    }

    override fun viaxar(): String {
        return "Viaxa o masaxista: $nome"
    }

    override fun toString () : String{
        return "id: $id , nome: $nome , edade: $edade , titulacion: $titulacion, anosExperiencia: $anosExperiencia"
    }

}
