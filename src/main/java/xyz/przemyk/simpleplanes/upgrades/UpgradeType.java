package xyz.przemyk.simpleplanes.upgrades;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistryEntry;
import xyz.przemyk.simpleplanes.entities.PlaneEntity;

import java.util.function.Function;
import java.util.function.Predicate;

public class UpgradeType extends ForgeRegistryEntry<UpgradeType> {

    protected Item upgradeItem;
    public final Function<PlaneEntity, Upgrade> instanceSupplier;
    public final Predicate<PlaneEntity> isPlaneApplicable;
    public final boolean occupyBackSeat;

    /**
     * Upgrade Type Constructor
     * @param upgradeItem After right clicking with this item, stack shrinks and plane gets this upgrade.
     * @param instanceSupplier Supplier of Upgrade instances
     * @param isPlaneApplicable Upgrade is given to plane only if this Predicate returns true.
     * @param occupyBackSeat Upgrade occupying back seat can only be applied to large plane.
     *                       Large plane can have only 1 upgrade occupying back seat.
     */
    public UpgradeType(Item upgradeItem, Function<PlaneEntity, Upgrade> instanceSupplier, Predicate<PlaneEntity> isPlaneApplicable, boolean occupyBackSeat) {
        this.upgradeItem = upgradeItem;
        this.instanceSupplier = instanceSupplier;
        this.isPlaneApplicable = isPlaneApplicable;
        this.occupyBackSeat = occupyBackSeat;
    }

    public UpgradeType(Item upgradeItem, Function<PlaneEntity, Upgrade> instanceSupplier, Predicate<PlaneEntity> isPlaneApplicable) {
        this(upgradeItem, instanceSupplier, isPlaneApplicable, false);
    }

    public UpgradeType(Item upgradeItem, Function<PlaneEntity, Upgrade> instanceSupplier) {
        this(upgradeItem, instanceSupplier, planeEntity -> true);
    }

    public Item getUpgradeItem() {
        return upgradeItem;
    }
}