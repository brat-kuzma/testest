import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.query.FieldsQueryCursor;
import org.apache.ignite.cache.query.SqlFieldsQuery;

import java.util.Iterator;
import java.util.List;

public class QueryingData {
    public static void main(String[] args) {
        // Connecting to the cluster.
        Ignite ignite = Ignition.start("/home/sbt-kuznetsov-dg/GG/apache-ignite-2.7.5-bin/customIgniteconfiguratin.xml_easy_example_client");
        // Getting a reference to an underlying cache created for City table above.
        IgniteCache<Long, String> cityCache = ignite.cache("SQL_PUBLIC_CITY");

// Querying data from the cluster using a distributed JOIN.
        SqlFieldsQuery query = new SqlFieldsQuery("SELECT p.name, c.name " +
                " FROM Person p, City c WHERE p.city_id = c.id");

        FieldsQueryCursor<List<?>> cursor = cityCache.query(query);

        Iterator<List<?>> iterator = cursor.iterator();

        System.out.println("Query result:");

        while (iterator.hasNext()) {
            List<?> row = iterator.next();

            System.out.println(">>>    " + row.get(0) + ", " + row.get(1));
        }
    }

}
