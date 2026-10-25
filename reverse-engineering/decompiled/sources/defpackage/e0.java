package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsScreenKt;
import app.chalo.appsupport.BookingHelpScreenComponent;
import app.chalo.appsupport.BookingHelpScreenKt;
import app.chalo.appsupport.BookingHelpScreenUIKt;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.bookingsuccess.compose.BookingSuccessScreenKt;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.busesaroundyou.BusesAroundYouScreenKt;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyMainScreenKt;
import app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialogUIState;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteCorridorUIState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoContentState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoRouteUIState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionBottomSheetUiState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionCardUiState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionFieldUiState;
import app.chalo.home.ui.chalobusrouteinfo.RouteNameAndIconUIState;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerUIState;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkMainScreenKt;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountMainScreenKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailComponent;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailMainScreenKt;
import app.chalo.ncmc.ui.landing.ChaloCardInfoComponent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoMainScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryMainScreenKt;
import app.chalo.productactivation.ui.ActivationPassComposablesKt;
import app.chalo.productactivation.ui.ActivationTicketComposablesKt;
import app.chalo.productactivation.ui.uistate.ActivationPassUIState;
import app.chalo.productactivation.ui.uistate.ActivationTicketContainerUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15504a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(Object obj, int i, int i2) {
        this.f15504a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15504a;
        Unit unit = Unit.f17538a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ActivationPassComposablesKt.f((ActivationPassUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ActivationTicketComposablesKt.a((ActivationTicketContainerUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AppMigrationPreconditionsScreenKt.c((AppMigrationPreconditionsComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.m((BleValidationFragmentComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                BleValidationScreen_androidKt.o((ProductDetailsDisplayFieldData) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                BookingHelpScreenKt.a((BookingHelpScreenComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                BookingHelpScreenUIKt.a((BookingHelpScreenViewState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                BookingSuccessScreenKt.a((BookingSuccessComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 8:
                Function4 function4 = (Function4) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1640075976, iIntValue, -1, "app.chalo.compose.MainBulletListComponent.<anonymous>.<anonymous>.<anonymous> (BulletListComponentWithLineIcon.kt:90)");
                    }
                    function4.invoke(Modifier.INSTANCE, Integer.valueOf(i2), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 9:
                ((Integer) obj2).intValue();
                BusesAroundYouScreenKt.c((BusesAroundYouComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                CardTransactionDetailMainScreenKt.a((CardTransactionDetailComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                CardTransactionHistoryMainScreenKt.a((CardTransactionHistoryComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.p((ChaloBusRouteSuggestionBottomSheetUiState.Success) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.m((ChaloBusRouteSuggestionBottomSheetUiState.Form) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.g((ChaloBusRouteInfoContentState.Loading) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.d((ChaloBusRouteInfoContentState.Empty) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.c((ChaloBusRouteCorridorUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.r((RouteSuggestionTimePickerUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.o((ChaloBusRouteSuggestionFieldUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.n((ChaloBusRouteSuggestionCardUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.j((ChaloBusRouteInfoRouteUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.i((RouteNameAndIconUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                ChaloBusRouteInfoMainScreenKt.h((ChaloBusRouteInfoComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                ChaloBusUserProfileSurveyMainScreenKt.b((ChaloBusUserProfileSurveyComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                ChaloBusUserProfileSurveyMainScreenKt.i((SurveyTimePickerDialogUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                ChaloCardInfoMainScreenKt.a((ChaloCardInfoComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                ChaloCardLinkMainScreenKt.a((ChaloCardLinkCardComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                ChaloCardRechargeAmountMainScreenKt.a((ChaloCardRechargeAmountComponent) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                ChaloConfirmationDialogKt.a((ConfirmationDialogUiState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                ChaloDatePickerKt.b((DatePickerUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return unit;
    }
}
