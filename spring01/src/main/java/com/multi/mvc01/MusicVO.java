package com.multi.mvc01;

public class MusicVO {
		private String id;
		private String name;
		private String singer;
		private String genre;
		private String album;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		@Override
		public String toString() {
			return "MusicVO [id=" + id + ", name=" + name + ", singer=" + singer + ", genre=" + genre + ", album="
					+ album + "]";
		}
		
		
}
