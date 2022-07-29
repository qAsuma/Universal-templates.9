import java.util.HashMap;
import java.util.Map;

//Создайте класс MyDictionary. Реализуйте в простейшем приближении возможность использования его экземпляра.
// Минимально требуемый интерфейс взаимодействия с экземпляром,должен включать метод добавления пар элементов,
// индексатор для получения значения элемента по указанному индексу
// и свойство только для чтения для получения общего количества пар элементов.
public  class MyDictionary<key,value> {
    Map<key,value> dictionary = new HashMap<>();
    public Map<key,value> getDictionary(){
        return dictionary;
    }
    public void add(key k , value v){
        dictionary.put(k,v);
    }
    public value index (key k){
        return  dictionary.get(k);
    }
    public int showResult(){
        return dictionary.size();
    }

    public static void main(String[] args) {
        MyDictionary<String,String> md = new MyDictionary<>();
        md.add("1","Да");
        md.add("2","нет");
        System.out.println(md.getDictionary());

        System.out.println(md.index("2"));

        System.out.println(md.showResult());


    }



}


