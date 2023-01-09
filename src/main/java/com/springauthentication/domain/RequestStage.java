 package com.springauthentication.domain;

import java.util.Date;

import com.springauthentication.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class RequestStage {
	private long id;
	private String description;
	private Date realizationDate;
	private RequestState state;
	private Request request;
	private User user;
	
}
