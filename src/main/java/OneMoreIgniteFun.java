/*
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.query.SqlFieldsQuery;

public class OneMoreIgniteFun {
    // Connecting to the cluster.
    Ignite ignite = Ignition.start();

    // Getting a reference to an underlying cache created for City table above.
    IgniteCache<Long, City> cityCache = ignite.cache("SQL_PUBLIC_CITY");

    // Getting a reference to an underlying cache created for Person table above.
    IgniteCache<PersonKey, Person> personCache = ignite.cache("SQL_PUBLIC_PERSON");

    // Inserting entries into City.
    SqlFieldsQuery query = new SqlFieldsQuery(
            "INSERT INTO City (id, name) VALUES (?, ?)");

cityCache.query(query.setArgs(1, "Forest Hill")).getAll();
cityCache.query(query.setArgs(2, "Denver")).getAll();
cityCache.query(query.setArgs(3, "St. Petersburg")).getAll();

// Inserting entries into Person.
    query = new SqlFieldsQuery(
    "INSERT INTO Person (id, name, city_id) VALUES (?, ?, ?)");

personCache.query(query.setArgs(1, "John Doe", 3)).getAll();
personCache.query(query.setArgs(2, "Jane Roe", 2)).getAll();
personCache.query(query.setArgs(3, "Mary Major", 1)).getAll();
personCache.query(query.setArgs(4, "Richard Miles", 2)).getAll();
}
*/
