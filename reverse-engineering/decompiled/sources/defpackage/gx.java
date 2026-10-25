package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15773a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ PlaybackException c;

    public /* synthetic */ gx(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i) {
        this.f15773a = i;
        this.b = eventTime;
        this.c = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f15773a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerErrorChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerError(this.b, this.c);
                break;
        }
    }
}
