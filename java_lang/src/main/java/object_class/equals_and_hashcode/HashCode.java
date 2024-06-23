package object_class.equals_and_hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {
        Car car1 = new Car(3);
        Car car2 = new Car(3);
        Set<Car> carSet =new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        System.out.println("carSet.size() = " + carSet.size());
    }

    private static class Car {
        int i;

        public Car(int i) {
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Car car)) return false;
            return i == car.i;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(i);
        }
    }
}
