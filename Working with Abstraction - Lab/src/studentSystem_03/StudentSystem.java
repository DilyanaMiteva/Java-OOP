package studentSystem_03;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public String parseCommand(String[] args) {

        String output = null;

        if ("Create".equals(args[0])) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            if (!contains(name)) {
                Student student = new Student(name, age, grade);
                studentsByName.put(name, student);
            }
        } else if ("Show".equals(args[0])) {
            String name = args[1];
            if (contains(name)) {
                Student student = studentsByName.get(name);
                output = student.toString();
            }
        }
        return output;
    }

    private boolean contains(String name){
        return this.studentsByName.containsKey(name);
    }

}
