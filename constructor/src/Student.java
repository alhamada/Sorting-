public class Student {
    String name;
    String nachName;
    String uni;
    int studentNumber;
Student (){

}
Student(String name, String nachName){
    this.name=name;
    this.nachName=nachName;
}


    Student(String name , String nachName , String uni , int studentNumber){
        this.name = name;
        this.nachName = nachName;
        this.uni = uni;
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return  name+ " "+ nachName + " " + uni +" "+ studentNumber;
    }
}