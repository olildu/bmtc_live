package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/AllLiveVehiclesUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AllLiveVehiclesUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4810a;
    public final ChaloColorToken b;
    public final ChaloPadding c;
    public final ChaloColorToken d;
    public final ChaloPadding e;

    public AllLiveVehiclesUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        this.f4810a = white;
        this.b = white;
        this.c = chaloPadding;
        this.d = ChaloColorToken.GreyColor.f9806a;
        this.e = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllLiveVehiclesUISpecs)) {
            return false;
        }
        AllLiveVehiclesUISpecs allLiveVehiclesUISpecs = (AllLiveVehiclesUISpecs) obj;
        return Intrinsics.d(this.f4810a, allLiveVehiclesUISpecs.f4810a) && Intrinsics.d(this.b, allLiveVehiclesUISpecs.b) && Intrinsics.d(this.c, allLiveVehiclesUISpecs.c) && Intrinsics.d(this.d, allLiveVehiclesUISpecs.d) && Intrinsics.d(this.e, allLiveVehiclesUISpecs.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z40.b(this.d, r30.c(this.c, z40.b(this.b, this.f4810a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllLiveVehiclesUISpecs(containerBackground=");
        sb.append(this.f4810a);
        sb.append(", etaBackground=");
        sb.append(this.b);
        sb.append(", etaPadding=");
        sb.append(this.c);
        sb.append(", headerBackground=");
        sb.append(this.d);
        sb.append(", headerPadding=");
        return py.e(sb, this.e, ")");
    }
}
