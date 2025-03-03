package com.beans.lombok;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@NoArgsConstructor 
public class LombokBeanB {

	private @NonNull int  value;
	private @NonNull boolean flag;
	private @NonNull String  word;
	
}
