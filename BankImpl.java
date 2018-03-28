import java.io.*;
import java.rmi.*;
public class BankImpl extends java.rmi.server.UnicastRemoteObject implements BankIntf
{
	public BankImpl() throws RemoteException
	{super();}
	
	int a[][] = {{123,1500},{124,2000},{125,2500}};//this is acc_number, balance pair 2-D array.
	//hashmaps can also be used in place of 2D array.
	int i;
	public void deposit(int ac_no,int amount)
	{
		for(i=0;i<3;i++)
		{
			if(a[i][0] == ac_no) {a[i][1] = a[i][1] + amount;} } }
	public void withdraw(int ac_no,int amount)
	{
		for(i=0;i<3;i++)
		{ if(a[i][0] == ac_no && a[i][1]>=amount) { a[i][1] = a[i][1] - amount; } } }
	int tmp;
	public int view_bal(int ac_no)
	{
		for(i=0;i<3;i++)
		{ if(a[i][0] == ac_no)
				tmp = a[i][1]; }
	return tmp;
	} 
}
