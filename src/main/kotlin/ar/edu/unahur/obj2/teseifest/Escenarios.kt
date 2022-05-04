package ar.edu.unahur.obj2.teseifest

interface Escenario {
    val lineUp: Map<Int,String>
}

object escenarioRock: Escenario {
    override val lineUp: Map<Int, String> = mapOf<Int,String>(1 to "Sumados", 2 to "Joya Nunca Taxi")
}
object escenarioCumbia: Escenario {
    override val lineUp: Map<Int, String> = mapOf<Int,String>(1 to "Luna", 2 to "Calí")
}
object escenarioTrap: Escenario {
    override val lineUp: Map<Int, String> = mapOf<Int,String>(1 to "Dub", 2 to "Pipe")
}