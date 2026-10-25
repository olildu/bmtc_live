package defpackage;

import android.media.MediaPlayer;
import com.inmobi.media.C2694v8;
import in.juspay.hyperupi.UPIBridge;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pm1 implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19049a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pm1(Object obj, int i) {
        this.f19049a = i;
        this.b = obj;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        switch (this.f19049a) {
            case 0:
                return UPIBridge.playSound$lambda$16((UPIBridge) this.b, mediaPlayer, i, i2);
            default:
                return C2694v8.a((C2694v8) this.b, mediaPlayer, i, i2);
        }
    }
}
