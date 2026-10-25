package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15867a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ MediaLoadData c;

    public /* synthetic */ hx(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i) {
        this.f15867a = i;
        this.b = eventTime;
        this.c = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f15867a) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.b, this.c);
                break;
        }
    }
}
