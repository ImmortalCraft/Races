package net.immortalcraft.races;

import org.bukkit.command.CommandSender;

import com.massivecraft.mcore.util.PermUtil;

public enum RPerm 
{
   VERSION(".version"),
	;

	public final String node;

	RPerm(final String permissionNode)
	{
		this.node = "race."+permissionNode;
    }

	public boolean has(CommandSender sender, boolean informSenderIfNot)
	{
		return PermUtil.has(sender, this.node, informSenderIfNot);
	}

	public boolean has(CommandSender sender)
	{
		return has(sender, false);
	}
}


