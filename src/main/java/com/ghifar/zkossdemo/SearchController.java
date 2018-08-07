package com.ghifar.zkossdemo;

import com.ghifar.zkossdemo.Domain.User;
import com.ghifar.zkossdemo.Domain.UserService;
import com.ghifar.zkossdemo.Domain.UserServiceImpl;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

import java.util.List;

public class SearchController extends SelectorComposer<Component> {
    private static final long serialVersionUID = 1L;

    @Wire
    private Textbox searchBox;

    @Wire
    private Listbox userListbox;

    @Wire
    private Label idLabel;

    @Wire
    private Label usernameLabel;

    @Wire
    private Label genderLabel;

    @Wire
    private Image previewImage;



    private UserService userService = new UserServiceImpl();


    @Listen("onClick = #searchButton")
    public void search(){
        System.out.println(">> search button clicked");
        String keyword= searchBox.getValue();
        System.out.println(keyword);
        List<User> result= userService.search(keyword);
        System.out.println(result);
        userListbox.setVisible(true);
        userListbox.setModel(new ListModelList(result));
    }

    @Listen("onSelect = #userListbox")
    public void showDetail(){
        User selection = userListbox.getSelectedItem().getValue();

        previewImage.setSrc(selection.getPreview());
        idLabel.setValue(selection.getId().toString());
        usernameLabel.setValue(selection.getUsername());
        genderLabel.setValue(selection.getGender());


    }

}
