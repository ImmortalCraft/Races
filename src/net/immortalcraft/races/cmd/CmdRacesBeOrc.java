package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;
import net.immortalcraft.races.RPlayer;
import net.immortalcraft.races.Race;
import net.immortalcraft.races.cmd.arg.ARUPlayer;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;

public class CmdRacesBeOrc extends CmdRacesBe
{
	public CmdRacesBeOrc()
	{
		this.addAliases("orc");
		this.setDesc("become an orc");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_ORC.node));
		this.addRequirements(ReqIsPlayer.get());
	}
	
	public void perform()
	{
	RPlayer you = this.arg(0, ARUPlayer.getStartAny(sender));
	if (you == null) return;
	
		// Player is already race
	if (RPlayer.getRace() == Race.Orc)
	{
		msg("<b>You already are an Orc.");
		return;
	}

	else
		
		//Turn from Demon to Orc
	if (RPlayer.getRace() == Race.Demon)
	{
		you.setDemon(false);
		you.setOrc(true);
		msg("<i>You are now an Orc!");
		return;
	}
	
	else
		
		// Turn from Elf to Orc
	if ( RPlayer.getRace() == Race.Elf)
	{
		you.setElf(false);
		you.setOrc(true);
		msg("<i>You are now an Orc!");
		return;
	}
	
	else
		
		// Turn from Human to Orc
	if ( RPlayer.getRace() == Race.Human)
	{
		you.setHuman(false);
		you.setOrc(true);
		msg("<i>You are now an Orc!");
		return;
	}
  }
}
