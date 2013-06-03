package net.immortalcraft.races;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TheTask implements Runnable
{
	@Override
	public void run()
	{
		// Tick each online player
		for (Player player: Bukkit.getOnlinePlayers())
		{
			RPlayer rplayer = RPlayer.get(player);
			rplayer.tick(ConfServer.taskInterval);
		}
	}
}

