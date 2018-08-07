package com.ghifar.zkossdemo;

import com.ghifar.zkossdemo.Domain.User;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;

import java.util.logging.Logger;

public class registrationController extends SelectorComposer<Component> {

    @Wire
    private Button submitButton;

    @Wire
    private Checkbox checkTermBox;
//   makes sure variable name you gave at id attribute .zul file same as you declare it in here.

//    using 3rd party libs
    private static Logger logger= Logger.getLogger(registrationController.class.getName());

    private User newUser= new User();



    @Listen("onCheck = #checkTermBox")
    public void changeSubmitStatus(){
        if(checkTermBox.isChecked()){
            submitButton.setDisabled(false);
        }else{
            submitButton.setDisabled(true);
        }
    }

    @Listen("onClick = #submitButton")
    public void submitButtonPressed(){

        logger.info("Log4j >> submit terklick!");
        System.out.println("Submit Terklick!!");

    }




}
