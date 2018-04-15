package com.programinjava.learn.ReadPropertyFileDemo;

/**
 * Read property file demo
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       Now I will read the property value of property-key
    	String valueOfKey = PropertyUtil.readProperty("property-key");
    	System.out.println(valueOfKey);
    }
}
