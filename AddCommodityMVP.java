import java.awt.Color;

public class AddCommodityMVP {
	private GTerm gt;
	private String name;
	private double price;
	private String records;
	
public AddCommodityMVP(String title) {

		this.gt = new GTerm(600, 400);
		this.gt.setTitle(title);
		this.gt.setFontSize(15);
		Color colorBackground = Color.PINK;
		this.gt.setBackgroundColor(colorBackground);
		this.name="";
		this.price = 0;
		this.records = "Commodity List:\n";

	}
	
	// run this program
	public void runProgram() {
		this.gt.addButton("Add Commodity", this, "addcommodity");
		this.gt.println("\n");
		this.gt.addButton("Commodity List", this, "list");
		this.gt.println("\n");
		this.gt.addButton("Download Commodity List", this, "download");
		this.gt.println("\n");
		this.gt.addTextArea("", 580, 300);
	}

	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	


	// input the commodities' information
	public void addcommodity() {
		String itemname = String.valueOf(this.gt.getInputString("Please input a commodity..."));
		double itemprice = Double.valueOf(this.gt.getInputString("Please input price..."));
		this.gt.showMessageDialog(this.setCommondity(itemname+" $"+itemprice));
	}
	
	// Save the information of commodity
	public String setCommondity(String item) {
		this.name += item;
		this.setList(item);
		return "You have added " + item;

	}

	// get the list
	public void list() {
		this.gt.setTextInEntry(0, this.getList());
	}

	public String getList() {
		return this.records;
	}
 
	public void setList(String text) {
		this.records += text + "\n";
	}

	public static void main(String[] args) {
		AddCommodityMVP ac = new AddCommodityMVP("Commodity Regestion Program");
		ac.runProgram();
	}

}
