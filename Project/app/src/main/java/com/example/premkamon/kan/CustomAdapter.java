package com.example.premkamon.kan;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomAdapter extends BaseAdapter {

    private ViewHolder mViewHolder;

    private static class ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView author;
        TextView date;
    }

    // สร้าง Constructor constructor รับ parameter 2 ค่าครับ คือ Activity และ List<Post>
    private LayoutInflater mInflater;
    private List<Post> mPosts;
    private ViewHolder mViewHolder;

    private Bitmap mBitmap;
    private Post mPost;

    public CustomAdapter(Activity activity, List<Post> posts) {
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        mPosts = posts;
    }

    @Override
    public int getCount() {
        return mPosts.size();
    }

    @Override
    public Object getItem(int position) {
        return mPosts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // View ที่เป็น Default จากไฟล์ xml
        Post post = mPosts.get(position);

        mViewHolder.author.setText(post.getAuthor());
        mViewHolder.title.setText(post.title);
        mViewHolder.date.setText(post.date);

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.post, parent, false);
            mViewHolder = new ViewHolder();
            mViewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.post_thumbnail);
            mViewHolder.author = (TextView) convertView.findViewById(R.id.post_author);
            mViewHolder.title = (TextView) convertView.findViewById(R.id.post_title);
            mViewHolder.date = (TextView) convertView.findViewById(R.id.post_date);

            convertView.setTag(mViewHolder);

        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mPost = mPosts.get(position);

        if (mPost.getThumbnail() != null) {

            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... params) {
                    try {
                        URL url = new URL(mPost.getThumbnail());
                        mBitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());

                    } catch (MalformedURLException e) {

                    } catch (IOException e) {

                    }
                    return null;
                }
            }.execute();

            mViewHolder.thumbnail.setImageBitmap(mBitmap);
        }

        mViewHolder.author.setText(mPost.getAuthor());
        mViewHolder.title.setText(mPost.title);
        mViewHolder.date.setText(mPost.date);

        return convertView;
    }
}
