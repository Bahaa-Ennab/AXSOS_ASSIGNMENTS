import java.util.Random;
public class Puzzle{
//         int [] randomRolls = new int[10];
//         for (int i = 0; i<10;i++){
//             Random rand = new Random();
//             int randomNumber = rand.nextInt(20) + 1;
//             randomRolls[i]= randomNumber;
//         }
//         for (int i = 0; i< randomRolls.length; i++){
//             System.out.println("Roll " + (i + 1) + ": " + randomRolls[i]);
//         }

// // -----------------------------------------------------------------

//         char [] letters = new char [26];
//             for (int i = 0 ; i<26;i++){
//                 letters[i]= (char) ('a' + i);
//             }
//             int arrLength=10;
//         char [] password = new char [arrLength];
//         Random rand = new Random();
//             for(int i = 0; i<arrLength;i++){
//                 char randomchar = (char) ('a' + rand.nextInt(26));
//                 password[i]=randomchar;
//             }
//             String passwordString= new String(password);
//             System.out.println(passwordString);
    public int[] getTenRolls(){
        int[] randomRolls = new int[10];
        Random randominst = new Random();
        int randomNumber = randominst.nextInt(20)+1;
        System.out.println(randomNumber);
        return randomRolls;
    }
}