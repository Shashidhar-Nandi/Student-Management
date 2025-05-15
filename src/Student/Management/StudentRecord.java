package Student.Management;

public class StudentRecord implements Comparable<StudentRecord>{
    int id;
    String name;

    public StudentRecord(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "id: "+id+", name: "+ name;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof StudentRecord){
            StudentRecord s = (StudentRecord) obj;
            if(this.id==s.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(StudentRecord o) {
        if(this.id==o.id){
            return 0;
        } else if (this.id>o.id) {
            return 1;
        }
        else{
            return -1;
        }
    }

}
