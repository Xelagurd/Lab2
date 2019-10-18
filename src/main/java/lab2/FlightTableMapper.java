package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FlightTableMapper extends Mapper<LongWritable, Text, ComponentKey, Text> {
    /*в.разрабатываем map функцию для каждого из набора данных, которая генерирует  WritableComparable ключа и Writable данных
    для списка рейсов в качестве value эта функция отправляет время задержки (в виде строки)*/
}
