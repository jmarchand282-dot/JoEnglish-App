package com.josephmarchand.joenglish;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class ReminderReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        String channelId = "joenglish_learning";
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) nm.createNotificationChannel(new NotificationChannel(channelId, "Rappels JoEnglish", NotificationManager.IMPORTANCE_DEFAULT));
        Notification.Builder b = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(context, channelId) : new Notification.Builder(context);
        b.setSmallIcon(android.R.drawable.ic_dialog_info).setContentTitle("JoEnglish").setContentText("Ton cours t'attend. Quelques minutes aujourd'hui font progresser !").setAutoCancel(true);
        nm.notify(2026, b.build());
    }
}
