public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //declaring an array of 10 elements. //1
        int sum = 0; //declaring a variable to store the sum of the elements. //1
        for (int i = 0; i < 10; i++) { //for loop to iterate through the array. //n
            sum += array[i]; //adding the elements of the array to the sum variable. //n
        }
        System.out.println(sum); //printing the sum.
    }
}
