package com.apps.rvinrv.model;

import java.util.List;

public class ModelItem {
    private String itemTitle;
    private List<SubModelItem> subItemList;

    public ModelItem(String itemTitle, List<SubModelItem> subItemList) {
        this.itemTitle = itemTitle;
        this.subItemList = subItemList;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public List<SubModelItem> getSubItemList() {
        return subItemList;
    }

    public void setSubItemList(List<SubModelItem> subItemList) {
        this.subItemList = subItemList;
    }
}
