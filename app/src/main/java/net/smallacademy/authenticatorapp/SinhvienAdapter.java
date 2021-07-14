package net.smallacademy.authenticatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SinhvienAdapter extends BaseAdapter {
private Context context;
private int layout;
List<Sinhvien> sinhvienList;

    public SinhvienAdapter(Context context, int layout, List<Sinhvien> sinhvienList) {
        this.context = context;
        this.layout = layout;
        this.sinhvienList = sinhvienList;
    }

    @Override
    public int getCount() {
        return sinhvienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen,txtMasv;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.txtTen  =(TextView) view.findViewById(R.id.textViewTen);
            holder.txtMasv =(TextView) view.findViewById(R.id.textViewMasv);
            holder.imgHinh =(ImageView) view.findViewById(R.id.imageViewHinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();

        }


        Sinhvien sinhvien= sinhvienList.get(i);
        holder.txtTen.setText(sinhvien.getTen());
        holder.txtMasv.setText(sinhvien.getMasv());
        holder.imgHinh.setImageResource(sinhvien.getHinh());

        return view;

    }

}
