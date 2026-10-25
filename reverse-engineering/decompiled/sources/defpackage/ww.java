package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ww implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19965a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ LoadEventInfo c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ ww(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f19965a = i;
        this.b = eventTime;
        this.c = loadEventInfo;
        this.d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f19965a) {
            case 0:
                ((AnalyticsListener) obj).onLoadStarted(this.b, this.c, this.d);
                break;
            case 1:
                ((AnalyticsListener) obj).onLoadCanceled(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCompleted(this.b, this.c, this.d);
                break;
        }
    }
}
