package com.capgemini.profileservice.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profile {

	private int userId;
	private String userName;
	private String profile;
	private String postProfile;
	private String timelinePost;
	private String friend1;
	private String city;
	private String state;
	private String caption;
	private String tag;
	private String friends[];

	public Profile() {
		super();
	}

	public Profile(int userId, String userName, String profile, String postProfile, String timelinePost, String friend1,
			String city, String state, String caption, String tag, String[] friends) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.profile = profile;
		this.postProfile = postProfile;
		this.timelinePost = timelinePost;
		this.friend1 = friend1;
		this.city = city;
		this.state = state;
		this.caption = caption;
		this.tag = tag;
		this.friends = friends;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPostProfile() {
		return postProfile;
	}

	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}

	public String getTimelinePost() {
		return timelinePost;
	}

	public void setTimelinePost(String timelinePost) {
		this.timelinePost = timelinePost;
	}

	public String getFriend1() {
		return friend1;
	}

	public void setFriend1(String friend1) {
		this.friend1 = friend1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String[] getFriends() {
		return friends;
	}

	public void setFriends(String[] friends) {
		this.friends = friends;
	}

}
