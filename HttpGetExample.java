//import java.net.HttpURLConnection;
import java.net.URL;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class HttpGetExample {

    public static void main(String[] args) {
        try{
            String url = "https://api.github.com";
            URL obj = new URL(url);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine); 
            }
            in.close();

            int sizeInBytes = response.toString().getBytes().length;
            System.out.println("Tamaño de la respuesta (bytes): " + sizeInBytes);

            String first200 = response.length() > 200 ? response.substring(0, 200) : response.toString();
            System.out.println("Primeras 200 letras de la respuesta:");
            System.out.println(first200);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en la conexión HTTP");
        }  
    }

}





