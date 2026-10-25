package app.chalo.productsummary.ui.pass;

import app.chalo.productsummary.ui.data.PassDetailInfoUIState;
import app.chalo.productsummary.ui.data.PassVerificationDocumentationUIState;
import app.chalo.productsummary.ui.data.TripHistoryCardUIState;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassDetailUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassDetailUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassDetailInfoUIState f8766a;
    public final TitleSubtitleUiState b;
    public final UserInfoUIState c;
    public final TripHistoryCardUIState d;
    public final PassVerificationDocumentationUIState e;

    public PassDetailUIState(PassDetailInfoUIState passDetailInfoUIState, TitleSubtitleUiState titleSubtitleUiState, UserInfoUIState userInfoUIState, TripHistoryCardUIState tripHistoryCardUIState, PassVerificationDocumentationUIState passVerificationDocumentationUIState) {
        this.f8766a = passDetailInfoUIState;
        this.b = titleSubtitleUiState;
        this.c = userInfoUIState;
        this.d = tripHistoryCardUIState;
        this.e = passVerificationDocumentationUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassDetailUIState)) {
            return false;
        }
        PassDetailUIState passDetailUIState = (PassDetailUIState) obj;
        return Intrinsics.d(this.f8766a, passDetailUIState.f8766a) && Intrinsics.d(this.b, passDetailUIState.b) && Intrinsics.d(this.c, passDetailUIState.c) && Intrinsics.d(this.d, passDetailUIState.d) && Intrinsics.d(this.e, passDetailUIState.e);
    }

    public final int hashCode() {
        PassDetailInfoUIState passDetailInfoUIState = this.f8766a;
        int iHashCode = (passDetailInfoUIState == null ? 0 : passDetailInfoUIState.hashCode()) * 31;
        TitleSubtitleUiState titleSubtitleUiState = this.b;
        int iHashCode2 = (iHashCode + (titleSubtitleUiState == null ? 0 : titleSubtitleUiState.hashCode())) * 31;
        UserInfoUIState userInfoUIState = this.c;
        int iHashCode3 = (iHashCode2 + (userInfoUIState == null ? 0 : userInfoUIState.hashCode())) * 31;
        TripHistoryCardUIState tripHistoryCardUIState = this.d;
        return this.e.f8754a.hashCode() + ((iHashCode3 + (tripHistoryCardUIState != null ? tripHistoryCardUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PassDetailUIState(passInfoUIState=" + this.f8766a + ", passValidityUIState=" + this.b + ", userInfoUIState=" + this.c + ", viewTripHistoryCardUIState=" + this.d + ", passVerificationDocumentationUIState=" + this.e + ")";
    }
}
