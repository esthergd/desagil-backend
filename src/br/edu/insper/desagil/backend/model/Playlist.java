package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Playlist{
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id, Map<String, Integer> ratings) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = ratings;
	}
	
	public int getId() {
		return this.id;
	}
	
	public List<Track> getTracks(){
		return this.tracks;
	}
	
	public Map<String, Integer> getRatings(){
		return this.ratings;
	}
	
	public void addTrack(Track track) { // talvez esse Track faixa esteja errado
		this.tracks.add(track);
	}
	
	public void putRating(String nome, int avaliacao) {
		this.ratings.put(nome, avaliacao);
	}
	
	public double averageRatings() {
		double soma = 0;
		for(String nota : this.ratings.keySet()) {
			soma += this.ratings.get(nota);
		}
		double media = soma / this.ratings.size();
		int i = (int) media;
		double d = media - i;
		if (d < 0.26) {
			d = 0;
		}
		else if (d >= 0.26 && d < 0.74) {
			d = 0.5;
		}
		else if (d >= 0.74) {
			d = 1.0;
		}
		return (i+d);
	}
	
	
}