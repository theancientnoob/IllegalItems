package com.theancientnoob.illegalitems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class IllegalItems implements ModInitializer {
    public static final String MOD_ID = "illegalitems";

    public static final ItemGroup ILLEGAL_ITEMS = FabricItemGroupBuilder.create(
            new Identifier((MOD_ID), "illegal_items"))
            .icon(() -> new ItemStack(Blocks.COMMAND_BLOCK))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Blocks.BARRIER));
                stacks.add(new ItemStack(Blocks.CHAIN_COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.DEBUG_STICK));
                stacks.add(new ItemStack(Blocks.DRAGON_EGG));
                stacks.add(new ItemStack(Items.FIREWORK_ROCKET));
                stacks.add(new ItemStack(Items.FIREWORK_STAR));
                stacks.add(new ItemStack(Blocks.JIGSAW));
                stacks.add(new ItemStack(Items.KNOWLEDGE_BOOK));
                stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
                stacks.add(new ItemStack(Blocks.REPEATING_COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.SPAWNER));
                stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
                stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
                stacks.add(new ItemStack(Items.SUSPICIOUS_STEW));
            })
            .build();


    @Override
    public void onInitialize() {

    }
}
