package com.sk89q.craftbook.sponge.mechanics.ics.pinsets;

import com.sk89q.craftbook.sponge.mechanics.ics.IC;
import com.sk89q.craftbook.sponge.util.SignUtil;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.world.Location;

public class Pins3ISO extends PinSet {

    @Override
    public int getInputCount() {
        return 3;
    }

    @Override
    public int getOutputCount() {
        return 1;
    }

    @Override
    public String getName() {
        return "3ISO";
    }

    @Override
    public Location getPinLocation(int id, IC ic) {
        switch(id) {
            case 0:
                return ic.getBlock().getRelative(SignUtil.getFront(ic.getBlock()));
            case 1:
                return ic.getBlock().getRelative(SignUtil.getLeft(ic.getBlock()));
            case 2:
                return ic.getBlock().getRelative(SignUtil.getRight(ic.getBlock()));
            case 3:
                return ic.getBlock().getRelative(SignUtil.getBack(ic.getBlock())).getRelative(SignUtil.getBack(ic.getBlock()));
            default:
                return null;
        }
    }

}
