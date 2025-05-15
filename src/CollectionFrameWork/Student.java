package CollectionFrameWork;

public class Student implements Comparable<Student> {
    long id;
    String name;
    String course;

    public Student(long id, String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
    @Override
    public int hashCode(){
        long l = id;
        return Long.hashCode(l);
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student s = (Student) obj;
            if(this.name.equals(s.name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Student s1) {
         if(s1.id==this.id){
             return 0;
         }
         else if(s1.id>this.id){
             return 1;
         }
         else{
             return -1;
         }
    }


    @Override
    public String toString() {
        return "id: "+id+" "+",name: "+name+" "+",course: "+course;
    }



    public static void main(String[] args) {
        Student s1 = new Student(1,"shashi","java");
        Student s2 = new Student(2,"manoj","SQL");
        Student s8 = new Student(8,"santhosh","MySQL");
        Student s9 = new Student(9,"rahul","HTML");
        Student s10 = new Student(1,"shashi","java");
        Student s3 = new Student(3,"seenu","python");
        Student s4 = new Student(4,"guru","oracle");
        Student s5 = new Student(5,"iranna","java");
        Student s6 = new Student(6,"shishira","java");
        Student s7 = new Student(7,"vinay","DSA");

    }

}
