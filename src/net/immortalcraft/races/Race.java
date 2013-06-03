package net.immortalcraft.races;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.block.Biome;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.entity.EntityDamageEvent;

public abstract class Race extends TheListener {

	public static int baseDamage = 0;
	public String name = getClass().getSimpleName();
	public ArrayList<Type> overriden = new ArrayList<Type>();
	public List<String> playerList =
			Arrays.asList(new String[] { "gamerfreak22222", "defaultPlayers", "yourPlayersHere"});
	public int spellSlots = 1;
	}

	public abstract void load();	
	public abstract int getDamageForBiome(Biome biome);
	public abstract void onFireDamage(EntityDamageEvent event);
	public abstract void onLavaDamage(EntityDamageEvent event);
	public abstract void onWaterDamage(EntityDamageEvent event);
}
