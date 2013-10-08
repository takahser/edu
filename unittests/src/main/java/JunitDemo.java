 
public class JunitDemo implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if(s.length()==0)
		{
			return true;
		}
		return false;
	}

	@Override
	public String capitalize(String s) {
		if(isEmpty(s))
		{
			return null;
		} else {
			return ((Character)(s.charAt(0))).toString().toUpperCase() + s.substring(1).toLowerCase();
		}
	}

	@Override
	public String reverse(String s) throws NullPointerException {
//		StringBuilder sb = new StringBuilder(s);
//		s = sb.reverse().toString();
//		return s;
		return new StringBuilder(s).reverse().toString();
	}

	@Override
	// String... --> Data Type ("String Array")
	// strings   --> Variable Name
	public String join(String... strings) {
		
		String output = "";
		for(String s:strings) {
			output += s + " ";		// alternative: output += s += " "; (parsed from right to left)
		}
		return output;
	}

}
