/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discussionthread.model;

/**
 *
 * @author Meghan
 */
public class Posts {

    private String post;

    public Posts(String post) {
        this.setPost(post);
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
    @Override
    public String toString() {
        return post;
    }
}
