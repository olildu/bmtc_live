package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.compose.ChaloHeaderTextComposableKt;
import app.chalo.compose.ContactSupportTextComposableKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewIntent;
import app.chalo.home.ui.selectridescreen.SelectRideIntent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.validationsdk.blevalidation.ui.BleValidationIntent;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.ComposableSingletons$BleValidationScreen_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ab implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ab(Function1 function1, int i) {
        this.f253a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f253a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                List selectedTags = (List) obj2;
                Intrinsics.i(selectedTags, "selectedTags");
                function1.invoke(new BleValidationIntent.RideFeedbackRatingSubmittedIntent(((Integer) obj).intValue(), (String) obj3, selectedTags));
                return unit;
            case 1:
                RowScope ChaloToolBar = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1878115179, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.BleToolbarDisplayToolbar.<anonymous> (BleValidationScreen.android.kt:223)");
                    }
                    Modifier modifierA = PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Help");
                    boolean zChanged = composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ya(function1, 8);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    IconButtonKt.IconButton((Function0) objRememberedValue, modifierA, false, null, null, null, ComposableSingletons$BleValidationScreen_androidKt.b, composer, 1572864, 60);
                    BleValidationScreen_androidKt.d(function1, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 2:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(25476787, iIntValue2, -1, "app.chalo.validationsdk.blevalidation.ui.BleTurnOnFullScreenExplainerFooterUI.<anonymous> (BleValidationScreen.android.kt:841)");
                    }
                    BleValidationScreen_androidKt.h(function1, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                String amOrPM = (String) obj3;
                Intrinsics.i(amOrPM, "amOrPM");
                function1.invoke(new ChaloBusRouteInfoViewIntent.RouteSuggestionReachBySelectedIntent(iIntValue3, iIntValue4, amOrPM));
                return unit;
            case 4:
                int iIntValue5 = ((Integer) obj).intValue();
                int iIntValue6 = ((Integer) obj2).intValue();
                String amOrPm = (String) obj3;
                Intrinsics.i(amOrPm, "amOrPm");
                function1.invoke(new ChaloBusViewIntent.OnTimeChangeIntent(iIntValue5, iIntValue6, amOrPm));
                return unit;
            case 5:
                int iIntValue7 = ((Integer) obj).intValue();
                int iIntValue8 = ((Integer) obj2).intValue();
                String amPm = (String) obj3;
                Intrinsics.i(amPm, "amPm");
                function1.invoke(new ChaloBusUserProfileSurveyIntent.TimePickerSelectionChanged(iIntValue7, iIntValue8, amPm));
                return unit;
            case 6:
                return DragGestureDetectorKt.detectDragGestures$lambda$3(function1, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
            case 7:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer3.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-316259398, iIntValue9, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:350)");
                    }
                    boolean zChanged2 = composer3.changed(function1);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new fq0(function1, 6);
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    PbBulkBookingRideDetailsScreenKt.k((Function0) objRememberedValue2, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 8:
                int iIntValue10 = ((Integer) obj).intValue();
                int iIntValue11 = ((Integer) obj2).intValue();
                String amOrPM2 = (String) obj3;
                Intrinsics.i(amOrPM2, "amOrPM");
                function1.invoke(new PremiumBusStopSelectionIntent.OnTimeChangeIntent(iIntValue10, iIntValue11, amOrPM2));
                return unit;
            case 9:
                int iIntValue12 = ((Integer) obj).intValue();
                int iIntValue13 = ((Integer) obj2).intValue();
                String amOrPm2 = (String) obj3;
                Intrinsics.i(amOrPm2, "amOrPm");
                function1.invoke(new SelectRideIntent.OnTimeChangeIntent(iIntValue12, iIntValue13, amOrPm2));
                return unit;
            case 10:
                int iIntValue14 = ((Integer) obj).intValue();
                int iIntValue15 = ((Integer) obj2).intValue();
                ((Boolean) obj3).getClass();
                function1.invoke(new TripPlannerResultIntent.UpdateSelectedTimeIntent(iIntValue14, iIntValue15));
                return unit;
            case 11:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer4.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(413708173, iIntValue16, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedResultsComposable.<anonymous>.<anonymous>.<anonymous> (UniversalPickerComposable.kt:254)");
                    }
                    boolean zChanged3 = composer4.changed(function1);
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new bm1(function1, 9);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    UniversalPickerComposableKt.f((Function0) objRememberedValue3, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 12:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer5.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1927728580, iIntValue17, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedResultsComposable.<anonymous>.<anonymous>.<anonymous> (UniversalPickerComposable.kt:262)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloDividerComposableKt.b(null, 0L, composer5, 0, 3);
                    boolean zChanged4 = composer5.changed(function1);
                    Object objRememberedValue4 = composer5.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new bm1(function1, 10);
                        composer5.updateRememberedValue(objRememberedValue4);
                    }
                    ChaloHeaderTextComposableKt.a((Function0) objRememberedValue4, composer5, 0);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 13:
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                Intrinsics.i(item4, "$this$item");
                if (composer6.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1878404879, iIntValue18, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentAndFavoriteComposable.<anonymous>.<anonymous>.<anonymous> (UniversalPickerComposable.kt:296)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor2);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer6);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ChaloDividerComposableKt.b(null, 0L, composer6, 0, 3);
                    boolean zChanged5 = composer6.changed(function1);
                    Object objRememberedValue5 = composer6.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new bm1(function1, 11);
                        composer6.updateRememberedValue(objRememberedValue5);
                    }
                    ChaloHeaderTextComposableKt.a((Function0) objRememberedValue5, composer6, 0);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            default:
                LazyItemScope item5 = (LazyItemScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                Intrinsics.i(item5, "$this$item");
                if (composer7.shouldExecute((iIntValue19 & 17) != 16, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1467271464, iIntValue19, -1, "app.chalo.wallet.ui.alltransactions.compose.WalletTransactionSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WalletAllTransactionsComposable.kt:108)");
                    }
                    ChaloSpacersKt.b(ChaloTheme.b(composer7, 0).k, composer7, 0);
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer7, 0).n, 0.0f, 2, null);
                    String strC = StringResourcesHelperKt.c(StringEnum.WALLET_TRANSACTIONS_X_HISTORY_SUPPORT_TEXT, new Object[]{2}, composer7, 6);
                    String strC2 = StringResourcesHelperKt.c(StringEnum.REQUEST_HISTORY, new Object[0], composer7, 6);
                    boolean zChanged6 = composer7.changed(function1);
                    Object objRememberedValue6 = composer7.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new xo1(function1, 14);
                        composer7.updateRememberedValue(objRememberedValue6);
                    }
                    ContactSupportTextComposableKt.b(modifierM786paddingVpY3zN4$default, null, strC, strC2, (Function0) objRememberedValue6, composer7, 0, 2);
                    ChaloSpacersKt.b(ChaloTheme.b(composer7, 0).g, composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
        }
    }
}
