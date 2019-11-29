package ex1;

public class Median {

    public float median(float [] numbers) {
        float sortedArr[] = sort(numbers);
        if (sortedArr.length % 2 == 1){
            return sortedArr[sortedArr.length/2];
        }
        else {
            return (sortedArr[sortedArr.length/2] + sortedArr[sortedArr.length/2 - 1]) / 2.0f;
        }
    }

    private static float[] sort(float[] numbers) {
        for (int j=0; j<numbers.length; j++){
            for (int i=1; i<numbers.length; i++){
                float temp;
                if (numbers[i]<numbers[i-1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        Median m = new Median();
        float median = m.median(new float[]{-2.1f, -.7f, 1.5f, .0f, 136.5f, 4.0f, .3f, 800.3f});
        System.out.println("Mediana: " + median);
    }
}
