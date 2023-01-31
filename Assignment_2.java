import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Assignment_2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url="https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=d4456470c49b45e981816b820fd81dd2&include=minutely";

        //Building a request
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        //Getting the HttpClient object
        HttpClient httpClient=HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse= httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        //statusCode and body
        System.out.print(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}

