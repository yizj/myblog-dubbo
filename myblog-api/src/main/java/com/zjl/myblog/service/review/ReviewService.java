package com.zjl.myblog.service.review;


import com.zjl.myblog.domain.ReviewDO;

public interface ReviewService {

        /**
          * 发表评论
          * @exception
          */
        ReviewDO addReview(ReviewDO review);
}
