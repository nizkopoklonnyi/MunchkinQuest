package user.com;

import java.util.ArrayList;

public class User {
	private String mLogin;
	private String mPassword;
	private ArrayList<String> mGames;
	
	
	public void setLogin(String login){
		mLogin=login;
	}
	public String getLogin(){
		return mLogin;
	}
	
	public void setPassword(String password){
		mPassword=password;
	}
	public String getPassword(){
		return mPassword;
	}
	
	public void addGame(){
		//...
	}
	public ArrayList<String> getGames(){
		return mGames;
	}
}
