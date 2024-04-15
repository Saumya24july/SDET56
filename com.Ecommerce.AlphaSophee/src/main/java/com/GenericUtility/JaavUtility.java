package com.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JaavUtility {

	public int getRandomNo(int num)
	{
		Random ran = new Random();
		int random = ran.nextInt(num);
		return random;
		
	}
	public  String getySystemDate()
	{
		Date dt = new Date();
		String date = dt.toString();
		return date;
	}
	public String getSystemDateInFormat()
	{
		SimpleDateFormat dateForamt = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		String sysDateInFormat = dateForamt.format(dt);
		return sysDateInFormat;
	}
}
