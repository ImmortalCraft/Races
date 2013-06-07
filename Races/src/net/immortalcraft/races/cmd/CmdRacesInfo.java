package net.immortalcraft.races.cmd;

public class CmdRacesInfo extends RCommand 
{
	public CmdRacesInfo()
	{
		this.addAliases("i", "info");
		this.addRequiredArg("race");
		this.setDesc("Show race info");
	}

	@Override
	public void perform() 
	{
		
		
	}

}
