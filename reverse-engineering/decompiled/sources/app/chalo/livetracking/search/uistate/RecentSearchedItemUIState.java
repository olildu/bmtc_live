package app.chalo.livetracking.search.uistate;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentSearchedItemUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentSearchedItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentSearchedItemSpec f4518a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final DividerUIState e;

    public RecentSearchedItemUIState(RecentSearchedItemSpec spec, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, DividerUIState dividerUIState) {
        Intrinsics.i(spec, "spec");
        this.f4518a = spec;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearchedItemUIState)) {
            return false;
        }
        RecentSearchedItemUIState recentSearchedItemUIState = (RecentSearchedItemUIState) obj;
        return Intrinsics.d(this.f4518a, recentSearchedItemUIState.f4518a) && Intrinsics.d(this.b, recentSearchedItemUIState.b) && Intrinsics.d(this.c, recentSearchedItemUIState.c) && Intrinsics.d(this.d, recentSearchedItemUIState.d) && Intrinsics.d(this.e, recentSearchedItemUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f4518a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        int iF = r30.f(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode2 = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.e;
        return iHashCode2 + (dividerUIState != null ? dividerUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentSearchedItemUIState(spec=");
        sb.append(this.f4518a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        r30.p(sb, this.c, ", subtitle=", this.d, ", dividerUiState=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
