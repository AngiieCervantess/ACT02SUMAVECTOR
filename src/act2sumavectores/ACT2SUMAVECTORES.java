/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2sumavectores;

/**
 *
 * @author Familia Andrade
 */
public class ACT2SUMAVECTORES {

   public static int suma (int vec[], int n)
   {
            if (n==0){
                return vec[n]; }
            
                    else
        {
                        return suma (vec, n - 1) + vec [n];
        }
    } 

    static class suma {

        public suma() {
        }
    }
}


   
    