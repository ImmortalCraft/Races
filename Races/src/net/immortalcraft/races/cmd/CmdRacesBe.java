package net.immortalcraft.races.cmd;

import net.immortalcraft.races.Perm;

import com.massivecraft.mcore.cmd.HelpCommand;
import com.massivecraft.mcore.cmd.req.ReqHasPerm;

public class CmdRacesBe extends RCommand
{
	public CmdRacesBeDemon cmdRacesBeDemon = new CmdRacesBeDemon();
	public CmdRacesBeElf cmdRacesBeElf = new CmdRacesBeElf();
	public CmdRacesBeHuman cmdRacesBeHuman = new CmdRacesBeHuman();
	public CmdRacesBeOrc cmdRacesBeOrc = new CmdRacesBeOrc();

	public CmdRacesBe()
	{
		super();
		
		this.addSubCommand(this.cmdRacesBeDemon);
		this.addSubCommand(this.cmdRacesBeElf);
		this.addSubCommand(this.cmdRacesBeHuman);
		this.addSubCommand(this.cmdRacesBeOrc);

		this.addRequirements(ReqHasPerm.get(Perm.BE.node));
	}

	@Override
	public void perform()
	{
		this.getCommandChain().add(this);
		HelpCommand.getInstance().execute(this.sender, this.args, this.commandChain);
	}
}
