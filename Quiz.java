public class Quiz {
    public static void main(String[] args) {
        
        Dessert cake = new Dessert(4.99);
        Dessert pie = new Dessert(cake);
 
        String[] ingredients = new String[] {"Eggs", "Flower", "Baking Powder"};
        pie.setIngredients(ingredients);
       
        ingredients[2] = "Filling";
    }
}

