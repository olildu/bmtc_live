package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11174a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b8(long j, String str, int i, long j2, Object obj) {
        this.f11174a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11174a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.e).lambda$decoderInitialized$1(this.b, this.c, this.d);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.e).lambda$decoderInitialized$1(this.b, this.c, this.d);
                break;
        }
    }
}
