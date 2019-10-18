package lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class ReduceSideJoinReducer extends Reducer<ComponentKey, Text, Text, Text> {
    /*е. Разрабатываем reduce функцию, которая берет первую строку, извлекает из нее
     имя аэропорта, далее рассчитывает из последующих строк среднее минимальное и
      максимальное время задержки и печатает результат. */
    @Override
    protected void reduce(ComponentKey key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {

    }
}
