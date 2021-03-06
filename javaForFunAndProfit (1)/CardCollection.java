import java.util.ArrayList;

public class CardCollection {

  private String label;
  private ArrayList<Card> cards;

  public CardCollection(String label) {

    this.label = label;
    this.cards = new ArrayList<Card>();
  }

  public int size() {
    return cards.size();
  }

  public boolean empty() {
    return cards.size() == 0;
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public Card popCard(int i) {
    return cards.remove(i);
  }

  public Card popCard() {
    int i = size() - 1;
    return popCard(i);
  }

}
