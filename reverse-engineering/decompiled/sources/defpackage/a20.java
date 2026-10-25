package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a20 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a20(Object obj, int i) {
        this.f154a = i;
        this.b = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f154a) {
            case 0:
                return ExoPlayer.Builder.lambda$setLoadControl$19((LoadControl) this.b);
            case 1:
                return ExoPlayer.Builder.lambda$new$11((LoadControl) this.b);
            default:
                return Boolean.valueOf(((AtomicBoolean) this.b).get());
        }
    }
}
