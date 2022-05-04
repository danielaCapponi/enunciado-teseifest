package ar.edu.unahur.obj2.caralibro

import ar.edu.unahur.obj2.teseifest.*


object Festival {
    val escenarios= listOf(escenarioRock, escenarioCumbia, escenarioTrap);

    fun lineUp(): List<Map<Int, String>> {
        return escenarios.map { n -> n.lineUp }
    }
}


object App {

}

class Perfil(participante: Participante, nivel: NivelDeAcceso) {
    fun puedeAcceder(escenario: Escenario): Any {
        return true
    }

}

enum class NivelDeAcceso { FREE, FAN, REFAN, SUPERFAN }

