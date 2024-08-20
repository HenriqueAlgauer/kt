import org.junit.jupiter.api.Test
import org.example.kotlin.Pato
import kotlin.test.assertEquals

class patoTests{

    @Before
    var patoJuca = Pato()

    @Test
    fun testeDeVoo(){
        var patoJo = Pato()

        assertEquals("estou voando", patoJuca.voar())
    }

}