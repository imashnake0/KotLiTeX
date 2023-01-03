package core

abstract class Command(val name: String) : KotLiTeX {
    override fun toLaTeX(): String = "\\$name"
}
