/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

public class mtkCanggih extends mtk {
    double hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian, hasilModulus;
    
    void setPenjumlahan (int a, int b){
        hasilPenjumlahan = a + b;
        System.out.println("Hasil Dari "+ a +" + "+ b +" = "+hasilPenjumlahan);
    }
    
    void setPenjumlahan (double a, double b){
       hasilPenjumlahan = a + b;
        System.out.println("Hasil Dari "+a+" + "+b+" = "+hasilPenjumlahan);
    }
    
    void setPenjumlahan (double a, double b, double c){
        hasilPenjumlahan = a + b + c;
        System.out.println("Hasil Dari "+a+" + "+b+" + "+c+" = "+hasilPenjumlahan);
    }
    
    void setPengurangan (int a, int b){
        hasilPengurangan = a - b;
        System.out.println("Hasil Dari "+a+" - "+b+" = "+hasilPengurangan);        
    }
    
    void setPengurangan (double a, double b){
        hasilPengurangan = a - b;
        System.out.println("Hasil Dari "+a+" - "+b+" = "+hasilPengurangan);
    }
    
    void setPengurangan (double a, double b, double c){
        hasilPengurangan = a - b - c;
        System.out.println("Hasil Dari "+a+" - "+b+" - "+c+" = "+hasilPengurangan);
    }
    
    void setPerkalian (int a, int b){
        hasilPerkalian = a * b;
        System.out.println("Hasil Dari "+a+" * "+b+" = "+hasilPerkalian);
    }
    
    void setPerkalian (double a, double b){
        hasilPerkalian = a * b;
        System.out.println("Hasil Dari "+a+" * "+b+" = "+hasilPerkalian);
    }
    
    void setPerkalian (double a, double b, double c){
        hasilPerkalian = a * b * c;
        System.out.println("Hasil Dari "+a+" * "+b+" * "+c+" = "+hasilPerkalian);
    }
    
    void setPembagian (int a, int b){
        hasilPembagian = a / b;
        System.out.println("Hasil Dari "+a+" / "+b+" = "+hasilPembagian);
    }
    
    void setPembagian (double a, double b){
        hasilPembagian = a / b;
        System.out.println("Hasil Dari "+a+" / "+b+" = "+hasilPembagian);
    }
    
    void setPembagian (double a, double b, double c){
        hasilPembagian = a / b / c;
        System.out.println("Hasil Dari "+a+" / "+b+" / "+c+" = "+hasilPembagian);
    }
    
    void setModulus (int a, int b){
        hasilModulus = a % b;
        System.out.println("Hasil Dari "+a+" % "+b+" = "+hasilModulus);
    }

    double getPenjumlahan (){
        return hasilPenjumlahan;
    }
    
    double getPengurangan (){
        return hasilPengurangan;
    }
    
    double getPerkalian (){
        return hasilPerkalian;
    }
    
    double getPembagian (){
        return hasilPembagian;
    }

}
