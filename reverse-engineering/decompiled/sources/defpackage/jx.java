package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17445a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ AudioSink.AudioTrackConfig c;

    public /* synthetic */ jx(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f17445a = i;
        this.b = eventTime;
        this.c = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f17445a) {
            case 0:
                ((AnalyticsListener) obj).onAudioTrackInitialized(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onAudioTrackReleased(this.b, this.c);
                break;
        }
    }
}
