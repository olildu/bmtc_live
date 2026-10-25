package defpackage;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ix implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17097a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ Format c;
    public final /* synthetic */ DecoderReuseEvaluation d;

    public /* synthetic */ ix(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i) {
        this.f17097a = i;
        this.b = eventTime;
        this.c = format;
        this.d = decoderReuseEvaluation;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f17097a) {
            case 0:
                ((AnalyticsListener) obj).onVideoInputFormatChanged(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onAudioInputFormatChanged(this.b, this.c, this.d);
                break;
        }
    }
}
