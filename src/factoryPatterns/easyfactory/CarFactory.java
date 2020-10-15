package factoryPatterns.easyfactory;

/**
 * @author hejiawei
 * @date 2020/9/29 13:32
 */
public class CarFactory {

    public ICar getCarBrand(String brand) {
        if ("audi".equals(brand)) {
            return new Audi();
        } else if ("benz".equals(brand)) {
            return new Benz();
        }

        return null;
    }


}
