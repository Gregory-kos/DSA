package arrayspackage;

import java.util.Arrays;

public class singledimensionarraytest {

    public static void main(String[] args) {
        
        singledimensionarray sda = new singledimensionarray(4);
        System.out.println(Arrays.toString(sda.getarray()));
        sda.insert(0, 1);
        sda.insert(1, 2);
        sda.insert(2, 3);
        sda.insert(3, 4);
        sda.insert(4, 5);
        sda.insert(0, 3);
        System.out.println(Arrays.toString(sda.getarray()));
    }
    
}
