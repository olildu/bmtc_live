package defpackage;

import androidx.media3.common.SimpleBasePlayer;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a91 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176a;
    public final /* synthetic */ SimpleBasePlayer.State b;

    public /* synthetic */ a91(SimpleBasePlayer.State state, int i) {
        this.f176a = i;
        this.b = state;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f176a) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoSurface$17(this.b);
            case 1:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$25(this.b);
            case 2:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$26(this.b);
            case 3:
                return SimpleBasePlayer.lambda$release$13(this.b);
            case 4:
                return SimpleBasePlayer.lambda$clearVideoOutput$21(this.b);
            case 5:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$24(this.b);
            case 6:
                return SimpleBasePlayer.lambda$stop$12(this.b);
            case 7:
                return SimpleBasePlayer.lambda$prepare$7(this.b);
            default:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$27(this.b);
        }
    }
}
