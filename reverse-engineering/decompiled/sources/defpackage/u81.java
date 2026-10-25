package defpackage;

import androidx.media3.common.SimpleBasePlayer;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u81 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19723a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ u81(SimpleBasePlayer.State state, boolean z, int i) {
        this.f19723a = i;
        this.b = state;
        this.c = z;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f19723a) {
            case 0:
                return SimpleBasePlayer.lambda$setPlayWhenReady$1(this.b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.b, this.c);
            case 2:
                return SimpleBasePlayer.lambda$setDeviceMuted$28(this.b, this.c);
            default:
                return SimpleBasePlayer.lambda$setDeviceMuted$29(this.b, this.c);
        }
    }
}
