package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xw implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20056a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;

    public /* synthetic */ xw(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.f20056a = i2;
        this.b = eventTime;
        this.c = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f20056a) {
            case 0:
                ((AnalyticsListener) obj).onTimelineChanged(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.b, this.c);
                break;
            case 3:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$63(this.b, this.c, (AnalyticsListener) obj);
                break;
            case 4:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.b, this.c);
                break;
        }
    }
}
