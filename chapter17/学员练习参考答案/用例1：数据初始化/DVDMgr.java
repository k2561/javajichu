package com.jb.minidvd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DVDMgr {
	/**
	 * ����DVD����
	 */
	DVDSet dvd = new DVDSet();
	/**
	 * ��ʼ����DVD	 
	 */
    public void initial() {
    	
    	dvd.name[0] = "�������";
    	dvd.state[0] = 0; 
    	dvd.date[0]="2010-7-1";
    	
    	dvd.name[1] = "�������";
    	dvd.state[1] = 1;    	
    	dvd.name[2] = "��������";
    	dvd.state[2] = 1;
    }	
	
}
