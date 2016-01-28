import java.util.ArrayList;

public class Space 
{

	private int spaceNumber;
	private String spaceType;
	private String spaceName;
	private boolean spaceOwned;
	private int spaceOwner;
	private int spaceCost;
	private int spaceRent;
	private int spaceHousePrice;
	private int spaceHouses;
	
	public Space(int sN, String sT, String sNa, boolean sOd, int sOr, int sC, int sR, int sHP, int sH)
	{
	spaceNumber = sN;
	spaceType = sT;
	spaceName = sNa;
	spaceOwned = sOd;
	spaceOwner = sOr;
	spaceCost = sC;
	spaceRent = sR;
	spaceHousePrice = sHP;
	spaceHouses = sH;
	}

	public String getSpaceName() {
		return spaceName;
	}

	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
	}

	public int getSpaceNumber() 
	{
		return spaceNumber;
	}

	public void setSpaceNumber(int spaceNumber) 
	{
		this.spaceNumber = spaceNumber;
	}

	public String getSpaceType() 
	{
		return spaceType;
	}

	public void setSpaceType(String spaceType) 
	{
		this.spaceType = spaceType;
	}

	public boolean isSpaceOwned() 
	{
		return spaceOwned;
	}

	public void setSpaceOwned(boolean spaceOwned) 
	{
		this.spaceOwned = spaceOwned;
	}

	public int getSpaceOwner() 
	{
		return spaceOwner;
	}

	public void setSpaceOwner(int spaceOwner)
	{
		this.spaceOwner = spaceOwner;
	}

	public int getSpaceCost() 
	{
		return spaceCost;
	}

	public void setSpaceCost(int spaceCost) 
	{
		this.spaceCost = spaceCost;
	}

	public int getSpaceRent() 
	{
		return spaceRent;
	}

	public void setSpaceRent(int spaceRent) 
	{
		this.spaceRent = spaceRent;
	}

	public int getSpaceHousePrice() 
	{
		return spaceHousePrice;
	}

	public void setSpaceHousePrice(int spaceHousePrice) 
	{
		this.spaceHousePrice = spaceHousePrice;
	}

	public int getSpaceHouses() 
	{
		return spaceHouses;
	}

	public void setSpaceHouses(int spaceHouses) 
	{
		this.spaceHouses = spaceHouses;
	}
	
}
