
public class Main {
    public static boolean asalMi(int sayi) {
        
        for (int i = 2 ; i < sayi;i++) {
            
            if (sayi % i == 0){
                return false;
                
            }
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        
        
        for (int i = 2 ; i < 58000 ; i++) {
            
            if (asalMi(i)){
                System.out.println(i);
                
            }
        }
        /*
        
        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.
         
        */
        
        
    }
}
