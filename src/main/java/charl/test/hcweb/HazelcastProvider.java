
package charl.test.hcweb;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class HazelcastProvider {

    @Produces
    protected HazelcastInstance lookupHZClient() {
        return HazelcastClient.newHazelcastClient();
    }
}
