package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20082a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;
    public final /* synthetic */ AudioSink.AudioTrackConfig c;

    public /* synthetic */ y7(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f20082a = i;
        this.b = eventDispatcher;
        this.c = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20082a) {
            case 0:
                this.b.lambda$audioTrackInitialized$10(this.c);
                break;
            default:
                this.b.lambda$audioTrackReleased$11(this.c);
                break;
        }
    }
}
