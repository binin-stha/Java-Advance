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

        Repository<Teacher> teacherRepository = new Repository<>();
        teacherRepository.save(new Teacher(1, "Rukesh"));
        teacherRepository.save(new Teacher(2, "Subit"));
        teacherRepository.save(new Teacher(3, "anmol"));

        Repository<Course> courseRepository = new Repository<>();
        courseRepository.save(new Course(1, "Object Oriented Programming"));
        courseRepository.save(new Course(2, "Advance Java"));
        courseRepository.save(new Course(3, "Computer Vision"));

        System.out.println("Course with id:2 is " + courseRepository.findById(2).getName());

    }
}
