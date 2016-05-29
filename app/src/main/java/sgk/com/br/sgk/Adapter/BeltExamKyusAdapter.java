package sgk.com.br.sgk.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import sgk.com.br.sgk.List.BeltExamKyus;
import sgk.com.br.sgk.R;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class BeltExamKyusAdapter  extends RecyclerView.Adapter<BeltExamKyusAdapter.MyViewHolder> {

    private List<BeltExamKyus> kyusList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView kyu;
        public View mView;


        public MyViewHolder(View view) {
            super(view);
            mView = view;
            kyu = (TextView) view.findViewById(R.id.kyu);

        }
    }

    public BeltExamKyusAdapter(List<BeltExamKyus> kyusList) {
        this.kyusList = kyusList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.kyu_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BeltExamKyus kyu = kyusList.get(position);
        holder.kyu.setText(kyu.getKyus());
        holder.kyu.setTag(position);

    }

    @Override
    public int getItemCount() {
        return kyusList.size();
    }
}
