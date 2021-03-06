package net.immortalcraft.races;

import java.util.List;

import com.massivecraft.mcore.SimpleConfig;
import com.massivecraft.mcore.util.MUtil;

public class ConfServer extends SimpleConfig
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //

	public static String dburi = "default";
	public static int taskInterval = 10; // Defines how often the task runs.
	public static List<String> baseCommandAliases = MUtil.list("races");

	// -------------------------------------------- //
	// PERSISTENCE
	// -------------------------------------------- //

	public static transient ConfServer i = new ConfServer();
	public static ConfServer get() { return i; }
	public ConfServer() { super(Races.r); }
}

