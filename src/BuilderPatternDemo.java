
public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal veganMeal = mealBuilder.prepareVeganMeal();
		System.out.println("Vegan Meal");
		veganMeal.showItems();
		System.out.println("Total Cost: " + veganMeal.getCost());
		
		
		Meal nonVeganMeal = mealBuilder.prepareNonVeganMeal();
		System.out.println("\nNon Vegan Meal");
		nonVeganMeal.showItems();
		System.out.println("Total Cost: " + nonVeganMeal.getCost());

	}

}
