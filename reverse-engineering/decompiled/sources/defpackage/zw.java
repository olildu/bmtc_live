package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zw implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20236a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ zw(AnalyticsListener.EventTime eventTime, int i, long j, long j2, int i2) {
        this.f20236a = i2;
        this.b = eventTime;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f20236a) {
            case 0:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.b, this.c, this.d, this.e);
                break;
            default:
                ((AnalyticsListener) obj).onAudioUnderrun(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
