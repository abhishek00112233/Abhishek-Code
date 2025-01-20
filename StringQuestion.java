public class StringQuestion {
    //1 how do you reverse a string using iteration and recursion
    static String revString(String str){
        String reverse="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
        return  reverse;
    }

    // check if a string is a palindrome
    static boolean checkPalindrome(String str){
        String rev="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        if (str.equals(rev)){
            return true;
        }
        return false;
    }
    //3 count the number of words in string
    static int countWords(String str){
        int count=0;
        String[] sarray=str.split(" ");
        for (int i=0;i<sarray.length;i++){
//            System.out.println(sarray[i]);
            count++;
        }
//        System.out.println(count);
        return count;
    }

    //4 count the vowel in string
    static int vowelCount(String str){
        int vowelCount=0;
        int constantCount=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
            else
                constantCount++;
        }
        System.out.println("vowel = "+vowelCount);
        System.out.println("constant = "+constantCount);
        return constantCount;
    }
    // reverse  String word
    static String reverseWord(String str){
        String str3="";
        String[] str1=str.split(" ");
        for (int i=str1.length-1;i>=0;i--){
            str3+=str1[i]+" ";
        }
            return str3;

    }
    public static void main(String[] args) {
        // reverse word
        System.out.println(reverseWord("hello i am abhishek"));


        // String reverse
        revString("hello");

        // check palindrome
        System.out.println(checkPalindrome("aba"));
        System.out.println(checkPalindrome("hello"));

        // word count
        System.out.println("number of word is : "+countWords("my name is abhishek yadav and i have a lot of experience"));

        // vowel count
        vowelCount("hello everyone");

        String str="geeksforgeeks";
        String target="for";
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='f'){
                break;
            }count++;

        }
        System.out.println(count);
    }
}
