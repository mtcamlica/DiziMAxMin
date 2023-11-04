public class Main {
    public static void main(String[] args) {
        int [] list = {56,34,1,8,101,-2,-33};
        //min = list [0] min <list [1] ? min = list[1] : " " -- ilk elemanı minimum varsayıp hepsini geziyoruz.
        //max = list [0] max > list [1] ? max = list[1] : " "

        int min = list[0];
        int max = list[0];

        for (int i: list) {
            if (i<min) {
                min = i;
            }
            if (i>max) {
                max = i;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);
    }
}
