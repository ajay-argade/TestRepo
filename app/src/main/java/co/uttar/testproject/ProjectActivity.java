package co.uttar.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProjectActivity extends AppCompatActivity{

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<ProjectDetils> projectDetilsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        projectDetilsList = new ArrayList<>();

        projectDetilsList.add( new ProjectDetils("Student Database","Ajay Argade","yogeshD","B+","2018-19","15 days"));
        projectDetilsList.add( new ProjectDetils("Photoshop system","yogesh","shiv","B+","2018-19","20days"));
        projectDetilsList.add( new ProjectDetils("RTO system","yogesh","sujit","B+","2018-19","30days"));
        projectDetilsList.add( new ProjectDetils("Uttar","yogesh","nitin","B+","2018-19","2month"));
        projectDetilsList.add( new ProjectDetils("Library system","yogesh","sumit","G+","2018-19","23days"));
        projectDetilsList.add( new ProjectDetils("Facebook","yogesh","dongre","C+","2018-19","1 month"));

        mAdapter = new ProgrammingAdapter(this, projectDetilsList);
        recyclerView.setAdapter(mAdapter);

    }
}
