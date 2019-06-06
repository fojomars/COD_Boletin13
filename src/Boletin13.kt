package boletin13

object Boletin13 {
    fun main (args : Array<String>) { // clase Main del proyecyo

        // inicialización
        var objS = Seleccion(1, nome = "Iker", edade = 37)
        var objX = Xogador(dorsal = 11, demarcacion = "defensa", id = 2, nome = "Varane", edade = 25)
        var objA = Adestrador(idFederacion = "5676", id = 3, nome = "Jorge", edade = 50)
        var objM = Masaxista(titulacion = "medico", anosExperiencia = 14, id = 6, nome = "Pepe", edade = 65)

        // Ejecución de los diversos métodos
        println(objS.concentrarse())
        println(objS.viaxar())
        println(objS.toString())
        println(objX.concentrarse())
        println(objX.viaxar())
        println(objX.toString())
        println(objA.concentrarse())
        println(objA.viaxar())
        println(objA.toString())
        println(objM.concentrarse())
        println(objM.viaxar())
        println(objM.toString())


    }
}