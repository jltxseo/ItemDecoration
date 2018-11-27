package com.sjl.itemdecoration.decoration.group;

/**
 * GroupBean
 *
 * @author 沈建林
 * @date 2018/11/27
 */
public class GroupBean {
    private int groupId;
    private int index;
    private int top;

    public GroupBean() {
    }

    public GroupBean(int groupId, int index, int top) {
        this.groupId = groupId;
        this.index = index;
        this.top = top;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public boolean isGroupHead() {
        return index == 0;
    }
}
