package app.chalo.home.ui.history.uistate.tabheader;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/tabheader/TabHeaderUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabHeaderUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabHeaderUiSpec f3531a = new TabHeaderUiSpec();
    public final ProfileAndCityContainerUiState b;
    public final HeaderAndIconContainerUiState c;

    public TabHeaderUiState(ProfileAndCityContainerUiState profileAndCityContainerUiState, HeaderAndIconContainerUiState headerAndIconContainerUiState) {
        this.b = profileAndCityContainerUiState;
        this.c = headerAndIconContainerUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabHeaderUiState)) {
            return false;
        }
        TabHeaderUiState tabHeaderUiState = (TabHeaderUiState) obj;
        return Intrinsics.d(this.f3531a, tabHeaderUiState.f3531a) && Intrinsics.d(this.b, tabHeaderUiState.b) && Intrinsics.d(this.c, tabHeaderUiState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f3531a.hashCode() * 31;
        ProfileAndCityContainerUiState profileAndCityContainerUiState = this.b;
        int iHashCode2 = (iHashCode + (profileAndCityContainerUiState == null ? 0 : profileAndCityContainerUiState.hashCode())) * 31;
        HeaderAndIconContainerUiState headerAndIconContainerUiState = this.c;
        return (iHashCode2 + (headerAndIconContainerUiState != null ? headerAndIconContainerUiState.hashCode() : 0)) * 29791;
    }

    public final String toString() {
        return "TabHeaderUiState(spec=" + this.f3531a + ", profileAndCityContainerUiState=" + this.b + ", headerAndIconContainerUiState=" + this.c + ", locationDisclaimerContainerUiState=null, homeScreenSearchBarCardUiState=null, recentlySearchedContainerUiState=null)";
    }
}
