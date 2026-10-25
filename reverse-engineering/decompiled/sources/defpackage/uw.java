package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uw implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19781a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ uw(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.f19781a = i;
        this.b = eventTime;
        this.c = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f19781a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$34(this.b, this.c, (AnalyticsListener) obj);
                break;
            case 1:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.b, this.c);
                break;
        }
    }
}
