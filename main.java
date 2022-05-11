package Six;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.given;
public class main {
    public static void main(String[] args) throws IOException {

        RestAssured.baseURI="http://dataservice.accuweather.com/";

        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/294021?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89%20&q=Moscow&language=en");
// запрос неправильный у тебя
// по моему даже в телегу тебе кидал 
//"forecasts/v1/daily/1day/294021?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89"


        if (response.getStatusCode() == 200) {
            System.out.println("OK");
        }
        Map<String, Object> map = response.as(Map.class);
        System.out.println(map);
// в этом задании нужно было прото вывести ответ в нормальном виде
//System.out.println(response.asPrettyString());
    }
}
