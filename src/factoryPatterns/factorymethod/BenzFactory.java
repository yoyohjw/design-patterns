package factoryPatterns.factorymethod;

import factoryPatterns.easyfactory.Benz;
import factoryPatterns.easyfactory.ICar;

/**
 * @author hejiawei
 * @date 2020/9/29 17:24
 */
public class BenzFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new Benz();
    }
}
