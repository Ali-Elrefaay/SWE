
package lab1;
import java.util.Vector;
import java.util.Enumeration;

public class CourseRecord {
    private Student student;
    private Vector<Assignment> assignments;

    CourseRecord() {
        assignments = new Vector<Assignment>();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        student = s;
    }

    public void addAssignment(Assignment a) {
        assignments.addElement(a);
    }

    public Enumeration<Assignment> getAssignments() {
        return assignments.elements();
    }

    // Excercise Solution ..............................
   public double average() throws NotYetSetException {
double sum = 0;
int count = 0;
for (Assignment a : assignments) {
if (a.getMark() != -1) {
sum += a.getMark();
count++;
} else {
throw new NotYetSetException( 
"Mark is not yet set");
}
}
return sum / count;
}
    

    public boolean canTakeFinalExam() {
    
        {
        return assignments.size() > 3;
                   }  

}
}