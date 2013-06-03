package net.immortalcraft.races;

import com.massivecraft.mcore.store.SenderEntity;


	public class RPlayer extends SenderEntity<RPlayer>
	{
		// -------------------------------------------- //
		// META
		// -------------------------------------------- //

		public static RPlayer get(Object worldNameExtractable)
		{
			return RPlayerColls.i.get2(worldNameExtractable);
		}

		// -------------------------------------------- //
		// LOAD
		// -------------------------------------------- //

		@Override
		public RPlayer load(RPlayer that)
		{
			//TODO load races and stuff
		return null;
		}
		
		public void tick(long ticks)
		{
			//TODO add certain ticks
		}
		//---------------------------------------------//
		// RACES
	    //--------------------------------------------//
		public void update()
		{
			// TODO Just empty for now
			
		}
		//---------------------------------------------//
		// RACES
		//--------------------------------------------//
		
		public boolean isDemon()
		{
			RPlayer.getRace();
			if ( Race.DEMON != null);
				return true;
		}
		
		public boolean isElf()
		{
			RPlayer.getRace();
			if ( Race.ELF != null);
				return true;
		}
		
		public boolean isHuman()
		{
			RPlayer.getRace();
			if ( Race.HUMAN != null);
				return true;
		}
		
		public boolean isOrc()
		{
			RPlayer.getRace();
			if ( Race.ORC != null);
				return true;
		}

		static boolean isRace(Race race)
		{
			// TODO Tell how a player is a race.
			return false;
		}
		
		public static Race getRace()
		{
		
		if
		 	( RPlayer.isRace(Race.DEMON));
		if
			( RPlayer.isRace(Race.ELF));
		if 
			( RPlayer.isRace(Race.ORC));
		if
			( RPlayer.isRace(Race.HUMAN));
				return null;
		}
	}