package net.mateusgabi.Spark;

import static spark.Spark.*;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 05/12/2017.
 */
public class Main {

    public static void main(String[] args) {

        port(getHerokuAssignedPort());

        path("/api", () -> {

            get("/convert/:value", (request, response) -> {

                response.type("application/json");

                String result = ConversorFacade.converte(request.params(":value"));

                return "{\"result\":\""+ result +"\"}";

//                return result;
            });

        });
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
