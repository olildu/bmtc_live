package defpackage;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.material3.BasicAlertDialogOverrideScope;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.ModalWideNavigationRailOverrideScope;
import androidx.compose.material3.NavigationBarOverrideScope;
import androidx.compose.material3.NavigationRailOverrideScope;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.ShortNavigationBarOverrideScope;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.WideNavigationRailOverrideScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.GenericSuccessScreenWithImageMsgAndCtaKt;
import app.chalo.compose.components.dialogs.GenderSelectionDialogKt;
import app.chalo.compose.components.userprofile.GenderCardSelectionKt;
import app.chalo.electricitybill.ui.ebillamount.EnterAmountCardUIState;
import app.chalo.electricitybill.ui.ebillamount.ui.EBillAmountScreenKt;
import app.chalo.home.ui.history.compose.components.EmptyScreenViewKt;
import app.chalo.home.ui.history.uistate.TextWithBackgroundUiState;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionViewState;
import app.chalo.multimodalticket.ui.TicketSelectionContainerUIState;
import app.chalo.multimodalticket.ui.composables.FullJourneyTicketCardComposableKt;
import app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionMainScreenKt;
import app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionBottomSheetComposableKt;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerFareUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionBottomSheetUIState;
import app.chalo.multimodalticket.ui.uistates.PassengerSelectionItemsContainerUIState;
import app.chalo.ondc.model.app.response.OndcFareBreakupUiModel;
import app.chalo.productsummary.ui.compose.components.FareSplitComponentKt;
import app.chalo.productsummary.ui.data.DashedLineUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.uistate.dialog.GenderRadioGroupUIState;
import app.chalo.uistate.fromto.FromToSelectionContainerKt;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import app.chalo.uistate.userprofile.GenderCardSelectionUIState;
import app.chalo.uistate.userprofile.GenderCardUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerToolbarUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerUiState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreenUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18984a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ox(Object obj, Object obj2, int i, int i2) {
        this.f18984a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18984a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DefaultBasicAlertDialogOverride.BasicAlertDialog$lambda$0((DefaultBasicAlertDialogOverride) this.c, (BasicAlertDialogOverrideScope) this.d, this.b, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$23((DefaultModalWideNavigationRailOverride) this.c, (ModalWideNavigationRailOverrideScope) this.d, this.b, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DefaultNavigationBarOverride.NavigationBar$lambda$0((DefaultNavigationBarOverride) this.c, (NavigationBarOverrideScope) this.d, this.b, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return DefaultNavigationRailOverride.NavigationRail$lambda$0((DefaultNavigationRailOverride) this.c, (NavigationRailOverrideScope) this.d, this.b, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return DefaultShortNavigationBarOverride.ShortNavigationBar$lambda$0((DefaultShortNavigationBarOverride) this.c, (ShortNavigationBarOverrideScope) this.d, this.b, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$16((DefaultSingleRowTopAppBarOverride) this.c, (SingleRowTopAppBarOverrideScope) this.d, this.b, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$1((TextContextMenuSession) this.c, (TextContextMenuData) this.d, this.b, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$28((DefaultTwoRowsTopAppBarOverride) this.c, (TwoRowsTopAppBarOverrideScope) this.d, this.b, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return DefaultWideNavigationRailOverride.WideNavigationRail$lambda$0((DefaultWideNavigationRailOverride) this.c, (WideNavigationRailOverrideScope) this.d, this.b, (Composer) obj, iIntValue9);
            case 9:
                ((Integer) obj2).getClass();
                DirectValidationMainScreenUIKt.e((Modifier) this.c, (TicketCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).intValue();
                DirectValidationMainScreenUIKt.f((QRScannerViewState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                DirectValidationMainScreenUIKt.c((Modifier) this.c, (QRScannerViewState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                DirectValidationMainScreenUIKt.a((QRScannerToolbarUIState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                DirectValidationMainScreenUIKt.d((Modifier) this.c, (QrContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).getClass();
                EBillAmountScreenKt.a((Modifier) this.c, (EnterAmountCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).getClass();
                EmptyScreenViewKt.a((Modifier) this.c, (TextWithBackgroundUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).getClass();
                FareBreakupSectionKt.d((Modifier) this.c, (OndcFareBreakupUiModel) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                FareSplitComponentKt.b((Modifier) this.c, (PriceDetailsUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).getClass();
                FareSplitComponentKt.a((Modifier) this.c, (DashedLineUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).getClass();
                FromToSelectionContainerKt.a((Modifier) this.c, (StopBasedMetroFromToSelectionContainerUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).intValue();
                FullJourneyTicketCardComposableKt.b((Modifier) this.c, (FullJourneyTicketCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).getClass();
                GenderCardSelectionKt.a((Modifier) this.c, (GenderCardSelectionUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                GenderCardSelectionKt.b((Modifier) this.c, (GenderCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                GenderSelectionDialogKt.a((GenderRadioGroupUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                GenericSuccessScreenWithImageMsgAndCtaKt.a((Modifier) this.c, (StandardSuccessScreenUIState.SuccessWithGifMsgAndCta) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                GroupTicketLegSelectionMainScreenKt.b((GroupTicketLegSelectionViewState) this.c, (SheetState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).getClass();
                GroupTicketLegSelectionMainScreenKt.c((Modifier) this.c, (TicketSelectionContainerUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                GroupTicketPassengerSelectionBottomSheetComposableKt.b((Modifier) this.c, (GroupTicketPassengerFareUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).getClass();
                GroupTicketPassengerSelectionBottomSheetComposableKt.c((Modifier) this.c, (GroupTicketPassengerSelectionBottomSheetUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                GroupTicketPassengerSelectionBottomSheetComposableKt.e((Modifier) this.c, (PassengerSelectionItemsContainerUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
