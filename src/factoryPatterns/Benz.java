package factoryPatterns;

/**
 * @author hejiawei
 * @date 2020/9/29 13:31
 */
public class Benz implements ICar {
    @Override
    public void getBrand() {
        System.out.println("my car brand is Benz");
    }
}
