package masran.myapplication.RecyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import masran.myapplication.R;

public class HospitalListAdapter extends RecyclerView.Adapter<HospitalListAdapter.Holder>{

    private ArrayList<String> hospitalList;

    public HospitalListAdapter(ArrayList<String> hospitalList){
       this.hospitalList = hospitalList;
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView textHospitalName;
        public View viewBackground;
        public View viewForeground;

        public Holder(View itemView) {
            super(itemView);
            textHospitalName = itemView.findViewById(R.id.text_hospital);
            viewBackground = itemView.findViewById(R.id.list_background);
            viewForeground = itemView.findViewById(R.id.list_foreground);
        }

        public void bindItem(int position){
            textHospitalName.setText(hospitalList.get(position));
        }

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contact_item,parent,false);
        return new Holder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bindItem(position);
    }

    @Override
    public int getItemCount() {
        return hospitalList.size();
    }


}
