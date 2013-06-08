package net.immortalcraft.races;

import com.massivecraft.mcore.Aspect;
import com.massivecraft.mcore.store.Colls;

public class RPlayerColls extends Colls<RPlayerColl, RPlayer>
{
	public static RPlayerColls i = new RPlayerColls();
	public static RPlayerColls get() { return i; }

	@Override
	public RPlayerColl createColl(String collName)
	{
		return new RPlayerColl(collName);
	}

	@Override
	public Aspect getAspect()
	{
		return Races.r.playerAspect;
	}

	@Override
	public String getBasename()
	{
		return Const.playerBasename;
	}
}