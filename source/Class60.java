import java.math.BigInteger;

public class Class60 {
	static int anInt478;
	static BigInteger ex = RSBuf.RSAON ? new BigInteger("65537") : new BigInteger("10001", 16);
	static BigInteger mod = RSBuf.RSAON ? 
			 new BigInteger("100150409785540241173273901311044449952069320905724483233031164232153239978028691758036621407003158568511310873066620615616044813284973691793805750952682395813669248460153423799527428706644398039989173980693314570259325738173347058405505358466744806916937175531245440231087366918327779628364154839732961631201")
			: new BigInteger(
			"b1baf55371c5d161de2889cc95420031f4afee4f000112192b9d82fc87ab5acd6a8595bf71dac89d386879c119b8cdd98c7a62efc2b37b070b640eb06ef4726f",
			16);

	static final void method256(final String var0, final String var1, final int var2, final int var3, final int var4,
			final int var5) {
		if (!client.aBool1930)
			if (client.anInt1805 < 500) {
				client.aStringArray1863[client.anInt1805] = var0;
				client.aStringArray1936[client.anInt1805] = var1;
				client.anIntArray1933[client.anInt1805] = var2;
				client.anIntArray1934[client.anInt1805] = var3;
				client.anIntArray1931[client.anInt1805] = var4;
				client.anIntArray1932[client.anInt1805] = var5;
				++client.anInt1805;
			}
	}
}
