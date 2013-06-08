package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;
import net.immortalcraft.races.RPlayer;
import net.immortalcraft.races.Race;
import net.immortalcraft.races.cmd.arg.ARUPlayer;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;

public class CmdRacesBeHuman extends CmdRacesBe 
{
	public CmdRacesBeHuman()
	{
		this.addAliases("human");
		this.setDesc("become a human");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_HUMAN.node));
		this.addRequirements(ReqIsPlayer.get());
	}
	
	public void perform()
	{
	RPlayer you = this.arg(0, ARUPlayer.getStartAny(sender));
	if (you == null) return;
	
		// Player is already race
	if (RPlayer.getRace() == Race.Human)
	{
		msg("<b>You already are a Human.");
		return;
	}

	else
		
		//Turn from Demon to Human
	if (RPlayer.getRace() == Race.Demon)
	{
		you.setDemon(false);
		you.setHuman(true);
		msg("<i>You are now a Human!");
		return;
	}
	
	else
		
		// Turn from Elf to Human
	if ( RPlayer.getRace() == Race.Elf)
	{
		you.setElf(false);
		you.setHuman(true);
		msg("<i>You are now a Human!");
		return;
	}
	
	else
		
		// Turn from Orc to Human
	if ( RPlayer.getRace() == Race.Orc)
	{
		you.setOrc(false);
		you.setHuman(true);
		msg("<i>You are now a Human!");
		return;
	}
  }
}