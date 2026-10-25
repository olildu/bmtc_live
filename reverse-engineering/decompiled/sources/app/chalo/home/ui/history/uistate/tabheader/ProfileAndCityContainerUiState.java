package app.chalo.home.ui.history.uistate.tabheader;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.history.uistate.ChaloCitySelectedContainerUiState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$NO_OP$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/tabheader/ProfileAndCityContainerUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileAndCityContainerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileAndCityContainerSpec f3529a;
    public final ImageUrlUIState b;
    public final ImageUIState c;
    public final ImageUIState d;
    public final ChaloCitySelectedContainerUiState e;
    public final UiEventHandler$Companion$NO_OP$1 f;

    public ProfileAndCityContainerUiState(ImageUrlUIState imageUrlUIState, ImageUIState imageUIState, ChaloCitySelectedContainerUiState chaloCitySelectedContainerUiState) {
        ProfileAndCityContainerSpec profileAndCityContainerSpec = new ProfileAndCityContainerSpec();
        ImageUIState imageUIState2 = new ImageUIState(IconType.IC_PROFILE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().k), UIContentScale.Crop, 0.0f, (UiEventHandler) null, 230);
        this.f3529a = profileAndCityContainerSpec;
        this.b = imageUrlUIState;
        this.c = imageUIState2;
        this.d = imageUIState;
        this.e = chaloCitySelectedContainerUiState;
        this.f = UiEventHandler.Companion.f9897a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAndCityContainerUiState)) {
            return false;
        }
        ProfileAndCityContainerUiState profileAndCityContainerUiState = (ProfileAndCityContainerUiState) obj;
        return Intrinsics.d(this.f3529a, profileAndCityContainerUiState.f3529a) && Intrinsics.d(this.b, profileAndCityContainerUiState.b) && Intrinsics.d(this.c, profileAndCityContainerUiState.c) && Intrinsics.d(this.d, profileAndCityContainerUiState.d) && Intrinsics.d(this.e, profileAndCityContainerUiState.e) && Intrinsics.d(this.f, profileAndCityContainerUiState.f);
    }

    public final int hashCode() {
        int iE = r30.e(this.c, (this.b.hashCode() + (this.f3529a.hashCode() * 31)) * 31, 31);
        ImageUIState imageUIState = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iE + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileAndCityContainerUiState(spec=" + this.f3529a + ", profileUrl=" + this.b + ", emptyProfileIcon=" + this.c + ", headerIcon=" + this.d + ", citySelectedContainerUiState=" + this.e + ", profileUiEventHandler=" + this.f + ")";
    }
}
