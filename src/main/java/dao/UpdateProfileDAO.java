package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.CustomerBean;
import dp.DBConnection;

public class UpdateProfileDAO 
{
   public int k=0;
   public int update(CustomerBean cb)
   {
	   try
	   {
		   Connection con=DBConnection.getCon();
		   PreparedStatement ps=con.prepareStatement("Update Customer set pword=?,fname=?,lname=?,phno=?,addr=? where cid=?");
		   ps.setString(1,cb.getpWord());
		   ps.setString(2,cb.getfName());
		   ps.setString(3,cb.getlName());
		   ps.setLong(4,cb.getPhNo());
		   ps.setString(5,cb.getAddr());
		   ps.setString(6,cb.getCid());
		   
		   k=ps.executeUpdate();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	return k;
   }
}
