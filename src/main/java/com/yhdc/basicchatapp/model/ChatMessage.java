package com.yhdc.basicchatapp.model;

import com.yhdc.basicchatapp.model.type.MessageType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

	private String content;
	private String sender;
	private MessageType type;

}
