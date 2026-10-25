package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f20 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15605a;
    public final /* synthetic */ BandwidthMeter b;

    public /* synthetic */ f20(BandwidthMeter bandwidthMeter, int i) {
        this.f15605a = i;
        this.b = bandwidthMeter;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f15605a) {
            case 0:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.b);
            default:
                return ExoPlayer.Builder.lambda$new$12(this.b);
        }
    }
}
