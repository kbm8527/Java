package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class SampleController implements Initializable {

	@FXML private Button btnClear;
	@FXML private Button btnRegister;
	
	@FXML private TextField txtUid;
	@FXML private TextField txtName;
	@FXML private TextField txtHp;
	@FXML private TextField txtPos;
	@FXML private TextField txtDep;
	@FXML private DatePicker txtRegDate;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btnRegister.setOnAction(event->btnRegister());
		
		//초기화 버튼 이벤트 핸들러
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				txtUid.clear();
				txtName.clear();
				txtHp.clear();
				txtPos.clear();
				txtDep.clear();
				txtRegDate.getEditor().clear();
				
				
				System.out.println("초기화 버튼을 클릭했습니다.");
				
			}
		});
		
	}//initialize end
	public void btnRegister() {
		
	String uid = txtUid.getText();
	String name = txtName.getText();
	String hp = txtHp.getText();
	String pos = txtPos.getText();
	String dep = txtDep.getText();
	String regDate = txtRegDate.getEditor().getText();
		
		System.out.println("===================");
		System.out.println("아이디 : "+uid);
		System.out.println("이   름 : "+name);
		System.out.println("휴대폰 : "+hp);
		System.out.println("직   급 : "+pos);
		System.out.println("부   서 : "+dep);
		System.out.println("입사일 : "+regDate);
	
	
		System.out.println("직원등록 버튼 클릭했다.");
	}
	
}
