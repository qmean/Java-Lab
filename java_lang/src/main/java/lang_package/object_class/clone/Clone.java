package lang_package.object_class.clone;

public class Clone {
    public static void main(String[] args) {
        TestA original = new TestA(3, new TestB(5));
        TestA clone = original.clone();
        System.out.println("original = " + original);
        System.out.println("original.data = " + original.data);
        System.out.println("original.classData = " + original.classData);
        System.out.println("original.classData.data = " + original.classData.data);
        System.out.println("==================================================");
        System.out.println("clone = " + clone);
        System.out.println("clone.data = " + clone.data);
        System.out.println("clone.classData = " + clone.classData);
        System.out.println("clone.classData.data = " + clone.classData.data);
        System.out.println("==================================================");
        System.out.println("original.classData의 Data 변경");
        System.out.println("==================================================");
        original.classData.data = 10;
        System.out.println("original.classData.data = " + original.classData.data);
        System.out.println("clone.classData.data = " + clone.classData.data);
    }
}

class TestA implements Cloneable {
    int data;
    TestB classData;

    public TestA(int data, TestB classData) {
        this.data = data;
        this.classData = classData;
    }

    @Override
    public TestA clone() {
        try {
            return (TestA) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class TestB {
    int data;

    public TestB(int data) {
        this.data = data;
    }
}
