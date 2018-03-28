import java.rmi.*;
public interface BankIntf extends Remote
{
	public void deposit(int ac_no, int amount) throws java.rmi.RemoteException;
	public void withdraw(int ac_no, int amount) throws java.rmi.RemoteException;
	public int view_bal(int ac_no) throws java.rmi.RemoteException;
}
