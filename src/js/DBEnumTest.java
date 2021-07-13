package js;

/**
 * @Author:asher
 * @Date:2021/7/11 23:05
 * @Description:js
 * @Version:1.0
 */
public class DBEnumTest {
    public static void main(String[] args) {
        System.out.println(DBEnum.MSSQL.getDbName());
        DBEnum dbEnum = DBEnum.ORACLE;
        System.out.println(dbEnum);
        DBEnum1 spring = DBEnum1.valueOf("DB2");
        System.out.println(spring.getDbVendor());
    }

}

class DBEnum {
//    2定义若干常量，其实就是定义枚举类对象的成员变量，要用private final来修饰
//    题外话，final变量初始化有3种常见方式：定义时；constructor、static code 实例化；
//    但是，我们这里不能用1，3种，为什么？这两种方式的实例化，将导致每个成员变量的属性值都是一致的
    private final String dbName;
    private final String dbVendor;
    //1 私有化该类的构造方法，目的就是不让你在类外面实例化该类的对象。否则，如果可以在外面实例化的话，
//    则不能控制该类的对象的个数是有限个的；这和枚举类的特性相违背了，所有构造方法要私有化；
    private DBEnum(String dbName,String dbVendor) {
        this.dbName = dbName;
        this.dbVendor = dbVendor;
    }

    //    3提供当前枚举类的多个对象(这里的多个，就是要确定的且是有限个的)
    public static final DBEnum ORACLE = new DBEnum("Oracle", "@Oracle corporation");
    public static final DBEnum DB2 = new DBEnum("DB2", "@IBM corp");
    public static final DBEnum MSSQL = new DBEnum("SQL Server", "@Microsoft corp");

//    4提供枚举类对象属性(dbName,dbVendor)的getter，因为它们是private的，所以不能有setter


    public String getDbName() {
        return dbName;
    }

    public String getDbVendor() {
        return dbVendor;
    }

//    提供toString()方法

    @Override
    public String toString() {
        return "DBEnum{" +
                "dbName='" + dbName + '\'' +
                ", dbVendor='" + dbVendor + '\'' +
                '}';
    }
}
