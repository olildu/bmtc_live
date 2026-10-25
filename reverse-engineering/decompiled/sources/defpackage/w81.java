package defpackage;

import androidx.media3.common.SimpleBasePlayer;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w81 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19904a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ int c;

    public /* synthetic */ w81(SimpleBasePlayer.State state, int i, int i2) {
        this.f19904a = i2;
        this.b = state;
        this.c = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f19904a) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$22(this.b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$23(this.b, this.c);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.b, this.c);
        }
    }
}
