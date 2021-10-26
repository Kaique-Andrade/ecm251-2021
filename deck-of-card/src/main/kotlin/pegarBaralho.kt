fun main() {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id = resposta.jsonObject["deck_id"]
    val cartas_resposta = khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val valor_carta = cartas_resposta.jsonObject["cards"]
    println(valor_carta)
}