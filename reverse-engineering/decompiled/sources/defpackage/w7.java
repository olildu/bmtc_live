package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import in.juspay.hypersdk.services.HyperPaymentsServices;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19899a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w7(Object obj, long j, int i) {
        this.f19899a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19899a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.c).lambda$positionAdvancing$3(this.b);
                break;
            case 1:
                ((HyperPaymentsServices) this.c).lambda$terminate$12(this.b);
                break;
            default:
                ((PreloadMediaSource) this.c).lambda$preload$0(this.b);
                break;
        }
    }
}
