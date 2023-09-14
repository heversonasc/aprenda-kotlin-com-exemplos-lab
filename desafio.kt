enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class User(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {
    val inscritos = mutableListOf<User>()

    fun matricular(usuario: User) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Criação de alguns objetos para simulação
    val userA= User("Heverson")
    val userB = User("Dio")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")

    val formacao = Formacao("Desenvolvedor kotlin formado pela Dio.")
    formacao.conteudos.add(conteudo1)
    formacao.conteudos.add(conteudo2)

    formacao.matricular(userA)
    formacao.matricular(userB)

    println("Formação: ${formacao.nome}")
    println("Conteúdos:")
    for (conteudo in formacao.conteudos) {
        println("- ${conteudo.nome} (${conteudo.duracao} minutos)")
    }

    println("Inscritos:")
    for (inscrito in formacao.inscritos) {
        println("- ${inscrito.nome}")
    }
}
    
  // Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
  // Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.