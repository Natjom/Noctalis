package natjom.noctalis;

import net.minecraft.client.gui.GuiGraphics;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = Noctalis.MODID, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void onRenderGui(net.neoforged.neoforge.client.event.RenderGuiEvent.Post event) {
        if (BloodMoonManager.isActive()) {
            GuiGraphics gfx = event.getGuiGraphics();
            int w = gfx.guiWidth();
            int h = gfx.guiHeight();
            gfx.fill(0, 0, w, h, 0x80FF0000);
        }
    }
}


