if(N%2!=0)
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                System.out.print("Weird");
            else if(N%2==0 && N>=2 && N<=5)
            System.out.print("Not Weird");
            else if(N%2==0 && N>=6 && N<=20)
            System.out.print("Weird");
            else if(N%2==0 && N>20)
            System.out.print("Not Weird");
            
            
            
        


    public static void main(String[] args) {
        int N = scanner.nextInt();

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna