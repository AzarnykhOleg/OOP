/* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
выдающий продукт соответствующий имени, объёму и температуре
*/

package Task_1;

import java.util.ArrayList;
import java.util.List;
public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> productList;

    public List<HotDrink> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrink> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public HotDrinkVendingMachine(List<HotDrink> productList) {
        this.productList = productList;
    }
    public HotDrink getProduct(String name, double volume, int temperature) {
        for (HotDrink mugHotDrink : productList) {
            if (mugHotDrink.getName().equals(name) && mugHotDrink.getVolume() == volume
                    && mugHotDrink.getTemperature() == temperature) {
                return mugHotDrink;
            }
        }
        return null;
    }
    public void addHotDrink(HotDrink mugHotDrink){
        this.productList.add(mugHotDrink);
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
