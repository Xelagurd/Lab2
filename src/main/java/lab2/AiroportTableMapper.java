package lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

import javafx.util.Pair;

public class AirportTableMapper extends Mapper<LongWritable, Text, ComponentKey, Text> {
    /*в.разрабатываем map функцию для каждого из набора данных, которая генерирует  WritableComparable ключа и Writable данных
    для списка аэропортов эта функция в качестве value отправляет имя аэропорта.*/
}
