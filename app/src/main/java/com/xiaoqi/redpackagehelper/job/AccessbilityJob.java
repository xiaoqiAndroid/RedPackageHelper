package com.xiaoqi.redpackagehelper.job;

import android.view.accessibility.AccessibilityEvent;

import com.xiaoqi.redpackagehelper.IStatusBarNotification;
import com.xiaoqi.redpackagehelper.QiangHongBaoService;


/**
 * <p>Created 16/1/16 上午12:32.</p>
 * <p><a href="mailto:codeboy2013@gmail.com">Email:codeboy2013@gmail.com</a></p>
 * <p><a href="http://www.happycodeboy.com">LeonLee Blog</a></p>
 *
 * @author LeonLee
 */
public interface AccessbilityJob {
    String getTargetPackageName();
    void onCreateJob(QiangHongBaoService service);
    void onReceiveJob(AccessibilityEvent event);
    void onStopJob();
    void onNotificationPosted(IStatusBarNotification service);
    boolean isEnable();
}
