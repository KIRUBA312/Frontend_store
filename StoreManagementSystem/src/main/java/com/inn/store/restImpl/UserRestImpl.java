package com.inn.store.restImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.inn.store.constents.storeConstants;
import com.inn.store.rest.UserRest;
import com.inn.store.service.UserService;
import com.inn.store.utils.storeUtils;
import com.inn.store.wrapper.UserWrapper;

import java.util.ArrayList;




@RestController
public class UserRestImpl  implements UserRest{

	
	@Autowired
	UserService userService;
	
	@Override
	public ResponseEntity<String> signup(Map<String, String> requestMap) {
		
		
		try {
			return userService.signup(requestMap);
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return storeUtils.getResponseEntity(storeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> login(Map<String, String> requestMap) {
		try {
			return userService.login(requestMap);
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return storeUtils.getResponseEntity(storeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<List<UserWrapper>> getAllUser() {
		try {
			return userService.getAllUser();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return new ResponseEntity<List<UserWrapper>>(new ArrayList<>(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> update(Map<String, String> requestMap) {
		try {
			return userService.update(requestMap);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return  storeUtils.getResponseEntity(storeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	@Override
	public ResponseEntity<String> checkToken() {
		try {
			return userService.checkToken();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return  storeUtils.getResponseEntity(storeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> changePassword(Map<String, String> requestMap) {
		try {
			return userService.changePassword(requestMap);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return  storeUtils.getResponseEntity(storeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	@Override
	public ResponseEntity<String> forgotPassword(Map<String, String> requestMap) {
		try {
			return userService.forgotPassword(requestMap);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return  storeUtils.getResponseEntity(storeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}

}
