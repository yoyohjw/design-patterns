package factoryPatterns.easyfactory;

/**
 * @author hejiawei
 * @date 2020/9/29 13:34
 */
public class FactoryDemo {

    public static void main(String[] args) {
        //通过工厂去获取实例
        CarFactory carFactory = new CarFactory();
        ICar iCar = carFactory.getCarBrand("audi");
        iCar.getBrand();

        //通过改造后的工厂2获取实例
        CarFactory2 carFactory2 = new CarFactory2();
        ICar audi = carFactory2.getCarBrand(Audi.class);
        audi.getBrand();
        ICar benz = carFactory2.getCarBrand(Benz.class);
        benz.getBrand();

    }

}
