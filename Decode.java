import java.util.Scanner;

public class Decode
{

    public static void main(String[] args)
    {

        //set variables
        String codedMessage;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int charPosition;
        String decodedMessage = "";
        char decodedChar;
        int key;


        //create scanner to read file
        Scanner s = new Scanner(System.in);

        //store the coded message
        codedMessage = s.nextLine();
        key = s.nextInt();

        //close scanner
        s.close();





        //loop through all the characters in the message and use the key to decode
        for (int j = 0; j < codedMessage.length(); j++)
        {
            //store the current char
            char currentChar = codedMessage.charAt(j);
            int code2;

            //check if it's a space
            if (currentChar == ' ')
            {
                //add the space to the encoded message
                decodedMessage += " ";

            }
            else
            {
                //find index of current char in alphabet
                charPosition = alphabet.indexOf(currentChar);


                //add the key to the current char position
                int code1 = charPosition - key;

                //check to see if it's out of bounds
                if(code1 < 0 || code1 >= 26)
                {
                    //use mod to code the char again
                    code2 = Math.floorMod(code1,26);
                }
                else
                {
                    //set code2 = code1
                    code2 = code1;
                }


                //set the decoded char to be the char at the new index in the alphabet
                decodedChar = alphabet.charAt(code2);

                //add the char to potential decoded message
                decodedMessage += decodedChar;

            }

        }

        //print the potential decoded message
        System.out.println(decodedMessage);













    }

}
