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
        tAHUNTERBIT = input.nextInt();
        pENERBIT = input.nextLine();
        fORMAT = input.nextLine();
        hARGA = input.nextDouble();
        mINIMUMMARGIN = input.nextDouble();
        sTOK = input.nextInt();
        rATING = input.nextDouble();
        if (rATING >= 4.7) {
            kETERANGAN = "BestPick";
        } else {
            if (rATING >= 4.5) {
                kETERANGAN = "MustRead";
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
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMAT + "|" + hARGA + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING + "|" + kETERANGAN);
    }
}
