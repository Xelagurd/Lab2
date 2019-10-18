package lab2;

import org.apache.hadoop.io.Text;

public class AirportIDOnlyPartitioner extends Partitioner<ComponentKey, Text> {
    /*u. Разрабатываем Partitioner, который учитывает только код аэропорта */
    public AirportIDOnlyPartitioner() {
    }

}
