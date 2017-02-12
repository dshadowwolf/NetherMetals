package com.mcmoddev.nethermetals.util;


import com.mcmoddev.nethermetals.init.Materials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNMe extends CreativeTabs {
    
    public CreativeTabNMe() {
        
        super("nethermetals");
    }
    
    @Override
    public Item getTabIconItem () {
      
        return Item.getItemFromBlock(Materials.getMaterialByName("lead").oreNether) ;
    }
}
