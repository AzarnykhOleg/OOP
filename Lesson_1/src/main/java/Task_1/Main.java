/* В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
и воспроизвести логику, заложенную в программе
*/

package Task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Добавление горячих напитков*/
        HotDrink tear = new HotDrink("чай", 22.50, 80, 0.25);
        System.out.println(tear);
        HotDrink coffee = new HotDrink("кофе", 50.50, 90, 0.35);
        System.out.println(coffee.getName());
        System.out.println(coffee.getVolume());
        System.out.println(coffee.getCost());
        System.out.println(coffee.getTemperature());
        HotDrink grog = new HotDrink("грог", 55.50, 90, 0.35);
        HotDrink punch = new HotDrink("пунш", 60.50, 90, 0.35);
        HotDrink mulledwine = new HotDrink("глинтвейн", 70.50, 90, 0.35);
        HotDrink tear_2 = new HotDrink("чай", 40.50, 80, 0.25);
        HotDrink tear_3 = new HotDrink("чай", 40.50, 90, 0.40);
        HotDrink tear_4 = new HotDrink("чай", 50.50, 90, 0.40);
        /*Добавление автоматов горячих напитков с напитками*/
        List<HotDrink> hotDrinks_1 = new ArrayList<>();
        hotDrinks_1.add(tear);
        hotDrinks_1.add(coffee);
        hotDrinks_1.add(grog);
        hotDrinks_1.add(punch);
        HotDrinkVendingMachine machine_1 = new HotDrinkVendingMachine(hotDrinks_1);
        List<HotDrink> hotDrinks_2 = new ArrayList<>();
        hotDrinks_2.add(mulledwine);
        hotDrinks_2.add(tear_2);
        hotDrinks_2.add(tear_3);
        hotDrinks_2.add(tear_4);
        HotDrinkVendingMachine machine_2 = new HotDrinkVendingMachine(hotDrinks_2);
        /*Просмотр ассортимента автоматов горячих напитков*/
        System.out.println("--------------------");
        System.out.println(machine_1.getProductList());
        /*Проверка наличия напитка в автомате по условию*/
        System.out.println("--------------------");
        System.out.println(machine_2.getProduct("глинтвейн", 0.35, 90));
        System.out.println(machine_2.getProduct("глинтвейн", 0.35, 80));
        /*Добавление напитка в автомат (список напитков)*/
        System.out.println("--------------------");
        machine_1.addHotDrink(mulledwine);
        System.out.println(machine_1.getProductList());
    }
}