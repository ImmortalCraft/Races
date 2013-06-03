package net.immortalcraft.races.cmd;

public abstract class CmdRacesBeAbstract extends RCommand 
{
	public CmdRacesBeAbstract()
	{
		this.addAliases("b", "be");
		this.addRequiredArg("race");
		this.setDesc("turn into a different race");
		
	}

	@Override
	public void perform() 
	{
		
		
	}
}
