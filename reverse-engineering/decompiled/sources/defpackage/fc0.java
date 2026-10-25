package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.multimodal.MetroLineContainerComposableKt;
import app.chalo.home.ui.history.compose.components.MultiModalTicketSelectionBottomSheetContentKt;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.kyc.min.ui.minkycdetails.DetailsStepProgressIndicatorUIState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsComponent;
import app.chalo.kyc.min.ui.minkycdetails.StepCircleUIState;
import app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreenKt;
import app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreenUIKt;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent;
import app.chalo.kyc.min.ui.minkycotp.OtpStepProgressUIState;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenKt;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.BusInfoCardUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.EtaAndFareInfoCardUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.FareAndTravelTimeInfoUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.LegCardHeaderUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopInfoUiState;
import app.chalo.locationdisclaimer.LocationDisclaimerComponent;
import app.chalo.locationdisclaimer.LocationDisclaimerInstructionsSectionUIState;
import app.chalo.locationdisclaimer.LocationDisclaimerViewState;
import app.chalo.locationdisclaimer.ui.compose.LocationDisclaimerScreenKt;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.otp.LoginOtpEnterComponent;
import app.chalo.login.ui.otp.LoginOtpScreenKt;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.landing.compose.MetroLandingScreenKt;
import app.chalo.metro.ui.landing.compose.components.LineSelectionBottomSheetContentKt;
import app.chalo.metro.ui.landing.uistate.LineTypeIndicatorUIState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionScreenKt;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoScreenKt;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.languageselection.LanguageSelectionState;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.uistate.multimodal.LineIndicatorUIState;
import app.chalo.uistate.multimodal.MetroLineContainerUIState;
import app.chalo.userprofile.ui.minprofileupdate.AgeInputFieldUIState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateViewState;
import app.chalo.userprofile.ui.minprofileupdate.compose.MinProfileUpdateScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15628a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fc0(Object obj, int i, int i2) {
        this.f15628a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15628a) {
            case 0:
                ((Integer) obj2).intValue();
                ItinerarySingleLegCardKt.f((LegCardHeaderUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ItinerarySingleLegCardKt.i((EtaAndFareInfoCardUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ItinerarySingleLegCardKt.b((BusInfoCardUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ItinerarySingleLegCardKt.j((StopInfoUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ItinerarySingleLegCardKt.d((FareAndTravelTimeInfoUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                LanguageSelectionScreenKt.e((LanguageSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                LanguageSelectionScreenKt.f((LanguageSelectionState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                LineSelectionBottomSheetContentKt.a((LineTypeIndicatorUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                LocationDisclaimerScreenKt.d((LocationDisclaimerComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                LocationDisclaimerScreenKt.a((LocationDisclaimerViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                LocationDisclaimerScreenKt.c((LocationDisclaimerInstructionsSectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                LoginOptionsScreenKt.e((LoginOptionsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                LoginOtpScreenKt.c((LoginOtpEnterComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                MTicketPassengerSelectionScreenKt.h((MTicketPassengerSelectionComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                MTicketPassengerSelectionScreenKt.g((MTicketPassengerSelectionUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                MTicketTripInfoScreenKt.b((MTicketTripInfoComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                MetroLandingScreenKt.a((MetroLandingScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                MetroLineContainerComposableKt.c((MetroLineContainerUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                MetroLineContainerComposableKt.a((LineIndicatorUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                MinKycDetailsScreenKt.a((MinKycDetailsComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                MinKycDetailsScreenUIKt.b((DetailsStepProgressIndicatorUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                MinKycDetailsScreenUIKt.e((StepCircleUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                MinKycOtpScreenKt.a((MinKycOtpComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                MinKycOtpScreenUIKt.e((OtpStepProgressUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                MinProfileUpdateScreenKt.a((AgeInputFieldUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                MinProfileUpdateScreenKt.f((MinProfileUpdateComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                MinProfileUpdateScreenKt.e((MinProfileUpdateViewState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                MultiModalTicketSelectionBottomSheetContentKt.a((MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                MultiProductValidationScreenKt.e((MultiProductValidationComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                MultiProductValidationScreenKt.f((MultiProductValidationUIState) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
