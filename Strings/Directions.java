public class Directions {
    public static double shortestPath(String dir){
        int finalX = 0, finalY = 0;
        for(char ch : dir.toCharArray()){
            if(ch == 'E'){
                finalX--;
            }
            else if(ch == 'W'){
                finalX++;
            }
            else if(ch == 'N'){
                finalY++;
            }
            else{
                finalY--;
            }
        }
        double answer = Math.sqrt((finalX * finalX) + (finalY * finalY));
        return answer;
    }

    public static void main(String[] args) {
        String sample = "NSEW";
        System.out.println(shortestPath(sample));
    }
}
