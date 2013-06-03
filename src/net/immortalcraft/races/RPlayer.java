package net.immortalcraft.races;

//Java
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Bukkit
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.potion.PotionEffectType;

//MassiveCraft
import com.massivecraft.mcore.MCore;
import com.massivecraft.mcore.cmd.MCommand;
import com.massivecraft.mcore.store.SenderEntity;
import com.massivecraft.mcore.util.MUtil;
import com.massivecraft.mcore.util.PermUtil;
import com.massivecraft.mcore.util.Txt;


	public class RPlayer extends SenderEntity<RPlayer>
	{
		// -------------------------------------------- //
		// META
		// -------------------------------------------- //

		public static RPlayer get(Object worldNameExtractable)
		{
			return RPlayerColls.i.get2(worldNameExtractable);
		}

		// -------------------------------------------- //
		// LOAD
		// -------------------------------------------- //

		@Override
		public RPlayer load(RPlayer that)
		{
			//TODO load races and stuffs
		}
	}