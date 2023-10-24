public class Ques {

        public static String reverseString(String input) {
            // Convert the input string to a character array
            char[] charArray = input.toCharArray();

            // Initialize pointers for the start and end of the character array
            int start = 0;
            int end = charArray.length - 1;

            // Reverse the character array
            while (start < end) {
                // Swap characters at the start and end positions
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;

                // Move the pointers towards each other
                start++;
                end--;
            }

            // Convert the character array back to a string
            String reversedString = new String(charArray);

            return reversedString;
        }


        }
