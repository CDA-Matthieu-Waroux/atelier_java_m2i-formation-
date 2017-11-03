/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class VariablesTest {

    @Test
    public void testVariablesObjets() {

//        String txt1= new String("couCou") ;
//        
//        String txt2= txt1.toUpperCase() ;
//        
//        System.out.println(txt2);
    }

    @Test
    public void exercice1() {
//    
//        String a = "Jamaïque" ;
//        
//        String b = "kingston" ;
//        
//        String c = b.toUpperCase() + ", " + a.toUpperCase();
//        
//       
//        System.out.println(c);
    }

    @Test

    public void exercices2() {

//    int a  = 123;
//    
//    String b = "COUCOU" ;
//        
//    String c = a + b ;
//    
//    String d = "6" + a ;
////    
//        System.out.println(c);
//        
//        System.out.println(d);
//    }
    }
//    
//@Test
//public void exercices3(){
//            
//            String a = "10" ;
//           
//            int b = 20 ;
//            
//            int c  ;
//            
//           c = b+Integer.parseInt(a) ;
//           
//           int d ;
//           
//           d=Integer.parseInt(a)+b;
//     
//           System.out.println(c);
//           System.out.println(d);
//
//            
//}
@Test
public void test4(){
    System.out.println(carre(9));
}
    public int carre(int nb) {
        
        int res = nb*nb ;
        
        return res ;
        

    }

@Test
public void TestContatene() {
    String a ="maison" ;
    
    String b = "blanche";
    
    System.out.println(concatene(a,b));


}
public String concatene ( String a , String b){

String c = a + " " + b ;

return c ;

        }


}
