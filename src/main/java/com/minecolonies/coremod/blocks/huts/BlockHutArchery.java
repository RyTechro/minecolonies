package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.IColonyView;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import org.jetbrains.annotations.NotNull;

/**
 * Block of the Archers trainings camp.
 */
public class BlockHutArchery extends AbstractBlockHut<BlockHutArchery>
{
    @NotNull
    @Override
    public String getName()
    {
        return "blockhutarchery";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.archery;
    }


}
