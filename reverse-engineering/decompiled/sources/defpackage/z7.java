package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20171a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ z7(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.f20171a = i;
        this.b = eventDispatcher;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20171a) {
            case 0:
                this.b.lambda$audioCodecError$9(this.c);
                break;
            default:
                this.b.lambda$audioSinkError$8(this.c);
                break;
        }
    }
}
