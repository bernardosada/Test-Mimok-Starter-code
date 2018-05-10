package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<Word> {
    private TextView mimokTextView;
    private TextView defaultTextView;

    public wordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,
                    parent,
                    false
            );
        }

        mimokTextView = (TextView) listItemView.findViewById(R.id.mimok_text_view);
        defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        mimokTextView.setText(currentWord.getmMimokTranslation());
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        return listItemView;
    }

    // This is my test code


}




