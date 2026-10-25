package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e20 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15511a;
    public final /* synthetic */ MediaSource.Factory b;

    public /* synthetic */ e20(MediaSource.Factory factory, int i) {
        this.f15511a = i;
        this.b = factory;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f15511a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$7(this.b);
            case 1:
                return ExoPlayer.Builder.lambda$new$9(this.b);
            case 2:
                return ExoPlayer.Builder.lambda$new$5(this.b);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.b);
        }
    }
}
