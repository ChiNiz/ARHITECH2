package com.atheesh.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Raschet extends Remote {
    String rasch(int a, int b, int c) throws RemoteException;
}
