package Anonymous;

public class MethodParameter {

	public static void main(String[] args) {
		FoodFactory foodFactory = new FoodFactory();
		VehicleFactory vehicleFactory = new VehicleFactory();

		foodFactory.eatFood(new Food() {
			@Override
			void eat() {
				System.out.println("Food is eaten");
			}
		});

		vehicleFactory.moveVehicle(new Vehicle() {
			@Override
			public void move() {
				System.out.println("Vehicle is moving");
			}
		});
	}
}

abstract class Food {
	abstract void eat();
}

interface Vehicle {
	void move();
}

class FoodFactory {
	public void eatFood(Food food) {
		food.eat();
	}
}

class VehicleFactory {
	public void moveVehicle(Vehicle vehicle) {
		vehicle.move();
	}
}
