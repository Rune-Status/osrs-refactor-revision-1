public class Class78 {
	String aString624;
	String aString625;
	static int[] anIntArray626;
	static int anInt627;
	static int anInt629;
	static int anInt628;

	static final void method346(final int var0) {
		if (var0 >= 0) {
			final int var1 = client.anIntArray1931[var0];
			final int var2 = client.anIntArray1932[var0];
			int var3 = client.anIntArray1933[var0];
			final int var4 = client.anIntArray1934[var0];
			if (var3 >= 2000)
				var3 -= 2000;

			Player var5;
			if (var3 == 45) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(146);
					client.secureBuf.writeShort(var4);
				}
			}

			if (var3 == 35) {
				client.secureBuf.putOpcode(76);
				client.secureBuf.writeLEShort(var1);
				client.secureBuf.writeIntV1(var2);
				client.secureBuf.writeLEShort(var4);
				client.anInt1899 = 0;
				Class30.widgetx = Class47.forHash(var2);
				client.anInt1900 = var1;
			}

			Class104_Sub18_Sub16_Sub7_Sub2 var11;
			if (var3 == 8) {
				var11 = client.localNpcs[var4];
				if (null != var11) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var11.stepx[0],
							var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(190);
					client.secureBuf.writeInt(anInt628);
					client.secureBuf.writeShortA(var4);
					client.secureBuf.writeShortA(client.anInt1970);
				}
			}

			if (var3 == 51) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(145);
					client.secureBuf.writeLEShort(var4);
				}
			}

			int var6;
			Widget var12;
			if (var3 == 28) {
				client.secureBuf.putOpcode(155);
				client.secureBuf.writeInt(var2);
				var12 = Class47.forHash(var2);
				if ((null != var12.anIntArrayArray1069) && (var12.anIntArrayArray1069[0][0] == 5)) {
					var6 = var12.anIntArrayArray1069[0][1];
					Class71.anIntArray576[var6] = 1 - Class71.anIntArray576[var6];
					Class46.redrawComponent(var6);
				}
			}

			if (var3 == 1002) {
				client.anInt1895 = Class14.anInt101;
				client.anInt1896 = Class14.anInt102;
				client.anInt1898 = 2;
				client.anInt1897 = 0;
				client.secureBuf.putOpcode(162);
				client.secureBuf.writeShortA((var4 >> 14) & 32767);
			}

			if (var3 == 31) {
				client.secureBuf.putOpcode(70);
				client.secureBuf.writeLEShort(var4);
				client.secureBuf.writeLEShort(Class7.anInt42);
				client.secureBuf.writeShort(Class7.anInt44);
				client.secureBuf.writeInt(var2);
				client.secureBuf.writeLEShort(var1);
				client.secureBuf.writeLEInt(Class14.anInt105);
				client.anInt1899 = 0;
				Class30.widgetx = Class47.forHash(var2);
				client.anInt1900 = var1;
			}

			if (var3 == 1004) {
				client.anInt1895 = Class14.anInt101;
				client.anInt1896 = Class14.anInt102;
				client.anInt1898 = 2;
				client.anInt1897 = 0;
				client.secureBuf.putOpcode(49);
				client.secureBuf.writeLEShort(var4);
			}

			if (var3 == 47) {
				var5 = client.localPlayers[var4];
				if (null != var5) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(78);
					client.secureBuf.writeShort(var4);
				}
			}

			if (var3 == 32) {
				client.secureBuf.putOpcode(218);
				client.secureBuf.writeLEShort(client.anInt1970);
				client.secureBuf.writeShort(var1);
				client.secureBuf.writeShort(var4);
				client.secureBuf.writeIntV1(var2);
				client.secureBuf.writeIntV1(anInt628);
				client.anInt1899 = 0;
				Class30.widgetx = Class47.forHash(var2);
				client.anInt1900 = var1;
			}

			if (var3 == 46) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(102);
					client.secureBuf.writeLEShort(var4);
				}
			}

			boolean var7;
			if (var3 == 20) {
				var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
						Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 0, 0, 0,
						2);
				if (!var7)
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 1,
							1, 0, 2);

				client.anInt1895 = Class14.anInt101;
				client.anInt1896 = Class14.anInt102;
				client.anInt1898 = 2;
				client.anInt1897 = 0;
				client.secureBuf.putOpcode(224);
				client.secureBuf.writeShortA(var4);
				client.secureBuf.writeLEShortA(Class53.anInt436 + var1);
				client.secureBuf.writeShortA(var2 + Class20.anInt206);
			}

			if (var3 == 12) {
				var11 = client.localNpcs[var4];
				if (null != var11) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var11.stepx[0],
							var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(95);
					client.secureBuf.writeLEShort(var4);
				}
			}

			if (var3 == 14) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(226);
					client.secureBuf.writeShortA(Class7.anInt42);
					client.secureBuf.writeLEShort(Class7.anInt44);
					client.secureBuf.writeShortA(var4);
					client.secureBuf.writeIntV1(Class14.anInt105);
				}
			}

			if ((var3 == 2) && Class97.method442(var1, var2, var4)) {
				client.secureBuf.putOpcode(247);
				client.secureBuf.putIntV2(anInt628);
				client.secureBuf.writeShort(var2 + Class20.anInt206);
				client.secureBuf.writeLEShort(client.anInt1970);
				client.secureBuf.writeShortA((var4 >> 14) & 32767);
				client.secureBuf.writeLEShort(var1 + Class53.anInt436);
			}

			if (var3 == 41) {
				client.secureBuf.putOpcode(6);
				client.secureBuf.writeLEShort(var1);
				client.secureBuf.writeLEInt(var2);
				client.secureBuf.writeLEShortA(var4);
				client.anInt1899 = 0;
				Class30.widgetx = Class47.forHash(var2);
				client.anInt1900 = var1;
			}

			if (var3 == 50) {
				var5 = client.localPlayers[var4];
				if (null != var5) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(119);
					client.secureBuf.writeLEShortA(var4);
				}
			}

			if (var3 == 29) {
				client.secureBuf.putOpcode(155);
				client.secureBuf.writeInt(var2);
				var12 = Class47.forHash(var2);
				if ((null != var12.anIntArrayArray1069) && (var12.anIntArrayArray1069[0][0] == 5)) {
					var6 = var12.anIntArrayArray1069[0][1];
					if (var12.anIntArray1076[0] != Class71.anIntArray576[var6]) {
						Class71.anIntArray576[var6] = var12.anIntArray1076[0];
						Class46.redrawComponent(var6);
					}
				}
			}

			if (var3 == 48) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(117);
					client.secureBuf.writeShortA(var4);
				}
			}

			if (var3 == 33) {
				client.secureBuf.putOpcode(135);
				client.secureBuf.writeIntV1(var2);
				client.secureBuf.writeLEShortA(var4);
				client.secureBuf.writeLEShortA(var1);
				client.anInt1899 = 0;
				Class30.widgetx = Class47.forHash(var2);
				client.anInt1900 = var1;
			}

			if ((var3 == 1) && Class97.method442(var1, var2, var4)) {
				client.secureBuf.putOpcode(241);
				client.secureBuf.writeLEInt(Class14.anInt105);
				client.secureBuf.writeShort(Class7.anInt44);
				client.secureBuf.writeShort((var4 >> 14) & 32767);
				client.secureBuf.writeShortA(var1 + Class53.anInt436);
				client.secureBuf.writeLEShort(Class7.anInt42);
				client.secureBuf.writeShortA(var2 + Class20.anInt206);
			}

			if (var3 == 6) {
				Class97.method442(var1, var2, var4);
				client.secureBuf.putOpcode(83);
				client.secureBuf.writeShortA(Class53.anInt436 + var1);
				client.secureBuf.writeLEShortA(var2 + Class20.anInt206);
				client.secureBuf.writeLEShortA((var4 >> 14) & 32767);
			}

			if (var3 == 15) {
				var5 = client.localPlayers[var4];
				if (null != var5) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(183);
					client.secureBuf.writeShortA(client.anInt1970);
					client.secureBuf.writeInt(anInt628);
					client.secureBuf.writeLEShort(var4);
				}
			}

			if (var3 == 18) {
				var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
						Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 0, 0, 0,
						2);
				if (!var7)
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 1,
							1, 0, 2);

				client.anInt1895 = Class14.anInt101;
				client.anInt1896 = Class14.anInt102;
				client.anInt1898 = 2;
				client.anInt1897 = 0;
				client.secureBuf.putOpcode(243);
				client.secureBuf.writeLEShort(var4);
				client.secureBuf.writeShort(var1 + Class53.anInt436);
				client.secureBuf.writeLEShortA(Class20.anInt206 + var2);
			}

			if (var3 == 5) {
				Class97.method442(var1, var2, var4);
				client.secureBuf.putOpcode(133);
				client.secureBuf.writeShortA(Class53.anInt436 + var1);
				client.secureBuf.writeShortA(var2 + Class20.anInt206);
				client.secureBuf.writeLEShortA((var4 >> 14) & 32767);
			}

			if (var3 == 16) {
				var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
						Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 0, 0, 0,
						2);
				if (!var7)
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 1,
							1, 0, 2);

				client.anInt1895 = Class14.anInt101;
				client.anInt1896 = Class14.anInt102;
				client.anInt1898 = 2;
				client.anInt1897 = 0;
				client.secureBuf.putOpcode(235);
				client.secureBuf.writeShort(var2 + Class20.anInt206);
				client.secureBuf.writeShortA(Class7.anInt42);
				client.secureBuf.writeLEShort(var1 + Class53.anInt436);
				client.secureBuf.writeInt(Class14.anInt105);
				client.secureBuf.writeLEShort(var4);
				client.secureBuf.writeLEShort(Class7.anInt44);
			}

			if (var3 == 1001) {
				Class97.method442(var1, var2, var4);
				client.secureBuf.putOpcode(56);
				client.secureBuf.writeShort(Class53.anInt436 + var1);
				client.secureBuf.writeLEShort((var4 >> 14) & 32767);
				client.secureBuf.writeShortA(Class20.anInt206 + var2);
			}

			if (var3 == 26) {
				client.secureBuf.putOpcode(129);

				for (Nodee var15 = (Nodee) client.aClass58_1795
						.method245(); null != var15; var15 = (Nodee) client.aClass58_1795.method243())
					if ((var15.anInt956 == 0) || (var15.anInt956 == 3))
						Class13.method56(var15, true);

				if (null != client.aClass104_Sub12_1951) {
					Class79.setflags(client.aClass104_Sub12_1951);
					client.aClass104_Sub12_1951 = null;
				}
			}

			if (var3 == 37) {
				client.secureBuf.putOpcode(19);
				client.secureBuf.writeShort(var4);
				client.secureBuf.writeInt(var2);
				client.secureBuf.writeShortA(var1);
				client.anInt1899 = 0;
				Class30.widgetx = Class47.forHash(var2);
				client.anInt1900 = var1;
			}

			if ((var3 == 57) || (var3 == 1007))
				Class29.method143(var4, var2, var1, client.aStringArray1936[var0]);

			if (var3 == 44) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(246);
					client.secureBuf.writeShort(var4);
				}
			}

			if (var3 == 22) {
				var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
						Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 0, 0, 0,
						2);
				if (!var7)
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 1,
							1, 0, 2);

				client.anInt1895 = Class14.anInt101;
				client.anInt1896 = Class14.anInt102;
				client.anInt1898 = 2;
				client.anInt1897 = 0;
				client.secureBuf.putOpcode(77);
				client.secureBuf.writeShort(Class53.anInt436 + var1);
				client.secureBuf.writeShortA(var2 + Class20.anInt206);
				client.secureBuf.writeLEShortA(var4);
			}

			if (var3 == 24) {
				var12 = Class47.forHash(var2);
				boolean var13 = true;
				if (var12.anInt982 > 0)
					var13 = Class104_Sub20.method559(var12);

				if (var13) {
					client.secureBuf.putOpcode(155);
					client.secureBuf.writeInt(var2);
				}
			}

			if (var3 == 9) {
				var11 = client.localNpcs[var4];
				if (null != var11) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var11.stepx[0],
							var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(84);
					client.secureBuf.writeLEShortA(var4);
				}
			}

			if (var3 == 49) {
				var5 = client.localPlayers[var4];
				if (var5 != null) {
					Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var5.stepx[0],
							var5.stepy[0], false, 0, 0, 1, 1, 0, 2);
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(111);
					client.secureBuf.writeLEShortA(var4);
				}
			}

			if (var3 == 25) {
				var12 = Class29.method141(var2, var1);
				if (var12 != null) {
					Class26.method132();
					var6 = Class101.method464(Class104_Sub3.method485(var12));
					final Widget var8 = Class29.method141(var2, var1);
					if ((null != var8) && (var8.anObjectArray1056 != null)) {
						final CS var9 = new CS();
						var9.ownerRSFaceHash = var8;
						var9.params = var8.anObjectArray1056;
						Class46.doCS(var9);
					}

					client.aBool1943 = true;
					anInt628 = var2;
					client.anInt1970 = var1;
					Class11.anInt66 = var6;
					Class79.setflags(var8);
					client.anInt1941 = 0;
					String var14;
					if (Class101.method464(Class104_Sub3.method485(var12)) == 0)
						var14 = null;
					else if ((var12.aString1036 != null) && (var12.aString1036.trim().length() != 0))
						var14 = var12.aString1036;
					else
						var14 = null;

					client.aString1914 = var14;
					if (client.aString1914 == null)
						client.aString1914 = "Null";

					if (var12.isHeaderless)
						client.aString1946 = var12.aString990 + Class70.method326(16777215);
					else
						client.aString1946 = Class70.method326('\uff00') + var12.aString1078
								+ Class70.method326(16777215);
				}

			} else {
				if (var3 == 42) {
					client.secureBuf.putOpcode(186);
					client.secureBuf.writeShort(var1);
					client.secureBuf.writeInt(var2);
					client.secureBuf.writeShort(var4);
					client.anInt1899 = 0;
					Class30.widgetx = Class47.forHash(var2);
					client.anInt1900 = var1;
				}

				if (var3 == 10) {
					var11 = client.localNpcs[var4];
					if (var11 != null) {
						Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
								Class81.activePlayer.stepy[0], var11.stepx[0],
								var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
						client.anInt1895 = Class14.anInt101;
						client.anInt1896 = Class14.anInt102;
						client.anInt1898 = 2;
						client.anInt1897 = 0;
						client.secureBuf.putOpcode(13);
						client.secureBuf.writeShortA(var4);
					}
				}

				if (var3 == 34) {
					client.secureBuf.putOpcode(179);
					client.secureBuf.writeLEShortA(var1);
					client.secureBuf.writeShortA(var4);
					client.secureBuf.writeLEInt(var2);
					client.anInt1899 = 0;
					Class30.widgetx = Class47.forHash(var2);
					client.anInt1900 = var1;
				}

				if (var3 == 43) {
					client.secureBuf.putOpcode(40);
					client.secureBuf.writeLEShort(var4);
					client.secureBuf.writeLEInt(var2);
					client.secureBuf.writeShortA(var1);
					client.anInt1899 = 0;
					Class30.widgetx = Class47.forHash(var2);
					client.anInt1900 = var1;
				}

				if (var3 == 1003) {
					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					var11 = client.localNpcs[var4];
					if (null != var11) {
						Class104_Sub18_Sub2 var10 = var11.aClass104_Sub18_Sub2_1788;
						if (null != var10.anIntArray1230)
							var10 = var10.method677();

						if (var10 != null) {
							client.secureBuf.putOpcode(52);
							client.secureBuf.writeShort(var10.anInt1228);
						}
					}
				}

				if (var3 == 13) {
					var11 = client.localNpcs[var4];
					if (null != var11) {
						Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
								Class81.activePlayer.stepy[0], var11.stepx[0],
								var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
						client.anInt1895 = Class14.anInt101;
						client.anInt1896 = Class14.anInt102;
						client.anInt1898 = 2;
						client.anInt1897 = 0;
						client.secureBuf.putOpcode(88);
						client.secureBuf.writeShort(var4);
					}
				}

				if (var3 == 11) {
					var11 = client.localNpcs[var4];
					if (null != var11) {
						Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
								Class81.activePlayer.stepy[0], var11.stepx[0],
								var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
						client.anInt1895 = Class14.anInt101;
						client.anInt1896 = Class14.anInt102;
						client.anInt1898 = 2;
						client.anInt1897 = 0;
						client.secureBuf.putOpcode(67);
						client.secureBuf.writeLEShort(var4);
					}
				}

				if (var3 == 17) {
					var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
							Class81.activePlayer.stepy[0], var1, var2, false, 0, 0, 0,
							0, 0, 2);
					if (!var7)
						Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
								Class81.activePlayer.stepy[0], var1, var2, false, 0, 0,
								1, 1, 0, 2);

					client.anInt1895 = Class14.anInt101;
					client.anInt1896 = Class14.anInt102;
					client.anInt1898 = 2;
					client.anInt1897 = 0;
					client.secureBuf.putOpcode(81);
					client.secureBuf.writeLEShortA(var4);
					client.secureBuf.writeShort(Class20.anInt206 + var2);
					client.secureBuf.putIntV2(anInt628);
					client.secureBuf.writeShortA(var1 + Class53.anInt436);
					client.secureBuf.writeShortA(client.anInt1970);
				}

				if (var3 == 3) {
					Class97.method442(var1, var2, var4);
					client.secureBuf.putOpcode(73);
					client.secureBuf.writeShortA((var4 >> 14) & 32767);
					client.secureBuf.writeShort(Class53.anInt436 + var1);
					client.secureBuf.writeShort(var2 + Class20.anInt206);
				}

				if (var3 == 38) {
					Class26.method132();
					var12 = Class47.forHash(var2);
					client.anInt1941 = 1;
					Class7.anInt44 = var1;
					Class14.anInt105 = var2;
					Class7.anInt42 = var4;
					Class79.setflags(var12);
					client.aString1942 = Class70.method326(16748608) + Class27.forId(var4).aString1444
							+ Class70.method326(16777215);
					if (null == client.aString1942)
						client.aString1942 = "null";

				} else {
					if (var3 == 58) {
						client.secureBuf.putOpcode(251);
						client.secureBuf.writeShortA(client.anInt1970);
						client.secureBuf.writeShortA(var1);
						client.secureBuf.writeInt(anInt628);
						client.secureBuf.writeIntV1(var2);
					}

					if ((var3 == 30) && (client.aClass104_Sub12_1951 == null)) {
						client.secureBuf.putOpcode(242);
						client.secureBuf.writeShortA(var1);
						client.secureBuf.writeInt(var2);
						client.aClass104_Sub12_1951 = Class29.method141(var2, var1);
						Class79.setflags(client.aClass104_Sub12_1951);
					}

					if (var3 == 23)
						Class81.aClass17_643.method95(Class12.myplayerHeight, var1, var2);

					if (var3 == 4) {
						Class97.method442(var1, var2, var4);
						client.secureBuf.putOpcode(90);
						client.secureBuf.writeLEShortA(Class20.anInt206 + var2);
						client.secureBuf.writeLEShortA(Class53.anInt436 + var1);
						client.secureBuf.writeShortA((var4 >> 14) & 32767);
					}

					if (var3 == 36) {
						client.secureBuf.putOpcode(220);
						client.secureBuf.putIntV2(var2);
						client.secureBuf.writeShortA(var1);
						client.secureBuf.writeLEShort(var4);
						client.anInt1899 = 0;
						Class30.widgetx = Class47.forHash(var2);
						client.anInt1900 = var1;
					}

					if (var3 == 19) {
						var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
								Class81.activePlayer.stepy[0], var1, var2, false, 0, 0,
								0, 0, 0, 2);
						if (!var7)
							Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
									Class81.activePlayer.stepy[0], var1, var2, false, 0,
									0, 1, 1, 0, 2);

						client.anInt1895 = Class14.anInt101;
						client.anInt1896 = Class14.anInt102;
						client.anInt1898 = 2;
						client.anInt1897 = 0;
						client.secureBuf.putOpcode(177);
						client.secureBuf.writeShort(Class20.anInt206 + var2);
						client.secureBuf.writeLEShortA(var4);
						client.secureBuf.writeShort(Class53.anInt436 + var1);
					}

					if (var3 == 40) {
						client.secureBuf.putOpcode(202);
						client.secureBuf.writeLEShort(var4);
						client.secureBuf.writeIntV1(var2);
						client.secureBuf.writeLEShort(var1);
						client.anInt1899 = 0;
						Class30.widgetx = Class47.forHash(var2);
						client.anInt1900 = var1;
					}

					if (var3 == 1005) {
						var12 = Class47.forHash(var2);
						if ((null != var12) && (var12.anIntArray1081[var1] >= 100000))
							Class15.chat(0, "",
									var12.anIntArray1081[var1] + " x " + Class27.forId(var4).aString1444);
						else {
							client.secureBuf.putOpcode(49);
							client.secureBuf.writeLEShort(var4);
						}

						client.anInt1899 = 0;
						Class30.widgetx = Class47.forHash(var2);
						client.anInt1900 = var1;
					}

					if (var3 == 7) {
						var11 = client.localNpcs[var4];
						if (null != var11) {
							Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
									Class81.activePlayer.stepy[0],
									var11.stepx[0], var11.stepy[0], false, 0, 0, 1, 1, 0, 2);
							client.anInt1895 = Class14.anInt101;
							client.anInt1896 = Class14.anInt102;
							client.anInt1898 = 2;
							client.anInt1897 = 0;
							client.secureBuf.putOpcode(106);
							client.secureBuf.writeShortA(Class7.anInt44);
							client.secureBuf.writeInt(Class14.anInt105);
							client.secureBuf.writeLEShort(var4);
							client.secureBuf.writeLEShortA(Class7.anInt42);
						}
					}

					if (var3 == 21) {
						var7 = Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
								Class81.activePlayer.stepy[0], var1, var2, false, 0, 0,
								0, 0, 0, 2);
						if (!var7)
							Class104_Sub13.pathfind(Class81.activePlayer.stepx[0],
									Class81.activePlayer.stepy[0], var1, var2, false, 0,
									0, 1, 1, 0, 2);

						client.anInt1895 = Class14.anInt101;
						client.anInt1896 = Class14.anInt102;
						client.anInt1898 = 2;
						client.anInt1897 = 0;
						client.secureBuf.putOpcode(139);
						client.secureBuf.writeLEShort(var2 + Class20.anInt206);
						client.secureBuf.writeLEShort(var1 + Class53.anInt436);
						client.secureBuf.writeLEShortA(var4);
					}

					if (var3 == 39) {
						client.secureBuf.putOpcode(21);
						client.secureBuf.writeShort(var1);
						client.secureBuf.writeIntV1(var2);
						client.secureBuf.writeLEShort(var4);
						client.anInt1899 = 0;
						Class30.widgetx = Class47.forHash(var2);
						client.anInt1900 = var1;
					}

					if (client.anInt1941 != 0) {
						client.anInt1941 = 0;
						Class79.setflags(Class47.forHash(Class14.anInt105));
					}

					if (client.aBool1943)
						Class26.method132();

					if ((Class30.widgetx != null) && (client.anInt1899 == 0))
						Class79.setflags(Class30.widgetx);

				}
			}
		}
	}

	public static Class classForPrefix(final String p) throws ClassNotFoundException {
		return p.equals("B") ? Byte.TYPE
				: (p.equals("I") ? Integer.TYPE
						: (p.equals("S") ? Short.TYPE
								: (p.equals("J") ? Long.TYPE
										: (p.equals("Z") ? Boolean.TYPE
												: (p.equals("F") ? Float.TYPE
														: (p.equals("D") ? Double.TYPE
																: (p.equals("C") ? Character.TYPE
																		: Class.forName(p))))))));
	}
}
