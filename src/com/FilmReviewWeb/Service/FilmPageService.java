package com.FilmReviewWeb.Service;

import com.FilmReviewWeb.Model.Film;
import com.FilmReviewWeb.Model.Result;
import com.FilmReviewWeb.Model.Review;

import java.util.ArrayList;

/**特定电影页面的服务
 * @author HTwo2O
 * @date 2020/5/13 14:26
 */
public interface FilmPageService {

    /**
     * 通过电影名字获得相关影评
     * @param filmName
     * @return
     */
    public ArrayList<Review> getReviewsByFilmName(String filmName) throws Exception;

    /**
     *通过电影名字获得电影数据
     * @param fileNmae
     * @return
     * @throws Exception
     */
    public Film getFilmDataByFilmName(String fileNmae)throws Exception;

    /**
     *通过Review中几个属性写评论
     * @param review
     * @return是否成功
     * @throws Exception
     */
    public boolean writeAReview(Review review) throws Exception;

    /**
     * 点击点赞按钮，进行点赞或者取消点赞
     * @param reviewId
     * @param userName
     * @return
     * @throws Exception
     */
    public Result giveReviewLike(Integer reviewId, String userName) throws Exception;

    public Result checkReviewLike(Integer reviewId, String userName) throws Exception;
}
