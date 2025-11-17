import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.chucknorris.io/jokes/random"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            

            System.out.println("Código de respuesta: " + response.statusCode());
            System.out.println("Tamaño de respuesta: " + response.body().getBytes().length);
            String body = response.body();

          int start = body.indexOf("\"value\":\"") + 9;
          int end = body.indexOf("\"}", start);
          String chiste = body.substring(start, end);
          System.out.println("Chiste:" + chiste);

          System.out.println("Primeras 200 letras:");
          System.out.println(response.body().substring(0, Math.min(200, response.body().length())));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en la conexión HTTP");
        }
    }
}
 