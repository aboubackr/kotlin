import java.util.*

internal class A {
    private val field1 = ArrayList<String>()
    internal val field2: List<String> = ArrayList()
    val field3 = 0
    protected val field4 = 0

    private var field5: List<String> = ArrayList()
    internal var field6: List<String> = ArrayList()

    private var field7 = 0
    internal var field8 = 0

    private var field9: String? = "a"
    private var field10: String? = foo()

    internal fun foo(): String {
        return "x"
    }

    internal fun bar() {
        field5 = ArrayList<String>()
        field7++
        field8++
        field9 = null
        field10 = null
    }
}