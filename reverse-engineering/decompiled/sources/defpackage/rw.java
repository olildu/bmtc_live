package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rw implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19248a;
    public final /* synthetic */ AnalyticsListener.EventTime b;

    public /* synthetic */ rw(AnalyticsListener.EventTime eventTime, int i) {
        this.f19248a = i;
        this.b = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f19248a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerReleased(this.b);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.b);
                break;
            case 2:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.b);
                break;
            case 3:
                ((AnalyticsListener) obj).onSeekStarted(this.b);
                break;
            case 4:
                ((AnalyticsListener) obj).onDrmKeysLoaded(this.b);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.b);
                break;
        }
    }
}
