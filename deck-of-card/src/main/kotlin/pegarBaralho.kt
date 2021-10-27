import Model.Card
import controller.DeckController
import org.json.JSONArray
import org.json.JSONObject

fun main() {
    val deckController = DeckController()
    val carta = deckController.drawCard()
    println(carta)
    val carta2 = deckController.drawCard()
    println(carta2)
}