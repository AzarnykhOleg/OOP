/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.* */

package Task_1;

public class HotDrink extends Product{
    private int temperature;
    private double volume;
    public HotDrink(String name, double cost, int temperature, double volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Горячий напиток:\n %s \n %.2f л \n %.2f руб. \n %d градусов\n",
                super.getName(), this.volume, super.getCost(), this.temperature);
    }
}