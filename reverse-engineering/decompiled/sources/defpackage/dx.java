package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15499a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ dx(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.f15499a = 1;
        this.b = eventTime;
        this.c = i;
        this.d = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f15499a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.b, this.d, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onDeviceVolumeChanged(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.b, this.d, this.c);
                break;
        }
    }

    public /* synthetic */ dx(AnalyticsListener.EventTime eventTime, boolean z, int i, int i2) {
        this.f15499a = i2;
        this.b = eventTime;
        this.d = z;
        this.c = i;
    }
}
