package fr.smileandpay.shop.merchant.endpoint;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MerchantEndPoint {

	private static final String GET_TARGET_NAMESPACE = "http://com/javaguys/webservices/getUserServices";
	private static final String SAVE_TARGET_NAMESPACE = "http://com/javaguys/webservices/saveUserServices";
/*
	@Autowired
	private UserService userService;


	@PayloadRoot(localPart = "SaveMerchant", namespace = SAVE_TARGET_NAMESPACE)
	public @ResponsePayload
	SaveUserResponse saveUserDetails(@RequestPayload SaveUserRequest request) {
		System.out.println("Save User !");
		SaveUserResponse response = new SaveUserResponse();
		response.setUserId(userService.saveUserDetails(request.getUserDetails()));
		return response;
	}

	@PayloadRoot(localPart = "SaveMerchant", namespace = SAVE_TARGET_NAMESPACE)
	public @ResponsePayload
	SaveUserResponse saveUserDetails(@RequestPayload SaveUserRequest request) {
		System.out.println("Save User !");
		SaveUserResponse response = new SaveUserResponse();
		response.setUserId(userService.saveUserDetails(request.getUserDetails()));
		return response;
	}

	@PayloadRoot(localPart = "SaveMerchant", namespace = SAVE_TARGET_NAMESPACE)
	public @ResponsePayload
	SaveUserResponse saveUserDetails(@RequestPayload SaveUserRequest request) {
		System.out.println("Save User !");
		SaveUserResponse response = new SaveUserResponse();
		response.setUserId(userService.saveUserDetails(request.getUserDetails()));
		return response;
	}*/

}
