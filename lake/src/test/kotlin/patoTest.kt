import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.example.Pato
import kotlin.test.assertEquals

class PatoTests{

    @get:BeforeEach
    var patoJuca = Pato()

    @Test
    fun testeDeVoo(){
        var patoJo = Pato()

        assertEquals("estou voando", patoJuca.voar())
    }

}