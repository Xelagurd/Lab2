package lab2;

import org.apache.hadoop.io.WritableComparable;

public class ComponentKey implements WritableComparable<ComponentKey> {
    /*б. разрабатываем  WritableComparable ключа имеющий два столбца :
       AEROPORT_ID,индикатор набора данных (для набора данных с аэропортом = 0 , для перелетов =1)
       сортировка по умолчанию по двум столбцам */
    private String airportID;
    private int flag;

    public ComponentKey() {
        this.airportID = "init";
        this.flag = -1;
    }

    public ComponentKey(String airportID, int flag) {
        this.airportID = airportID;
        this.flag = flag;
    }

    public String getAirportID() {
        return airportID;
    }

    public int getflag() {
        return flag;
    }

    public int compareTo(ComponentKey other) {
        int x = airportID.compareTo(other.getAirportID());

        return x;
    }
}
