package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.appsupport.uistate.BookingHelpBottomSheetUIStateType;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialogUIState;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.compose.components.ChaloAlertTextKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.RowWithTwoTextKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindow;
import app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.multimodal.FromToStopComposableKt;
import app.chalo.compose.components.qr.QrCodeComponentKt;
import app.chalo.compose.components.userprofile.GenderCardSelectionKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationViewState;
import app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenKt;
import app.chalo.electricitybill.ui.paymenthistory.EBillHistoryItemUISpecs;
import app.chalo.electricitybill.ui.paymenthistory.EBillHistoryItemUIState;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.chalobus.ChaloBusPassHistory;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionBottomSheetUiState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionCardUiState;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUISpecs;
import app.chalo.multimodalticket.ui.FullJourneyTicketCardUIState;
import app.chalo.multimodalticket.ui.composables.FullJourneyTicketCardComposableKt;
import app.chalo.multimodalticket.ui.uistates.FareBreakupItemUIState;
import app.chalo.multimodalticket.ui.uistates.FareBreakupLegSectionUIState;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUISpecs;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionUiModel;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.WelcomeScreenConfig;
import app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUISpec;
import app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanelUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.FareMappingFailedBottomSheetUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.PassAlreadyAvailedBottomSheetUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassConfirmBtnUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangement;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.dialog.CalendarMonthUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.userprofile.GenderCardSelectionUIState;
import app.chalo.uistate.userprofile.GenderCardUIState;
import app.chalo.utils.CommonHtmlParserImpl;
import app.chalo.utils.HtmlParserKt;
import app.chalo.utils.HtmlTag;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetailsBottomsheetInfo;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerUiState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.ValidationBottomCtaContainerUiState;
import com.google.android.gms.maps.model.Marker;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.b;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11257a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i) {
        this.f11257a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) this.b;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1878021490, iIntValue, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreenUI.<anonymous>.<anonymous> (DirectValidationMainScreenUI.kt:81)");
            }
            StandardErrorScreenKt.c(errorWithMsgAndRetry, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        QRScannerViewState qRScannerViewState = (QRScannerViewState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(825299244, iIntValue, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.ValidationScreenContent.<anonymous>.<anonymous>.<anonymous> (DirectValidationMainScreenUI.kt:127)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ValidationBottomCtaContainerUiState validationBottomCtaContainerUiState = qRScannerViewState.i;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, validationBottomCtaContainerUiState.f10743a.f10742a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AlertTextWithIconUiState alertTextWithIconUiState = validationBottomCtaContainerUiState.c;
            if (alertTextWithIconUiState == null) {
                composer.startReplaceGroup(224881121);
            } else {
                composer.startReplaceGroup(224881122);
                ChaloAlertTextKt.a(null, alertTextWithIconUiState, composer, 0);
                ChaloSpacersKt.a(validationBottomCtaContainerUiState.f10743a.d, composer, 0);
            }
            composer.endReplaceGroup();
            if (b3.s(6, 0, composer, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), validationBottomCtaContainerUiState.b.d)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        QrContainerUiState qrContainerUiState = (QrContainerUiState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1920924171, iIntValue, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.QrContainerUi.<anonymous>.<anonymous> (DirectValidationMainScreenUI.kt:234)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            QrCodeComponentKt.a(ChaloThemeKt.c(companion, qrContainerUiState.e.b.f10734a), SizeKt.m828size3ABfNKs(companion, ChaloThemeHelper.a().w), qrContainerUiState.e.f10735a, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        EBillPaymentConfirmationViewState eBillPaymentConfirmationViewState = (EBillPaymentConfirmationViewState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500739897, iIntValue, -1, "app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenUI.<anonymous>.<anonymous>.<anonymous> (EBillPaymentConfirmationScreen.kt:100)");
            }
            EBillPaymentConfirmationScreenKt.d(eBillPaymentConfirmationViewState.f, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        EBillHistoryItemUIState eBillHistoryItemUIState = (EBillHistoryItemUIState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(85287742, iIntValue, -1, "app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryItemUI.<anonymous> (EBillPaymentHistoryScreen.kt:87)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = eBillHistoryItemUIState.f;
            EBillHistoryItemUISpecs eBillHistoryItemUISpecs = eBillHistoryItemUIState.f2596a;
            Modifier modifierC = ChaloThemeKt.c(ComposeUtilsKt.b(modifierFillMaxWidth$default, uiEventHandler$Companion$fromLambda$1, composer, 6, 6), eBillHistoryItemUISpecs.c);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.c(eBillHistoryItemUIState.b, null, null, null, composer, 0, 14);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            TextKt.c(eBillHistoryItemUIState.c, null, null, null, composer, 0, 14);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, eBillHistoryItemUISpecs.b), composer, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i3), composerM3915constructorimpl3));
            TextKt.c(eBillHistoryItemUIState.d, null, null, null, composer, 0, 14);
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            TextKt.c(eBillHistoryItemUIState.e, null, null, null, composer, 0, 14);
            if (r1.k(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        FullJourneyTicketCardUIState fullJourneyTicketCardUIState = (FullJourneyTicketCardUIState) this.b;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286929299, iIntValue, -1, "app.chalo.multimodalticket.ui.composables.FullJourneyTicketCardComposable.<anonymous> (FullJourneyTicketCardComposable.kt:36)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            FullJourneyTicketCardUISpecs fullJourneyTicketCardUISpecs = fullJourneyTicketCardUIState.f5926a;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(fullJourneyTicketCardUISpecs.b), null, 2, null), fullJourneyTicketCardUISpecs.f5925a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpecialFeatureTagListComposableKt.b(fullJourneyTicketCardUIState.b, null, composer, 0, 2);
            Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fullJourneyTicketCardUISpecs.h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(fullJourneyTicketCardUISpecs.i), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierC2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierA);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i3), composerM3915constructorimpl3));
            TextUIState.ChaloTextUIState chaloTextUIState = fullJourneyTicketCardUIState.c;
            if (chaloTextUIState == null) {
                composer.startReplaceGroup(-1780773321);
            } else {
                composer.startReplaceGroup(-1780773320);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer, 0, 13);
            }
            composer.endReplaceGroup();
            FullJourneyTicketCardComposableKt.b(ChaloThemeKt.c(companion, fullJourneyTicketCardUISpecs.f), fullJourneyTicketCardUIState, composer, 0);
            FromToStopComposableKt.a(fullJourneyTicketCardUIState.f, composer, 0);
            composer.endNode();
            RadioButtonUIState radioButtonUIState = fullJourneyTicketCardUIState.g;
            if (radioButtonUIState == null) {
                composer.startReplaceGroup(-1442829203);
            } else {
                composer.startReplaceGroup(-1442829202);
                ChaloRadioButtonKt.a(ChaloThemeKt.c(companion, fullJourneyTicketCardUISpecs.g), radioButtonUIState, composer, 0, 0);
            }
            composer.endReplaceGroup();
            if (r1.k(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        GenderCardSelectionUIState genderCardSelectionUIState = (GenderCardSelectionUIState) this.b;
        int iIntValue = ((Integer) obj).intValue();
        Composer composer = (Composer) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= composer.changed(iIntValue) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1824363586, iIntValue2, -1, "app.chalo.compose.components.userprofile.GenderCardsSelectionComposable.<anonymous>.<anonymous> (GenderCardSelection.kt:42)");
            }
            GenderCardSelectionKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (GenderCardUIState) genderCardSelectionUIState.c.get(iIntValue), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        FareBreakupSectionUIState fareBreakupSectionUIState = (FareBreakupSectionUIState) this.b;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1195583876, iIntValue, -1, "app.chalo.multimodalticket.ui.composables.FareBreakupComposable.<anonymous> (GroupTicketPassengerSelectionBottomSheetComposable.kt:157)");
            }
            Modifier modifierWidth = IntrinsicKt.width(Modifier.INSTANCE, IntrinsicSize.Max);
            FareBreakupSectionUISpecs fareBreakupSectionUISpecs = fareBreakupSectionUIState.f5960a;
            Modifier modifierC = ChaloThemeKt.c(modifierWidth, fareBreakupSectionUISpecs.f5959a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(160662711);
            for (FareBreakupLegSectionUIState fareBreakupLegSectionUIState : fareBreakupSectionUIState.c) {
                Arrangement.HorizontalOrVertical horizontalOrVerticalA = UiArrangementKt.a(new UiArrangement.HorizontalOrVertical.SpacedBy(ChaloTheme.b(composer, 0).f));
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalA, Alignment.INSTANCE.getStart(), composer, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composer.startReplaceGroup(764937035);
                ArrayList arrayList = fareBreakupLegSectionUIState.f5958a;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    FareBreakupItemUIState fareBreakupItemUIState = (FareBreakupItemUIState) arrayList.get(i3);
                    RowWithTwoTextKt.a(fareBreakupItemUIState.f5957a, fareBreakupItemUIState.b, null, dq.a(columnScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), null, false, fareBreakupSectionUISpecs.c, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
                    size = size;
                    arrayList = arrayList;
                }
                composer.endReplaceGroup();
                composer.endNode();
                DashedDividerKt.a(fareBreakupSectionUIState.e, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), fareBreakupSectionUISpecs.b), composer, 0);
            }
            composer.endReplaceGroup();
            FareBreakupItemUIState fareBreakupItemUIState2 = fareBreakupSectionUIState.d;
            RowWithTwoTextKt.a(fareBreakupItemUIState2.f5957a, fareBreakupItemUIState2.b, null, dq.a(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), null, false, fareBreakupSectionUISpecs.c, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        long j;
        int i = this.f11257a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22((BottomAppBarScrollBehavior) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 1:
                ProductAndUserDetailsBottomsheetInfo productAndUserDetailsBottomsheetInfo = (ProductAndUserDetailsBottomsheetInfo) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1284949933, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.ProductAndUserDetails.<anonymous> (BleValidationScreen.android.kt:1241)");
                    }
                    BleValidationScreen_androidKt.D(productAndUserDetailsBottomsheetInfo, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                BookingHelpScreenViewState bookingHelpScreenViewState = (BookingHelpScreenViewState) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1166315817, iIntValue2, -1, "app.chalo.appsupport.BookingHelpScreenUI.<anonymous> (BookingHelpScreenUI.kt:46)");
                    }
                    BookingHelpBottomSheetUIStateType bookingHelpBottomSheetUIStateType = bookingHelpScreenViewState.e;
                    if (bookingHelpBottomSheetUIStateType instanceof BookingHelpBottomSheetUIStateType.Generic) {
                        composer3.startReplaceGroup(-570793260);
                        BottomSheetContentWithIconTitleSubTitleKt.a(null, ((BookingHelpBottomSheetUIStateType.Generic) bookingHelpScreenViewState.e).b, composer3, 0, 1);
                        composer3.endReplaceGroup();
                    } else {
                        if (!Intrinsics.d(bookingHelpBottomSheetUIStateType, BookingHelpBottomSheetUIStateType.None.b)) {
                            throw pk0.p(composer3, -156963221);
                        }
                        composer3.startReplaceGroup(-570602889);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CancellableContinuationImpl.f;
                ((b) obj4).invoke((Throwable) obj);
                return unit;
            case 4:
                ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState = (ChaloBusRouteSuggestionCardUiState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-319227139, iIntValue3, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloBusRouteInfoMainScreen.kt:234)");
                    }
                    if (chaloBusRouteSuggestionCardUiState == null) {
                        composer4.startReplaceGroup(-1038063374);
                    } else {
                        composer4.startReplaceGroup(-1038063373);
                        ChaloBusRouteInfoMainScreenKt.n(chaloBusRouteSuggestionCardUiState, composer4, 0);
                    }
                    composer4.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 5:
                ChaloBusRouteInfoViewState chaloBusRouteInfoViewState = (ChaloBusRouteInfoViewState) obj4;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(485683847, iIntValue4, -1, "app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionBottomSheetHandler.<anonymous> (ChaloBusRouteInfoMainScreen.kt:170)");
                    }
                    ChaloBusRouteSuggestionBottomSheetUiState chaloBusRouteSuggestionBottomSheetUiState = chaloBusRouteInfoViewState.d;
                    if (chaloBusRouteSuggestionBottomSheetUiState instanceof ChaloBusRouteSuggestionBottomSheetUiState.Form) {
                        composer5.startReplaceGroup(-737169108);
                        ChaloBusRouteInfoMainScreenKt.m((ChaloBusRouteSuggestionBottomSheetUiState.Form) chaloBusRouteSuggestionBottomSheetUiState, composer5, 0);
                        composer5.endReplaceGroup();
                    } else if (chaloBusRouteSuggestionBottomSheetUiState instanceof ChaloBusRouteSuggestionBottomSheetUiState.Success) {
                        composer5.startReplaceGroup(-736985371);
                        ChaloBusRouteInfoMainScreenKt.p((ChaloBusRouteSuggestionBottomSheetUiState.Success) chaloBusRouteSuggestionBottomSheetUiState, composer5, 0);
                        composer5.endReplaceGroup();
                    } else {
                        if (chaloBusRouteSuggestionBottomSheetUiState != null) {
                            throw pk0.p(composer5, -1409257257);
                        }
                        composer5.startReplaceGroup(-736843081);
                        gf.r(Modifier.INSTANCE, ChaloTheme.b(composer5, 0).b, composer5, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 6:
                ChaloBusPassHistory chaloBusPassHistory = (ChaloBusPassHistory) obj4;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1010650021, iIntValue5, -1, "app.chalo.home.ui.chalobus.ChaloBusPassCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:1542)");
                    }
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(chaloBusPassHistory.d, null, ChaloTheme.a(composer6, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 131066);
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(" • ", null, ChaloTheme.a(composer6, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer6, 0)), composer6, 6, 0, 131066);
                    String str = chaloBusPassHistory.g;
                    if (str == null) {
                        composer6.startReplaceGroup(-553507246);
                        composer6.endReplaceGroup();
                    } else {
                        composer6.startReplaceGroup(-553507245);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer6, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer6, 0)), composer6, 0, 0, 131066);
                        composer6.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 7:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                String amPm = (String) obj3;
                Intrinsics.i(amPm, "amPm");
                ((SurveyTimePickerDialogUIState) obj4).c.invoke(num, num2, amPm);
                return unit;
            case 8:
                CardTransactionUiModel cardTransactionUiModel = (CardTransactionUiModel) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer7.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-501271114, iIntValue6, -1, "app.chalo.ncmc.ui.transactionhistory.compose.TransactionCard.<anonymous> (ChaloCardTransactionsScreen.kt:442)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer7, 0).h);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer7, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ChaloCardTransactionsScreenKt.b(i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), cardTransactionUiModel, composer7, 0);
                    ChaloSpacersKt.w(composer7, 0);
                    if (cardTransactionUiModel.e != null) {
                        composer7.startReplaceGroup(-687387776);
                        String str2 = cardTransactionUiModel.e;
                        TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composer7, 0));
                        if (cardTransactionUiModel.f6439a == CardTransactionTypeUiModel.RECHARGE) {
                            composer7.startReplaceGroup(-687163336);
                            j = ChaloTheme.a(composer7, 0).L;
                            composer7.endReplaceGroup();
                        } else {
                            composer7.startReplaceGroup(-687070398);
                            j = ChaloTheme.a(composer7, 0).e;
                            composer7.endReplaceGroup();
                        }
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(textStyleG, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer7, 0, 0, 131070);
                        composer = composer7;
                    } else {
                        composer = composer7;
                        composer.startReplaceGroup(-703572752);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 9:
                CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState = (CardWithTextLeftAndRightIconUiState) obj4;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer8.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(263591248, iIntValue7, -1, "app.chalo.uistate.cardwithtextleftandrighticon.ChaloCardWithTextLeftAndRightIconView.<anonymous> (ChaloCardWithTextLeftAndRightIconView.kt:34)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), cardWithTextLeftAndRightIconUiState.f9926a.f9925a);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer8, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer8, modifierM784padding3ABfNKs2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor2);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageUIState imageUIState = cardWithTextLeftAndRightIconUiState.b;
                    if (imageUIState == null) {
                        composer8.startReplaceGroup(586525948);
                        composer8.endReplaceGroup();
                    } else {
                        composer8.startReplaceGroup(586525949);
                        CommonImageKt.a(imageUIState, null, false, composer8, 0, 6);
                        nf1.t(companion3, cardWithTextLeftAndRightIconUiState.f9926a.d, composer8, 0);
                    }
                    TextKt.c(cardWithTextLeftAndRightIconUiState.c, null, null, null, composer8, 0, 14);
                    SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composer8, 0);
                    ImageUIState imageUIState2 = cardWithTextLeftAndRightIconUiState.d;
                    if (imageUIState2 == null) {
                        composer8.startReplaceGroup(586897235);
                    } else {
                        composer8.startReplaceGroup(586897236);
                        CommonImageKt.a(imageUIState2, null, false, composer8, 0, 6);
                    }
                    composer8.endReplaceGroup();
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 10:
                ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow = (ChaloMapMarkerInfoWindow) obj4;
                Marker it = (Marker) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1583076539, iIntValue8, -1, "app.chalo.compose.components.chalomap.MapMarkerInfoWindow.<anonymous> (ChaloMap.android.kt:483)");
                }
                Function2 function2 = chaloMapMarkerInfoWindow != null ? chaloMapMarkerInfoWindow.f1868a : null;
                if (function2 == null) {
                    composer9.startReplaceGroup(-1602666082);
                } else {
                    composer9.startReplaceGroup(918132419);
                    function2.invoke(composer9, 0);
                }
                composer9.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 11:
                CalendarMonthUIState calendarMonthUIState = (CalendarMonthUIState) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer10.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(697609595, iIntValue9, -1, "app.chalo.compose.components.dialogs.ChaloMultiSelectDatePicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloMultiSelectDatePicker.kt:104)");
                    }
                    ChaloMultiSelectDatePickerKt.d(calendarMonthUIState, composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 12:
                SnackbarUIState snackbarUIState = (SnackbarUIState) obj4;
                RowScope ChaloSnackbarContainer = (RowScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                float f = ChaloSnackbarKt.f1826a;
                Intrinsics.i(ChaloSnackbarContainer, "$this$ChaloSnackbarContainer");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= composer11.changed(ChaloSnackbarContainer) ? 4 : 2;
                }
                if (composer11.shouldExecute((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(154816655, iIntValue10, -1, "app.chalo.compose.components.ChaloSnackbar.<anonymous> (ChaloSnackbar.kt:67)");
                    }
                    boolean zChanged = composer11.changed(snackbarUIState.f10070a);
                    Object objRememberedValue = composer11.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        TextUIState.ChaloTextUIState chaloTextUIStateA = snackbarUIState.f10070a;
                        if (chaloTextUIStateA.d == null) {
                            chaloTextUIStateA = TextUIState.ChaloTextUIState.a(chaloTextUIStateA, null, ChaloColorToken.White.f9870a, null, 8187);
                        }
                        objRememberedValue = chaloTextUIStateA;
                        composer11.updateRememberedValue(objRememberedValue);
                    }
                    ChaloTextViewKt.a(i41.a(ChaloSnackbarContainer, Modifier.INSTANCE, 1.0f, false, 2, null), (TextUIState.ChaloTextUIState) objRememberedValue, null, null, composer11, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 13:
                WelcomeScreenConfig welcomeScreenConfig = (WelcomeScreenConfig) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer12.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632592219, iIntValue11, -1, "app.chalo.onboarding.citylocationselection.ui.CityWelcomeScreen.<anonymous>.<anonymous> (CityLocationSelectionScreen.kt:267)");
                    }
                    IconType iconType = welcomeScreenConfig.b;
                    LottieType lottieType = welcomeScreenConfig.c;
                    if (iconType != null) {
                        composer12.startReplaceGroup(761814406);
                        ImageKt.Image(PainterResourceHelperKt.a(welcomeScreenConfig.b, composer12, 0), (String) null, SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer12, 0).d0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer12, Painter.$stable | 48, 120);
                        composer12.endReplaceGroup();
                    } else {
                        Composer composer13 = composer12;
                        if (lottieType != null) {
                            composer13.startReplaceGroup(762187801);
                            ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(lottieType, composer13, 0), Integer.MAX_VALUE, false, composer13, 48, 28), (String) null, SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer13, 0).d0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer13, Painter.$stable | 48, 120);
                            composer13 = composer13;
                        } else {
                            composer13.startReplaceGroup(751432413);
                        }
                        composer13.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 14:
                CitySelectionSearchPanelUIState citySelectionSearchPanelUIState = (CitySelectionSearchPanelUIState) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer14.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(170150943, iIntValue12, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanel.<anonymous> (CitySelectionScreen.kt:426)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    CitySelectionSearchPanelUIState.SearchBarCard searchBarCard = (CitySelectionSearchPanelUIState.SearchBarCard) citySelectionSearchPanelUIState;
                    CitySelectionSearchPanelUISpec citySelectionSearchPanelUISpec = searchBarCard.f6632a;
                    Modifier modifierB = ComposeUtilsKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(companion5, citySelectionSearchPanelUISpec.f6631a), ChaloThemeKt.d(citySelectionSearchPanelUISpec.d.f9924a)), searchBarCard.d, composer14, 0, 6);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer14, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer14, modifierB);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor3);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion6, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    CommonImageKt.a(searchBarCard.b, ChaloThemeKt.c(companion5, citySelectionSearchPanelUISpec.b), false, composer14, 0, 4);
                    TextKt.c(searchBarCard.c, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), null, null, composer14, 48, 12);
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 15:
                String name = (String) obj;
                Map attributes = (Map) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.i(name, "name");
                Intrinsics.i(attributes, "attributes");
                HtmlTag htmlTagA = HtmlParserKt.a(name);
                vo1.x("TAG_OPEN----->", htmlTagA.getIdentifier(), "message");
                ArrayDeque arrayDeque = ((CommonHtmlParserImpl) obj4).f10420a;
                if (((HtmlTag) arrayDeque.e()) != htmlTagA) {
                    arrayDeque.addLast(htmlTagA);
                    return unit;
                }
                throw new IllegalStateException("Tag " + htmlTagA + " opened twice");
            case 16:
                DrawableResource drawableResource = (DrawableResource) obj4;
                String it2 = (String) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                Intrinsics.i(it2, "it");
                if (composer15.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1633199017, iIntValue13, -1, "app.chalo.compose.components.inlineImagesContent.<anonymous>.<anonymous> (ComposeUtils.kt:169)");
                    }
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer15.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer15.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor4);
                    } else {
                        composer15.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer15);
                    pk0.v(companion7, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(ImageResourcesKt.a(drawableResource, composer15), "", (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer15, Painter.$stable | 24624, 108);
                    composer15.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 17:
                SuperPassConfirmBtnUIState superPassConfirmBtnUIState = (SuperPassConfirmBtnUIState) obj4;
                ColumnScope Card3 = (ColumnScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i(Card3, "$this$Card");
                if (composer16.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-941639144, iIntValue14, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassSubmitBtn.<anonymous>.<anonymous> (ConfirmSuperPassScreen.kt:255)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), superPassConfirmBtnUIState.d);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion9.getStart(), composer16, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer16, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer16.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer16, modifierC);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion10.getConstructor();
                    if (composer16.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer16.startReusableNode();
                    if (composer16.getInserting()) {
                        composer16.createNode(constructor5);
                    } else {
                        composer16.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer16);
                    pk0.v(companion10, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl5, Integer.valueOf(i6), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion9.getTop(), composer16, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer16, 0);
                    int i7 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer16.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer16, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
                    if (composer16.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer16.startReusableNode();
                    if (composer16.getInserting()) {
                        composer16.createNode(constructor6);
                    } else {
                        composer16.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer16);
                    pk0.v(companion10, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl6, Integer.valueOf(i7), composerM3915constructorimpl6));
                    TextKt.c(superPassConfirmBtnUIState.b, i41.a(RowScopeInstance.INSTANCE, companion8, 1.0f, false, 2, null), null, null, composer16, 0, 12);
                    TextKt.c(superPassConfirmBtnUIState.c, null, null, null, composer16, 0, 14);
                    composer16.endNode();
                    if (b3.s(0, 0, composer16, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), superPassConfirmBtnUIState.e), superPassConfirmBtnUIState.f8397a)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 18:
                PassAlreadyAvailedBottomSheetUIState passAlreadyAvailedBottomSheetUIState = (PassAlreadyAvailedBottomSheetUIState) obj4;
                ColumnScope ModalBottomSheet = (ColumnScope) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                if (composer17.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1582906848, iIntValue15, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.PassAlreadyAvailedBottomSheet.<anonymous> (ConfirmSuperPassScreen.kt:167)");
                    }
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), passAlreadyAvailedBottomSheetUIState.d);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer17, 48);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer17, 0);
                    int i8 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer17.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer17, modifierC2);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion12.getConstructor();
                    if (composer17.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer17.startReusableNode();
                    if (composer17.getInserting()) {
                        composer17.createNode(constructor7);
                    } else {
                        composer17.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer17);
                    pk0.v(companion12, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl7, Integer.valueOf(i8), composerM3915constructorimpl7));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.c(passAlreadyAvailedBottomSheetUIState.f8389a, SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), null, null, composer17, 48, 12);
                    TextKt.c(passAlreadyAvailedBottomSheetUIState.b, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), passAlreadyAvailedBottomSheetUIState.e), null, null, composer17, 0, 12);
                    if (b3.s(0, 0, composer17, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion11, 0.0f, 1, null), passAlreadyAvailedBottomSheetUIState.f), passAlreadyAvailedBottomSheetUIState.c)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 19:
                FareMappingFailedBottomSheetUIState fareMappingFailedBottomSheetUIState = (FareMappingFailedBottomSheetUIState) obj4;
                ColumnScope ModalBottomSheet2 = (ColumnScope) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet2, "$this$ModalBottomSheet");
                if (composer18.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-365771830, iIntValue16, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.FareMappingFailedBottomSheet.<anonymous> (ConfirmSuperPassScreen.kt:205)");
                    }
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    Modifier modifierC3 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), fareMappingFailedBottomSheetUIState.e);
                    Alignment.Companion companion14 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion14.getCenterHorizontally(), composer18, 48);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer18, 0);
                    int i9 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer18.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer18, modifierC3);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion15.getConstructor();
                    if (composer18.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer18.startReusableNode();
                    if (composer18.getInserting()) {
                        composer18.createNode(constructor8);
                    } else {
                        composer18.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer18);
                    pk0.v(companion15, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion15, composerM3915constructorimpl8, Integer.valueOf(i9), composerM3915constructorimpl8));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion14.getTopStart(), false);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer18, 0);
                    int i10 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer18.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer18, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor9 = companion15.getConstructor();
                    if (composer18.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer18.startReusableNode();
                    if (composer18.getInserting()) {
                        composer18.createNode(constructor9);
                    } else {
                        composer18.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer18);
                    pk0.v(companion15, composerM3915constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion15, composerM3915constructorimpl9, Integer.valueOf(i10), composerM3915constructorimpl9));
                    CommonImageKt.a(fareMappingFailedBottomSheetUIState.d, BoxScopeInstance.INSTANCE.align(companion13, companion14.getCenterEnd()), false, composer18, 0, 4);
                    ChaloSpacersKt.o(composer18, 0);
                    composer18.endNode();
                    TextKt.c(fareMappingFailedBottomSheetUIState.f8388a, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), fareMappingFailedBottomSheetUIState.f), null, null, composer18, 0, 12);
                    ChaloFilledButtonKt.a(0, 0, composer18, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), fareMappingFailedBottomSheetUIState.g), fareMappingFailedBottomSheetUIState.b);
                    if (b3.s(0, 0, composer18, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), fareMappingFailedBottomSheetUIState.h), fareMappingFailedBottomSheetUIState.c)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 20:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$5((CoreTextFieldSemanticsModifierNode) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            case 21:
                return a(obj, obj2, obj3);
            case 22:
                return c(obj, obj2, obj3);
            case 23:
                return d(obj, obj2, obj3);
            case 24:
                return e(obj, obj2, obj3);
            case 25:
                return f(obj, obj2, obj3);
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return h(obj, obj2, obj3);
            case 28:
                return i(obj, obj2, obj3);
            default:
                HomeScreenInfoHelper homeScreenInfoHelper = (HomeScreenInfoHelper) obj4;
                HomeComponent.TabComponentEntry tabComponentEntry = (HomeComponent.TabComponentEntry) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-483821679, iIntValue17, -1, "app.chalo.home.ui.base.HomeTabPager.<anonymous> (HomeScreenMainDecompose.kt:771)");
                }
                if (tabComponentEntry == null) {
                    composer19.startReplaceGroup(378645504);
                    ChaloCircularLoadingBoxKt.a(null, composer19, 0);
                    composer19.endReplaceGroup();
                } else {
                    composer19.startReplaceGroup(378703040);
                    HomeScreenMainDecomposeKt.g(tabComponentEntry, homeScreenInfoHelper, composer19, iIntValue17 & 14);
                    composer19.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
        }
    }
}
