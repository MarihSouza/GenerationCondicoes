fun main() {
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List  manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
        */

    val est = mutableListOf<String>()


    while (true) {
        println(" Departamento de estoque :")

        println("1 - Adicionar itens no estoque")
        println("2 - Remover itens no estoque")
        println("3 - atualizar itens no estoque")
        println("4 - Mostrar itens no estoque")
        println("5 - encerrar")

        println(" Escolha uma opção? ")

        val opcao = readLine()!!.toInt()

        println("")

        when (opcao) {

            1 -> {
                println(" Liste os itens no estoque")
                val cont = readLine()!!

                if (cont.isEmpty())
                    print("INVÁLIDO")
                else {
                    est.add(cont)
                    println(" adicionado com sucesso")

                }
            }
            2 -> {
                println(" Deseja remover um item? qual?")
                val cont = readLine()!!

                if (cont.isEmpty()) {
                    println("Valor inválido")
                } else {
                    if (est.contains(cont)) {
                        est.remove(cont)
                        println("O item $cont foi removido com sucesso")
                    } else {
                        println("O item $cont não existe na lista")

                    }

                }

            }

            3 -> {
                print("Selecione um item de 0 a ${est.size - 1}")
                val pos = readLine()!!.toInt()

                if (pos in 0..(est.size - 1)) {
                    print("\n Quer atualizar um item? qual? : ")
                    val cont = readLine()!!

                    est[pos] = cont
                } else {
                    println("Esse item não existe")
                }


            }
            4 -> {
                if (est.isEmpty()) {
                    println("O estoque está vazio")
                } else {
                    println("***Itens do Estoque***")

                    est.forEach {
                        println(it)
                    }

                }
            }

            else -> break

        }
    }
}