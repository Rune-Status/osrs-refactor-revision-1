import java.io.File;

public class Class24 {
	public static int idxCount;
	public static File rootdirectory;
	static File settings;
	static int[] anIntArray244;
	static FSManager aClass96_241 = null;
	public static FSManager maindata = null;
	public static FSManager idx255 = null;

	public static boolean method125() {
		try {
			if (Class29.anInt272 == 2) {
				if (null == Class29.aClass104_Sub14_268) {
					Class29.aClass104_Sub14_268 = Class104_Sub14.method547(Class29.aClass61_273, Class1.anInt1,
							Class29.anInt276);
					if (null == Class29.aClass104_Sub14_268)
						return false;
				}

				if (null == Class102_Sub1.aClass53_896)
					Class102_Sub1.aClass53_896 = new Class53(Class29.aClass61_270, Class29.aClass61_269);

				if (Class29.aClass104_Sub8_Sub1_271.method635(Class29.aClass104_Sub14_268, Class29.aClass61_274,
						Class102_Sub1.aClass53_896, 22050)) {
					Class29.aClass104_Sub8_Sub1_271.method652();
					Class29.aClass104_Sub8_Sub1_271.method642(Class29.anInt275);
					Class29.aClass104_Sub8_Sub1_271.method636(Class29.aClass104_Sub14_268, Class104_Sub2.aBool859);
					Class29.anInt272 = 0;
					Class29.aClass104_Sub14_268 = null;
					Class102_Sub1.aClass53_896 = null;
					Class29.aClass61_273 = null;
					return true;
				}
			}
		} catch (final Exception var1) {
			var1.printStackTrace();
			Class29.aClass104_Sub8_Sub1_271.method665();
			Class29.anInt272 = 0;
			Class29.aClass104_Sub14_268 = null;
			Class102_Sub1.aClass53_896 = null;
			Class29.aClass61_273 = null;
		}

		return false;
	}

	public static void method126(final Class61 var0, final Class61 var1, final Class61 var2, final Class61 var3) {
		Widget.requester = var0;
		Widget.aClass61_971 = var1;
		Class1_Sub1.aClass61_837 = var2;
		Widget.aClass61_995 = var3;
		Class22.widgets = new Widget[Widget.requester.method267()][];
		Class103.loaded = new boolean[Widget.requester.method267()];
	}

	static String method127(final Widget var0, final int var1) {
		final int var2 = Class104_Sub3.method485(var0);
		final boolean var3 = ((var2 >> (1 + var1)) & 1) != 0;
		return !var3 && (null == var0.anObjectArray1042) ? null
				: ((null != var0.aStringArray1039) && (var0.aStringArray1039.length > var1)
						&& (null != var0.aStringArray1039[var1]) && (var0.aStringArray1039[var1].trim().length() != 0)
								? var0.aStringArray1039[var1] : null);
	}
}
