package HomeWorks.HomeWork02;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3.** Дана json-строка (можно сохранить в файл и читать из файла)
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
 * Студент [фамилия] получил [оценка] по предмету [предмет].
 *
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */
public class Task2_03 {
    private final String _dataBaseTXTPath;

    Task2_03(String dataBaseTXTPath){
        _dataBaseTXTPath = dataBaseTXTPath;
    }

    public void start(){
        printResult();
    }

    private String readFileToString() {

        File file = new File(_dataBaseTXTPath);
        FileInputStream inputStream;
        String str;

        try {
            inputStream = new FileInputStream(file);
            byte data[] = new byte[inputStream.available()];
            inputStream.read(data);
            str = new String(data);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return str;
    }

    private List<Map<String, String>> parseStringToMapper(String dataString){
        Pattern pattern = Pattern.compile("\\{.+?\\}");
        Matcher matcher = pattern.matcher(dataString);

        List<String> lines = new ArrayList<>();
        while (matcher.find()) {
            String line = dataString.substring(matcher.start() + 1, matcher.end() - 1);
            lines.add(line);
        }

        List<Map<String, String>> result = new ArrayList<>();

        for (String line: lines) {

            Map<String, String> dataList = new HashMap<>();

            String[] rows = line.split(",");
            for (String row: rows) {
                String words[] = row.split(":");
                String key = words[0].replace("\"", "").replaceAll("\\s+","");
                String value = words[1].replace("\"", "").replaceAll("\\s+","");
                dataList.put(key, value);
            }

            result.add(dataList);
        }
        return result;
    }


    private void printResult() {
        String data = readFileToString();
        List<Map<String, String>> result = parseStringToMapper(data);
        for (var line: result) {
            String message = String.format("Студент %s получил %s по предмету %s.", line.get("фамилия"),  line.get("оценка"),  line.get("предмет"));
            System.out.println(message);
        }
    }

}
