package com.atheesh.rmi;

import java.rmi.RemoteException;

public class Raschetmpl implements Raschet {
    @Override
    public String rasch(int a, int b, int c) throws RemoteException {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            return "Ответ: x1 = " + (-b+Math.sqrt(d))/(2*a) + " x2 = " + (-b-Math.sqrt(d))/(2*a);
        } else if (d == 0) {
            return  "Ответ: x = " +  -b/(2*a);
        } else {
            return "Нет корней";
        }
    }
}
