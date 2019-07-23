package com.example.loadmap4d;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

//hjshgsdnbrdtnjrstj

public class ListAdapter extends ArrayAdapter<Busstop> {
    public ListAdapter(Context context, int resource) {
        super(context, resource);
    }

    public ListAdapter( Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ListAdapter( Context context, int resource, Busstop[] objects) {
        super(context, resource, objects);
    }

    public ListAdapter( Context context, int resource, int textViewResourceId, Busstop[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ListAdapter( Context context, int resource, List<Busstop> objects) {
        super(context, resource, objects);
    }

    public ListAdapter( Context context, int resource, int textViewResourceId, List<Busstop> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
