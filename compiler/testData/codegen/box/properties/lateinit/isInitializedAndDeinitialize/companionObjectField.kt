// WITH_RUNTIME

class Foo {
    companion object {
        lateinit var foo: String

        fun bar(): String {
            if (::foo.isInitialized) throw AssertionError()
            foo = "OK"
            return foo
        }
    }
}

fun box(): String = Foo.bar()
