/*Создать класс StreamService, добавив в него метод сортировки списка потоков, используя созданный StreamComparator*/


package Lesson_3.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamService {
    public static List<Stream> sortingStreams(Stream stream) {
        ArrayList<Stream> myStreamArrayList = new ArrayList<Stream>();
        StreamComparator myStreamComparator = new StreamComparator();
        myStreamArrayList.sort((Comparator<? super Stream>) myStreamComparator);
        return myStreamArrayList;
    }
}