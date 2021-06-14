package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;
	
	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	public String getFullArtistName() {
		String fullName = "";
		fullName = getArtist() + "(feat." + String.join(",", this.collaborators) + ")";
		return fullName;
	}
}