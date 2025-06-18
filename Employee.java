class Employee{
int id;
String name;
String role;
double salary;
String company;
Employee(int id,String name,double salary,String company){
this.id=id;
this.name=name;
this.role=role;
this.salary=salary;
this.company=company;
}
public void display(){
System.out.println("Name is:"+this.name);
System.out.println("Id is:"+this.id);
System.out.println("Role is:"+this.role);
System.out.println("Salaryis:"+this.salary);
System.out.println("Company is:"+this.company);
System.out.println();
}
}
class EmpData{
public static void main(String[] args){
Employee.e1=new Employee(2209,"swetha","developer",35000,"infosis");
e1.display();
}
}








