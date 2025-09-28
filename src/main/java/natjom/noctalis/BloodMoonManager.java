package natjom.noctalis;

import net.minecraft.server.level.ServerLevel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

public class BloodMoonManager {
    private static boolean active = false;
    private static long endTime = 0;

    public static void start(ServerLevel level, long durationTicks) {
        active = true;
        endTime = level.getDayTime() + durationTicks;
    }

    public static boolean isActive() {
        return active;
    }

    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        if (!active) return;

        for (ServerLevel lvl : event.getServer().getAllLevels()) {
            long current = lvl.getDayTime();
            if (current >= endTime) {
                active = false;
            } else {
                lvl.setDayTime(current + 0);
            }
        }
    }

}
