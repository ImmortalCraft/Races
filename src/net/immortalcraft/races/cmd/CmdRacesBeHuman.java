package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;

public class CmdRacesBeHuman extends CmdRacesBe 
{
	public CmdRacesBeHuman()
	{
		this.addAliases("human");
		this.setDesc("become a human");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_HUMAN.node));		
	}

}
