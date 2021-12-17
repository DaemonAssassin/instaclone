package com.gmail.mateendev3.instaclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private final List<Item> items;

    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.insta_custom_row, parent, false);
        return new ItemViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.getIvPostedUserProfileImg().setImageResource(item.getPostedUserProfileImgResId());
        holder.getTvPostedUserName().setText(item.getPostedUserName());
        holder.getIvUserUploadedPhoto().setImageResource(item.getUserUploadedPhotoImgResId());
        holder.getTvUserNameForText().setText(item.getPostedUserName());
        holder.getTvUserText().setText(item.getPostedUserText());
        holder.getIvWatchingUserPhoto().setImageResource(item.getWatchingUserProfileImgResId());
        holder.getTvPostedAgo().setText(item.getPostPostedAgo());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private final ImageView ivPostedUserProfileImg;
        private final TextView tvPostedUserName;
        private final ImageView ivUserUploadedPhoto;
        private final TextView tvUserNameForText;
        private final TextView tvUserText;
        private final ImageView ivWatchingUserPhoto;
        private final TextView tvPostedAgo;

        public ItemViewHolder(@NonNull View rootView) {
            super(rootView);

            ivPostedUserProfileImg = rootView.findViewById(R.id.iv_posted_user_profile_picture);
            tvPostedUserName = rootView.findViewById(R.id.tv_posted_user_name);
            ivUserUploadedPhoto = rootView.findViewById(R.id.iv_user_uploaded_photo);
            tvUserNameForText = rootView.findViewById(R.id.tv_user_name_for_text);
            tvUserText = rootView.findViewById(R.id.tv_user_text);
            ivWatchingUserPhoto = rootView.findViewById(R.id.iv_watching_user_photo);
            tvPostedAgo = rootView.findViewById(R.id.tv_posted_ago);
        }

        public ImageView getIvPostedUserProfileImg() {
            return ivPostedUserProfileImg;
        }

        public TextView getTvPostedUserName() {
            return tvPostedUserName;
        }

        public ImageView getIvUserUploadedPhoto() {
            return ivUserUploadedPhoto;
        }

        public TextView getTvUserNameForText() {
            return tvUserNameForText;
        }

        public TextView getTvUserText() {
            return tvUserText;
        }

        public ImageView getIvWatchingUserPhoto() {
            return ivWatchingUserPhoto;
        }

        public TextView getTvPostedAgo() {
            return tvPostedAgo;
        }
    }
}
