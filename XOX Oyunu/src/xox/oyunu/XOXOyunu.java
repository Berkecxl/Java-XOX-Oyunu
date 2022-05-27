
package xox.oyunu;

import java.util.Scanner;


public class XOXOyunu {

    
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     String oyuncu ="Player 1 ";
     String oyuncu2 =" Player 2 ";
     String oyuncu_sembol = "X";
     String oyuncu2_sembol = "O";
     String[][] dizi = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
     int sayac = 2;
     int a = 2;
      
     System.out.println("       Tic Tac Toe");
     System.out.println();
     System.out.println(oyuncu+"("+oyuncu_sembol+")  "+"-  "+oyuncu2+" ("+oyuncu2_sembol+")");
     System.out.println();
     System.out.println("-  |  -  |  -  |");
     for(int i = 0;i < dizi.length;i++){
          for(int j = 0;j < dizi[0].length;j++){
            
              System.out.print(dizi[i][j]+"  "+"|"+"  "); 
      }
      System.out.println();
      System.out.println("-  |  -  |  -  |");
       }
    
     System.out.println();
     System.out.println("1. Oyuncu Adını Giriniz.");
     oyuncu = s.nextLine();
    System.out.println("2. Oyuncu Adını Giriniz.");
     oyuncu2 = s.nextLine();
   
     while(true){
     String islem = "16";
    if(sayac%2 == 0){    
     System.out.println(oyuncu+", oynamak istediğin kare numarasını gir:");
     islem = s.nextLine(); }
    else if(sayac%2 == 1){
       System.out.println(oyuncu2+", oynamak istediğin kare numarasını gir:");
     islem = s.nextLine();  
     }
    sayac++;
    switch(islem){
     case "1": if(a%2 != 0){dizi[0][0] = oyuncu2_sembol; a++; break;} else {dizi[0][0] = oyuncu_sembol; a++; break; }
     case "2": if(a%2 != 0){dizi[0][1] = oyuncu2_sembol; a++; break;} else {dizi[0][1] = oyuncu_sembol; a++; break; }
     case "3": if(a%2 != 0){dizi[0][2] = oyuncu2_sembol; a++; break;} else {dizi[0][2] = oyuncu_sembol; a++; break; }
     case "4": if(a%2 != 0){dizi[1][0] = oyuncu2_sembol; a++; break;} else {dizi[1][0] = oyuncu_sembol; a++; break; }
     case "5": if(a%2 != 0){dizi[1][1] = oyuncu2_sembol; a++; break;} else {dizi[1][1] = oyuncu_sembol; a++; break; }
     case "6": if(a%2 != 0){dizi[1][2] = oyuncu2_sembol; a++; break;} else {dizi[1][2] = oyuncu_sembol; a++; break; }
     case "7": if(a%2 != 0){dizi[2][0] = oyuncu2_sembol; a++; break;} else {dizi[2][0] = oyuncu_sembol; a++; break; }
     case "8": if(a%2 != 0){dizi[2][1] = oyuncu2_sembol; a++; break;} else {dizi[2][1] = oyuncu_sembol; a++; break; }
     case "9": if(a%2 != 0){dizi[2][2] = oyuncu2_sembol; a++; break;} else {dizi[2][2] = oyuncu_sembol; a++; break; }
     }
     System.out.println("       Tic Tac Toe");
     System.out.println();
     System.out.println(oyuncu+"("+oyuncu_sembol+")  "+"-  "+oyuncu2+" ("+oyuncu2_sembol+")");
     System.out.println();
     System.out.println("-  |  -  |  -  |");
     for(int i = 0;i < dizi.length;i++){
          for(int j = 0;j < dizi[0].length;j++){
            
              System.out.print(dizi[i][j]+"  "+"|"+"  "); 
      }
      System.out.println();
      System.out.println("-  |  -  |  -  |");
       }
     if(dizi[0][0]==dizi[0][1] && dizi[0][0]==dizi[0][2] && dizi[0][1] == dizi[0][2] || dizi[1][0]==dizi[1][1] && dizi[1][0]==dizi[1][2] && dizi[1][1] == dizi[1][2] || dizi[2][0]==dizi[2][1] && dizi[2][0]==dizi[2][2] && dizi[2][1] == dizi[2][2])
     {
         if(a%2== 0){
         System.out.println(oyuncu2+" oyuncusu,"+((sayac-2)/2)+" hamlede oyunu yatay şekilde bitirmiştir.");
         break;
         }
         else{
         System.out.println(oyuncu+" oyuncusu,"+(((sayac-2)/2)+1)+" hamlede oyunu yatay şekilde bitirmiştir."); 
         break;
         }
         }
     if(dizi[0][0]==dizi[1][0] && dizi[0][0]==dizi[2][0] && dizi[1][0] == dizi[2][0] || dizi[0][1]==dizi[1][1] && dizi[0][1]==dizi[2][1] && dizi[1][1] == dizi[2][1] || dizi[0][2]==dizi[1][2] && dizi[0][2]==dizi[2][2] && dizi[1][2] == dizi[2][2])
     {
       if(a%2== 0){
         System.out.println(oyuncu2+" oyuncusu,"+((sayac-2)/2)+" hamlede oyunu dikey şekilde bitirmiştir.");
         break;
         }
         else{
         System.out.println(oyuncu+" oyuncusu,"+(((sayac-2)/2)+1)+" hamlede oyunu dikey şekilde bitirmiştir."); 
         break;
        }
        }
     if(dizi[0][0]==dizi[1][1] && dizi[0][0]==dizi[2][2] && dizi[1][1] == dizi[2][2] || dizi[0][2]==dizi[1][1] && dizi[0][2]==dizi[2][0] && dizi[2][0] == dizi[1][1])
     {
       if(a%2== 0){
         System.out.println(oyuncu2+" oyuncusu,"+((sayac-2)/2)+" hamlede oyunu çarpraz şekilde bitirmiştir.");
         break;
         }
         else{
         System.out.println(oyuncu+" oyuncusu,"+(((sayac-2)/2)+1)+" hamlede oyunu çarpraz şekilde bitirmiştir."); 
         break;
        }
        }
     if(sayac-2==9){
         System.out.println("Hamle hakkı kalmadı. BERABERE"); 
         break;
     }
   }     
    }
    
}
