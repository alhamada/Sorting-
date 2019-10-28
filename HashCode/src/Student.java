public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public String course;

    public Student(){

    }
    public Student(String firstName,String lastName , int age, String course){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.course=course;

    }

    public boolean equals(Object t){
        Student anotherStudent=(Student) t;
        return firstName.equals(anotherStudent.firstName) &&
                lastName.equals(anotherStudent.lastName) &&
                age==anotherStudent.age &&
                course.equals(anotherStudent.course);

    }

    @Override
    public int hashCode() {
        return age * 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
