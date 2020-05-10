package Abstract_Factory_Pattern;

public abstract class Order {
	
	producttype type = null;
	channel chan = null;

	public Order(producttype type, channel chan) {
		this.type = type;
		this.chan = chan;
	}
	
	public producttype gettype() {
		return type;
	}

	public void settype(producttype type) {
		this.type = type;
	}

	public channel getchan() {
		return chan;
	}

	public void setchan(channel chan) {
		this.chan = chan;
	}

	@Override
	public String toString() {
		return "Product Type  - "+type+" channel ordered in " + chan;
	}
	
    abstract void processOrder();

}
