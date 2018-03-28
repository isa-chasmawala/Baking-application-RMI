import java.rmi.Naming;
class BankServer
{
	public static void main(String args[])
	{
		try{         BankIntf bi = (BankIntf) new BankImpl();
			Naming.rebind("rmi://localhost:1099//BankImpl",bi); }
		catch(Exception e)
		{ e.printStackTrace(); } } }
