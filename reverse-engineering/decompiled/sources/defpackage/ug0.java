package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.multimodal.MetroLineContainerComposableKt;
import app.chalo.compose.components.multimodal.ModeTicketStepInfoComposablesKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.compose.MyTicketScreenKt;
import app.chalo.homescreen.data.model.app.TicketsPassesAppModel;
import app.chalo.kyc.min.ui.minkycdetails.NameRegistrationUIState;
import app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreenUIKt;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpCharUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpTextFieldUIState;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenUIKt;
import app.chalo.metro.ui.landing.compose.MetroLandingScreenUIKt;
import app.chalo.metro.ui.landing.uistate.MetroFromToSelectionContainerUIState;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitUiState;
import app.chalo.metro.ui.landing.uistate.MetroTicketBenefitsContainerUiState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerItemCounterUIState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionScreenKt;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoScreenKt;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.MultipleOriginDestinationSelectionScreenKt;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.ModeToReachFromStopUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.MultipleOriginDestinationSelectionScreenUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationInfoUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCtaItemUIState;
import app.chalo.uistate.multimodal.StepTicketMetroModeInfoUISpecs;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.userprofile.ui.minprofileupdate.GenderOptionCardUIState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateStepUIState;
import app.chalo.userprofile.ui.minprofileupdate.compose.MinProfileUpdateScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.BrandingFooterUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.ExpiredQrTicketUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiChildQRCard;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState;
import com.google.maps.android.compose.MapClickListenersKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ug0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19744a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ug0(int i, int i2, Modifier modifier, Object obj) {
        this.f19744a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19744a) {
            case 0:
                ((Integer) obj2).getClass();
                MTicketPassengerSelectionScreenKt.b((MTicketPassengerItemCounterUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                MTicketTripInfoScreenKt.a((MTicketTripInfoUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                MapClickListenersKt.a((MutablePropertyReference0Impl) this.d, (Function0) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                MetroLandingScreenUIKt.c((MetroLandingScreenViewState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                MetroLandingScreenUIKt.e((Modifier) this.b, (MetroFromToSelectionContainerUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                MetroLandingScreenUIKt.a((Modifier) this.b, (MetroTicketBenefitsContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                MetroLandingScreenUIKt.b((Modifier) this.b, (MetroTicketBenefitUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                MetroLineContainerComposableKt.b((StepTicketMetroModeInfoUISpecs) this.d, (List) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                MinKycDetailsScreenUIKt.a((NameRegistrationUIState) this.d, (SafeFocusRequester) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                MinKycOtpScreenUIKt.c((MinKycOtpUIState) this.d, (SafeFocusRequester) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                MinKycOtpScreenUIKt.b((SafeFocusRequester) this.d, (OtpTextFieldUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                MinKycOtpScreenUIKt.a((Modifier) this.b, (OtpCharUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                MinProfileUpdateScreenKt.c((GenderOptionCardUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                MinProfileUpdateScreenKt.i((TextUIState) this.d, (TextUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                MinProfileUpdateScreenKt.g((MinProfileUpdateStepUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                MinProfileUpdateScreenKt.d((MinProfileUpdateStepUIState.GenderStepUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                MinProfileUpdateScreenKt.b((MinProfileUpdateStepUIState.AgeStepUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                MinProfileUpdateScreenKt.h((MinProfileUpdateStepUIState.ProfilePhotoStepUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ModeTicketStepInfoComposablesKt.c((StepTicketModeBasedInfoUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                MultiProductValidationScreenKt.g((MultiChildQRCard.MultiProductQrUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                MultiProductValidationScreenKt.d((MultiProductValidationScreenUIState.Content) this.d, (ScrollState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                MultiProductValidationScreenKt.a((BrandingFooterUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                MultiProductValidationScreenKt.h((Modifier) this.b, (ValidationTicketStatusUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                MultiProductValidationScreenKt.b((ExpiredQrTicketUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                MultipleOriginDestinationSelectionScreenKt.c((Modifier) this.b, (MultipleOriginDestinationSelectionScreenUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                MultipleOriginDestinationSelectionScreenKt.b((Modifier) this.b, (OriginDestinationSelectionCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                MultipleOriginDestinationSelectionScreenKt.e((Modifier) this.b, (OriginDestinationSelectionCtaItemUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                MultipleOriginDestinationSelectionScreenKt.a((Modifier) this.b, (OriginDestinationInfoUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                MultipleOriginDestinationSelectionScreenKt.d((Modifier) this.b, (ModeToReachFromStopUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                MyTicketScreenKt.a((MyTicketsComponent) this.d, (TicketsPassesAppModel) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ ug0(Object obj, Object obj2, int i, int i2) {
        this.f19744a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
