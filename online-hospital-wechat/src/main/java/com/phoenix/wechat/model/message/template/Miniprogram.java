package com.phoenix.wechat.model.message.template;

/**
 * 实体类对象，用来设置<tt>TemplateMessage</tt>中的跳小程序所需数据
 *
 * @since 0.1.0
 */
public class Miniprogram implements java.io.Serializable {

    /**
     * 所需跳转到的小程序appid（该小程序appid必须与发模板消息的公众号是绑定关联关系）
     */
    private String appid;
    /**
     * 所需跳转到小程序的具体页面路径，支持带参数,（示例index?foo=bar）
     */
    private String pagepath;

    public Miniprogram() {
    }

    public Miniprogram(String appid, String pagepath) {
        this.appid = appid;
        this.pagepath = pagepath;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPagepath() {
        return pagepath;
    }

    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }
}
