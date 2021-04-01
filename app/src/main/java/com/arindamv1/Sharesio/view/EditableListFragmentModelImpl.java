package com.arindamv1.Sharesio.view;

import com.arindamv1.Sharesio.fragment.EditableListFragment;
import com.arindamv1.Sharesio.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
