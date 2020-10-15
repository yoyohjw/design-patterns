package factoryPatterns.abstractfactory;

/**
 * @author hejiawei
 * @date 2020/10/15 14:30
 */
public class Demo {


    public static void main(String[] args) {
        IFactory mysqlFactory = new MysqlFactory();
        IUser mysqlUser = mysqlFactory.user();
        IDepartment mysqlDepartment = mysqlFactory.department();
        mysqlUser.addUser();
        mysqlUser.findUser();
        mysqlDepartment.addDepartment();
        mysqlDepartment.findDepartment();

        IFactory oracleFactory = new OracleFactory();
        IUser oracleUser = oracleFactory.user();
        IDepartment oracleDepartment = oracleFactory.department();
        oracleUser.addUser();
        oracleUser.findUser();
        oracleDepartment.addDepartment();
        oracleDepartment.findDepartment();
    }


}
