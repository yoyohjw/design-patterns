package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:35
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUser user() {
        return new MysqlUser();
    }

    @Override
    public IDepartment department() {
        return new MysqlDepartment();
    }
}
