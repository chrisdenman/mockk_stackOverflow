import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test

interface Fails {
    fun fn(): Any
}

interface Passes {
    fun fn(): String
}

class StackOverflowSpec {

    @Test fun fails() {
        val collaborator = mockk<Fails>()
        every { collaborator.fn() } returns ""
    }

    @Test fun passes() {
        val collaborator = mockk<Passes>()
        every { collaborator.fn() } returns ""
    }
}
