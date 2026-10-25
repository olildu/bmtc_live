package defpackage;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18262a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ MediaMetadata c;

    public /* synthetic */ kx(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, int i) {
        this.f18262a = i;
        this.b = eventTime;
        this.c = mediaMetadata;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f18262a) {
            case 0:
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onMediaMetadataChanged(this.b, this.c);
                break;
        }
    }
}
