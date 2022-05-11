package models.dto;

public class VideoDto {
	
	 private String title;
	 private String director;
	 private int cli_id;
	 
	public VideoDto(String title, String director, int cli_id) {
		super();
		this.title = title;
		this.director = director;
		this.cli_id = cli_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCli_id() {
		return cli_id;
	}

	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}

	@Override
	public String toString() {
		return "VideoDto [title=" + title + ", director=" + director + ", cli_id=" + cli_id + "]";
	}
	
	
	
	 
	 

}
