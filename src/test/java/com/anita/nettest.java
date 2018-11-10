package com.anita;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import junit.framework.Testcase;

public class nettest extends Testcase
{
	
     Calculator cal=new Calculator();

     public nettest(String name) {
	     super(name);
     }
	     public void testSum() {
		     assertEquals(2,cal.sum(1,1));
	     }
     }

    
