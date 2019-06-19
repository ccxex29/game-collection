/*
 * Object Oriented Programming Project LK01
 * Theme:
 * Game Collection
 * Team:
 * Louis Raymond (2201849535)
 * Christina Angelia (2201728004)
 * Lecturer : 
 * Livia Ashianti (D5358)
 */

package core;

public class GameVersion{
	private double version = 0.11D;
	private int buildSubVersion = 1;
	private String author1 = "Louis Raymond";
	private String author2 = "Christina Angelia";
	private String nim1 = "2201849535";
	private String nim2 = "2201728004";
	public double getVersion() {
		return version;
	}
	public int getBuildSubVersion() {
		return buildSubVersion;
	}
	public String getAuthor1() {
		return author1;
	}
	public String getAuthor2() {
		return author2;
	}
	public String getNim1() {
		return nim1;
	}
	public String getNim2() {
		return nim2;
	}
	
}