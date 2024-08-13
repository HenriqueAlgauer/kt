open class Pato (var voo: Voar){

    fun voarDeFato(){
        this.voo.executaVoo()
    }

    fun mudarEstiloDeVoo(novoVoo : Voar){
        this.voo = novoVoo
    }

    open fun fazerQuack(){
        println("Fazer Quack")
    }

    open fun boiar(){
        println("O pato está boiando")
    }
}

class PatoBrabo(voo: Voar) : Pato(voo) {
    override fun fazerQuack(){
        println("Brabo Quack")
    }

    fun bicar(){
        println("Toma bicada")
    }
}