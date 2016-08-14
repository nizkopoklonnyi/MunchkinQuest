package person.com;

import javafx.scene.paint.Color;

public abstract class Essential {
	/**position x (x,y)*/
	private Double x;
	
	/**position y (x,y)*/
	private Double y;
	
	/**level of essential*/
	private Double mLevel;
	
	/**damage of essential*/
	private Double mDamage;
	
	
	public void setPositionX(Double x){
		this.x=x;
	}
	public Double getPositionX(){
		return this.x;
	}
	public void setPositionY(Double y){
		this.y=y;
	}
	public Double getPositionY(){
		return this.y;
	}
	public void setLevel(Double level){
		this.mLevel= level;
	}
	public Double getLevel(){
		return mLevel;
	}
	public void setDamage(Double damage){
		this.mDamage=damage;
	}
	public Double getDamage(){
		return mDamage;
	}
	
}
