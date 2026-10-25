package app.chalo.scenes;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/ChaloNavOptions;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloNavOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9211a;
    public final boolean b;
    public final PopUpToConfig c;

    public /* synthetic */ ChaloNavOptions(PopUpToConfig popUpToConfig, int i) {
        this((i & 1) == 0, false, popUpToConfig);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloNavOptions)) {
            return false;
        }
        ChaloNavOptions chaloNavOptions = (ChaloNavOptions) obj;
        return this.f9211a == chaloNavOptions.f9211a && this.b == chaloNavOptions.b && Intrinsics.d(this.c, chaloNavOptions.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.f9211a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("ChaloNavOptions(launchSingleTop=", ", includePath=", ", popUpToConfig=", this.f9211a, this.b);
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }

    public ChaloNavOptions(boolean z, boolean z2, PopUpToConfig popUpToConfig) {
        Intrinsics.i(popUpToConfig, "popUpToConfig");
        this.f9211a = z;
        this.b = z2;
        this.c = popUpToConfig;
    }
}
