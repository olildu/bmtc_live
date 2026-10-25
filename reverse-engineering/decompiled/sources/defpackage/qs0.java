package defpackage;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import so.plotline.insights.FlowViews.j;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Models.c0;
import so.plotline.insights.Models.x;
import so.plotline.insights.PlotlinePush;
import so.plotline.insights.ProgressUpdateReceiver;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class qs0 implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f19151a;
    public final /* synthetic */ NotificationCompat.Builder b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ NotificationManager f;

    public /* synthetic */ qs0(x xVar, NotificationCompat.Builder builder, int i, Context context, int i2, NotificationManager notificationManager) {
        this.f19151a = xVar;
        this.b = builder;
        this.c = i;
        this.d = context;
        this.e = i2;
        this.f = notificationManager;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:6:0x0051  */
    public final void a(RemoteViews remoteViews, RemoteViews remoteViews2) {
        int i;
        x xVar;
        x xVar2 = this.f19151a;
        c0 c0Var = xVar2.p;
        NotificationManager notificationManager = this.f;
        NotificationCompat.Builder builder = this.b;
        Context context = this.d;
        int i2 = this.e;
        if (remoteViews == null) {
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(xVar2.g));
            PlotlinePush.a(context, builder, xVar2, new lx(context, builder, xVar2, i2));
            return;
        }
        long j = xVar2.r;
        long jB = q.b(c0Var, "TIMER");
        long jB2 = q.b(c0Var, "PROGRESS");
        NotificationCompat.Builder style = builder.setContentTitle(xVar2.d).setContentText(xVar2.e).setSubText(xVar2.f).setSmallIcon(this.c).setColor(Color.parseColor(xVar2.m)).setStyle(new NotificationCompat.DecoratedCustomViewStyle());
        String str = xVar2.o;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "LOW":
                    i = -1;
                    break;
                case "MAX":
                    i = -2;
                    break;
                case "MIN":
                    i = 2;
                    break;
                case "HIGH":
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        style.setPriority(i).setAutoCancel(true).setCustomBigContentView(remoteViews).setOngoing(xVar2.u);
        if (remoteViews2 != null) {
            builder.setCustomContentView(remoteViews2);
        }
        if (jB <= 0) {
            if (j > 0) {
                builder.setTimeoutAfter(j);
                AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
                Intent intent = new Intent(context, (Class<?>) ProgressUpdateReceiver.class);
                intent.putExtra("postId", i2);
                intent.putExtra("messageType", "dismiss");
                xVar = xVar2;
                alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + j, PendingIntent.getBroadcast(context, i2, intent, 201326592));
            }
            if (jB2 > 0) {
                try {
                    builder.setOnlyAlertOnce(true);
                    Notification notificationBuild = builder.build();
                    notificationBuild.bigContentView = remoteViews;
                    notificationManager.notify(i2, notificationBuild);
                    so.plotline.insights.Helpers.j.f19445a.put(Integer.valueOf(i2), remoteViews);
                    so.plotline.insights.Helpers.j.b.put(Integer.valueOf(i2), notificationBuild);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Intent intent2 = new Intent(context, (Class<?>) ProgressUpdateReceiver.class);
                    intent2.putExtra("postId", i2);
                    intent2.putExtra("messageType", "progress");
                    intent2.putExtra("endTime", jCurrentTimeMillis + jB2);
                    intent2.putExtra("startTime", jCurrentTimeMillis);
                    intent2.putExtra("durationMs", jB2);
                    intent2.putExtra("totalSteps", (int) (jB2 / 1000));
                    ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).setExactAndAllowWhileIdle(0, jCurrentTimeMillis + ((long) 1000), PendingIntent.getBroadcast(context, i2, intent2, 201326592));
                } catch (Exception e) {
                    DebugHelper.a(e);
                }
            }
            PlotlinePush plotlinePushD = PlotlinePush.d();
            NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
            plotlinePushD.getClass();
            PlotlinePush.c(i2, notificationManager2, context, builder, xVar);
        }
        builder.setTimeoutAfter(jB);
        xVar = xVar2;
        if (jB2 > 0) {
            builder.setOnlyAlertOnce(true);
            Notification notificationBuild2 = builder.build();
            notificationBuild2.bigContentView = remoteViews;
            notificationManager.notify(i2, notificationBuild2);
            so.plotline.insights.Helpers.j.f19445a.put(Integer.valueOf(i2), remoteViews);
            so.plotline.insights.Helpers.j.b.put(Integer.valueOf(i2), notificationBuild2);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Intent intent3 = new Intent(context, (Class<?>) ProgressUpdateReceiver.class);
            intent3.putExtra("postId", i2);
            intent3.putExtra("messageType", "progress");
            intent3.putExtra("endTime", jCurrentTimeMillis2 + jB2);
            intent3.putExtra("startTime", jCurrentTimeMillis2);
            intent3.putExtra("durationMs", jB2);
            intent3.putExtra("totalSteps", (int) (jB2 / 1000));
            ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).setExactAndAllowWhileIdle(0, jCurrentTimeMillis2 + ((long) 1000), PendingIntent.getBroadcast(context, i2, intent3, 201326592));
        }
        PlotlinePush plotlinePushD2 = PlotlinePush.d();
        NotificationManager notificationManager3 = (NotificationManager) context.getSystemService("notification");
        plotlinePushD2.getClass();
        PlotlinePush.c(i2, notificationManager3, context, builder, xVar);
    }
}
