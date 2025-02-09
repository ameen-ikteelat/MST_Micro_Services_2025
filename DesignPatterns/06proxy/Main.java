package proxy;

public class Main {

	public static void main(String[] args) {
		Capitalizer cap=new CapitalizerCacheProxy();
		System.out.print(cap.modify("This")+" ");
		System.out.print(cap.modify("is")+" ");
		System.out.print(cap.modify("an")+" ");
		System.out.print(cap.modify("example")+" ");
		System.out.print(cap.modify("of")+" ");
		System.out.print(cap.modify("cache")+" ");
		System.out.print(cap.modify("proxy")+" ");
		System.out.println(cap.modify("dp."));
		
		System.out.println("What patterns ??");
		
		System.out.print(cap.modify("cache")+" ");
		System.out.print(cap.modify("proxy")+" ");
		System.out.print(cap.modify("dp."));
	}

}
