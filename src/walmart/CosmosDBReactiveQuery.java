package walmart;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.SqlQuerySpec;
import java.util.List;
import reactor.core.publisher.Flux;

public class CosmosDBReactiveQuery {

    private CosmosAsyncContainer container;

    public CosmosDBReactiveQuery(String connectionString, String databaseName, String containerName) {
       /* this.container = new CosmosClientBuilder()
                .endpoint("https://asda-payments-stage-cosmos.documents.azure.com:443")
                .key(connectionString)
                .preferredRegions(List.of("South Central US","West US"))
                .connectionSharingAcrossClientsEnabled(true)
                .consistencyLevel(ConsistencyLevel.SESSION)
                .contentResponseOnWriteEnabled(false)
                .directMode(DirectConnectionConfig.getDefaultConfig())
                .multipleWriteRegionsEnabled(false)
                .buildAsyncClient()
                .getDatabase(databaseName)
                .getContainer(containerName);*/
    }

    public void getCustomerCount(String batchName) {
       /* String query = "SELECT * FROM c WHERE c.batch_name = @partitionKey";
        SqlQuerySpec querySpec = new SqlQuerySpec(query);
        CosmosQueryRequestOptions options = new CosmosQueryRequestOptions();
        PartitionKey partitionKey= new PartitionKey(batchName);
        options.setPartitionKey(partitionKey);
        Flux<FeedResponse<Long>> feedResponseFlux = container.queryItems(querySpec, options, Long.class)
                .byPage(-1);

        List<Long> block = feedResponseFlux.concatMap(longFeedResponse ->
                longFeedResponse.getResults() == null
                        ? Flux.empty()
                        : Flux.fromIterable(longFeedResponse.getResults())).collectList().block();
        block.forEach(System.out::println);*/
    }

    public static void main(String[] args) {
        String connectionString = "Yed2Jp6SzNT8H2yGkFqau2ykPxa06ZpG5zMcQ7zZAgBvH0qYbS69JUSjxNbqh7sjLYiv1h9jtJRBMPU4Wj8ABQ==";
        String databaseName = "ukgr-migration";
        String containerName = "card-migration-batch";
        String partitionKey = "QETEST_1L_V12";

        CosmosDBReactiveQuery reactiveQuery = new CosmosDBReactiveQuery(connectionString, databaseName, containerName);
        reactiveQuery.getCustomerCount(partitionKey);

    }
}

