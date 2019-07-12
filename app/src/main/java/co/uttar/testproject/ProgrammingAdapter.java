package co.uttar.testproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import co.uttar.testproject.ProjectDetils;
import co.uttar.testproject.R;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.programmingViewHolder> {


    private Context context;
    private List<ProjectDetils> projectDetils;

    public ProgrammingAdapter(Context context, List projectDetils){

        this.context = context;
        this.projectDetils = projectDetils;

    }

    @Override
    public programmingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater  inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new programmingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(programmingViewHolder holder, int position) {

        ProjectDetils projData = projectDetils.get(position);
        holder.tvTitle.setText(projData.getProjTitle());
        holder.tvP1.setText(projData.getProjPartner1());
        holder.tvP2.setText(projData.getProjPartner2());
        holder.tvGrade.setText(projData.getGrade());
        holder.tvYear.setText(projData.getYear());
        holder.tvTime.setText(projData.getTime());
    }

    @Override
    public int getItemCount() {
        return projectDetils.size();
    }

    public class programmingViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvP1;
        TextView tvP2;
        TextView tvGrade;
        TextView tvYear;
        TextView tvTime;

        public programmingViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvP1 = (TextView)itemView.findViewById(R.id.tvP1);
            tvP2 = (TextView)itemView.findViewById(R.id.tvP2);
            tvGrade = (TextView)itemView.findViewById(R.id.tvGrade);
            tvYear = (TextView)itemView.findViewById(R.id.tvYear);
            tvTime =(TextView)itemView.findViewById(R.id.tvTime);

        }
    }
}
