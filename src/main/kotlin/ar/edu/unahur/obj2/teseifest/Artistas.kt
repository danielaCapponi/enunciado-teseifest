package ar.edu.unahur.obj2.teseifest

abstract class Artista(escenario: Escenario) {

}

class ArtistaRock(escenario: escenarioRock, nombre: String, horario: Int):Artista(escenarioRock) {

}

class ArtistaCumbia(escenario: escenarioCumbia, nombre: String, horario: Int):Artista(escenarioRock) {

}

class ArtistaTrap(escenario: escenarioTrap, nombre: String, horario: Int):Artista(escenarioRock) {

}