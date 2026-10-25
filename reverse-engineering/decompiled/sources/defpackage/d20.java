package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d20 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15421a;
    public final /* synthetic */ RenderersFactory b;

    public /* synthetic */ d20(RenderersFactory renderersFactory, int i) {
        this.f15421a = i;
        this.b = renderersFactory;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f15421a) {
            case 0:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(this.b);
            case 1:
                return ExoPlayer.Builder.lambda$new$6(this.b);
            case 2:
                return ExoPlayer.Builder.lambda$new$2(this.b);
            default:
                return ExoPlayer.Builder.lambda$new$8(this.b);
        }
    }
}
