package Practice;

public class LowercaseVowels {
    public static boolean isVowel(char ch){
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < vowels.length; i++){
            if(ch == vowels[i]){
                return true;
            }
        }

        return false;
    }

    public static int lowercaseVowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                if(isVowel(str.charAt(i))){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sample = "abcde";
        System.out.println(lowercaseVowels(sample));
    }
}
