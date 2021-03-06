package net.immortalcraft.races;

import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;

import com.massivecraft.mcore.store.Entity;
import com.massivecraft.mcore.util.MUtil;

public class Conf extends Entity<Conf>
{

	// -------------------------------------------- //
	// META
	// -------------------------------------------- //

	public static Conf get(Object worldNameExtractable)
	{
		return ConfColls.i.get2(worldNameExtractable);
	}
	// -------------------------------------------- //
	// FX
	// -------------------------------------------- //
	
	public double fxSmokePerTick = 0.40D;
	public double fxEnderPerTick = 0.10D;
	public int fxEnderRandomMaxLen = 1;
	public double fxSmokeBurstCount = 30D;
	public double fxFlameBurstCount = 5D;
	public double fxEnderBurstCount = 3D;

	// -------------------------------------------- //
    // MISC
	// -------------------------------------------- //

		public Set<DamageCause> blockDamageFromOrc = MUtil.set(
			DamageCause.FALL,
			DamageCause.STARVATION
		);
		
		public Set<DamageCause> blockDamageFromDemon = MUtil.set(
				DamageCause.FIRE,
				DamageCause.LAVA,
				DamageCause.FALL
			);

		public Set<RegainReason> blockHealthFrom = MUtil.set(
			RegainReason.SATIATED,
			RegainReason.REGEN	
		);

		// -------------------------------------------- //
		// UPDATE
		// -------------------------------------------- //

		public int updateRespawnFood = 20;
		public int updateRespawnHealth = 20;

		public Boolean updateNameColor = false;
		public ChatColor updateNameColorTo = ChatColor.RED;

		// -------------------------------------------- //
		// DROP SELF
		// -------------------------------------------- //

		public Set<Material> dropSelfMaterials = MUtil.set(
			Material.WEB,
			Material.GLOWSTONE,
			Material.BOOKSHELF,
			Material.DEAD_BUSH
		);
}