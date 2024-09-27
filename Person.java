public class Person{

private String name;
private String contactnumber;



Person(String name, String contactnumber){
   this.name=name;
   this.contactnumber=contactnumber;
   

}

 public void setName(String name){
     this.name=name;

}
public String getName(){
  return name;
}

public void setContactnumber(String  contactnumber){
     this.contactnumber=contactnumber;

}

public String getContactno(){
  return contactnumber;
}

public void displayInformation(){
  System.out.println("The name of the person is:"+name);
  System.out.println(" The contact number of the person is:"+contactnumber);



}












}