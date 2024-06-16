package study.equalshash;

import java.util.Objects;

public class equals {
    public static void main(String[] args) {
        Outer outer1 = new Outer(1, new Inner(1));
        Outer outer2 = new Outer(1, new Inner(1));
        System.out.println("outer1 equals outer2 = " + outer1.equals(outer2));
    }

    static class Outer {
        int data;
        Inner classData;

        public Outer(int data, Inner classData) {
            this.data = data;
            this.classData = classData;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Outer outer)) return false;
            return data == outer.data && classData.equals(outer.classData);
        }
    }

    private static class Inner {
        int data;

        public Inner(int data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Inner inner)) return false;
            return data == inner.data;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(data);
        }
    }
}
