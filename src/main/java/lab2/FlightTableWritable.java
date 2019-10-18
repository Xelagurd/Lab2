package lab2;

import javafx.util.Pair;

public class FlightTableWritable {
    /*а.Разрабатываем Writable для каждого из входных наборов данных, который может читать данные из csv. */
    private Pair<String, String> pair;

    public static final int TOTAL = 18;
    public static final int AIRPORT_ID_INDEX = 14;
    public static final int DELAY_INDEX = 17;

    public FlightTableWritable(String table) {
        if (table.length() > 1 && !table.contains("YEAR")){
            String[] parts = table.split(",");
        }
    }
}