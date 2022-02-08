import java.util.*;

public class Loans{
    public static void main( String[] args){

        //scanner
        Scanner input = new Scanner(System.in);
             
             //list array
             ArrayList<UnderGraduate> ug = new ArrayList<>(5);
             ArrayList<PostGraduate> pg = new ArrayList<>(5);

             // array control

            int index_ug=0;
            int index_pg=0;

            System.out.println(" WELCOME TO LOANS BOARD SYSTEM ");
            System.out.println( " ______________________________");
            System.out.println(" ");
            System.out.println( " Select your option \n1.Create an underGraduate student account\n2.create a postGraduate student account\n3.Apply Loan\n4.make Deposits\n5.List all accounts\n6.Exit");

             System.out.println( " Enter your choice: ");
             int Choice1=input.nextInt();    

              //Loop The Menu
        while (Choice1 != 6){

            //The meat of it
            if (Choice1 > 6){
                System.out.print("invalid choice");
            }
            else if (Choice1 == 6){

            }
            else if (Choice1 == 5){
               System.out.println("1.Tuition\n2.tuitionInterestRate\n3.stationary\n4.stationaryInterestRate\n5.substintence\n6.substintenceInterestRate\n7.balance\n8.AccountNumber");

                        //Printing loop for UnderGraduate Students
                        for(int printIndex = 0; printIndex < (UnderGraduate.getGenerator() - 100); printIndex++ ){
                            //System.out.println( ug.get[printIndex].toString());
                            System.out.println( "Tuition \t\t\ttuitionInterestRate\t\t\t stationary\t\t\t stationaryInterestRate"+
                                    "\t\t\tsubstintence\t\tsubstintenceInterestRate\t\t\t balance\t\t\t AccountNumber");
                            System.out.println("************************************************************************************************************************************************************************************************************");

                            System.out.println( ug.get(printIndex).toString());

                        }
                        //Printing loop for PostGraduate Students
                        for(int printIndex = 0; printIndex < (PostGraduate.getGenerator() - 100); printIndex++ ){
                            //System.out.println( pg.get[printIndex].toString());
                            System.out.println( "Tuition \t\t\ttuitionInterestRate\t\t\t stationary\t\t\t stationaryInterestRate"+
                                    "\t\tsubstintence\t\tsubstintenceInterestRate\t\t balance\t\t AccountNumber");
                            System.out.println("************************************************************************************************************************************************************************************************************");
                            System.out.println( pg.get(printIndex).toString());

                        }

            }
            
            else if (Choice1 == 4){

                //Option 4
                System.out.println("Choose Your Account.\n1.UnderGraduate Account\n2.PostGraduate Account");
                int account_Type = input.nextInt();
                if (account_Type == 1){
                    //INTO MENU 4
                    System.out.print("Enter Your Account Number: UG");
                    int cheat = input.nextInt();
                    System.out.println("\n1.Apply tuition loan\n2.Apply substintence loan\n3.Apply stationary loan");
                    System.out.println(" Enter your choice;");
                    int loan_Choice = input.nextInt();
                    while( loan_Choice <1 || loan_Choice>3){
                        System.out.println( " Invalid input\n Enter your choice;");
                        loan_Choice = input.nextInt();
                    }


                    //Inner Menu
                    //Tuition loan
                    if (loan_Choice == 1){
                        //ug.get[cheat - 100].Tuition();
                        ug.get(cheat- 100).Tuition();

                    }
                    //substintence loan
                    else if(loan_Choice == 2){
                       //g.get[cheat- 100].Substintence();
                        ug.get(cheat- 100).substintence();

                    }
                    //Stationary loan
                    else{
                        //ug[cheat - 100].Stationary_Loan();
                        ug.get(cheat - 100).stationary();

                    }

                }
                else{
                     //INTO MENU 4
                     System.out.print("Enter Your Account Number: PG");
                     int cheat = input.nextInt();
                     System.out.println("\n1.Apply tuition loan\n2.Apply substintence loan\n3.Apply Research Grant");
                     int loan_Choice = input.nextInt();
 
                     //Inner Menu
                     //Tuition loan
                     if (loan_Choice == 1){
                         //ug[cheat - 100].tuition_Loan();
                         ug.get(cheat-100).Tuition();
                     }
                     //substintence loan
                     else if(loan_Choice == 2){
                         //ug[cheat- 100].substintence_Loan();
                         ug.get(cheat- 100).substintence();
                     }
                     //Research Grant
                     else{
                         //ug[cheat - 100].Stationary_Loan();
                         ug.get(cheat - 100).stationary();

                     }
                }


            }
            else if (Choice1 == 3){
              //  ug[index_ug - 1].repay();
                ug.get(index_ug - 1).repay();

            }

            else if (Choice1 == 2){
                System.out.print("Enter Your firstName: ");
                String firstName= input.next();
                System.out.print("Enter Your lastName: ");
                String lastName = input.next();
                System.out.print("Enter Your Program Of Study: ");
                String programOfStudy = input.next();
                System.out.print("Enter Your Year Of Study: ");
                int yearOfStudy = input.nextInt();
                while (yearOfStudy > 4){
                    System.out.print("Invalid Input.\nEnter Your Year Of Study: ");
                    yearOfStudy = input.nextInt();
                }
              //  pg[index_pg] = new PostGraduate(name_Of_Student,programOfStudy,yearOfStudy);
                pg.add( new PostGraduate(firstName,lastName,programOfStudy,yearOfStudy));

               // System.out.print("Your account has been successfully generated.\nYour account number is " + pg[index_pg].get_AccountNumber());
                System.out.print("Your account has been successfully generated.\nYour account number is " + pg.get(index_pg).getAccountNumber());


                //Dealing with the array

//                if (index_pg < (pg.length - 1))
                   index_pg++;
            }
            else{
                System.out.print("Enter Your firstName: ");
                String firstName= input.next();
                 System.out.print("Enter Your lastName: ");
                String lastName = input.next();
                System.out.print("Enter Your Program Of Study: ");
                String programOfStudy = input.next();
                System.out.print("Enter Your Year Of Study: ");
                int yearOfStudy = input.nextInt();
                while (yearOfStudy > 4){
                    System.out.print("Invalid Input.\nEnter Your Year Of Study: ");
                    yearOfStudy = input.nextInt();
                }
              //  ug[index_ug] = new UnderGraduate(name_Of_Student,programOfStudy,yearOfStudy);
                ug.add( new UnderGraduate(firstName,lastName,programOfStudy,yearOfStudy));

//                System.out.print("Your account has been successfully generated.\nYour account number is " + ug[index_ug].get_AccountNumber());
                System.out.print("Your account has been successfully generated.\nYour account number is " + ug.get(index_ug).getAccountNumber());


                //Dealing with the array

//                if (index_ug < (ug.length - 1))
                   index_ug++;


            }
            System.out.println();
            System.out.print("\t\tWelcome To The System\n1.Create Undergraduate Student Account\n2.Create PostGraduate Student Account" +
                    "\n3.Deposit Money\n4.Apply Loans\n5.List All Accounts\n6.Exit\n");
            //Input
            System.out.println( " Enter your option;");
            Choice1 = input.nextInt();
            while ( Choice1<1 || Choice1>6){
                System.out.println(" Invalid option.\n Enter your option");
                Choice1 = input.nextInt();
            }
        }
    }
}
