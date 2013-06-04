package net.immortalcraft.races.events;

import net.immortalcraft.races.Races;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;


public abstract class RaceEvent extends Event implements Runnable
{
	@Override
	public void run()
	{
		Bukkit.getPluginManager().callEvent(this);
	}

	public void run(long delay)
	{
		Bukkit.getScheduler().scheduleSyncDelayedTask(Races.r, this, delay);
	}
}
