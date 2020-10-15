package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:21
 */
public class OracleDepartment implements IDepartment {
    @Override
    public int addDepartment() {
        System.out.println("调用oracle添加部门");
        return 0;
    }

    @Override
    public int findDepartment() {
        System.out.println("调用oracle查找部门");
        return 0;
    }
}
