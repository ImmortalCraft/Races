package net.immortalcraft.races;

import net.immortalcraft.races.events.RaceChangeEventDemon;
import net.immortalcraft.races.events.RaceChangeEventElf;
import net.immortalcraft.races.events.RaceChangeEventHuman;
import net.immortalcraft.races.events.RaceChangeEventOrc;
import net.immortalcraft.races.util.FxUtil;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.massivecraft.mcore.store.SenderEntity;
import com.massivecraft.mcore.util.MUtil;


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
		// UPDATE
	    //--------------------------------------------//
		public void update()
		{
			// TODO Just empty for now
			
		}
		//---------------------------------------------//
		// FX
	    //--------------------------------------------//
		
		// FX: Smoke
		protected transient int fxSmokeTicks = 0;
		public int getFxSmokeTicks() { return this.fxSmokeTicks; }
		public void setFxSmokeTicks(int fxSmokeTicks) { this.fxSmokeTicks = fxSmokeTicks; }
		public void runFxSmoke() { this.fxSmokeTicks = 20 * 20; }

		// FX: Ender
		protected transient int fxEnderTicks = 0;
		public int getFxEnderTicks() { return this.fxEnderTicks; }
		public void getFxEnderTicks(int fxEnderTicks) { this.fxEnderTicks = fxEnderTicks; }
		public void runFxEnder() { this.fxEnderTicks = 10 * 20; }

		// FX: Shriek
		public void runFxShriek()
		{
			Player me = this.getPlayer();
			if (me == null) return;
			Location location = me.getLocation();
			World world = location.getWorld();
			world.playEffect(location, Effect.GHAST_SHRIEK, 0);
		}

		// FX: SmokeBurst
		public void runFxSmokeBurst()
		{
			Player me = this.getPlayer();
			if (me == null) return;
			double dcount = Conf.get(me).fxSmokeBurstCount;
			long lcount = MUtil.probabilityRound(dcount);
			for (long i = lcount; i > 0; i--) FxUtil.smoke(me);
		}

		// FX: EnderBurst
		public void runFxEnderBurst()
		{
			Player me = this.getPlayer();
			if (me == null) return;
			double dcount = Conf.get(me).fxEnderBurstCount;
			long lcount = MUtil.probabilityRound(dcount);
			for (long i = lcount; i > 0; i--) FxUtil.ender(me, 0);
		}

		// FX: FlameBurst
		public void runFxFlameBurst()
		{
			Player me = this.getPlayer();
			if (me == null) return;
			double dcount = Conf.get(me).fxFlameBurstCount;
			long lcount = MUtil.probabilityRound(dcount);
			for (long i = lcount; i > 0; i--) FxUtil.flame(me);
		}
		
		//---------------------------------------------//
		// RACES
		//--------------------------------------------//
		
		protected boolean demon;
		protected boolean elf;
		protected boolean human;
		protected boolean orc;
		
		//---------------------------------------------//
		// IS RACE
		//--------------------------------------------//
		
		public boolean isDemon()
		{
			RPlayer.getRace();
			if ( Race.Demon != null);
				return true;
		}
		
		public boolean isElf()
		{
			RPlayer.getRace();
			if ( Race.Elf != null);
				return true;
		}
		
		public boolean isHuman()
		{
			RPlayer.getRace();
			if ( Race.Human != null);
				return true;
		}
		
		public boolean isOrc()
		{
			RPlayer.getRace();
			if ( Race.Orc != null);
				return true;
		}

		static boolean isRace(Race race)
		{
			// TODO Tell how a player is a race.
			return false;
		}
		
		//---------------------------------------------//
		// GET RACE
		//--------------------------------------------//
		
		public static Race getRace()
		{
		
		if
		 	( RPlayer.isRace(Race.Demon));
		if
			( RPlayer.isRace(Race.Elf));
		if 
			( RPlayer.isRace(Race.Orc));
		if
			( RPlayer.isRace(Race.Human));
				return null;
		}
		//---------------------------------------------//
		// SET RACE
		//--------------------------------------------//

		public void setDemon(Boolean val)
		{
			RaceChangeEventDemon event = new RaceChangeEventDemon(val, this);
			event.run();
			if (event.isCancelled()) return;

			this.demon = val;
			this.changed();
			if (this.demon)
			{
				this.msg(Lang.demonTrue);
				this.runFxShriek();
				this.runFxSmokeBurst();
				this.runFxFlameBurst();

				Player player = this.getPlayer();
				if (player != null)
			{
					
			}
				this.update();
			}
		}
		
		public void setElf(Boolean val)
		{
			RaceChangeEventElf event = new RaceChangeEventElf(val, this);
			event.run();
			if (event.isCancelled()) return;

			this.elf = val;
			this.changed();
			if (this.elf)
			{
				Player player = this.getPlayer();
				if (player != null)
			{
				}
				this.update();
			}
		}
		
		public void setHuman(Boolean val)
		{
			RaceChangeEventHuman event = new RaceChangeEventHuman(val, this);
			event.run();
			if (event.isCancelled()) return;

			this.human = val;
			this.changed();
			if (this.human)
			{
				Player player = this.getPlayer();
				if (player != null)
			{
				}
				this.update();
			}
		}
		
		public void setOrc(Boolean val)
		{
			RaceChangeEventOrc event = new RaceChangeEventOrc(val, this);
			event.run();
			if (event.isCancelled()) return;

			this.orc = val;
			this.changed();
			if (this.orc)
			{
				this.msg(Lang.orcTrue);
				this.runFxEnderBurst();
				this.runFxSmoke();

				Player player = this.getPlayer();
				if (player != null)
				{
			}
				this.update();
			}
		}
	}