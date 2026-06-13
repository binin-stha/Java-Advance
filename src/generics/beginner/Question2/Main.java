package generics.beginner.Question2;

public class Main {
    static void main() {
        Repository<Student> studentRepository = new Repository<>();
        studentRepository.save(new Student(1, "Ram", 16));
        studentRepository.save(new Student(2, "Sita", 16));
        studentRepository.save(new Student(3, "Gita", 19));

//        Student student1 = studentRepository.findById(0);
//        System.out.println(student1);

        System.out.println(studentRepository.findAll());
        studentRepository.save(new Student(3, "Gita", 19));
        System.out.println(studentRepository.findAll());

    }
}
