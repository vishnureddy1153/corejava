class Employee{
  // declare the variables
  int emp_id = 101;
  String emp_name = "Mayank";
  // create function
// modifiers + returnType + name og method/function + parameter
   public void showEmpDetails(){
      
    System.out.println("emp id" +emp_id);
    System.out.println("emp name" +emp_name);
}
  // Calling main method
 public static void main(String args[]) {
   // creating the object 
    Employee employee = new Employee();
   // calling the method
    employee.showEmpDetails();
    

  }
  
}