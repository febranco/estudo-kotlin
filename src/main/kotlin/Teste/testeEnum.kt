package src.main.kotlin.Teste

import src.main.kotlin.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name}  ${elemento.toString()}")

    }

    ClienteTipo.values().forEach {
        println("${it.name}  ${it.toString()}")
    }
}

