package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;

public class CmdRacesBeElf extends CmdRacesBe 
{
	public CmdRacesBeElf()
	{
		this.addAliases("elf");
		this.setDesc("become an elf");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_ELF.node));		
	}

}
