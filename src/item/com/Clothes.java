package item.com;

import javafx.scene.image.Image;

public class Clothes extends Buff{

	protected Image mImage; 	
	
	public Clothes(String type, String argument) {
		super(type, argument);
	}
	
	public Image getImage(){
		return mImage;
	}
	public void setImage(Image image){
		this.mImage= image;
	}
}
