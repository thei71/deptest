package deptest;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class DepTest {
	public static void main(String[] args) {
		System.out.println("I have *lots* of dependencies ...");
		BouncyCastleProvider bc = new BouncyCastleProvider();
		System.out.println(bc.getName() + " v" + bc.getVersionStr());
	}
}
