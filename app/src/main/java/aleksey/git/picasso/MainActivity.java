package aleksey.git.picasso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static aleksey.git.picasso.Data.getCats;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCats;
    private CatAdapter catAdapter = new CatAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCats = findViewById(R.id.recyclerView);
        catAdapter.setCats(Data.getCats());
        recyclerViewCats.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerViewCats.setAdapter(catAdapter);
    }
}