package com.example.priya.contactslist;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by Priya on 2/13/2016.
 */
public class ContactAdapter extends CursorAdapter {

    public static final String LOG_TAG = ContactAdapter.class.getSimpleName();

    public ContactAdapter
            (Context context, Cursor c, int flags) {
        super(context, c, flags);
    }


    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        View row = view;
        if (row != null) {
            TextView Name = (TextView) view.findViewById(R.id.name);
            TextView Number = (TextView) view.findViewById(R.id.number);


            int nameColumn = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
            int numberColumn = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);


            String CName = cursor.getString(nameColumn);
            String CNumber = cursor.getString(numberColumn);
            Name.setText(CName);
            Number.setText(CNumber);


            Log.d(LOG_TAG + " Contact:", CName);


        }
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.contact_item, parent, false);
        return view;
    }


       /* @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            ViewHolder holder = null;

            if (row == null) {
                LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
                row = inflater.inflate(layoutResourceId, parent, false);
                holder = new ViewHolder();
                holder.name = (TextView) row.findViewById(R.id.name);
                holder.number = (TextView) row.findViewById(R.id.number);
                row.setTag(holder);
            } else {
                holder = (ViewHolder) row.getTag();
            }

            Contacts item = mData.get(position);
            holder.name.setText(item.getName());
            holder.number.setText(item.getNumber());
            return row;
        }

    static class ViewHolder {
        TextView name;
        TextView number;

    }*/

}

