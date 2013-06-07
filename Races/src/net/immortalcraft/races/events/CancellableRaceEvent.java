package net.immortalcraft.races.events;

import org.bukkit.event.Cancellable;

public abstract class CancellableRaceEvent extends RaceEvent implements Cancellable
{
	// FIELD: cancelled
	private boolean cancelled = false;
	public boolean isCancelled() { return this.cancelled; }
	public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }
}