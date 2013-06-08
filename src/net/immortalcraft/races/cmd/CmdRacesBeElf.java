package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;
import net.immortalcraft.races.RPlayer;
import net.immortalcraft.races.Race;
import net.immortalcraft.races.cmd.arg.ARUPlayer;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;

public class CmdRacesBeElf extends CmdRacesBe 
{
	public CmdRacesBeElf()
	{
		this.addAliases("elf");
		this.setDesc("become an elf");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_ELF.node));
		this.addRequirements(ReqIsPlayer.get());
	}
	
	public void perform()
	{
	RPlayer you = this.arg(0, ARUPlayer.getStartAny(sender));
	if (you == null) return;
	
		// Player is already race
	if (RPlayer.getRace() == Race.Elf)
	{
		msg("<b>You already are an Elf.");
		return;
	}
	
	else

		//Turn from Demon to Elf
	if (RPlayer.getRace() == Race.Demon)
	{
		you.setDemon(false);
		you.setElf(true);
		msg("<i>You are now an Elf!");
		return;
	}
	
	else
		
		// Turn from Human to Elf
	if ( RPlayer.getRace() == Race.Human)
	{
		you.setHuman(false);
		you.setElf(true);
		msg("<i>You are now an Elf!");
		return;
	}
	
	else
		
		// Turn from Orc to Elf
	if ( RPlayer.getRace() == Race.Orc)
	{
		you.setOrc(false);
		you.setElf(true);
		msg("<i>You are now an Elf!");
		return;
	}
  }
}