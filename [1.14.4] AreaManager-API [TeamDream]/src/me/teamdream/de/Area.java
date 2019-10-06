package me.teamdream.de;

import org.bukkit.Location;

public abstract class Area {
	
	private Location pos1 = null;
	private Location pos2 = null;
	private String name = "Wildnis";
	private String entry_permission = "teamdream.area.entry."+name;
	public Area(Location pos1, Location pos2, String name) {
		super();
		this.pos1 = pos1;
		this.pos2 = pos2;
		this.name = name;
	}
	public Location getPos1() {
		return pos1;
	}
	public Location getPos2() {
		return pos2;
	}
	public String getName() {
		return name;
	}
	public String getEntry_permission() {
		return entry_permission;
	}
	
	double x1 = 0d;
	double y1 = 0d;
	double z1 = 0d;
	double x2 = 0d;
	double y2 = 0d;
	double z2 = 0d;
	public boolean isInArea(Location loc ) {
		if(pos1.getX() > pos2.getX()) {
			x1 = pos1.getX();
			x2 = pos2.getX();
		} else {
			x1 = pos2.getX();
			x2 = pos1.getX();
		}
		if(pos1.getY() > pos2.getY()) {
			y1 = pos1.getY();
			y2 = pos2.getY();
		} else {
			y1 = pos2.getY();
			y2 = pos1.getY();
		}
		if(pos1.getZ() > pos2.getZ()) {
			z1 = pos1.getZ();
			z2 = pos2.getZ();
		} else {
			z1 = pos2.getZ();
			z2 = pos1.getZ();
		}
		
		if((loc.getX() > x2 && loc.getX() < x1) && (loc.getY() > y2 && loc.getY() < y1) && (loc.getZ() > z2 && loc.getZ() < z1)) return true;
		else return false;
	}
	
}
