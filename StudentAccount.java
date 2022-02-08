import java.util.Scanner;

public class StudentAccount{
    private String firstName;
    private String lastName;
    private String programOfStudy;
    private int yearOfStudy;


 //constructors
  StudentAccount(){

  }   

  StudentAccount( String firstName, String lastName, 
   String programOfStudy ,int yearOfStudy){
          this.firstName=firstName;
          this.lastName=lastName;
          this.programOfStudy=programOfStudy;
          this.yearOfStudy=yearOfStudy;

  }

  //setters
  public void setFirstName( String firstName){
      this.firstName=firstName;

  }
  public void setLastname( String lastName){
      this.lastName=lastName;

  }

  public void setProgramOfStudy( String programOfStudy){
      this.programOfStudy=programOfStudy;

  }
  public void setYearOfStudy( int yearOfStudy){
      this.yearOfStudy=yearOfStudy;

  }
  
   //getters

  public String getFirstName(){
      return firstName;

  } 
  public String getLastName(){
      return lastName;

  } 
  public String getProgramOfStudy(){
  return programOfStudy;
      }


  public int getYearOfStudy(){
      return yearOfStudy;

  }
 

  //methods
  
}
