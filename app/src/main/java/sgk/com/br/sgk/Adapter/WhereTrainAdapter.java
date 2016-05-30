package sgk.com.br.sgk.Adapter;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import sgk.com.br.sgk.List.InstructorsList;
import sgk.com.br.sgk.List.WhereTrainList;
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 29/05/2016.
 */
public class WhereTrainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<WhereTrainList> mDataSet;
    private Activity mActivity;

    public WhereTrainAdapter(List<WhereTrainList> location, Activity act) {
        this.mDataSet = location;
        this.mActivity = act;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.location_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;

        viewHolder.location_gym.setText(this.mDataSet.get(position).getLocation_gym());
        viewHolder.location_public.setText(this.mDataSet.get(position).getLocation_public());
        viewHolder.location_image.setImageResource(this.mDataSet.get(position).getLocation_image());
        viewHolder.location_dojo.setText(this.mDataSet.get(position).getLocation_dojo());
        viewHolder.location_address.setText(this.mDataSet.get(position).getLocation_address());
        viewHolder.location_time.setText(this.mDataSet.get(position).getLocation_time());
        viewHolder.mCardView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView location_image;
        private TextView location_gym;
        private TextView location_public;
        private TextView location_dojo;
        private TextView location_address;
        private TextView location_time;
        public View mView;
        public CardView mCardView;


        public ViewHolder(View v) {
            super(v);
            this.location_image = (ImageView) v.findViewById(R.id.location_image);
            this.location_gym = (TextView) v.findViewById(R.id.location_gym);
            this.location_public = (TextView) v.findViewById(R.id.location_public);
            this.location_dojo = (TextView) v.findViewById(R.id.location_dojo);
            this.location_address = (TextView) v.findViewById(R.id.location_address);
            this.location_time = (TextView) v.findViewById(R.id.location_time);

            mView = v;
            mCardView = (CardView) v.findViewById(R.id.location_card_view);
        }
    }

}

