package net.immortalcraft.races.events;

import org.bukkit.event.HandlerList;

import net.immortalcraft.races.RPlayer;

	public class RaceChangeEventElf extends CancellableRaceEvent
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

		protected final boolean elf;
		public boolean isElf() { return this.elf; }

		protected final RPlayer rplayer;
		public RPlayer getrplayer() { return this.rplayer; }

		// -------------------------------------------- //
		// CONSTRUCT
		// -------------------------------------------- //

		public RaceChangeEventElf(boolean elf, RPlayer rplayer)
		{
			this.elf = elf;
			this.rplayer = rplayer;
		}
}

