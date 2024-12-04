/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

public class mtk {
   double hasilModulus;
   
   
   void setModulus (int a, int b){
       hasilModulus = a % b;
       System.out.println("Hasil Dari "+ a +" / "+ b +" = "+hasilModulus);
   }
    
   void setModulus (double a, double b){
       hasilModulus = a % b;
       System.out.println("Hasil Dari "+ a +" / "+ b +" = "+hasilModulus);
   }
   
   double getModulus (){
       return hasilModulus;
   }
}
