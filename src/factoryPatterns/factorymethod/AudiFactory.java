package factoryPatterns.factorymethod;

import factoryPatterns.easyfactory.Audi;
import factoryPatterns.easyfactory.ICar;

/**
 * @author hejiawei
 * @date 2020/9/29 17:24
 */
public class AudiFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new Audi();
    }
}
