package lab2;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportIDOnlyComparator extends WritableComparator {
    /*д.  Разрабатываем GroupingComparatorClass, который учитывает только  код аэропорта */
    public AirportIDOnlyComparator() {
        super(ComponentKey.class, true);
    }

    
}
