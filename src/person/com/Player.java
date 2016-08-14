package person.com;

import java.lang.reflect.Array;
import java.util.ArrayList;

import item.com.Card;
import item.com.Clothes;
import javafx.scene.paint.Color;
import user.com.User;

public class Player extends Essential{
	private Double mHealth;
	private String mLogin;
	private Color mColor;
	private ArrayList<Clothes> mClothes;
	private ArrayList<Card> mHand;
	private Race mRace;
	private ClassPerson mClass;
	
	
	public void setHealth(Double health){
		this.mHealth=health;
	}
	public Double getHealth(){
		return mHealth;
	}
	public void setLogin(String login){
		this.mLogin=login;
	}
	public void setColor(Color color){
		this.mColor=color;
	}
	public void getClothes(ArrayList<Clothes> clothes){
		this.mClothes= clothes;
	}
	public void setRace(Race race){
		this.mRace=race;
	}
	public void setClassPerson(ClassPerson classp){
		this.mClass=classp;
	}
	
}
