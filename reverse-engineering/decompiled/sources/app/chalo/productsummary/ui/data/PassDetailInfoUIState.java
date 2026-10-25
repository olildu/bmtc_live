package app.chalo.productsummary.ui.data;

import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/PassDetailInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassDetailInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8753a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final SpecialFeaturesTagListUIState e;

    public PassDetailInfoUIState(TextUIState.ChaloTextUIState passName, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, SpecialFeaturesTagListUIState specialFeaturesTagListUIState) {
        Intrinsics.i(passName, "passName");
        this.f8753a = passName;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloTextUIState3;
        this.e = specialFeaturesTagListUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassDetailInfoUIState)) {
            return false;
        }
        PassDetailInfoUIState passDetailInfoUIState = (PassDetailInfoUIState) obj;
        return Intrinsics.d(this.f8753a, passDetailInfoUIState.f8753a) && Intrinsics.d(this.b, passDetailInfoUIState.b) && Intrinsics.d(this.c, passDetailInfoUIState.c) && Intrinsics.d(this.d, passDetailInfoUIState.d) && Intrinsics.d(this.e, passDetailInfoUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8753a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.c;
        int iHashCode3 = (iHashCode2 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (chaloTextUIState3 != null ? chaloTextUIState3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("PassDetailInfoUIState(passName=", this.f8753a, ", passFareInfo=", this.b, ", passTripInfo=");
        r30.p(sbJ, this.c, ", passCategoryInfo=", this.d, ", specialFeatureTag=");
        sbJ.append(this.e);
        sbJ.append(")");
        return sbJ.toString();
    }
}
