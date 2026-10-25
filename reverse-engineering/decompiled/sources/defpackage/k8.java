package defpackage;

import android.media.MediaPlayer;
import android.view.View;
import com.inmobi.media.B6;
import com.inmobi.media.C2694v8;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k8 implements MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17473a;
    public final /* synthetic */ View b;

    public /* synthetic */ k8(View view, int i) {
        this.f17473a = i;
        this.b = view;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        switch (this.f17473a) {
            case 0:
                B6.a((B6) this.b, mediaPlayer, i, i2);
                break;
            default:
                C2694v8.c((C2694v8) this.b, mediaPlayer, i, i2);
                break;
        }
    }
}
