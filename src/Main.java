//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void quickSort(String[] arr, int start, int end){
        if (start >= end) return;
        String piv = arr[end];
        int test = start - 1;

        for(int j = start; j < end; j++){
            if(arr[j].compareTo(piv) < 0){
                test++;
                String temp = arr[test];
                arr[test] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[test+1];
        arr[test+1] = arr[end];
        arr[end] = temp;

        quickSort(arr, start, test);
        quickSort(arr, test +2, end);


    }



    public static void main(String[] args) {

            String arr[] = new String[8];
            arr[0] = "Lemon";
            arr[1] = "Blueberry";
            arr[2] = "Apple";
            arr[3] = "Banana";
            arr[4] = "Mogiliski";
            arr[5] = "Cookie";
            arr[6] = "POTATO";
            arr[7] = "Brownie";
            arr[8] = "Nish";

            quickSort(arr, 0, 7);

        }
    }
