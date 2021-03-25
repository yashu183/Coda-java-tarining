package day10;

public class Build {
	public static void main(String[] args) {
		Computer comp1 = new Computer.ComputerBuilder("i7 core", "8 GB ram").build();
		System.out.println(comp1.toString());
		Computer comp2 = new Computer.ComputerBuilder("i9 core", "16 GB ram").setGraphicsCard("Nvidia").setSsd("256 GB").build();
		System.out.println(comp2.toString());
	}
}

class Computer
{
	//compulsory components
	private String motherboard;
	private String ram;
	//optional
	private String graphicsCard;
	private String ssd;
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public String getSsd() {
		return ssd;
	}
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	public String getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public Computer(ComputerBuilder builder) {
		this.motherboard=builder.motherboard;
		this.ram=builder.ram;
		this.graphicsCard=builder.getGraphicsCard();
		this.ssd=builder.getSsd();
	}
	
	@Override
	public String toString() {
		return "Computer [motherboard=" + motherboard + ", ram=" + ram + ", graphicsCard=" + graphicsCard + ", ssd="
				+ ssd + "]";
	}

	public static class ComputerBuilder
	{
		private String motherboard;
		private String ram;
		//optional
		private String graphicsCard;
		private String ssd;
		
		public ComputerBuilder(String motherboard, String ram)
		{
			this.motherboard = motherboard;
			this.ram = ram;
		}

		public String getGraphicsCard() {
			return graphicsCard;
		}

		public ComputerBuilder setGraphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}

		public String getSsd() {
			return ssd;
		}

		public ComputerBuilder setSsd(String ssd) {
			this.ssd = ssd;
			return this;
		}
		
		public Computer build()
		{
			return new Computer(this);
		}
	}
}