package iterator.socialnetworks;

import iterator.iterators.FacebookIterator;
import iterator.iterators.ProfileIterator;
import iterator.profile.Profile;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xubin
 * @date 2021/6/4 17:46
 */
public class Facebook implements SocialNetwork{
	
	private List<Profile> profiles;
	
	public Facebook(List<Profile> cache){
		if(cache!=null){
			this.profiles=cache;
		}else{
			this.profiles=new ArrayList<>();
		}
	}
	
	public Profile requestProfileFromFacebook(String profileEmail){
		simulateNetworkLatency();
		System.out.println("Facebook: loading profile '"+profileEmail+"' over the network");
		return findProfile(profileEmail);
	}
	
	public List<String> requestProfileFriendsFromFacebook(String profileEmail,String contactType){
		simulateNetworkLatency();
		System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
		Profile profile=findProfile(profileEmail);
		if(profile!=null){
			return profile.getContacts(contactType);
		}
		return null;
	}
	
	@Override
	public ProfileIterator createFriendsIterator(String profileEmail) {
		return new FacebookIterator(this, "friends", profileEmail);
	}
	
	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new FacebookIterator(this, "coworkers", profileEmail);
	}
	
	private Profile findProfile(String profileEmail) {
		for(Profile profile:profiles){
			if(profile.getEmail().equals(profileEmail)){
				return profile;
			}
		}
		return null;
	}
	
	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	
	
}
