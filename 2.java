public class Main 
{ 
    public static void main(String[] args) {
        String sample1="engers";
        String sample = "Avengers";
        int count=0;
        char lastLetter = sample.charAt(sample.length() - 1);
        for(int i = 0; i<sample1.length(); i++) {
            if (sample1.charAt(i)==lastLetter)
            count++;
        }
        
        System.out.println(count);  
    }
}
