package Lesson_3.data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int counter;
    private final List<StudentGroup> studentsGroup;

    public StreamIterator(Stream studentStream) {
        this.studentsGroup = studentStream.getGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentsGroup.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentsGroup.get(counter);
    }
}
