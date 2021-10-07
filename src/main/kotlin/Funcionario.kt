package src.main.kotlin

import one.digitalInovation.digiobank.people


 abstract class Funcionario(
     nome:String,
     cpf: String,
     val salario: Double,
): people(nome, cpf) {
     protected abstract fun calculoAuxilio() : Double

     override fun toString(): String = """
         nome:$nome
         cpf:$cpf
         salario:$salario
         auxilio;${calculoAuxilio()}
    """.trimIndent()

}