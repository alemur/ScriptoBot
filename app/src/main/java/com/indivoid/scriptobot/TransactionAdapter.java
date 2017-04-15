package com.indivoid.scriptobot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by INETOID on 16.03.2017.
 */

public class TransactionAdapter extends ArrayAdapter<Transactions> {
        List<Transactions> transactions;

    public TransactionAdapter(Context context, List<Transactions> transactions) {
        super(context, 0, transactions);
        this.transactions = transactions;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Transactions transaction = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView date = (TextView) convertView.findViewById(R.id.date);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView sum = (TextView) convertView.findViewById(R.id.sum);

        date.setText(transaction.date);
        title.setText(transaction.title);
        sum.setText(transaction.sum);

        return convertView;
    }


}
