import DAO.ProdutoDAO
import models.Produto
import java.sql.DriverManager

fun main(args: Array<String>) {
    // Cria um DAO para os produtos
    val produtosDAO = ProdutoDAO()
    produtosDAO.deletar(9)
    produtosDAO.atualizar(Produto(8,"Samsung",350.5,2))
    var produtos = produtosDAO.pegarTodosSeguro()
    // Intera pelo resultado obtido
    for (produto in produtos){
        println(produto)
    }
    //produtosDAO.inserirUm(Produto(0, "Agua", 5.0,12))
    //produtosDAO.inserirVarios(listOf(
    //    Produto(0,"Clementine",799.98,1),
    //    Produto(0,"Listerine",15.99,80)))
}