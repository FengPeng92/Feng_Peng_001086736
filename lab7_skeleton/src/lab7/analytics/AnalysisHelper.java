/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {
    //1: Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
        System.out.println("");
            
    }
    
    //2: Find the post with most liked comments.
    public void getMostLikedCommentsPost() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> preResultMap = new HashMap<Integer, Integer>();
        int mostLikes = 0;
        for (Post post : posts.values()) {
            int totalLikesForPost = 0;
            List<Comment> comments = post.getComments();
            for (Comment comment : comments) {
                totalLikesForPost += comment.getLikes();
            }
            preResultMap.put(post.getPostId(), totalLikesForPost);
            if (totalLikesForPost > mostLikes) {
                mostLikes = totalLikesForPost;
            }
        }
        System.out.println("Post/posts with most liked comments");
        Set<Integer> keys = preResultMap.keySet();
        Iterator<Integer> keyIterator = keys.iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            int value = preResultMap.get(key);
            if (value == mostLikes) {
                System.out.println("Post Id: " + key + ". Most liked comments: " + value);
            }

        }
        System.out.println("");
    }
    
    //3: Find the post with most comments.
    public void getPostWithMostComments() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        int maxComments = 0;
        for (Post p : postList) {
            if (p.getComments().size() > maxComments) {
                maxComments = p.getComments().size();
            }
        }
        System.out.println("Posts/Post with Most Comments");
        for (Post post : postList) {
            if (post.getComments().size() == maxComments) {
                System.out.println("Post ID " + post.getPostId() + ". Number of comments: " + post.getComments().size());
            }
        }
        System.out.println("");
    }
    
    //4: Top 5 inactive users based on total posts number.
    public void topFiveInactivePostsNumber() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        
        
        List<Integer> idList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        for (Post p: postList) {
            int i = idList.get(p.getUserId());
            idList.set(p.getUserId(), ++i);
        }
        List<Integer> idListStore = new ArrayList<>(idList);
        Collections.sort(idList);
        System.out.println("Top 5 inactive users based on total posts number: ");
        for (int i = 0; i < 5; i++) {
            int j = idList.get(i);
            System.out.println("user id: " + idListStore.indexOf(j) + ", total post number: " + j);
            idListStore.set(idListStore.indexOf(j), -1);
        }
        System.out.println("");
    }
    
    //5: Top 5 inactive users based on total comments they created.
    public void getFiveInactiveUserByComments() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override 
            public int compare(User u1, User u2) {
                return u1.getComments().size() - u2.getComments().size();
            }
        });
        System.out.println("Top 5 inactive users based on total comments they created: ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println("user id: " + userList.get(i).getId() + ", comments they created: " + userList.get(i).getComments().size());
        }
        System.out.println("");
    }
    
    
    public int overall(User u){
        LinkedHashSet<Integer> postIDset = new LinkedHashSet<>();
        List<Integer> postIDs = new ArrayList<>();
        int likescount = 0;
        for (Comment c : u.getComments()){
            likescount += c.getLikes();
            postIDs.add(c.getPostId());
        }
        postIDset.addAll(postIDs); 
        int postcount = postIDset.size();
        return postcount+likescount+u.getComments().size();
    } 
    
    //6: Top 5 inactive users overall (sum of comments, posts and likes)
    public void getFiveInactiveUserOverall(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override 
            public int compare(User u1, User u2) {
                return overall(u1) - overall(u2);
            }
        });
        System.out.println("Top 5 inactive user overall:  ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println("user id: " + userList.get(i).getId() + ", sum of comments, posts and likes: " + overall(userList.get(i)));
        }
        System.out.println("");
    }
    
    //7: Top 5 proactive users overall (sum of comments, posts and likes)
    public void getFiveProactiveUserOverall(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override 
            public int compare(User u1, User u2) {
                return overall(u2) - overall(u1);
            }
        });
        System.out.println("Top 5 proactive users overall:  ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println("user id: " + userList.get(i).getId() + ", sum of comments, posts and likes: " + overall(userList.get(i)));
        }
        System.out.println("");
    }
    
    
}
