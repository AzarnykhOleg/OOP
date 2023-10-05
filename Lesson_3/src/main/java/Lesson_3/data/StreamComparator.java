/*Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток (Stream)*/

package Lesson_3.data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{
    @Override
    public int compare(Stream o1, Stream o2) {
        int numberOfGroups1 = o1.getnumberOfGroups();
        int numberOfGroups2 = o2.getnumberOfGroups();
        return Integer.compare(numberOfGroups1, numberOfGroups2);
    }
}