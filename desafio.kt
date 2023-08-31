// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("${usuario.nome}, matriculado na formação da DIO$nome")
        } else {
            println("${usuario.nome}, Já está matriculado na formação da DIO$nome")
        }
    }
}

fun main() {
    val usuario1 = Usuario("Edinaldo")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)

    val formacao = Formacao(" 'Code Update TQI - Backend com Kotlin e Java.'" , listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario1) // Tentativa de matrícula duplicada

    // Exibir lista de inscritos
    println("Inscritos na formação da DIO${formacao.nome}: ${formacao.inscritos.joinToString(", ") { it.nome }}")
}
