package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;

public class CmdRacesBeOrc extends CmdRacesBe
{
	public CmdRacesBeOrc()
	{
		this.addAliases("orc");
		this.setDesc("become an orc");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_ORC.node));		
	}

}
