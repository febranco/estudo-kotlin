package src.main.kotlin.Teste

import src.main.kotlin.Funcionario

class imprimirRelatorio {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}