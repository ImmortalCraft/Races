package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;
import net.immortalcraft.races.RPlayer;
import net.immortalcraft.races.Race;
import net.immortalcraft.races.cmd.arg.ARUPlayer;

import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.cmd.req.ReqIsPlayer;

public class CmdRacesBeDemon extends CmdRacesBe 
{
	public CmdRacesBeDemon()
	{
		
		this.addAliases("demon");
		this.setDesc("become a demon");
		
		this.addRequirements(ReqHasPerm.get(Perm.BE_DEMON.node));
		this.addRequirements(ReqIsPlayer.get());
	}
	
	public void perform()
	{
	RPlayer you = this.arg(0, ARUPlayer.getStartAny(sender));
	if (you == null) return;
	
		// Player is already race
	if (RPlayer.getRace() == Race.Demon)
	{
		msg("<b>You already are a Demon.");
		return;
	}
	
	else

		//Turn from Elf to Demon
	if (RPlayer.getRace() == Race.Elf)
	{
		you.setElf(false);
		you.setDemon(true);
		msg("<i>You are now a Demon!");
		return;
	}
	
	else
		
		// Turn from Human to Demon
	if ( RPlayer.getRace() == Race.Human)
	{
		you.setHuman(false);
		you.setDemon(true);
		msg("<i>You are now a Demon!");
		return;
	}
	
	else
		
		// Turn from Orc to Demon
	if ( RPlayer.getRace() == Race.Orc)
	{
		you.setOrc(false);
		you.setDemon(true);
		msg("<i>You are now a Demon!");
		return;
	}
  }
}