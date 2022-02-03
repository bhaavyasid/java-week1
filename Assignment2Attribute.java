package week5.day1;

import org.testng.annotations.Test;

public class Assignment2Attribute {

	@Test(priority=0)
	public void createLead()
	{
System.out.println("createlead");
 }

	@Test(priority=3)
	public void deleteLead()
	{
System.out.println("deletelead");
 }

	@Test(priority=2)
	public void duplicateLead()
	{
System.out.println("duplicatelead");
 }

	@Test(enabled=false)
	public void editLead()
	{
System.out.println("editlead");
	}
@Test(groups = {"functest", "checkintest"} )
public void mergeLead()
{
System.out.println("mergelead");
 }
}

