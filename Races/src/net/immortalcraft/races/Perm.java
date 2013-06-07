package net.immortalcraft.races;

import org.bukkit.command.CommandSender;

import com.massivecraft.mcore.util.PermUtil;

public enum Perm 
{
	BE(".be"),
	BE_DEMON(".be.demon"),
    BE_ELF(".be.elf"),
    BE_HUMAN(".be.human"),
    BE_ORC(".be.orc"),
    INFO(".info"),
    VERSION(".version"),
	;

	public final String node;

	Perm(final String permissionNode)
	{
		this.node = "races."+permissionNode;
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


