/*Создать класс Stream (Поток), содержащий в себе список УчебныхГрупп (StudentGroup) и реализующий интерфейс Iterable*/

package Lesson_3.data;

import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    public int streamNumber;
    protected List<StudentGroup> groups;

    public Stream(int streamNumber, List<StudentGroup> groups) {
        this.streamNumber = streamNumber;
        this.groups = groups;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    public void delGroup(StudentGroup group) {
        this.groups.remove(group);
    }

    public Integer getnumberOfGroups() {
        return this.groups.size();
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    @Override
    public StreamIterator iterator() {
        return new StreamIterator(this);
    }
    public String compareTo(Stream o) {
        int compare = getnumberOfGroups().compareTo(o.getnumberOfGroups());
        if (compare == -1) {
            return String.format("Поток № %s больше потока № %s", o.getStreamNumber(), this.getStreamNumber());
        }
        if (compare == 1) {
            return String.format("Поток № %s меньше потока № %s", o.getStreamNumber(), this.getStreamNumber());
        }
        return String.format("Поток № %s и поток № %s одинаковые", o.getStreamNumber(), this.getStreamNumber());
    }

    @Override
    public String toString() {
        return String.format("Поток № %d", streamNumber);
    }
}

