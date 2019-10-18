package lab2;

import javafx.util.Pair;

public class FlightTableWritable {
    /*а.Разрабатываем Writable для каждого из входных наборов данных, который может читать данные из csv. */
    private Pair<String, String> pair;

    public static final int TOTAL = 18;
    
    public FlightTableWritable(String table) {
        if (table.length() > 1){
            String[] parts = table.split(",");
        }
    }
}