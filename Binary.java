public class Binary {
    int b1, b2;
    int index = 0;
    
    
    public Binary(int b1, int b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public void binaryAdd() {
        int[] arr = new int[20];
        int i = index, rem = 0;
        int x = b1;
        int y = b2;
        

        while (x != 0 || y != 0) {
            arr[i++] = (int)((x % 10 + y % 10 + rem) % 2);
            rem = (int)((x % 10 + y % 10 + rem ) / 2);
            x /= 10;
            y /= 10;
        } 

        if (rem != 0) {
            arr[i++] = rem;
        }

        --i;
        System.out.print("The binary sum is ");
        while (i >= 0 ) {
            System.out.print(arr[i--]);
        }
        
        
    }


}