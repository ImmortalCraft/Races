package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;

public class CmdRacesInfo extends RCommand 
{
	public CmdRacesInfo()
	{
		this.addAliases("i", "info");
		this.addRequiredArg("race");
		this.setDesc("Show race info");
		
		this.addRequirements(ReqHasPerm.get(Perm.INFO.node));	
	}

	@Override
	public void perform() 
	{
		
		
	}

}
