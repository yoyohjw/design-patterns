package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:19
 */
public class MysqlDepartment implements IDepartment {
    @Override
    public int addDepartment() {
        System.out.println("调用mysql添加部门");
        return 0;
    }

    @Override
    public int findDepartment() {
        System.out.println("调用mysql查找部门");
        return 0;
    }
}
