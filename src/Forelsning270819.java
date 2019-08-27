/**
 * [5 7 9 2 1 11 13 8]
 *
 */

public class Forelsning270819 {

public static void main(String[] args){


}

public static int maximum (int[] values,int begin,int end){
    int max_value = values[begin];
    for (int i=begin+1;i<end;i++){
        if(max_value<values[i]){
            max_value=values[i];
            return max_value;
        }
    }
    return 0;
}

}
