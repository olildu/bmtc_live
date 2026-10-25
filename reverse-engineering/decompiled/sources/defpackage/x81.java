package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Size;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x81 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19997a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x81(SimpleBasePlayer.State state, Object obj, int i) {
        this.f19997a = i;
        this.b = state;
        this.c = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f19997a) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoTextureView$20(this.b, (Size) this.c);
            case 1:
                return SimpleBasePlayer.lambda$setPlaylistMetadata$15(this.b, (MediaMetadata) this.c);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurfaceHolder$18(this.b, (SurfaceHolder) this.c);
            case 3:
                return SimpleBasePlayer.lambda$setVideoSurfaceView$19(this.b, (SurfaceView) this.c);
            case 4:
                return SimpleBasePlayer.lambda$setAudioAttributes$30(this.b, (AudioAttributes) this.c);
            case 5:
                return SimpleBasePlayer.lambda$setPlaybackParameters$11(this.b, (PlaybackParameters) this.c);
            default:
                return SimpleBasePlayer.lambda$setTrackSelectionParameters$14(this.b, (TrackSelectionParameters) this.c);
        }
    }
}
