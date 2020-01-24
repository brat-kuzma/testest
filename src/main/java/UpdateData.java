/*
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.query.SqlFieldsQuery;
import org.apache.ignite.resources.SpringApplicationContextResource;
import org.springframework.context.ApplicationContext;
import sun.applet.Main;

public class UpdateData {
    public static void main(String[] args) {
        Ignite ignite = Ignition.start("/home/sbt-kuznetsov-dg/GG/apache-ignite-2.7.5-bin/customIgniteconfiguratin.xml_easy_example_client");

        IgniteCache<Long, String> cityCache = ignite.cache("SQL_PUBLIC_CITY");
        SqlFieldsQuery query = new SqlFieldsQuery(
                "UPDATE City SET name = 'Foster City' WHERE id = 2");

        cityCache.query(query).getAll();
        SpringApplicationContextResource app = new SpringApplicationContextResource(UpdateData.class);
        ApplicationContext igniteConfiguration = app.run
    }
}
*/
