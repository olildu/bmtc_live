package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bx implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11236a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ bx(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.f11236a = i;
        this.b = eventTime;
        this.c = exc;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f11236a) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioCodecError(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onAudioSinkError(this.b, this.c);
                break;
        }
    }
}
