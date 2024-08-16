
open class Cacador(var emitirSom: EmitirSom, var voar: VoarComBalao){

    fun atirar(){
        println("Tei")
    }

    fun imitarSom(){
        this.emitirSom.barulha()
    }

    fun voarComBalao(){
        this.voar.executaVoo();
    }

}