public class Students{
private String studentname;
private int studentnumber=0;
public Students(String name,int num){
studentname=name;
studentnumber=num;
}
public Students(){
studentname="Name";
studentnumber=0;
}
public void studentinfo(){
System.out.println(studentnumber+ ". " + studentname);
}
public static void main(String []args) {
Students student1 = new Students("Arnab",1);
Students student2 = new Students("Amal",2);
Students student3 = new Students("Bablu",3);
student1.studentinfo();
student2.studentinfo();
student3.studentinfo();
}
}
 
