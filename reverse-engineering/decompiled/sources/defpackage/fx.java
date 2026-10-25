package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15682a = 0;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ fx(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.b = eventTime;
        this.d = i;
        this.c = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f15682a) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames(this.b, this.d, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.b, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ fx(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.b = eventTime;
        this.c = j;
        this.d = i;
    }
}
