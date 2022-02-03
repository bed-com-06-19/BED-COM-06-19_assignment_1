import java.util.Scanner;

public class StudentAccount{
    private String firstName;
    private String lastName;
    private int yearOfStudy;
    private String programOfStudy;

 //constructors
  StudentAccount(){

  }   

  StudentAccount( String firstName, String lastName, 
  int yearOfStudy, String programOfStudy){
          this.firstName=firstName;
          this.lastName=lastName;
          this.yearOfStudy=yearOfStudy;
          this.programOfStudy=programOfStudy;

  }

  //setters
  public void setFirstName( String firstName){
      this.firstName=firstName;

  }
  public void setLastname( String lastName){
      this.lastName=lastName;

  }
  public void setYearOfStudy( int yearOfStudy){
      this.yearOfStudy=yearOfStudy;

  }
  public void setProgramOfStudy( String programOfStudy){
      this.programOfStudy=programOfStudy;
  }
  
}
