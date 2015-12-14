
public class Name{

  private String name;

  public void setName(String n){
    //set passed parameter as name
    name = n;
  }
  public String getName(){
    //return the set name
    return name;
  }

  public static void main(String args[]){
    Name example = new Name();
    //set name member of this object
    example.setName("Alejandrina");
    // print the name
    System.out.println("Hello " + example.getName());      
  }
}
/*
OUTPUT: 
Hello Alejandrina
*/