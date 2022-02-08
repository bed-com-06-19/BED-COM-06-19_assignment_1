import java.util.*;

class PostGraduate extends StudentAccount{
    private double tuition;
    private double tuitionInterestRate;
    private double researchGrant1;
    private double substintence;
    private double substintenceInterestRate;
    private double balance;
    private String accountNumber;
    private static int generator=100;

    //constructors
    
    public PostGraduate(String firstName, String lastName, String programOfStudy,int yearOfStudy ){
      super(firstName, lastName,  programOfStudy , yearOfStudy);
      accountNumber = "PG" + generator;
    generator++;
  }

  // scanner
  Scanner input = new Scanner(System.in);

  //methods

   public double deposit () {
        System.out.print("How much do you want to repay? : MWK ");
        double repay  = input.nextDouble();
        balance = (tuition + substintence  ) -repay ;
        return balance;

    }

    //Tuition loan
    public void tuition() {
        System.out.print("How much for tuition? : MWK ");
        tuition = input.nextDouble();
        tuitionInterestRate = (int) (tuition * 0.10);
        System.out.println("\nTuition Loan applied Succussfully.");
    }

    //substintence loan
    public void substintence(){
        System.out.print("How much for substintence? : MWK ");
        substintence = input.nextDouble();
        substintenceInterestRate = (int) (substintence * 0.15);
        System.out.println("\nsubstintence Loan applied Succussfully.");
    }

      //Research Grant
    public void researchGrant(){
        System.out.print("How much for research? : MWK ");
        researchGrant1 = input.nextDouble();
        while(researchGrant1 < 50000 || researchGrant1 > 100000){
            System.out.print("The amount should be between MWK 50000 and MWK 100000.\nPlease re-enter: MWK ");
            researchGrant1 = input.nextDouble();
        }
        System.out.println("\n Research Grant applied Succussfully.");
    }

    //Acc number getter
    public String getAccountNumber() {
        return accountNumber;
    }

    //Generator
    public static int getGenerator() {
        return generator;
    }

    @Override
    public String toString() {
        return   + tuition +"\t\t\t\t\t\t\t\t"+ tuitionInterestRate +"\t\t\t\t\t\t\t\t" + researchGrant1 + "\t\t\t\t\t\t\t\t"+ substintence + "\t\t\t\t\t\t\t\t"+ substintenceInterestRate + "\t\t\t\t\t\t\t\t" + balance +"\t\t\t\t\t\t\t\t"+  accountNumber
                ;
    }

}