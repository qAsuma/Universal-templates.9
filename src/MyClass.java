//Создайте проект, используя IntelliJ IDEA.
// Создайте класс MyClass, содержащий статический фабричный метод - T factoryMethod(),
// который будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения типом – Т).
public class MyClass<T> {


    public static <T> void factoryMethod(T t) {
        System.out.println(t);

    }

    public static void main(String[] args) {
        factoryMethod(("Привет"));
        factoryMethod(5);
        factoryMethod('^');
    }

}
