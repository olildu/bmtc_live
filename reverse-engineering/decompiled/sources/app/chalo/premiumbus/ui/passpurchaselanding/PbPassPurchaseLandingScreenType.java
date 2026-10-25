package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType;", "", "Loading", "PbPassPurchaseLandingScreenErrorUIState", "PbPassPurchaseLandingScreenSuccessUIState", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType$Loading;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType$PbPassPurchaseLandingScreenErrorUIState;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType$PbPassPurchaseLandingScreenSuccessUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PbPassPurchaseLandingScreenType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType$Loading;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends PbPassPurchaseLandingScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f7670a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2107317453;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType$PbPassPurchaseLandingScreenErrorUIState;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PbPassPurchaseLandingScreenErrorUIState extends PbPassPurchaseLandingScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f7671a;

        public PbPassPurchaseLandingScreenErrorUIState(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f7671a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PbPassPurchaseLandingScreenErrorUIState) && this.f7671a.equals(((PbPassPurchaseLandingScreenErrorUIState) obj).f7671a);
        }

        public final int hashCode() {
            return this.f7671a.hashCode();
        }

        public final String toString() {
            return "PbPassPurchaseLandingScreenErrorUIState(errorScreenUIState=" + this.f7671a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType$PbPassPurchaseLandingScreenSuccessUIState;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PbPassPurchaseLandingScreenSuccessUIState extends PbPassPurchaseLandingScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f7672a;
        public final ImageUrlUIState b;
        public final ImageUIState c;
        public final ImageUIState d;
        public final LoadingDialogUIState e;
        public final PassInfoCardUIState f;
        public final CardWithTextLeftAndRightIconUiState g;
        public final PBPassPurchaseLandingScreenBottomSheetTypeUIState h;
        public final SearchFieldWithSwapButtonCardUIState i;
        public final ButtonUIState j;
        public final PBConnectingRoutesUIState k;
        public final boolean l;

        public PbPassPurchaseLandingScreenSuccessUIState(ImageUIState imageUIState, ImageUrlUIState imageUrlUIState, ImageUIState placeHolderImageUIState, ImageUIState imageUIState2, LoadingDialogUIState loadingDialogUIState, PassInfoCardUIState passInfoCardUIState, CardWithTextLeftAndRightIconUiState cardWithLeftRightIconsAndTextUIState, PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState, SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState, ButtonUIState buttonUIState, PBConnectingRoutesUIState pBConnectingRoutesUIState, boolean z) {
            Intrinsics.i(placeHolderImageUIState, "placeHolderImageUIState");
            Intrinsics.i(cardWithLeftRightIconsAndTextUIState, "cardWithLeftRightIconsAndTextUIState");
            this.f7672a = imageUIState;
            this.b = imageUrlUIState;
            this.c = placeHolderImageUIState;
            this.d = imageUIState2;
            this.e = loadingDialogUIState;
            this.f = passInfoCardUIState;
            this.g = cardWithLeftRightIconsAndTextUIState;
            this.h = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
            this.i = searchFieldWithSwapButtonCardUIState;
            this.j = buttonUIState;
            this.k = pBConnectingRoutesUIState;
            this.l = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PbPassPurchaseLandingScreenSuccessUIState)) {
                return false;
            }
            PbPassPurchaseLandingScreenSuccessUIState pbPassPurchaseLandingScreenSuccessUIState = (PbPassPurchaseLandingScreenSuccessUIState) obj;
            return Intrinsics.d(this.f7672a, pbPassPurchaseLandingScreenSuccessUIState.f7672a) && Intrinsics.d(this.b, pbPassPurchaseLandingScreenSuccessUIState.b) && Intrinsics.d(this.c, pbPassPurchaseLandingScreenSuccessUIState.c) && Intrinsics.d(this.d, pbPassPurchaseLandingScreenSuccessUIState.d) && Intrinsics.d(this.e, pbPassPurchaseLandingScreenSuccessUIState.e) && Intrinsics.d(this.f, pbPassPurchaseLandingScreenSuccessUIState.f) && Intrinsics.d(this.g, pbPassPurchaseLandingScreenSuccessUIState.g) && Intrinsics.d(this.h, pbPassPurchaseLandingScreenSuccessUIState.h) && Intrinsics.d(this.i, pbPassPurchaseLandingScreenSuccessUIState.i) && Intrinsics.d(this.j, pbPassPurchaseLandingScreenSuccessUIState.j) && Intrinsics.d(this.k, pbPassPurchaseLandingScreenSuccessUIState.k) && this.l == pbPassPurchaseLandingScreenSuccessUIState.l;
        }

        public final int hashCode() {
            int iHashCode = this.f7672a.hashCode() * 31;
            ImageUrlUIState imageUrlUIState = this.b;
            int iE = r30.e(this.c, (iHashCode + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31, 31);
            ImageUIState imageUIState = this.d;
            int iHashCode2 = (iE + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
            LoadingDialogUIState loadingDialogUIState = this.e;
            int iHashCode3 = (iHashCode2 + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31;
            PassInfoCardUIState passInfoCardUIState = this.f;
            int iHashCode4 = (this.g.hashCode() + ((iHashCode3 + (passInfoCardUIState == null ? 0 : passInfoCardUIState.hashCode())) * 31)) * 31;
            PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState = this.h;
            int iHashCode5 = (iHashCode4 + (pBPassPurchaseLandingScreenBottomSheetTypeUIState == null ? 0 : pBPassPurchaseLandingScreenBottomSheetTypeUIState.hashCode())) * 31;
            SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState = this.i;
            int iHashCode6 = (iHashCode5 + (searchFieldWithSwapButtonCardUIState == null ? 0 : searchFieldWithSwapButtonCardUIState.hashCode())) * 31;
            ButtonUIState buttonUIState = this.j;
            int iHashCode7 = (iHashCode6 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
            PBConnectingRoutesUIState pBConnectingRoutesUIState = this.k;
            return ((iHashCode7 + (pBConnectingRoutesUIState != null ? pBConnectingRoutesUIState.hashCode() : 0)) * 31) + (this.l ? 1231 : 1237);
        }

        public final String toString() {
            return "PbPassPurchaseLandingScreenSuccessUIState(toolBarImageUIState=" + this.f7672a + ", passInfoImageUrlUIState=" + this.b + ", placeHolderImageUIState=" + this.c + ", chaloBusInfoImageUIState=" + this.d + ", loadingDialogUIState=" + this.e + ", passInfoCardUIState=" + this.f + ", cardWithLeftRightIconsAndTextUIState=" + this.g + ", pbPassPurchaseLandingScreenBottomSheetTypeUIState=" + this.h + ", fromAndToStopCardUIState=" + this.i + ", buyPassBtnUIState=" + this.j + ", pbConnectingRoutesUIState=" + this.k + ", showPassInfoPlotlineWidget=" + this.l + ")";
        }
    }
}
