package com.mikebrunetteinttoroman.service;

import org.springframework.stereotype.Service;


@Service
public class ConvertService {
    public String intToRoman(int rmn)
    {
        String ans = "";
        int cpyR = rmn, tmp = 0, mult =10;

        //1 <= rmn <= 3999
        if(rmn == 1)
            return "I";

        // i *= 10 iterates for loop.
        for(int i = 1; i <= rmn; i *= 10)
        {
            tmp = cpyR % mult;
            cpyR = cpyR / mult;
            cpyR = cpyR * mult;
            mult *= 10;
            ans = romans(tmp) + ans;
        }
        return ans;
    }

    public static String romans(int x)
    {

        String str = "";

        while(x > 0)
        {

            if(x >= 1000)
            {
                str += "M";
                x -= 1000;
            }
            else if(x < 1000 && x >= 900)
            {
                str += "CM";
                x -= 900;
            }
            else if(x < 900 && x >= 500)
            {
                str += "D";
                x -= 500;
            }
            else if(x < 500 && x >= 400)
            {
                str += "CD";
                x -= 400;
            }
            else if(x < 400 && x >= 100)
            {
                str += "C";
                x -= 100;
            }
            else if(x < 100 && x >= 90)
            {
                str += "XC";
                x -= 90;
            }
            else if(x < 90 && x >= 50)
            {
                str += "L";
                x -= 50;
            }
            else if(x < 50 && x >= 40)
            {
                str += "XL";
                x -= 40;
            }
            else if(x < 40 && x >= 10)
            {
                str += "X";
                x -= 10;
            }
            else if(x < 10 && x >= 9)
            {
                str += "IX";
                x -= 9;
            }
            else if(x < 9 && x >= 5)
            {
                str += "V";
                x -= 5;
            }
            else if(x < 5 && x >= 4)
            {
                str += "IV";
                x -= 4;
            }
            else //(x < 4 && x >=1)
            {
                str += "I";
                x -= 1;
            }

        }
        return str;

    }
}
//basic function for the conversion from integer to a roman numeral