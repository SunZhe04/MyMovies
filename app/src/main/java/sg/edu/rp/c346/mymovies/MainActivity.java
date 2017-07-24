package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //step 4A
    ListView lvMovies;
    ArrayList<movie> alMoview;
    CustomerAdapter caMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 4B
        lvMovies = (ListView)findViewById(R.id.listViewMovie);
        alMoview = new ArrayList<movie>();

        caMovies = new CustomerAdapter(this,R.layout.movie_row,alMoview);
        lvMovies.setAdapter(caMovies);

        //step 4C
        movie m1 = new movie("The Avengers","2012","pq","Action | Sci-Fi",c2,"Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentDetail = new Intent(getBaseContext(),MovieDetailActivity.class);

                movie currentItem = alMoview.get(position);
                intentDetail.putExtra("title",currentItem.getTitle());
                intentDetail.putExtra("year",currentItem.getYear());
                intentDetail.putExtra("genre",currentItem.getGenre());
                intentDetail.putExtra("desc",currentItem.getDescription());
                intentDetail.putExtra("rated",currentItem.getRated());
                intentDetail.putExtra("watchDate",currentItem.getWatched_on());
                intentDetail.putExtra("theatre",currentItem.getIn_theartre());

                startActivity(intentDetail);

            }
        });
    }
}
