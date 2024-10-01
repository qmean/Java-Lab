package lang_package.object_class.clone;

public class TwoWaysOfCopy {
    public static void main(String[] args) {
        Gun original = new Gun(10, new Bullet(3));
        Gun clone = original.clone();
        Gun swallowCopy = original.swallowCopy();
        Gun deepCopy = original.deepCopy();

        System.out.println("original = " + original);
        System.out.println("clone = " + clone);
        System.out.println("swallowCopy = " + swallowCopy);
        System.out.println("deepCopy = " + deepCopy);
        System.out.println("==========================");
        original.bullet.size = 100;
        System.out.println("original.bullet.size changed");
        System.out.println("==========================");
        System.out.println("original = " + original);
        System.out.println("clone = " + clone);
        System.out.println("swallowCopy = " + swallowCopy);
        System.out.println("deepCopy = " + deepCopy);
    }
}

class Gun implements Cloneable {
    int size;
    Bullet bullet;

    @Override
    public Gun clone() {
        try {
            return (Gun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Gun deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Gun g = (Gun) obj;
        g.bullet = this.bullet.clone();
        return (Gun) obj;
    }

    public Gun swallowCopy() {
        Object obj = null;
        try {
            return (Gun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Gun(int size, Bullet bullet) {
        this.size = size;
        this.bullet = bullet;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "size=" + size +
                ", bullet=" + bullet +
                '}';
    }
}

class Bullet implements Cloneable{
    int size;

    public Bullet(int size) {
        this.size = size;
    }

    @Override
    public Bullet clone() {
        try {
            return (Bullet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "size=" + size +
                '}';
    }
}
