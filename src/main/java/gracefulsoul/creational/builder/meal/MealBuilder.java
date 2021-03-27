package gracefulsoul.creational.builder.meal;

import gracefulsoul.creational.builder.item.burger.ChickenBurger;
import gracefulsoul.creational.builder.item.burger.VegBurger;
import gracefulsoul.creational.builder.item.drink.Coke;
import gracefulsoul.creational.builder.item.drink.Pepsi;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}