package defpackage;

import androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import app.chalo.appsupport.BookingHelpScreenUIKt;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.appsupport.uistate.FaqItemUiState;
import app.chalo.busesaroundyou.BusesAroundYouScreenKt;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.chalobususerprofile.ui.compose.OfficeInfoUIState;
import app.chalo.chalobususerprofile.ui.compose.ProfileSurveyUIState;
import app.chalo.compose.components.ChaloAlertTextKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoCtaType;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.home.ui.history.compose.components.ChaloBusTicketViewKt;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusScheduleUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketContainerUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketTripDetailsUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ChaloBusTicketUiState;
import app.chalo.home.ui.history.uistate.chalobusticket.ProductFooterContainerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.AllLiveVehicleKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.common.CardRechargeSuccessScreenUiData;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.ActivationTicketComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationNoticeUIState;
import app.chalo.productactivation.ui.uistate.ActivationPassUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketFooterUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketRouteDetailsHeader;
import app.chalo.productactivation.ui.uistate.ActivationTicketRouteDetailsUISpecs;
import app.chalo.productactivation.ui.uistate.ActivationTicketRouteDetailsUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketUIState;
import app.chalo.productsummary.ui.compose.components.BookingDetailsComponentKt;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11156a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(int i, int i2, Modifier modifier, Object obj) {
        this.f11156a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11156a) {
            case 0:
                ((Integer) obj2).getClass();
                ActivationPassComposablesKt.a((ActivationNoticeUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                ActivationPassComposablesKt.e((Modifier) this.b, (ActivationPassUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                ActivationTicketComposablesKt.g((Modifier) this.b, (ActivationTicketUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                ActivationTicketComposablesKt.b((ActivationTicketFooterUIState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                ActivationTicketComposablesKt.c((ActivationTicketRouteDetailsUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                ActivationTicketComposablesKt.e((Modifier) this.b, (ActivationTicketRouteDetailsHeader.MultipleLegsTicket) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                ActivationTicketComposablesKt.f((ActivationTicketRouteDetailsUISpecs) this.d, (ActivationTicketRouteDetailsHeader.SingleTicket) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                AllLiveVehicleKt.a((RouteDetailsViewTypeUIState.AllLiveVehicles) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                int iIntValue = ((Integer) obj2).intValue();
                return AnnotatedStringResolveInlineContentKt.InlineChildren$lambda$1((AnnotatedString) this.d, (List) this.b, this.c, (Composer) obj, iIntValue);
            case 9:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.z((BleValidationLayoutInfo) this.d, (String) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                BookingDetailsComponentKt.a((Modifier) this.b, (BookingDetailsUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                BookingHelpScreenUIKt.c((Modifier) this.b, (FaqItemUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                BookingHelpScreenUIKt.b((BookingHelpScreenViewState) this.d, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                BusesAroundYouScreenKt.e((Modifier) this.b, (IconButtonUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).getClass();
                CardRechargeSuccessScreenKt.b((Modifier) this.b, (CardRechargeSuccessScreenUiData) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).getClass();
                ChaloAlertTextKt.a((Modifier) this.b, (AlertTextWithIconUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.f((List) this.d, (List) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).intValue();
                ChaloBusScreenUIKt.s((ProductPurchaseNudgeInfoCtaType) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.f((Modifier) this.b, (ProductBannerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.a((Modifier) this.b, (ChaloBusTicketUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.b((Modifier) this.b, (ChaloBusTicketContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.g((Modifier) this.b, (ProductFooterContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.c((Modifier) this.b, (ChaloBusScheduleUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                ChaloBusTicketViewKt.d((Modifier) this.b, (ChaloBusTicketTripDetailsUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                ChaloBusUserProfileSurveyMainScreenKt.d((OfficeInfoUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                ChaloBusUserProfileSurveyMainScreenKt.k((TextUIState) this.d, (UiEventHandler) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).intValue();
                ChaloBusUserProfileSurveyMainScreenKt.e((ButtonUIState) this.d, (ButtonUIState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                ChaloBusUserProfileSurveyMainScreenKt.j((ProfileSurveyUIState.WorkTimingUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).getClass();
                ChaloBusUserProfileSurveyMainScreenKt.h((ProfileSurveyUIState.SuccessErrorUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                ChaloBusUserProfileSurveyMainScreenKt.f((ProfileSurveyUIState.FrequencyUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ b0(Object obj, Object obj2, int i, int i2) {
        this.f11156a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
