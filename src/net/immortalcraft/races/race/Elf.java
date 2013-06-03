package net.immortalcraft.races.race;

import net.immortalcraft.races.Race;

import org.bukkit.block.Biome;
import org.bukkit.event.entity.EntityDamageEvent;

public class Elf extends Race 
{

	@Override
	public void load() 
	{
		baseDamage = -2;
		spellSlots = 10;
	}

	@Override
	public int getDamageForBiome(Biome biome) {
		if(biome == Biome.FOREST || biome == Biome.JUNGLE
				|| biome == Biome.FOREST)
			return 0;
		return baseDamage;
	}

	@Override
	public void onFireDamage(EntityDamageEvent event) 
	{
	
	}

	@Override
	public void onLavaDamage(EntityDamageEvent event) 
	{
	
	}

	@Override
	public void onWaterDamage(EntityDamageEvent event) 
	{
	
	}

}