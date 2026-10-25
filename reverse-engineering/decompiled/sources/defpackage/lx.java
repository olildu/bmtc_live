package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import so.plotline.insights.Models.x;
import so.plotline.insights.PlotlinePush;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lx implements ListenerSet.Event, PlotlinePush.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18353a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lx(Context context, NotificationCompat.Builder builder, x xVar, int i) {
        this.b = context;
        this.c = builder;
        this.d = xVar;
        this.f18353a = i;
    }

    @Override // so.plotline.insights.PlotlinePush.c
    public void a() {
        Context context = (Context) this.b;
        NotificationCompat.Builder builder = (NotificationCompat.Builder) this.c;
        x xVar = (x) this.d;
        PlotlinePush plotlinePushD = PlotlinePush.d();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        plotlinePushD.getClass();
        PlotlinePush.c(this.f18353a, notificationManager, context, builder, xVar);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$45((AnalyticsListener.EventTime) this.b, this.f18353a, (Player.PositionInfo) this.c, (Player.PositionInfo) this.d, (AnalyticsListener) obj);
    }

    public /* synthetic */ lx(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.b = eventTime;
        this.f18353a = i;
        this.c = positionInfo;
        this.d = positionInfo2;
    }
}
