package net.immortalcraft.races.cmd.arg;

import net.immortalcraft.races.RPlayer;
import net.immortalcraft.races.RPlayerColls;
import com.massivecraft.mcore.cmd.arg.ARSenderEntity;
import com.massivecraft.mcore.cmd.arg.ArgReader;

public class ARUPlayer
{
	// -------------------------------------------- //
	// INSTANCE
	// -------------------------------------------- //

	public static ArgReader<RPlayer> getFullAny(Object o) { return ARSenderEntity.getFullAny(RPlayerColls.get().get(o)); }

	public static ArgReader<RPlayer> getStartAny(Object o) { return ARSenderEntity.getStartAny(RPlayerColls.get().get(o)); }

	public static ArgReader<RPlayer> getFullOnline(Object o) { return ARSenderEntity.getFullOnline(RPlayerColls.get().get(o)); }

	public static ArgReader<RPlayer> getStartOnline(Object o) { return ARSenderEntity.getStartOnline(RPlayerColls.get().get(o)); }

}