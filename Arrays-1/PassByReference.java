public class PassByReference {
    public static void update(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i]++;
        }
    }

    public static void main(String[] args) {
        int marks[] = {100, 101, 102};
        System.out.println("Array Before Updation: ");
        for(int i = 0; i < 3; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        update(marks);

        System.out.println("Array After Updation: ");
        for(int i = 0; i < 3; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
