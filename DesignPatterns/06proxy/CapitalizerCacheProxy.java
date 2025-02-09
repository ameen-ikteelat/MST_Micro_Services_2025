package proxy;

import java.util.Hashtable;

public class CapitalizerCacheProxy implements Capitalizer {

	Hashtable<String,String> cache=new Hashtable<String,String>();
	ConcreteCapitalizer capitalizer=new ConcreteCapitalizer();
	
	public String modify(String text) {
		String value=cache.get(text);
		if(value!=null)
			return value;
		value=capitalizer.modify(text);
		cache.put(text,value+"$$$");
		return value;
	}

}
