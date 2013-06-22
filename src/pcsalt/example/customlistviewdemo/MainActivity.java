package pcsalt.example.customlistviewdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lvDetail;
	Context context = MainActivity.this;
	ArrayList<ListData> myList = new ArrayList<ListData>();
	
	String[] title = new String[] {
			"Title 1", "Title 2", "Title 3", "Title 4",
			"Title 5", "Title 6", "Title 7", "Title 8"
	};
	String[] desc  = new String[] {
			"Desc 1", "Desc 2", "Desc 3", "Desc 4",
			"Desc 5", "Desc 6", "Desc 7", "Desc 8"
	};
	int[]    img   = new int[]	  {
			R.drawable.star1, R.drawable.star2, R.drawable.star3, R.drawable.star4,
			R.drawable.star5, R.drawable.star6, R.drawable.star7, R.drawable.star8
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lvDetail = (ListView) findViewById(R.id.lvCustomList);
		// insert data into the list before setting the adapter
		// otherwise it will generate NullPointerException  - Obviously
		getDataInList();
		lvDetail.setAdapter(new MyBaseAdapter(context, myList));
	}
	
	private void getDataInList() {
		for(int i=0;i<8;i++) {
			// Create a new object for each list item
			ListData ld = new ListData();
			ld.setTitle(title[i]);
			ld.setDescription(desc[i]);
			ld.setImgResId(img[i]);
			// Add this object into the ArrayList myList
			myList.add(ld);
		}
	}

}
