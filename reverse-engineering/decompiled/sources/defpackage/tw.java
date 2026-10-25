package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tw implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19694a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ long c;

    public /* synthetic */ tw(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.f19694a = i;
        this.b = eventTime;
        this.c = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f19694a) {
            case 0:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioPositionAdvancing(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(this.b, this.c);
                break;
        }
    }
}
