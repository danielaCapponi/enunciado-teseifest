import ar.edu.unahur.obj2.caralibro.*
import ar.edu.unahur.obj2.teseifest.*
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class AppTest : DescribeSpec({
    describe("teseifest") {
      val artistaRock = ArtistaRock("Trueno")
      val artistaCumbia = ArtistaCumbia("Nube")
      val artistaTrap = ArtistaTrap("Sol")

      val juan = Participante(
            34,
            CuentaInstagram ("@juan"),
            "1141598393",
            listOf(artistaRock, artistaCumbia, artistaTrap)
        )
      val luis = Participante(
            20,
            CuentaInstagram ("@luis"),
            "1141533393",
            listOf(artistaRock, artistaCumbia, artistaTrap)
        )
      val rene = Participante(
            15,
            CuentaInstagram ("@rene"),
            "1141008393",
            listOf(artistaRock, artistaCumbia, artistaTrap)
        )
      val laura = Participante(
            27,
            CuentaInstagram ("@laura"),
            "1141888393",
            listOf(artistaRock, artistaCumbia, artistaTrap)
        )
      val perfilJuanFan = Perfil(juan, NivelDeAcceso.FAN)
      val perfilLauraRefan = Perfil(laura, NivelDeAcceso.REFAN)
      val perfilReneSuperfan = Perfil(rene, NivelDeAcceso.SUPERFAN)
      val perfilLuisFree = Perfil(luis, NivelDeAcceso.FREE)

      describe("Accesos") {
            describe("El acceso de los perfiles") {
                it("Fan intenta acceder al vip de un escenario") {
                    perfilJuanFan.puedeAcceder(escenarioRock).shouldBe(true)
                }
                it("Fan intenta acceder al vip de dos escenario") {
                    perfilJuanFan.puedeAcceder(escenarioCumbia).shouldBe(false)
                }
                it("Fan intenta acceder al vip de todos los escenarios") {
                    perfilJuanFan.puedeAcceder(escenarioTrap).shouldBe(false)
                }
                it("Refan intenta acceder al vip de un escenario") {
                    perfilLauraRefan.puedeAcceder(escenarioRock).shouldBe(true);
                }
                it("Refan intenta acceder al vip de dos escenario") {
                    perfilLauraRefan.puedeAcceder(escenarioCumbia).shouldBe(true);
                }
                it("Refan intenta acceder al vip de todos los escenarios") {
                    perfilLauraRefan.puedeAcceder(escenarioTrap).shouldBe(false)
                }
                it("Superfan intenta acceder al vip de un escenario") {
                    perfilReneSuperfan.puedeAcceder(escenarioRock).shouldBe(true);
                }
                it("Superfan intenta acceder al vip de dos escenario") {
                    perfilReneSuperfan.puedeAcceder(escenarioCumbia).shouldBe(true);
                }
                it("Superfan intenta acceder al vip de todos los escenarios") {
                    perfilReneSuperfan.puedeAcceder(escenarioTrap).shouldBe(true);
                }
                it("Free intenta acceder al vip de un escenario") {
                    perfilLuisFree.puedeAcceder(escenarioRock).shouldBe(false)
                }
                it("Free intenta acceder al vip de dos escenario") {
                    perfilLuisFree.puedeAcceder(escenarioCumbia).shouldBe(false)
                }
                it("Free intenta acceder al vip de todos los escenarios") {
                    perfilLuisFree.puedeAcceder(escenarioTrap).shouldBe(false)
                }
            }

        }

        describe("Un usuario") {
            it("puede calcular el espacio que ocupan sus publicaciones") {
                val juana = Perfil()
                juana.agregarPublicacion(fotoEnCuzco)
                juana.agregarPublicacion(saludoCumpleanios)
                juana.espacioDePublicaciones().shouldBe(550548)
            }
        }
    }
})
