package util;

public class ObjectRepository {

    //Screen Name : Login

    public static final String Login_TextUserName_Xpath = "//input[@id='id1']";
    public static final String Login_TextPassword_Xpath = "//input[@id='id2']";
    public static final String Login_Button_Xpath = "//span[@class='login-form-submit-label']";

    //Screen Name : Home

    public static final String Home_Xpath = "//span[text()='Home']";
    public static final String Iframe_Xpath = "//brna-client-app[@class='ng-tns-c8-3 ng-star-inserted']//iframe";
    public static final String Content_Xpath = "//span[contains(text(),'To the content')]";
    public static final String Content_Page_Header_Xpath = "//span[(text()='Content')]";
    public static final String Expand_Folder_Button_Xpath = "//span[text()='Hippo Go Folder']/ancestor::div[@class='a_']/a[2]/span[2]";
    public static final String Expand_Folder_About_Xpath = "//span[contains(text(),'About')]";
    public static final String Expand_Folder_About_DownArrow_Xpath = "//span[text()='Hippo Go Folder']/ancestor::div[@class='a_']/following-sibling::a";
    public static final String Add_New_Document_Xpath = "//span[contains(text(),'Add new document...')]";

    //Screen Name : New Document

    public static final String New_Document_Header_Xpath = "//span[@class='w_captionText']";
    public static final String New_Document_Name_Xpath = "//input[@name='name-url:name']";
    public static final String New_Document_Select_Xpath = "//select[@name='prototype']";
    public static final String New_Document_OK_Button_Xpath = "//input[@name='buttons:1:button']";
    public static final String New_Document_Title_Text_Xpath = "//input[@name='cards:0:panel:editor:extension.editor:form:template:extension.left:view:1:item:view:1:fieldContainer:item:value:widget']";
    public static final String New_Document_Summary_Text_Xpath = "//textarea[@name='cards:0:panel:editor:extension.editor:form:template:extension.left:view:2:item:view:1:fieldContainer:item:value:widget']";
    public static final String New_Document_Description_Text_Xpath = "//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']";
    public static final String New_Document_Save_Xpath = "//span[contains(text(),'Save')]";
    public static final String New_Document_Done_Xpath = "//span[contains(text(),'Done')]";
    public static final String New_Document_User_Account_Xpath ="//body/brna-root/mat-sidenav-container/mat-sidenav-content/nav/brna-main-menu/div/div/brna-top-level-menu-item[2]/div[1]/mat-icon[1]//*[local-name()='svg']";
    public static final String New_Document_User_Logout_Xpath ="//a[@class='logout-link qa-usersettings-logout']";

    //Screen Name : Edit Document

    public static final String New_Document_Edit_Button_Xpath = "//span[contains(text(),'Edit')]";
}
