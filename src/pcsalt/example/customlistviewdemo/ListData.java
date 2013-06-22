package pcsalt.example.customlistviewdemo;

/*
 * ListData class will hold data for displaying in ListView
 * */
public class ListData {

	String Description;
	String title;
	int imgResId;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImgResId() {
		return imgResId;
	}

	public void setImgResId(int imgResId) {
		this.imgResId = imgResId;
	}

}
