package net.immortalcraft.races;

import com.massivecraft.mcore.store.MStore;
import com.massivecraft.mcore.store.SenderColl;

	public class RPlayerColl extends SenderColl<RPlayer>
	{
		// -------------------------------------------- //
		// CONSTRUCT
		// -------------------------------------------- //

		public RPlayerColl(String name)
		{
			super(name, RPlayer.class, MStore.getDb(ConfServer.dburi), Races.r);
		}

		// -------------------------------------------- //
		// EXTRAS
		// -------------------------------------------- //

		@Override
		public boolean isDefault(RPlayer rplayer)
		{
			if (RPlayer.getRace() != null) return false;
			return true;
		}
}
