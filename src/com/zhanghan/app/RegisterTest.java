package com.zhanghan.app;

import java.util.Iterator;

import ca.beq.util.win32.registry.RegistryKey;
import ca.beq.util.win32.registry.RegistryValue;
import ca.beq.util.win32.registry.RootKey;
import ca.beq.util.win32.registry.ValueType;

public class RegisterTest {

		public static void main(String a[]){
//			// create a new key, "Test", under HKLM
//			RegistryKey r = new RegistryKey(RootKey.HKEY_LOCAL_MACHINE, "Test");
//			if(!r.exists()) {
//			r.create();
//			} // if 
//
//			// create value entries
//			RegistryValue v = new RegistryValue("aString", ValueType.REG_SZ, "test");
//			r.setValue(v);
//
//			v.setName("aDword");
//			v.setType(ValueType.REG_DWORD);
//			v.setData(new Integer(0x1001001));
//			r.setValue(v);
//
//			// read value entries
//			Iterator i = r.values();
//			while(i.hasNext()) {
//			v = (RegistryValue)i.next();
//			System.out.println(v.toString());
//			} // while
//
//			// delete registry key
//			r.delete();
//			
			
			RegistryKey r = new RegistryKey(RootKey.HKEY_LOCAL_MACHINE,  "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run");   
			//r.create();  
			RegistryValue v = new RegistryValue("aString", ValueType.REG_SZ, "test");
			r.setValue(v);
			
			
			
			
		}
	
}
