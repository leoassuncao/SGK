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
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class InstructorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<InstructorsList> mDataSet;
    private Activity mActivity;

    public InstructorAdapter(List<InstructorsList> instructors, Activity act) {
        this.mDataSet = instructors;
        this.mActivity = act;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.instructors_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;

        viewHolder.instructor_name.setText(this.mDataSet.get(position).getInstructor_name());
        viewHolder.instructor_graduation.setText(this.mDataSet.get(position).getInstructor_graduation());
        viewHolder.instructor_photo.setImageResource(this.mDataSet.get(position).getInstructor_photo());
        viewHolder.instructor_train.setText(this.mDataSet.get(position).getInstructor_train());
        viewHolder.instructor_classes.setText(this.mDataSet.get(position).getInstructor_classes());
        viewHolder.instructor_contact.setText(this.mDataSet.get(position).getInstructor_contact());
        viewHolder.mCardView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView instructor_photo;
        private TextView instructor_name;
        private TextView instructor_graduation;
        private TextView instructor_train;
        private TextView instructor_classes;
        private TextView instructor_contact;
        public View mView;
        public CardView mCardView;


        public ViewHolder(View v) {
            super(v);
            this.instructor_photo = (ImageView) v.findViewById(R.id.instructor_photo);
            this.instructor_name = (TextView) v.findViewById(R.id.instructor_name);
            this.instructor_graduation = (TextView) v.findViewById(R.id.instructor_graduation);
            this.instructor_train = (TextView) v.findViewById(R.id.instructor_train);
            this.instructor_classes = (TextView) v.findViewById(R.id.instructor_classes);
            this.instructor_contact = (TextView) v.findViewById(R.id.instructor_contact);

            mView = v;
            mCardView = (CardView) v.findViewById(R.id.instructor_card_view);
        }
    }

}

