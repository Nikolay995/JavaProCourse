package reflection;

import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car("Tesla","Model_X", 400);
        Class<?> cls = car.getClass();
        String line = "------------------------------------------------------------";
        System.out.println("MaxSpeed before: " + car.getMaxSpeed());
        try {
            Field speed = cls.getDeclaredField("maxSpeed");
            speed.setAccessible(true);
            speed.setInt(car,200);
            System.out.println("MaxSpeed after: "+car.getMaxSpeed());
            System.out.println(line);
            Method moveMethod = cls.getMethod("move");
            moveMethod.invoke(car,null);
            System.out.println(line);
            int modifier = cls.getModifiers();
            System.out.println(modifier);
            System.out.println(Modifier.toString(modifier));
            System.out.println(line);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Method[] methods = cls.getDeclaredMethods();
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println(line);
        for (Method method : methods) {
            System.out.println(method);

        }
    }
}
