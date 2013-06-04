package net.immortalcraft.races;

import com.massivecraft.mcore.SimpleConfig;

public class Lang extends SimpleConfig
{	
	public static String consolePlayerArgRequired = "<b>You must specify player from console.";

	public static String xIsY = "<k>%s: <v>%s";
	public static String on = "<lime>ON  ";
	public static String off = "<rose>OFF";
	public static String boolIsY(String boolName, boolean val) { return String.format(xIsY, boolName, val ? on : off); }
	public static String quotaIsPercent(String quotaName, double val) { return String.format(xIsY, quotaName, percent(val)); }
	public static String percent(double quota) { return String.format("%.1f%%", quota*100); }

	public static String demonTrue = "<b><strong>You are now a Demon!";
	public static String elfTrue = "<b><strong>You are now an Elf!";
	public static String humanTrue = "<b><strong>You are now a Human!";
	public static String orcTrue = "<b><strong>You are now an Orc!";

	public static String foodCantEat = "<b>Demons can't eat %s.";

	// -------------------------------------------- //
	// Persistence
	// -------------------------------------------- //
	public static transient Lang i = new Lang();
	public Lang() { super(Races.r, "lang"); }
}

