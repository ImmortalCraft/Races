package net.immortalcraft.races.events;

import org.bukkit.event.HandlerList;

import net.immortalcraft.races.RPlayer;

	public class RaceChangeEventDemon extends CancellableRaceEvent
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

		protected final boolean demon;
		public boolean isDemon() { return this.demon; }

		protected final RPlayer rplayer;
		public RPlayer getrplayer() { return this.rplayer; }

		// -------------------------------------------- //
		// CONSTRUCT
		// -------------------------------------------- //

		public RaceChangeEventDemon(boolean demon, RPlayer rplayer)
		{
			this.demon = demon;
			this.rplayer = rplayer;
		}
}

