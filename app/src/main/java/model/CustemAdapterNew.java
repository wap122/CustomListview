package model;

import android.content.Context;
import android.widget.BaseAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.minhl.customlistview.R;

import java.util.ArrayList;

/**
 * Created by minhl on 19/06/2017.
 */

public class CustemAdapterNew extends BaseAdapter {
    private Context context;
    private ArrayList<Contact> arrContact;

    public CustemAdapterNew(Context context, ArrayList<Contact> arrContact) {
        super();
        this.context = context;
        this.arrContact = arrContact;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return arrContact.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_contact_layout, null);
            viewHolder = new ViewHolder();
            viewHolder.tvColor = (TextView) convertView.findViewById(R.id.tv_color);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tvNumber = (TextView) convertView.findViewById(R.id.tv_number);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Contact contact = arrContact.get(position);
        viewHolder.tvColor.setBackgroundColor(contact.getmColor());
        viewHolder.tvColor.setText(String.valueOf(position + 1));
        viewHolder.tvNumber.setText(contact.getmNumber());
        viewHolder.tvName.setText(contact.getmName());
        return convertView;
    }

    public class ViewHolder {
        TextView tvName;
        TextView tvColor;
        TextView tvNumber;
    }
}
