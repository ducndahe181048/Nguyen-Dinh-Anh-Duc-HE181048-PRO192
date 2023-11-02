/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyString implements IString{
    @Override
    public int f1(String str) {
        boolean check = isPalindrome(str);
        if(str.length()<2) return -1;
        if(check == false) return str.length();
        else return -1;
    }

    @Override
    public String f2(String str) {
        return null;
    }
    
    public static boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
}
