import java.util.ArrayList;
import java.util.List;
//Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра аналогично экземпляру класса List.
// Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления элемента,
// индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения общего количества элементов.

public class MyList<T> {
    List<T> list = new ArrayList<>();


    public void addElement(T element) {
        list.add(element);
    }

    public int addIndex(T index) {
        return list.indexOf(index);

    }

    public int addSize() {
        return list.size();
    }

    public List<T> getList() {
        return list;
    }

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.addElement("first");
        myList.addElement("second");


        System.out.println("Index = " + myList.addIndex("first"));
        System.out.println("Index = " + myList.addIndex("second"));
        System.out.println("size = " + myList.addSize());

        System.out.println(myList.getList());
    }
}



