package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/ItineraryListItemUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryListItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4587a;
    public final ItineraryListItemSpecs b;
    public final TextUIState.ChaloTextUIState c;
    public final List d;
    public final ItineraryCardCtaUIState e;

    public ItineraryListItemUiState(String id, TextUIState.ChaloTextUIState chaloTextUIState, List legs, ItineraryCardCtaUIState itineraryCardCtaUIState) {
        ItineraryListItemSpecs itineraryListItemSpecs = new ItineraryListItemSpecs();
        Intrinsics.i(id, "id");
        Intrinsics.i(legs, "legs");
        this.f4587a = id;
        this.b = itineraryListItemSpecs;
        this.c = chaloTextUIState;
        this.d = legs;
        this.e = itineraryCardCtaUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryListItemUiState)) {
            return false;
        }
        ItineraryListItemUiState itineraryListItemUiState = (ItineraryListItemUiState) obj;
        return Intrinsics.d(this.f4587a, itineraryListItemUiState.f4587a) && Intrinsics.d(this.b, itineraryListItemUiState.b) && Intrinsics.d(this.c, itineraryListItemUiState.c) && Intrinsics.d(this.d, itineraryListItemUiState.d) && Intrinsics.d(this.e, itineraryListItemUiState.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4587a.hashCode() * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iB = r30.b((iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31, this.d);
        ItineraryCardCtaUIState itineraryCardCtaUIState = this.e;
        return iB + (itineraryCardCtaUIState != null ? itineraryCardCtaUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ItineraryListItemUiState(id=" + this.f4587a + ", specs=" + this.b + ", travelInfoHeader=" + this.c + ", legs=" + this.d + ", cardBottomCta=" + this.e + ")";
    }
}
