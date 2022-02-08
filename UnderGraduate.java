import java.util.Scanner;
import java.util.Random;

class UnderGraduate extends StudentAccount{
    private double tuition;
    private double tuitionInterestRate;
    private double tuitionBalance;
    private double stationary;
    private double stationaryInterestRate;
    private double stationaryBalance;
    private double substintence;
    private double substintenceInterestRate;
    private double subsintenceBalance;
    private double balance;
    private String accountNumber;
    private static int generator=100;
  
  //constructors
UnderGraduate( String firstName, String lastName, String programOfStudy, 
  int yearOfStudy){
    super(firstName, lastName,   programOfStudy, yearOfStudy);
    accountNumber = "UG" + generator;
    generator++;
}

//scanner
Scanner input = new Scanner(System.in);

//repay

public void repay(){
    System.out.println( " THIS IS THE PAYMENT SECTION ");
    System.out.println( " ------------------------------------------- ");
     System.out.println( "which Loan are you repaying? \n1. Tuition Loan\n2. Stationary Loan\n3. Substintence Loan");
                         int choice2=input.nextInt();
     while( choice2<1 || choice2>3){
         System.out.println(" invalid choice.\n Enter your choice");
          choice2 =input.nextInt();
     } 
     if ( choice2==1){
         System.out.println( " How much tuition loan do u want to; \n Enter amount;MWK ");
         double repay=input.nextDouble();
         while( repay > tuition){
             System.out.println( " You cant repay more than your tuition balance");
             repay=input.nextDouble();
         }
         tuitionBalance=tuition-repay;
         System.out.println(" your tutuion loan now is; " +tuitionBalance);
              }

        if (choice2==2){
         System.out.println( " How much stationary loan do u want to; \n Enter amount;MWK ");
         double repay=input.nextDouble();
         while( repay > stationary){
             System.out.println( " You cant repay more than your stationary balance; \n Enter your amount; MWK ");
             repay=input.nextDouble();
         }
         stationaryBalance=stationary-repay;
         System.out.println(" your stationary loan now is; " +stationaryBalance);
              } 

        while( choice2<1 || choice2>3){
         System.out.println(" invalid choice.\n Enter your choice");
          choice2 =input.nextInt();
     } 
     if ( choice2==3){
         System.out.println( " How much Substintence loan do u want to; \n Enter amount;MWK ");
         double repay=input.nextDouble();
         while( repay > substintence){
             System.out.println( " You cant repay more than your substintence balance");
             repay=input.nextDouble();
         }
         subsintenceBalance=substintence-repay;
         System.out.println(" your substintence loan now is; " +subsintenceBalance);
              }        
    
     } 
    
    //tuition loan method
    
    public void Tuition(){
        System.out.println( " how much for tuiton; \n enter your amount");
        tuition = input.nextDouble();
        tuitionInterestRate =(double)( tuition* 0.10);
        System.out.println(" Tuition Loan applied successfully!!");
        return;
    }
    // stationary loan method
    public void stationary(){
        System.out.println( " how much for Stationary; \n enter your amount");
        stationary = input.nextDouble();
        stationaryInterestRate =(double)( stationary* 0.15);
        System.out.println(" stationary Loan applied successfully!!");
    }
    
//substintence loan method

    public void substintence(){
        System.out.println( " how much for substintence; \n enter your amount");
        substintence = input.nextDouble();
        substintenceInterestRate =(double)( substintence* 0.11);
        System.out.println(" Substintence Loan applied successfully!!");
    }

    //getter for accountNumber
    public String getAccountNumber(){
        return accountNumber;
    }

    //getter for generator

    public static int getGenerator(){
        return generator;
    }


    public String toString(){
         return "UnderGraduate{" +
                "tuition=" + tuition +
                ", tutuionInterestRate=" + tuitionInterestRate +
                ", tuitionBalance=" + tuitionBalance +
                ", stationary=" + stationary +
                ", stationaryInterestRate=" + stationaryInterestRate +
                ", stationaryBalance=" + stationaryBalance +
                ", substintence=" + substintence+
                ", substintenceInterestRate=" + substintenceInterestRate +
                ", subsintenceBalance=" + subsintenceBalance +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }


}
