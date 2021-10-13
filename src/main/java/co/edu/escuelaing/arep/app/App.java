package co.edu.escuelaing.arep.app;

import org.json.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 * @author  Juan Camilo Posso
 * @version 1.0.
 */
public class App {
    /**
     * Aplicacion principal que se carga del funcionamiento principal del programa
     */
    private static Calculadora calc = new Calculadora();
    public static void main(String[] args) {
        port(getPort());
        get("/ln", (req, res) -> response(req, res,"ln"));
        get("/exp", (req, res) -> response(req, res,"exp"));
    }
    /**
     * @param req Parametro request de spark
     * @param res Parametro responde sde spark
     * @param operation  Indica el tipo de operacion a realizar
     * @return  JSONObject objeto JSON con las operaciones correspondientes
     */
    private static JSONObject response(Request req, Response res,String operation) {
        JSONObject JSON = new JSONObject();
        double n = Double.parseDouble(req.queryParams("value"));
        JSON.put("operation",operation);
        JSON.put("input",n);

        if (operation.equals("ln"))
            JSON.put("output",calc.ln(n));
        else
            JSON.put("output",calc.exp(n));
        return JSON;
    }
    /**
     * @return Numero del puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
