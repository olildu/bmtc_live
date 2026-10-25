package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.adster.sdk.mediation.UrlOpener;
import com.inmobi.media.C2485g8;
import com.inmobi.media.M9;
import com.inmobi.media.N3;
import in.juspay.hypersdk.analytics.LogManager;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a8(Object obj, boolean z, int i) {
        this.f171a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f171a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.c).lambda$skipSilenceEnabledChanged$7(this.b);
                break;
            case 1:
                LogManager.startPushTasks$lambda$3((LogManager) this.c, this.b);
                break;
            case 2:
                M9.a((Context) this.c, this.b);
                break;
            case 3:
                N3.a((N3) this.c, null, this.b);
                break;
            case 4:
                UrlOpener.b((String) this.c, this.b);
                break;
            default:
                C2485g8.a((C2485g8) this.c, this.b);
                break;
        }
    }
}
