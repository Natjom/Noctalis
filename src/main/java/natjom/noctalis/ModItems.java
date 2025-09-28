package natjom.noctalis;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Noctalis.MODID);

    public static final DeferredItem<Item> BLOOD_MOON_ITEM = ITEMS.register("blood_moon_item",
            () -> new BloodMoonItem(new Item.Properties()
                    .stacksTo(1)
                    .setId(ResourceKey.create(
                            Registries.ITEM,
                            ResourceLocation.fromNamespaceAndPath(Noctalis.MODID, "blood_moon_item")
                    ))
            )
    );
}
