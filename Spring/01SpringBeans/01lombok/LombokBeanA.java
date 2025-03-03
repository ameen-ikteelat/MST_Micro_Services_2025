package com.beans.lombok;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter @Setter 
@NoArgsConstructor @RequiredArgsConstructor
@ToString() 
@EqualsAndHashCode(of={"value","flag"}) 
public class LombokBeanA {

	private @NonNull int  value;
	private @NonNull boolean flag;
	private String  word;
	
}
