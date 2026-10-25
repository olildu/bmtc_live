package defpackage;

import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.inmobi.media.AbstractC2636r6;
import com.inmobi.media.C2483g6;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ko1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17518a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ko1(int i, long j, VideoRendererEventListener.EventDispatcher eventDispatcher) {
        this.f17518a = 0;
        this.b = eventDispatcher;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17518a) {
            case 0:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$droppedFrames$3(this.d, this.c);
                break;
            case 1:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$reportVideoFrameProcessingOffset$4(this.c, this.d);
                break;
            default:
                AbstractC2636r6.b((C2483g6) this.b, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ ko1(Object obj, int i, int i2, long j) {
        this.f17518a = i2;
        this.b = obj;
        this.c = j;
        this.d = i;
    }
}
