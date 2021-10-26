import java.util.ArrayList;
import java.util.Scanner;

public class Encode
{

    public static void main(String[] args)
    {

        //set variables
        String message;
        int key;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int charPosition;
        String encodedMessage = "";
        char codedChar;


        //create scanner to read file
        Scanner s = new Scanner(System.in);


        //store the message and key
        message = s.nextLine();
        key = s.nextInt();


        //close scanner
        s.close();


        //loop through each character in the message and encode it
        for(int i = 0; i < message.length(); i++)
        {
            char currentChar = message.charAt(i);
            int code2;
            //check if it's a space
            if(currentChar == ' ')
            {
                //add the space to the encoded message
                encodedMessage += " ";

            }
            else
            {
                //encode the character

                //find index of current char in alphabet
                charPosition = alphabet.indexOf(currentChar);

                //subtract the key from the current char position
                int code1 = charPosition + key;

                if(code1 < 0 || code1 > 26)
                {
                    //use mod to code the char again
                    code2 = Math.floorMod(code1,26);
                }
                else
                {
                    code2 = code1;
                }



                //set the coded char to be the char at the new index in the alphabet
                codedChar = alphabet.charAt(code2);

                //add the char to encoded message
                encodedMessage += codedChar;
            }

        }


        //print the encoded message
        System.out.println(encodedMessage);


















    }
}
