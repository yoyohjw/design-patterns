package factoryPatterns.easyfactory;

/**
 * @author hejiawei
 * @date 2020/9/29 13:40
 */
public class CarFactory2 {

    public ICar getCarBrand(Class<? extends ICar> carClass) {
        try {
            return carClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


}
