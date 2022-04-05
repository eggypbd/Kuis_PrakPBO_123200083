
package Main;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int form,menu;
        boolean ulang = true;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("FORM PENDAFTARAN PT LIES MAKNYUS");
        System.out.println("1. Android Development\n2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        form = input.nextInt();
        
        System.out.println("");
        
        switch(form){
                   
        
            case 1 : {
            
                AndroDev andro = new AndroDev();
                
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                 System.out.print("Input NIK : ");
                 andro.setNim(input1.nextLine());
                 System.out.print("Input Nama : ");
                 andro.setNama(input2.nextLine());
                
                eAndro(andro,input);
                
                
                while(ulang == true){
                 
                     System.out.println("\nMenu :");
                     System.out.println("1. Edit\n2. Tampil\n3. Exit");
                     System.out.print("Pilih : ");
                     menu = input.nextInt();
                     
                     switch(menu){
                     
                         case 1 : {
                                    System.out.println("\nFORM EDIT\n");
                                    eAndro(andro,input);
                                    break;
                         }
                         
                         case 2 : {
                                    hAndro(andro);
                                    break;
                         }
                         case 3 : {
                                    ulang = false;
                                    break;
                         }
                         
                     }
                 
                 }
            
            break;
            }
        
            
            case 2 : {
            
                WebDev web = new WebDev();
                
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                 System.out.print("Input NIM : ");
                 web.setNim(input1.nextLine());
                 System.out.print("Input Nama : ");
                 web.setNama(input2.nextLine());
                
                eWeb(web,input);
                
                while(ulang == true){
                 
                     System.out.println("\nMenu :");
                     System.out.println("1. Edit\n2. Tampil\n3. Exit");
                     System.out.print("Pilih : ");
                     menu = input.nextInt();
                     
                     switch(menu){
                     
                         case 1 : {
                                    System.out.println("\nFORM EDIT\n");
                                    eWeb(web,input);
                                    break;
                         }
                         
                         case 2 : {
                                    hWeb(web);
                                    break;
                         }
                         case 3 : {
                                    ulang = false;
                                    break;
                         }
                         
                     
                     }
                 
                 }
            
                break;
            }
        }    
    }
    
    public static void eAndro(AndroDev andro,Scanner input){

         
         System.out.print("Input Nilai Tes Tulis : ");
         andro.setTulis(input.nextDouble());
         System.out.print("Input Nilai Tes Coding : ");
         andro.setCoding(input.nextDouble());
         System.out.print("Input Nilai Tes Wawancara : ");
         andro.setWawan(input.nextDouble());

    }
    
    public static void hAndro(AndroDev andro){
        
        andro.hitungHasil();
   
        System.out.println("Nilai Akhir : " + andro.getHasil());
        if(andro.getHasil()>= 85){
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat kepada " + andro.getNama() + " telah diterima di bagian Android Development");
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + andro.getNama() + " telah ditolak di bagian Android Development");
        } 
    
    }
    
    public static void eWeb(WebDev web,Scanner input){
        
         
         System.out.print("Input Nilai Tes Tulis : ");
         web.setTulis(input.nextDouble());
         System.out.print("Input Nilai Tes Coding : ");
         web.setCoding(input.nextDouble());
         System.out.print("Input Nilai Tes Wawancara : ");
         web.setWawan(input.nextDouble());

    }
    
    public static void hWeb(WebDev web){
        
        web.hitungHasil();
        
        System.out.println("Nilai Akhir : " + web.getHasil());
        if(web.getHasil()>= 85){
            System.out.println("Keterangan : Lolos");
            System.out.println("Selamat kepada " + web.getNama() + " telah diterima di bagian Web Development");
        }else{
            System.out.println("Keterangan : Gagal");
            System.out.println("Mohon maaf kepada " + web.getNama() + " telah ditolak di bagian Web Development");
        } 
    
    }
   
}
