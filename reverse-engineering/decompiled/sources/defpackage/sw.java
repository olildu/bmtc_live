package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sw implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19607a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ sw(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f19607a = i;
        this.b = eventTime;
        this.c = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f19607a) {
            case 0:
                ((AnalyticsListener) obj).onAudioEnabled(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioDisabled(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onVideoDisabled(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoEnabled(this.b, this.c);
                break;
        }
    }
}
