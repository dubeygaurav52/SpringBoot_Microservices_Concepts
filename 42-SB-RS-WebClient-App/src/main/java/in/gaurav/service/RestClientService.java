package in.gaurav.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RestClientService {

    private final WebClient jsonPlaceholderClient;
    private final WebClient reqresClient;
    private final WebClient dummyJsonClient;
    private final WebClient fakeStoreClient;
    private final WebClient httpBinClient;

    public RestClientService() {
        this.jsonPlaceholderClient = WebClient.create("https://jsonplaceholder.typicode.com");
        this.reqresClient = WebClient.create("https://reqres.in");
        this.dummyJsonClient = WebClient.create("https://dummyjson.com");
        this.fakeStoreClient = WebClient.create("https://fakestoreapi.com");
        this.httpBinClient = WebClient.create("https://httpbin.org");
    }

    public void fetchJsonPlaceholderPosts() {
        jsonPlaceholderClient.get()
                .uri("/posts")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> System.out.println("JSONPlaceholder Posts:\n" + response));
    }

    public void fetchReqresUsers() {
        reqresClient.get()
                .uri("/api/users?page=2")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> System.out.println("Reqres Users:\n" + response));
    }

    public void fetchDummyJsonProducts() {
        dummyJsonClient.get()
                .uri("/products")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> System.out.println("DummyJSON Products:\n" + response));
    }

    public void fetchFakeStoreProducts() {
        fakeStoreClient.get()
                .uri("/products")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> System.out.println("FakeStore Products:\n" + response));
    }

    public void postToHttpBin() {
        httpBinClient.post()
                .uri("/post")
                .bodyValue("{\"key\":\"value\"}")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> System.out.println("HTTPBin POST Response:\n" + response));
    }
}
