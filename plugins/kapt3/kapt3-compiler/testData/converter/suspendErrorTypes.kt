// CORRECT_ERROR_TYPES
// WITH_RUNTIME

@file:Suppress("UNRESOLVED_REFERENCE")
class Foo {
    suspend fun a(): ABC = TODO()

    suspend fun b(): Result<ABC> = TODO()
}