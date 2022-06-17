package com.extendedclip.papi.expansion.flycheck;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.milkbowl.vault.Vault;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.onarandombox.MultiverseCore.api.MultiverseWorld;

import java.util.Base64;
import java.util.Collection;
import java.util.UUID;
import java.util.logging.Level;
import java.io.UnsupportedEncodingException;


public class Flycheck extends PlaceholderExpansion
{
	
  @Override
  public boolean canRegister()
  {
	return true;
  }
  
  @Override
  public String getAuthor() {
    return "Tianji";
  }

  @Override
  public String getIdentifier()
  {
    return "fly";
  }
  
  @Override
  public String getPlugin() {
      return null;
  }
  
  @Override
  public String getVersion()
  {
    return "1.0.0";
  }
  
  @Override
  public String onPlaceholderRequest(Player p, String identifier)
  {
    if (p == null) {
      return "";
    }
    if (identifier.contains("flynotice")) {
      	String world = p.getWorld().getName();
      	if(world == "res" || world == "world_nether" || world == "world_the_end") {
      		if(p.hasPermission("fly.bypass")) {
      			return "輸入/fly開啟飛行";
      		}else {
      			return "當前世界無法飛行";
      		}
      	}else {
      		if(p.hasPermission("fly.bypass")) {
      			return "輸入/fly開啟飛行";
      		}else {
      			return "輸入/flyc開啟飛行";
      		}
      	}
    }
    
    if (identifier.contains("keepinv")) {
    	if(p.hasPermission("keepitems.keep")) {
    		return "+掉落防喷保護中+";
    	}else {
    		return "找艾譜莉打開防喷保護吧";
    	}
    }
    
    return null;
  }
  
}