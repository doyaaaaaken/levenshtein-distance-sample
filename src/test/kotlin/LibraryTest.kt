import org.junit.Test
import kotlin.test.assertEquals

class LibraryTest {

    @Test
    fun checkDistance() {
        assertEquals(0, checkDistance("", ""))
        assertEquals(0, checkDistance("a", "a"))
        assertEquals(1, checkDistance("a", "b"))
        assertEquals(1, checkDistance("a", "aa"))
        assertEquals(1, checkDistance("a", "ab"))
        assertEquals(0, checkDistance("abcd", "abcd"))
        assertEquals(4, checkDistance("abcd", "dcba"))
        assertEquals(3, checkDistance("ちょっと地図貸して", "ちょっと静かにして"))
    }
}
