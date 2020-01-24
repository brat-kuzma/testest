import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;

import static org.apache.ignite.cache.CacheAtomicityMode.TRANSACTIONAL;

public class CreateTransactions {

    public static void main(String[] args) {

        Ignite ignite = Ignition.start("/home/sbt-kuznetsov-dg/GG/apache-ignite-2.7.5-bin/customIgniteconfiguratin.xml_easy_example_client");

        CacheConfiguration cfg = new CacheConfiguration();
        cfg.setName("myCache");
        cfg.setAtomicityMode(TRANSACTIONAL);

        // Create cache with given name, if it does not exist.
        IgniteCache<Integer, String> cache = ignite.getOrCreateCache(cfg);

        cache.put(10, "Myaso");
        System.out.println(cache.get(10));
    }
}
