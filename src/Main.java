//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("DR001", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("DR002", "Nước cam", 40000, 10);

        for (Drink drink : drinks) {
            if (drink != null){
                drink.displayInfo();
                System.out.println("Thành tiền: "+ drink.calculatePrice() );
                if (drink instanceof FruitJuice){
                    ((FruitJuice) drink).mix();
                }
                System.out.println("\n");
            }
        }
    }
}