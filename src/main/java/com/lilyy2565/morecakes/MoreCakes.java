package com.lilyy2565.morecakes;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.ItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.fluid.Fluids;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lilyy2565.morecakes.ChocolateCakeBlock;

import com.lilyy2565.morecakes.IcingBucketItem;

public class MoreCakes implements ModInitializer {
	public static final String MOD_ID = "morecakes";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Block CAKE_BASE_BLOCK = new CakeBaseBlock(Block.Settings.copy(Blocks.CAKE));
    public static final Item CAKE_BASE_ITEM = new BlockItem(CAKE_BASE_BLOCK, new Item.Settings());

	public static final Block CHOCOLATE_CAKE_BLOCK = new ChocolateCakeBlock(Block.Settings.copy(Blocks.CAKE));
    public static final Item CHOCOLATE_CAKE_ITEM = new BlockItem(CHOCOLATE_CAKE_BLOCK, new Item.Settings());

	public static final Block BLANK_CAKE_BLOCK = new BlankCakeBlock(Block.Settings.copy(Blocks.CAKE));
    public static final Item BLANK_CAKE_ITEM = new BlockItem(BLANK_CAKE_BLOCK, new Item.Settings());

	public static final Block BERRY_CAKE_BLOCK = new BerryCakeBlock(Block.Settings.copy(Blocks.CAKE));
    public static final Item BERRY_CAKE_ITEM = new BlockItem(BERRY_CAKE_BLOCK, new Item.Settings());

	public static final Item ICING_BUCKET = new IcingBucketItem();
	public static final Item CHOCO_ICING_BUCKET = new ChocolateIcingBucketItem();

	@Override
	public void onInitialize() {
		LOGGER.info("MoreCakes mod is initializing...");

		Registry.register(Registries.BLOCK, new Identifier("morecakes", "cake_base"), CAKE_BASE_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("morecakes", "cake_base"), CAKE_BASE_ITEM);
		
		Registry.register(Registries.BLOCK, new Identifier("morecakes", "chocolate_cake"), CHOCOLATE_CAKE_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("morecakes", "chocolate_cake"), CHOCOLATE_CAKE_ITEM);

		Registry.register(Registries.BLOCK, new Identifier("morecakes", "blank_cake"), BLANK_CAKE_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("morecakes", "blank_cake"), BLANK_CAKE_ITEM);

		Registry.register(Registries.BLOCK, new Identifier("morecakes", "berry_cake"), BERRY_CAKE_BLOCK);
		Registry.register(Registries.ITEM, new Identifier("morecakes", "berry_cake"), BERRY_CAKE_ITEM);

		Registry.register(Registries.ITEM, new Identifier("morecakes", "icing_bucket"), ICING_BUCKET);
		Registry.register(Registries.ITEM, new Identifier("morecakes", "choco_icing_bucket"), CHOCO_ICING_BUCKET);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
        	entries.add(CAKE_BASE_ITEM);
			entries.add(CHOCOLATE_CAKE_ITEM);
        	entries.add(BLANK_CAKE_ITEM);
        	entries.add(BERRY_CAKE_ITEM);
			entries.add(ICING_BUCKET);
			entries.add(CHOCO_ICING_BUCKET);
    	});

		LOGGER.info("MoreCakes mod initialized!");
	}
}