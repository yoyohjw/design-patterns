package factoryPatterns.easyfactory;

/**
 * @author hejiawei
 * @date 2020/9/29 13:31
 */
public class Audi implements ICar {
    @Override
    public void getBrand() {
        System.out.println("my car brand is Audi");
    }
}
