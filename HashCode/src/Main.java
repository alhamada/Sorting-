import java.util.*;

public class Main {

    public static void main(String [] args) {


        Robot robot = new Robot(1, "Robot1", "Blue", 20);
        Robot sameRobot  = new Robot(1, "Robot1", "Blue", 20);

        System.out.println(robot.equals(sameRobot));

        HashSet<Student> mySetList =new HashSet<>();




        Student hasan= new Student("Hasan","Sultan",29,"Java");
        Student hassan= new Student("Hasan","Sultan",29,"Java");
        Student moh = new Student("Moh","Ibo",22,"Python");



        System.out.println(hasan.equals(hassan));

        mySetList.add(hasan);
        mySetList.add(hassan);
        mySetList.add(moh);

        Iterator<Student> i=mySetList.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        Student criss=new Student("Criss","Reismann",21,"Phyisc");
        Student risa=new Student("Risa","Hofmann",25,"Math");


        HashMap<Student, Integer> studentsScore = new HashMap<>();

        studentsScore.put(moh, 20);
        studentsScore.put(hassan,10);
        studentsScore.put(criss,30);
        studentsScore.put(risa,26);

      //  System.out.println(studentsScore.get(moh));
        int sum = 0;


        for(Map.Entry<Student,Integer> m:studentsScore.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
 sum+=m.getValue();
        }
        System.out.println(sum/studentsScore.size());













    }
}
