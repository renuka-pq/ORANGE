package com.orangehrm.genericUtility;

public enum SheetName {
    SheetName("CustomerDetails");
    private String Keys;
    private SheetName(String keys) {
        this.Keys=keys;
        
    }
    public String conveString()
    {
        return Keys.toString();
    }
    

}