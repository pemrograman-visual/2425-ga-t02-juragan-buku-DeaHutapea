// 12S24053 - Dea Anggreany Hutapea
// 12S24046 - Indah Elsadai Nainggolan

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, fORMAT, kETERANGAN;
        int tAHUNTERBIT, sTOK;
        double hARGA, mINIMUMMARGIN, rATING;

        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tAHUNTERBIT = Integer.parseInt(input.nextLine());
        pENERBIT = input.nextLine();
        fORMAT = input.nextLine();
        hARGA = Double.parseDouble(input.nextLine());
        mINIMUMMARGIN = Double.parseDouble(input.nextLine());
        sTOK = Integer.parseInt(input.nextLine());
        rATING = Double.parseDouble(input.nextLine());
        if (rATING >= 4.7) {
            kETERANGAN = "Best Pick";
        } else {
            if (rATING >= 4.5) {
                kETERANGAN = "Must Read";
            } else {
                if (rATING >= 4.0) {
                    kETERANGAN = "Recommended";
                } else {
                    if (rATING >= 3.0) {
                        kETERANGAN = "Average";
                    } else {
                        kETERANGAN = "Low";
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMAT + "|" + toFixed(hARGA,2) + "|" + toFixed(mINIMUMMARGIN,2) + "|" + sTOK + "|" + toFixed(rATING,1) + "|" + kETERANGAN);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
