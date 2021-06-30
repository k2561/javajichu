package com.jb.minidvd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DVDMgr {
	/**
	 * 创建DVD对象
	 */
	DVDSet dvd = new DVDSet();
	/**
	 * 初始三个DVD	 
	 */
    public void initial() {
    	
    	dvd.name[0] = "罗马假日";
    	dvd.state[0] = 0; 
    	dvd.date[0]="2010-7-1";
    	
    	dvd.name[1] = "风声鹤唳";
    	dvd.state[1] = 1;    	
    	dvd.name[2] = "浪漫满屋";
    	dvd.state[2] = 1;
    }	
	
}
