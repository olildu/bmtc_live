package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g20 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15694a;
    public final /* synthetic */ TrackSelector b;

    public /* synthetic */ g20(TrackSelector trackSelector, int i) {
        this.f15694a = i;
        this.b = trackSelector;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f15694a) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10(this.b);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(this.b);
        }
    }
}
