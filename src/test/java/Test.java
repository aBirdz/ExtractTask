import org.apache.commons.dbcp.BasicDataSource;

public class Test {
    public static void main(String[] args) throws Exception{
        BasicDataSource ds = new BasicDataSource();

        ds.setUrl("jdbc:oracle:thin:@192.168.110.44:1521:orcl");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("st");
        ds.setPassword("st");
        ds.setInitialSize(2);
        ds.getConnection().createStatement().execute("select * from dual");
        System.out.println(11);
    }

}
