/*
 * Copyright (C) 2020 cstuser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sandbox;

/**
 *
 * @author Geon Kim
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello my sandbox in NetBeans!!!!");
        System.out.println("My first change to be saved to git.");

        int a = 5;
        int b = 5;
        
        System.out.println();
        System.out.println("Equality with: a!=b " + (a!=b));
        System.out.println("Equality with: !(a==b) " + !(a==b));
        
        System.out.println();
        System.out.println("Relational: a<b " + (a<b));
        System.out.println("Relational: a<=b " + (a<=b));
        System.out.println("Relational: a>b " + (a>b));
        System.out.println("Relational: a>=b " + (a>=b));

        System.out.println();
        System.out.println("Logical: !(a<=b) " + !(a<=b));
        System.out.println("Logical: T && T " + ((a==b) && true));
        System.out.println("Logical: T && F " + (true && false));
        System.out.println("Logical: F && T " + ((a!=b) && true));
        System.out.println("Logical: T || T " + (true  || true));
        System.out.println("Logical: T || F " + (true  || false));
        System.out.println("Logical: F || F " + (false  || false));
        // Forming Condition
        
        System.out.println();
        a = 2;
        
        if (a<b){
            System.out.println("a is less than b");
            if (a==2)
            System.out.println("a is equal 2");
            System.out.println("a is equal 2");
        } else if (a<0) {
            System.out.println("a is less than zero");
        } else {
            System.out.println("a is NOT less than b nor than zero");
        }
        System.out.println("Outside the if");
        // if and else
        
        System.out.println();
        
        System.out.println("Conditional operator");
        String result;
        
        result = (a==b)?"Yes, of course it is TRUE":"FALSE";
        
        /*if (a==b) {
            result = "Yes, of course it is TRUE";
        } else {
            result = "FALSE";
        }
        */
        System.out.println("Is a equal b? " + (a==b));
        System.out.println("Is a equal b? " + result);
        // Conditional operator (?:)
    }
}
    



