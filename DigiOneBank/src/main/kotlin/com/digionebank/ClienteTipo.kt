package com.digionebank

enum class ClienteTipo(val descricao:String) {
    PF("pessoa física"),
    PJ("pessoa jurídica");

    //função estatica, acessada apenas via classe, e não por instância de objeto
    companion object {
        fun natureza() = ClienteTipo.values().forEach {
            it -> println("${it.name} - ${it.descricao}")
        }
    }
}