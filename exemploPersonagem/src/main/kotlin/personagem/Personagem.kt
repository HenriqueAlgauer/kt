package personagem

import javax.swing.AbstractAction

class Personagem {
    var forca: Int = 0
    var constituicao: Int = 0
    val raca: Raca
    var distribuirAtributos: DistribuicaoAtributos

    fun init(){
        distribuirAtributos.distribuir()
        raca.aplicarBonus
    }
}