public class CaesarCipher {
    public static void main(String[] args) {
        String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"  };
        Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };

        for ( String groceryItem : myGroceryList ) {
            System.out.println( groceryItem );
        }

        Integer total = 0;
        for ( Integer price : groceryItemPrices) {
            total = total + price;
        }

        System.out.println("Your total for this shopping trip will be: $" + total);
    }
}