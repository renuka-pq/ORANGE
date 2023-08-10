package com.orangehrm.genericUtility;

public enum KeysPropertyFile {
    Browser("browser"),Username("username"),Password("password"),Url("url"),Timeout("timeout"),Limit("limit");
    private String Keys;
    //setter
    KeysPropertyFile(String keys)
    {
        this.Keys=keys;
        
    }
    public String convertToString()
    {
        return Keys.toString();
        
    }
    

}
