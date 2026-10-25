package defpackage;

import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cu implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15405a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cu(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, long j) {
        this.f15405a = 2;
        this.b = eventDispatcher;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15405a) {
            case 0:
                ((CrashlyticsCore) this.b).lambda$log$2(this.c, (String) this.d);
                break;
            case 1:
                ((CrashlyticsCore) this.b).lambda$log$3(this.c, (String) this.d);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$renderedFirstFrame$6(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ cu(CrashlyticsCore crashlyticsCore, long j, String str, int i) {
        this.f15405a = i;
        this.b = crashlyticsCore;
        this.c = j;
        this.d = str;
    }
}
