package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:36
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser user() {
        return new OracleUser();
    }

    @Override
    public IDepartment department() {
        return new OracleDepartment();
    }
}
