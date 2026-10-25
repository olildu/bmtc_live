package app.chalo.home.ui.savedplacesandrides;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/RidesUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RidesUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3675a;
    public final List b;
    public final LoadingShimmerUIState c;
    public final AddRidesBtnUIState d;

    public RidesUIState(TextUIState.ChaloTextUIState title, List savedRides, LoadingShimmerUIState loadingShimmerUIState, AddRidesBtnUIState addRidesUIState) {
        Intrinsics.i(title, "title");
        Intrinsics.i(savedRides, "savedRides");
        Intrinsics.i(addRidesUIState, "addRidesUIState");
        this.f3675a = title;
        this.b = savedRides;
        this.c = loadingShimmerUIState;
        this.d = addRidesUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RidesUIState)) {
            return false;
        }
        RidesUIState ridesUIState = (RidesUIState) obj;
        return Intrinsics.d(this.f3675a, ridesUIState.f3675a) && Intrinsics.d(this.b, ridesUIState.b) && Intrinsics.d(this.c, ridesUIState.c) && Intrinsics.d(this.d, ridesUIState.d);
    }

    public final int hashCode() {
        int iB = r30.b(this.f3675a.hashCode() * 31, 31, this.b);
        LoadingShimmerUIState loadingShimmerUIState = this.c;
        return this.d.hashCode() + ((iB + (loadingShimmerUIState == null ? 0 : loadingShimmerUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RidesUIState(title=" + this.f3675a + ", savedRides=" + this.b + ", rideShimmerUIState=" + this.c + ", addRidesUIState=" + this.d + ")";
    }
}
