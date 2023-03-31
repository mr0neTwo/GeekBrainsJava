package HomeWorks.HomeWork02;

import org.json.JSONObject;
import java.util.StringJoiner;

/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
 * используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class Task2_01 {
    String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    public void start(){
        String request =  gerSQLRequestStudents(jsonString);
        System.out.println(request);
    }

    public String gerSQLRequestStudents(String jsonString) {
        String sqlRequest = "select * from students";

        JSONObject parameters = new JSONObject(jsonString);

        StringJoiner request = new StringJoiner(" ");
        request.add(sqlRequest);

        for (String parameter: parameters.keySet()) {
            var value = parameters.get(parameter).toString();
            if (!value.equals("null")) {
                request.add(parameter.toUpperCase());
                request.add(value);
            }
        }

        return request.toString();
    }
}
