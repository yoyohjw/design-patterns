package factoryPatterns.factorymethod;

import factoryPatterns.easyfactory.ICar;

/**
 * @author hejiawei
 * @date 2020/9/29 17:25
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        IFactory iFactory = new AudiFactory();
        ICar iCar = iFactory.createCar();
        iCar.getBrand();
        IFactory iFactory1 = new BenzFactory();
        ICar iCar1 = iFactory1.createCar();
        iCar1.getBrand();
    }


}
