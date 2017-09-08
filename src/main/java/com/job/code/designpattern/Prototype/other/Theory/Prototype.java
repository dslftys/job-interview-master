package BigBirdDesignPatterns.ch9_PrototypePattern.Theory;

abstract class Prototype {
	private String id;
	public Prototype(String id){
		this.id=id;
	}
	
	public String Id(){
		return id;
	}
	
	public abstract Prototype Clone();
}
