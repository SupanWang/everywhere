package com.example.nice.everywhere.net;

import com.example.nice.everywhere.bean.LoginInfo;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface EveryWhereService {

    public static final int SUCCESS_CODE = 0;
    public static final int VERIFY_CODE_ERROR = 200502;
    public static final int WECHAT_HAVE_BINDED = 20171102;
    //token 失效
    public static final int TOKEN_EXPIRE = 20170707;
    //余额不足
    public static final int MONEY_NOT_ENOUGH = 200607;
     String BASE_URL = "http://api.banmi.com/";


    /**
     * 微信登录
     *
     * @param unionID
     * @return
     */
    @FormUrlEncoded
    @POST("api/3.0/account/login/wechat")
    Observable<LoginInfo> postWechatLogin(@Field("unionID") String unionID);

    /**
     * 微博登录
     *
     * @param oAuthToken 就是三方里面的uid
     * @return
     */
    @FormUrlEncoded
    @POST("api/3.0/account/login/oauth")
    Observable<LoginInfo> postWeiboLogin(@Field("oAuthToken") String oAuthToken);
}
