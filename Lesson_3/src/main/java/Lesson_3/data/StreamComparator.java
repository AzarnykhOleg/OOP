/*Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток (Stream)*/

package Lesson_3.data;
public class StreamComparator{
    public static String compare(Stream o1, Stream o2) {
        if (o1.getnumberOfGroups() > o2.getnumberOfGroups()) {
            return String.format("Поток № %s больше потока № %s", o1.getStreamNumber(), o2.getStreamNumber());
        }
        if (o1.getnumberOfGroups() < o2.getnumberOfGroups()) {
            return String.format("Поток № %s меньше потока № %s", o1.getStreamNumber(), o2.getStreamNumber());
        }
        return String.format("Поток № %s и поток № %s одинаковые", o1.getStreamNumber(), o2.getStreamNumber());
    }

    public static Integer compare1(Stream o1, Stream o2) {
        if (o1.getnumberOfGroups() > o2.getnumberOfGroups()) {
            return 1;
        }
        if (o1.getnumberOfGroups() < o2.getnumberOfGroups()) {
            return -1;
        }
        return 0;
    }
}