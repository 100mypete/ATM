import java.util.*;
public class ATM {
	private HashMap<String, Double> accounts = new HashMap<String, Double>();
	
	public void deposit (double amount, String id) {
		if (accounts.containsKey(id)) {
			accounts.put(id, (double)accounts.get(id) + amount);
		}
		else {
			accounts.put(id, amount);
		}
	}
	
}
