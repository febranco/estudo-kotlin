    package one.digitalInovation.digiobank

class people {

    var name: String = "Felipe"
    private get

    constructor()
    fun peopleInfo() = "$nome e $cpf"


    var cpf: String = "123.123.123-48"
     private set
}

fun main(){
    val felipe = people()

    println(felipe.peopleInfo())
    //println(felipe.name)
    //println(felipe.cpf)
    //println(felipe.Endereco().rua)
}