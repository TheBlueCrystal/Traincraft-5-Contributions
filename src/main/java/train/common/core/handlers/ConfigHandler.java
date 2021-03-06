/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import train.common.Traincraft;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigHandler {

	public static boolean ORE_GEN;
	public static boolean COPPER_ORE_GEN;
	public static boolean ENABLE_ZEPPELIN;
	public static boolean SOUNDS;
	public static boolean FLICKERING;
	public static boolean ENABLE_STEAM;
	public static boolean ENABLE_DIESEL;
	public static boolean ENABLE_ELECTRIC;
	public static boolean ENABLE_BUILDER;
	public static boolean ENABLE_TENDER;
	public static boolean CHUNK_LOADING;
	public static boolean SHOW_POSSIBLE_COLORS;
	public static int TRAINCRAFT_VILLAGER_ID;
	public static boolean REAL_TRAIN_SPEED;
	public static boolean RETROGEN_CHUNKS;
	public static boolean	MAKE_MODPACKS_GREAT_AGAIN;



	public static void init(File configFile) {
		Configuration cf = new Configuration(configFile);

		try {
			cf.load();
			/* General */
			SOUNDS = cf.get(CATEGORY_GENERAL, "ENABLE_SOUNDS", true).getBoolean(true);
			FLICKERING = cf.get(CATEGORY_GENERAL, "DISABLE_FLICKERING", true).getBoolean(true);
			ORE_GEN = cf.get(CATEGORY_GENERAL, "ENABLE_FUEL_ORES_SPAWN", true).getBoolean(true);
			COPPER_ORE_GEN = cf.get(CATEGORY_GENERAL, "ENABLE_COPPER_SPAWN", true).getBoolean(true);
			ENABLE_ZEPPELIN = cf.get(CATEGORY_GENERAL, "ENABLE_ZEPPELIN", true).getBoolean(true);
			ENABLE_STEAM = cf.get(CATEGORY_GENERAL, "ENABLE_STEAM_TRAINS", true).getBoolean(true);
			ENABLE_DIESEL = cf.get(CATEGORY_GENERAL, "ENABLE_DIESEL_TRAINS", true).getBoolean(true);
			ENABLE_ELECTRIC = cf.get(CATEGORY_GENERAL, "ENABLE_ELECTRIC_TRAINS", true).getBoolean(true);
			ENABLE_BUILDER = cf.get(CATEGORY_GENERAL, "ENABLE_TRACKS_BUILDER", true).getBoolean(true);
			ENABLE_TENDER = cf.get(CATEGORY_GENERAL, "ENABLE_TENDERS", true).getBoolean(true);
			CHUNK_LOADING = cf.get(CATEGORY_GENERAL, "ENABLE_CHUNK_LOADING", true).getBoolean(true);
			TRAINCRAFT_VILLAGER_ID = cf.get(CATEGORY_GENERAL, "TRAINCRAFT_VILLAGER_ID", 86).getInt();
			Property SHOW_POSSIBLE_COLORS_PROP = cf.get(CATEGORY_GENERAL, "SHOW_POSSIBLE_TRAINS_COLORS_IN_CHAT", true);
			SHOW_POSSIBLE_COLORS_PROP.comment = "This will disable the chat messages telling you the possible colors when spawning new trains and when coloring them with dye";
			SHOW_POSSIBLE_COLORS = SHOW_POSSIBLE_COLORS_PROP.getBoolean(true);
			REAL_TRAIN_SPEED = cf.get(CATEGORY_GENERAL, "REAL_TRAIN_SPEED", false).getBoolean(false);
			RETROGEN_CHUNKS = cf.getBoolean("ENABLE_RETROGEN", CATEGORY_GENERAL, false, "This will generate ores in existing chunks prior to installing Traincraft 5. Do note that if this is off chunks that are loaded will not retrogen later, no matter what.");
			MAKE_MODPACKS_GREAT_AGAIN = cf.getBoolean("MAKE_MODPACKS_GREAT_AGAIN", CATEGORY_GENERAL, false,
					"This will disable some of Traincrafts easier recipes to balance Modpacks");


			// /* Blocks */
			// BlockIDs.assemblyTableI.blockID = cf.get(CATEGORY_BLOCK , "block_assemblytableI",
			// 350).getInt(350);
			// BlockIDs.assemblyTableII.blockID = cf.get(CATEGORY_BLOCK, "block_assemblytableII",
			// 351).getInt(351);
			// BlockIDs.assemblyTableIII.blockID = cf.get(CATEGORY_BLOCK, "block_assemblytableIII",
			// 352).getInt(352);
			//
			// BlockIDs.distilIdle.blockID = cf.get(CATEGORY_BLOCK, "block_distil",
			// 353).getInt(353);
			// BlockIDs.distilActive.blockID = cf.get(CATEGORY_BLOCK, "block_distil_active",
			// 354).getInt(354);
			// //BlockIDs.signal.blockID = cf.get(CATEGORY_BLOCK, "block_active_signal",
			// 362).getInt(362);
			//
			// BlockIDs.trainWorkbench.blockID = cf.get(CATEGORY_BLOCK, "block_train_workbench",
			// 361).getInt(361);
			// BlockIDs.stopper.blockID = cf.get(CATEGORY_BLOCK, "block_train_buffer",
			// 362).getInt(362);
			//
			// BlockIDs.oreTC.blockID = cf.get(CATEGORY_BLOCK, "block_traincraft_ores", 365, "TC
			// Ores generation (Copper)").getInt(365);
			//
			// BlockIDs.openFurnaceIdle.blockID = cf.get(CATEGORY_BLOCK, "block_open_furnace",
			// 363).getInt(363);
			// BlockIDs.openFurnaceActive.blockID = cf.get(CATEGORY_BLOCK,
			// "block_open_furnace_active", 364).getInt(364);
			// BlockIDs.lantern.blockID = cf.get(CATEGORY_BLOCK, "block_lantern", 365).getInt(365);
			// BlockIDs.waterWheel.blockID = cf.get(CATEGORY_BLOCK, "block_water_wheel",
			// 366).getInt(366);
			// BlockIDs.windMill.blockID = cf.get(CATEGORY_BLOCK, "block_wind_mill",
			// 367).getInt(367);
			// BlockIDs.generatorDiesel.blockID = cf.get(CATEGORY_BLOCK, "block_diesel_generator",
			// 368).getInt(368);
			//
			// BlockIDs.diesel.blockID = cf.get(CATEGORY_BLOCK, "block_diesel", 369).getInt(369);
			// BlockIDs.refinedFuel.blockID = cf.get(CATEGORY_BLOCK, "block_refinedFuel",
			// 370).getInt(370);
			//
			// BlockIDs.tcRailGag.blockID = cf.get(CATEGORY_BLOCK, "block_rail_gag",
			// 371).getInt(371);
			// BlockIDs.tcRail.blockID = cf.get(CATEGORY_BLOCK, "block_tc_rail", 372).getInt(372);
			// BlockIDs.bridgePillar.blockID = cf.get(CATEGORY_BLOCK, "block_tc_bridge_pillar",
			// 373).getInt(373);
			// //BlockIDs.book.blockID = cf.get(CATEGORY_BLOCK, "block_book", 371).getInt(371);
			//
			// /* Items */
			// int id = 29000;
			// for (ItemIDs items : ItemIDs.values()) {
			// items.itemID = cf.get(CATEGORY_ITEM, "item_" + items.name(), id).getInt(id);
			// id++;
			// }
			
		} catch (Exception e) {
			Traincraft.tcLog.fatal("Traincraft had a problem loading its configuration\n" + e);
		} finally {
			if(cf.hasChanged()) {
				cf.save();
			}
		}
	}
}
