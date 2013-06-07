package net.immortalcraft.races.cmd;

import com.massivecraft.mcore.cmd.MCommand;
import net.immortalcraft.races.RPlayer;

public abstract class RCommand extends MCommand
	{
		public RPlayer rme;

		@Override
		public void fixSenderVars()
	{
			this.rme = RPlayer.get(this.sender);
	}
}

