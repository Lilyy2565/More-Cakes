package com.lilyy2565.morecakes;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.item.Items;

public class IcingBucketItem extends MilkBucketItem {
	public IcingBucketItem() {
	       super(new Item.Settings().maxCount(1).recipeRemainder(Items.BUCKET)); 
	}
}