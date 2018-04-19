package com.esp.fastscrollstickyheaderrecyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>
        implements SectionIndexer, StickyRecyclerHeadersAdapter<ContactAdapter.HeaderViewHolder> {

    private Context context;
    private List<Contact> contactList;
    private List<Integer> sectionPositions;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.contactName.setText(contact.getName());
    }

    @Override
    public long getHeaderId(int position) {
        return contactList.get(position).getName().charAt(0);
    }

    @Override
    public HeaderViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.header, parent, false);
        return new HeaderViewHolder(view);
    }

    @Override
    public void onBindHeaderViewHolder(HeaderViewHolder holder, int position) {
        char c = contactList.get(position).getName().charAt(0);
        holder.header.setText(String.valueOf(c));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public String[] getSections() {
        List<String> sections = new ArrayList<>();
        sectionPositions = new ArrayList<>();
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            String section = String.valueOf(contact.getName().charAt(0)).toUpperCase();
            if (!sections.contains(section)) {
                sections.add(section);
                sectionPositions.add(i);
            }
        }
        return sections.toArray(new String[0]);
    }

    @Override
    public int getPositionForSection(int i) {
        return sectionPositions.get(i);
    }

    @Override
    public int getSectionForPosition(int i) {
        return 0;
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {

        TextView header;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            header = itemView.findViewById(R.id.header_name);
        }
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {

        TextView contactName;

        public ContactViewHolder(View itemView) {
            super(itemView);
            contactName = itemView.findViewById(R.id.contact_name);
        }
    }
}
