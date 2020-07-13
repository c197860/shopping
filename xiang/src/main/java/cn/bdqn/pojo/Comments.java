package cn.bdqn.pojo;

public class Comments {
    private Integer commentsId;

    private String commentsCont;

    private String commentsPath;

    private String commentsShopid;

    private String comentsHead;

    public Integer getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(Integer commentsId) {
        this.commentsId = commentsId;
    }

    public String getCommentsCont() {
        return commentsCont;
    }

    public void setCommentsCont(String commentsCont) {
        this.commentsCont = commentsCont == null ? null : commentsCont.trim();
    }

    public String getCommentsPath() {
        return commentsPath;
    }

    public void setCommentsPath(String commentsPath) {
        this.commentsPath = commentsPath == null ? null : commentsPath.trim();
    }

    public String getCommentsShopid() {
        return commentsShopid;
    }

    public void setCommentsShopid(String commentsShopid) {
        this.commentsShopid = commentsShopid == null ? null : commentsShopid.trim();
    }

    public String getComentsHead() {
        return comentsHead;
    }

    public void setComentsHead(String comentsHead) {
        this.comentsHead = comentsHead == null ? null : comentsHead.trim();
    }
}