public class TitleCase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String sample = "hi, i am abhiram";
        System.out.println(toUpperCase(sample));
    }
}
