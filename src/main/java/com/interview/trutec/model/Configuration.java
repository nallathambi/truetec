package com.interview.trutec.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Configuration {
	
	public String username;
	public String password;
	public String applicationName;
	public String version;
	
	public String getusername() {
        return username;
    }
    public void setusername(String username) {
        this.username = username;
    }
    
    public void setpassword(String password) {
        this.password = password;
    }
    
    public void setapplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    public void setversion(String version) {
        this.version = version;
    }

}
