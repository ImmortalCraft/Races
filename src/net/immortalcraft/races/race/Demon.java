package net.immortalcraft.races.race;

import net.immortalcraft.races.Race;

import org.bukkit.block.Biome;
import org.bukkit.event.entity.EntityDamageEvent;

public class Demon extends Race {

	@Override
	public int getDamageForBiome(Biome biome) {
		if(biome == Biome.HELL)
			return 2;
		return baseDamage;
	}

	public void load() {
		baseDamage = 0;
		name = "Demon";
		spellSlots = 6;
	}

	public void onFireDamage(EntityDamageEvent event) {
		event.setCancelled(true);
	}

	public void onLavaDamage(EntityDamageEvent event) {
		event.setDamage(event.getDamage() - 2);		
	}

	public void onWaterDamage(EntityDamageEvent event) {
	}
}
