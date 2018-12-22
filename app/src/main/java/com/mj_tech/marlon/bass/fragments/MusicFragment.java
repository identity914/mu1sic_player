package com.mj_tech.marlon.bass.fragments;


import android.app.Fragment;
import android.widget.AdapterView.OnItemClickListener;

import java.util.List;


public abstract class  MusicFragment extends Fragment implements OnItemClickListener{
    public String fragmentTag;
    public abstract  void setList(List items);


}
