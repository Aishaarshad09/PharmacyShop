public class Medicine {

  private String medicineId;
  private String batchNumber;
  private String manufacturer;
  private Date  expirydate;
  private int quantity;
  private String name;
  private double price;

Medicine(String medicineId, String batchNumber, String manufacturer, Date expirydate,int quantity,String name,double price){
  this.medicineId=medicineId;
  this.batchNumber=batchNumber;
  this.manufacturer=manufacturer;
  this.expirydate=expirydate;
  this.quantity=quantity;
  this.name=name;
  this.price=price;

}
public void displayInformation(){

 System.out.println("The Medicine Id is:"+medicineId);
 System.out.println("The Batchnumber is:"+batchNumber);
 System.out.println("The Manufacturer is:"+manufacturer);
 System.out.println("The Expirydate is:"+expirydate);
 System.out.println("The Quantity is:"+quantity);
 System.out.println("The Name is:"+name);
 System.out.println("The Price is:"+price);
 
}



public void setMedicineId(String medicineId){
   this.medicineId=medicineId;
}
public String getMedicineId(){
   return medicineId;
}

public void setBatchNumber(String batchNumber){
   this.batchNumber=batchNumber;
}
 public String getBatchNumber(){
   return batchNumber;
}



public void setManufacture(String manufacturer){
   this.manufacturer=manufacturer;
}
 public String getManufacturer(){
   return manufacturer;
}


public void setExpirydate(Date expirydate){
   this.expirydate=expirydate;
}
 public Date getExpirydate(){
   return expirydate;
}


public void setQuantity(int quantity){
   this.quantity=quantity;
}
 public int getQuantity(){
   return quantity;
}

public void setName(String name){
   this.name=name;
}
 public String getName(){
   return name;
}



public void setPrice(double price){
   this.price=price;
}
 public double  getPrice(){
   return price;
}



}