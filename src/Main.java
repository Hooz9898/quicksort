//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                                        //low      //high?
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



    }



    public static void main(String[] args) {

        }
    }
