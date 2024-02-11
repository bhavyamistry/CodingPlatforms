
import java.util.PriorityQueue;
import java.util.Comparator;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
    private int id;
    private String name;
    private double cgpa;
    public Student(int i, String n, double gpa){
        this.id = i;
        this.name = n;
        this.cgpa = gpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCGPA(){
        return cgpa;
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> queue = new PriorityQueue<Student>(new PrioritiesComparator());
        int counter = 0;
        for(int i=0;i<events.size();i++){
            // System.out.println(events.get(i));
            String str[] = events.get(i).split(" ");
            // System.out.println(str[0]);

            if(str[0].matches("ENTER")){
                Student s1 = new Student(Integer.parseInt(str[3]),str[1],Double.parseDouble(str[2]));
                // System.out.println(s1.getName());
                queue.add(s1);
                // counter++; 
            }
            else{
                Student s = queue.poll();
                // System.out.println("Polled:"+s.getName());
                // counter--;
            }
            // Object sq[] = queue.toArray();
            // for(int j=0;j<sq.length;j++){
            //     System.out.print(sq[i].get());
            // }
            // System.out.println();
            // System.out.println(queue.toArray());
        }
        List<Student> lst = new ArrayList<Student>();
        while(!queue.isEmpty()){
            lst.add(queue.poll());
        }
        return lst;
    }
}

class PrioritiesComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.getCGPA() > s2.getCGPA()){
            return -1;
        }
        else if(s1.getCGPA() < s2.getCGPA()){
            return 1;
        }
        else{
            if(s1.getName().compareTo(s2.getName()) > 0){
               return 1;
            }
            else if (s1.getName().compareTo(s2.getName()) < 0){
                return -1;
            }
            else{
                if(s1.getId() > s2.getId()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
    }
    
}

