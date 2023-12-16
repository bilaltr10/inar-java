package week_14.Q_20;

public class Q_20 {
    public static void main(String[] args) throws Exception {
//        Post post = null;
//        Post post1 = null;
        try {
          Post  post = new Post("Post1");
          Post  post1 = new Post("Post1");


            post.addTag("me");
            post.addTag("summer");
            post.addTag("nature");
            post.addTag("summer");
            post1.addTag("Winter");
            post1.addTag("Snow");
            post1.addTag("winter");


            System.out.println("Tags for " + post.getPostID() + "  : " + post);
            System.out.println("Tags for " + post1.getPostID() + "  : " + post);
            System.out.println("Does " + post.getPostID() + " have the tag 'me ' :  " + post.isTagExist("me"));
            System.out.println("Does " + post1.getPostID() + " have the tag 'me ' :  " + post.isTagExist("me"));
            post1.removingTag("Snow");
            System.out.println("Tags for post1 :  " + post1);
        } catch (Exception ex) {
            System.out.println("Same post name -->" +ex.getMessage());
        }
    }
}
