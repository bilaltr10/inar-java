package week_14.Q_20;

import java.util.*;

public class Post {
    private Set<String> tags;
    private String postID;
    static ArrayList<String> storePostIDs = new ArrayList<>();




    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
    }

    public Set<String> getTags() {
        return tags;
    }

    public Post(String postID) throws Exception {
        tags = new HashSet<>();
        if (!storePostIDs.contains(postID)) {
          this.postID = postID;
            storePostIDs.add(postID);
        } else {
          throw new Exception("There is a post in "+ postID+ " title");
        }
    }


    public void addTag(String tagName) {
        if (!isContains(tagName))
            tags.add(tagName);
    }

    public void removingTag(String tagName) {
        if (isTagExist(tagName)) tags.remove(tagName);
    }

    public boolean isTagExist(String tagName) {

        return tags.contains(tagName);
    }

    public String toString() {
        return tags.toString();
    }

    public boolean isContains(String tagName) {
        String[] array = tags.toArray(new String[0]);

        for (String s : array) {
            if (s.equalsIgnoreCase(tagName)) return true;
        }
        return false;
    }
}
