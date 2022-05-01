package lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataBase {

    public String name;

    public static Map<Item, String> db = new HashMap<>();

    public static void main(String [] args){

        toDo();

    }

    private static void toDo() {

        System.out.println("Выберите операцию:");
        System.out.println("1 - добавить предмет в базу данных");
        System.out.println("2 - показать базу данных");
        System.out.println("3 - выход");

        Scanner scanner = new Scanner(System.in);

        try {
            int digit = scanner.nextInt();


            if(digit == 1){
                addItem();
            }
            if(digit == 2){
                ShowItem();
            }
            if(digit == 3){
                Quit();
            }
        }catch (Exception e){
            System.out.println("Ошибка!\nВведите число от 1 до 3");
            toDo();
        }
    }

    public static void addItem(){

        Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Введите название!");
                String name = scanner.nextLine();
                System.out.println("Введите цену!");
                int price = scanner.nextInt();
                System.out.println("Введите количество!");
                int quantity = scanner.nextInt();

                db.put(new Item(name, price, quantity), name);
                System.out.println("Товар успешно добавлен!");
                toDo();
            }catch (Exception e){
                System.out.println("Неверный формат записи!");
                toDo();
            }


    }

    public static void ShowItem(){
        System.out.println(db);
        toDo();
    }

    public static void Quit(){
        System.out.println("Конец операции!");
    }


}