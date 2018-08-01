package edu.uc.likeconnectionsapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import edu.uc.likeconnectionsapplication.dto.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context c;
    private List<User> users;

    public UserAdapter(Context c, List<User> users) {
        this.c = c;
        this.users = users;
    }

    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UserAdapter.UserViewHolder holder, int position) {
        holder.bindUser(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView userIconView;
        TextView userNameView;

        private Context c;

        public UserViewHolder(View itemView) {
            super(itemView);

            userIconView = itemView.findViewById(R.id.userIconView);
            userNameView = itemView.findViewById(R.id.userNameView);

            c = itemView.getContext();
        }

        public void bindUser(User user) {
            userNameView.setText(user.getUserName());

            //later add most relevant interests into the adapter
        }
    }

}
