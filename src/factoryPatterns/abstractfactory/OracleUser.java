package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:18
 */
public class OracleUser implements IUser {
    @Override
    public int addUser() {
        System.out.println("调用oracle数据库添加用户");
        return 0;
    }

    @Override
    public int findUser() {
        System.out.println("调用oracle数据库查找用户");
        return 0;
    }
}
