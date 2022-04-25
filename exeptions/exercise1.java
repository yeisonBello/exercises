package expections;
//Answer of  exercise 1 and 3, THE Program illustrating throws keyword AND  try and catch & finally block
//this code calculate the age that you had bases on the age of your son
//TO cause the exception put your son age bigger that your age


import java.util.Scanner;
class  AgeThatYouHadWhenYourChildBorn{

    private int age;
    private int SonAge;

    public AgeThatYouHadWhenYourChildBorn( int age, int SonAge){
        this.age=age;
        this.SonAge=SonAge;
    }
    public void ageAtThatPoint() throws Exception {
        if(SonAge>age){
            throw new Exception("YOUR SON CAN BE OLDER THAN YOU ");
        }int YourAge=age-SonAge;
        System.out.println("You were " + YourAge+" years old when your son was born");
    }

}

public class exercise1 {
    public static void main(String[] args) throws Exception {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("what is your age ?");
        int age2 = scanObj.nextInt();
        System.out.println("what is your son age ?");

        try{int SonAge = scanObj.nextInt();
        AgeThatYouHadWhenYourChildBorn X = new AgeThatYouHadWhenYourChildBorn(age2, SonAge);
        X.ageAtThatPoint();}
        catch (Exception ex){
            System.out.println("Your son cannot be older thant you, Put your son's age. ");
            int sectry = scanObj.nextInt();
            AgeThatYouHadWhenYourChildBorn Y = new AgeThatYouHadWhenYourChildBorn(age2,sectry);
            Y.ageAtThatPoint();
    }finally {
            System.out.println("-------------------------------------- ");
           System.out.println("Thank you for user our services ");
       }
    }
}