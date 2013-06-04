package net.immortalcraft.races.events;

import org.bukkit.event.HandlerList;

import net.immortalcraft.races.RPlayer;

	public class RaceChangeEventHuman extends CancellableRaceEvent
	{
		// -------------------------------------------- //
		// REQUIRED EVENT CODE
		// -------------------------------------------- //

		private static final HandlerList handlers = new HandlerList();
		public HandlerList getHandlers() { return handlers; }
		public static HandlerList getHandlerList() { return handlers; }

		// -------------------------------------------- //
		// FIELD
		// -------------------------------------------- //

		protected final boolean human;
		public boolean isHuman() { return this.human; }

		protected final RPlayer rplayer;
		public RPlayer getrplayer() { return this.rplayer; }

		// -------------------------------------------- //
		// CONSTRUCT
		// -------------------------------------------- //

		public RaceChangeEventHuman(boolean human, RPlayer rplayer)
		{
			this.human = human;
			this.rplayer = rplayer;
		}
}

