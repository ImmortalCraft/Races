package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;

public class CmdRacesBeDemon extends CmdRacesBe 
{
	public CmdRacesBeDemon()
	{
		this.addAliases("demon");
		this.setDesc("become a demon");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_DEMON.node));	
	}
}
