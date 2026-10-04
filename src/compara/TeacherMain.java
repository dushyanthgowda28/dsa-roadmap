package compara;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TeacherMain {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Abid", 29);
        Teacher teacher1 = new Teacher("Bob", 47);
        Teacher teacher2 = new Teacher("Charls", 34);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        Collections.sort(teacherList);

        System.out.println(teacherList);
    }
}
