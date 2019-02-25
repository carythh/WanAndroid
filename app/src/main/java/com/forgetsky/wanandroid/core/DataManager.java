package com.forgetsky.wanandroid.core;

import com.forgetsky.wanandroid.core.http.BaseResponse;
import com.forgetsky.wanandroid.core.http.HttpHelper;
import com.forgetsky.wanandroid.modules.homepager.banner.BannerData;
import com.forgetsky.wanandroid.modules.homepager.bean.ArticleItemData;
import com.forgetsky.wanandroid.modules.homepager.bean.ArticleListData;

import java.util.List;

import io.reactivex.Observable;

public class DataManager implements HttpHelper {
    private HttpHelper mHttpHelper;

    public DataManager(HttpHelper httpHelper) {
        mHttpHelper = httpHelper;

    }

    @Override
    public Observable<BaseResponse<ArticleListData>> getArticleList(int pageNum) {
        return mHttpHelper.getArticleList(pageNum);
    }

    @Override
    public Observable<BaseResponse<List<BannerData>>> getBannerData() {
        return mHttpHelper.getBannerData();
    }

    @Override
    public Observable<BaseResponse<List<ArticleItemData>>> getTopArticles() {
        return mHttpHelper.getTopArticles();
    }
}
