package aspectjAop;

public class TargetObject {
	public String method(String param1, int param2) throws Exception {
		if (param2 > 10)
			throw new Exception();
		else
			return "Call TargetObject.method(String param1,int param2):return" + param1 + " " + param2;
	}
}
