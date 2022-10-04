public class Seminar1{
    public static void main(String[] args) {
    int [][] array = new int [][]{
        {0,1},
        {0,1},
        {1,0}
    };
        System.out.println(squareArray(array));
    }
    
    public static int squareArray(int [][] arr){
        int sum = 0;
        if (arr.length == arr[0].length){
        for(int i = 0 ; i < arr.length; i++ ){
            for(int j = 0 ; j < arr.length; j++ ){
                if (arr[i][j] == 0 || arr [i][j] == 1){
                    sum += arr[i][j];
                } else {
                    return -1;
                }
            }
        }
    } else {
        return -2;
    }
    return sum;              
}
}
