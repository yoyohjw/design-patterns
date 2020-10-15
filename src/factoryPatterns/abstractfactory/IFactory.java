package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:24
 *
 *
 * 产品组工厂 - 生成产品
 *
 */
public interface IFactory {

    IUser user();

    IDepartment department();

}
