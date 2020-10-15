package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:17
 */
public class MysqlUser implements IUser {
    @Override
    public int addUser() {
        System.out.println("调用mysql数据库保存用户");
        return 0;
    }

    @Override
    public int findUser() {
        System.out.println("调用mysql数据库查找用户");
        return 0;
    }
}
