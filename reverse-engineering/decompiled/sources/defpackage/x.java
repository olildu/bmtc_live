package defpackage;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt;
import androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutScreenKt;
import app.chalo.checkout.ui.screen.checkout.inai.compose.InaiCheckoutScreenKt;
import app.chalo.checkout.ui.screen.checkout.phonepe.compose.PhonePeCheckoutScreenKt;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenKt;
import app.chalo.checkout.ui.screen.netbanking.compose.CheckoutNetBankingScreenKt;
import app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt;
import app.chalo.checkout.ui.screen.postpayment.compose.PostPaymentMainScreenKt;
import app.chalo.checkout.ui.screen.upi.compose.UpiAppScreenKt;
import app.chalo.checkout.ui.screen.wallet.compose.WalletAppsPaymentScreenKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.ComposableSingletons$CardWithSideStepIconAndLineKt;
import app.chalo.compose.ComposableSingletons$ChaloToolBarKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposableSingletons$ChaloGridLayoutKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.core.compose.ComposableSingletons$CheckoutParentScreenKt;
import app.chalo.core.compose.ComposableSingletons$CitySelectionParentScreenKt;
import app.chalo.core.compose.ComposableSingletons$DecomposeAppKt;
import app.chalo.core.compose.DecomposeScreensKt;
import app.chalo.core.navigation.checkout.CheckoutParentComponent;
import app.chalo.core.navigation.city.CitySelectionParentComponent;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.ComposableSingletons$BottomSheetScaffoldKt;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$CitySelectionUniversalPickerScreenKt;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardInfoScreenKt;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.ncmc.ui.transactionhistory.compose.ComposableSingletons$ChaloCardTransactionsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import com.arkivanov.decompose.Child;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19973a;

    public /* synthetic */ x(int i) {
        this.f19973a = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws ClosedScopeException {
        int i = this.f19973a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 1:
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 2:
                return AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return BadgeKt.badgeBounds$lambda$7((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 4:
                Transition.Segment animateDp = (Transition.Segment) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(animateDp, "$this$animateDp");
                composer.startReplaceGroup(-1269097109);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1269097109, iIntValue, -1, "app.chalo.compose.components.ChaloTabIndicator.<anonymous> (ChaloScrollableTabRow.kt:99)");
                }
                SpringSpec springSpecSpring$default = ((Number) animateDp.getInitialState()).intValue() < ((Number) animateDp.getTargetState()).intValue() ? AnimationSpecKt.spring$default(1.0f, 800.0f, null, 4, null) : AnimationSpecKt.spring$default(1.0f, 1000.0f, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return springSpecSpring$default;
            case 5:
                Transition.Segment animateDp2 = (Transition.Segment) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(animateDp2, "$this$animateDp");
                composer2.startReplaceGroup(-1648801308);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1648801308, iIntValue2, -1, "app.chalo.compose.components.ChaloTabIndicator.<anonymous> (ChaloScrollableTabRow.kt:112)");
                }
                SpringSpec springSpecSpring$default2 = ((Number) animateDp2.getInitialState()).intValue() < ((Number) animateDp2.getTargetState()).intValue() ? AnimationSpecKt.spring$default(1.0f, 1000.0f, null, 4, null) : AnimationSpecKt.spring$default(1.0f, 800.0f, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default2;
            case 6:
                Transition.Segment animateDp3 = (Transition.Segment) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(animateDp3, "$this$animateDp");
                composer3.startReplaceGroup(-379660743);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-379660743, iIntValue3, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder.<anonymous> (ChaloScrollableTabRow.kt:146)");
                }
                SpringSpec springSpecSpring$default3 = ((Number) animateDp3.getInitialState()).intValue() < ((Number) animateDp3.getTargetState()).intValue() ? AnimationSpecKt.spring$default(1.0f, 800.0f, null, 4, null) : AnimationSpecKt.spring$default(1.0f, 1000.0f, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer3.endReplaceGroup();
                return springSpecSpring$default3;
            case 7:
                Transition.Segment animateDp4 = (Transition.Segment) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(animateDp4, "$this$animateDp");
                composer4.startReplaceGroup(-468811918);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-468811918, iIntValue4, -1, "app.chalo.compose.components.ChaloTabIndicatorWithBorder.<anonymous> (ChaloScrollableTabRow.kt:159)");
                }
                SpringSpec springSpecSpring$default4 = ((Number) animateDp4.getInitialState()).intValue() < ((Number) animateDp4.getTargetState()).intValue() ? AnimationSpecKt.spring$default(1.0f, 1000.0f, null, 4, null) : AnimationSpecKt.spring$default(1.0f, 800.0f, null, 4, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                return springSpecSpring$default4;
            case 8:
                return ComposableSingletons$BasicTextFieldKt.lambda_759698998$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return ComposableSingletons$BasicTextFieldKt.lambda_486633673$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return ComposableSingletons$BasicTextFieldKt.lambda_444370233$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return ComposableSingletons$BasicTextFieldKt.lambda__665310900$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                SnackbarHostState it = (SnackbarHostState) obj;
                boolean z = false;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda = ComposableSingletons$BottomSheetScaffoldKt.f4448a;
                Intrinsics.i(it, "it");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= composer5.changed(it) ? 4 : 2;
                }
                if ((iIntValue5 & 19) != 18) {
                    z = true;
                }
                if (composer5.shouldExecute(z, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1993148418, iIntValue5, -1, "app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.ComposableSingletons$BottomSheetScaffoldKt.lambda$-1993148418.<anonymous> (BottomSheetScaffold.kt:267)");
                    }
                    SnackbarHostKt.SnackbarHost(it, null, null, composer5, iIntValue5 & 14, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 13:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$CardInfoLandingScreenKt.f6381a;
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998864413, iIntValue6, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$CardInfoLandingScreenKt.lambda$-1998864413.<anonymous> (CardInfoLandingScreen.kt:267)");
                    }
                    BoxKt.Box(ShimmerEffectKt.b(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer6, 0).c0), 0.0f, 1, null), Color.m4595boximpl(ChaloTheme.a(composer6, 0).m0), Color.m4595boximpl(ChaloTheme.a(composer6, 0).q), 4), composer6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 14:
                Modifier modifier = (Modifier) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$CardWithSideStepIconAndLineKt.f1805a;
                Intrinsics.i(modifier, "modifier");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= composer7.changed(modifier) ? 4 : 2;
                }
                if (composer7.shouldExecute((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1780953951, iIntValue7, -1, "app.chalo.compose.ComposableSingletons$CardWithSideStepIconAndLineKt.lambda$-1780953951.<anonymous> (CardWithSideStepIconAndLine.kt:108)");
                    }
                    TextKt.m2623TextNvy7gAk("Walk to Domestic airport", SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Dp.m7278constructorimpl(100)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 6, 0, 262140);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 15:
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$ChaloCardInfoScreenKt.f6384a;
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-199760425, iIntValue8, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$ChaloCardInfoScreenKt.lambda$-199760425.<anonymous> (ChaloCardInfoScreen.kt:376)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 16:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$ChaloCardTransactionsScreenKt.f6441a;
                Intrinsics.i(item, "$this$item");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-867847209, iIntValue9, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ComposableSingletons$ChaloCardTransactionsScreenKt.lambda$-867847209.<anonymous> (ChaloCardTransactionsScreen.kt:328)");
                    }
                    ChaloSpacersKt.m(composer9, 0);
                    ChaloCardTransactionsScreenKt.j(composer9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 17:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$ChaloCardTransactionsScreenKt.f6441a;
                Intrinsics.i(item2, "$this$item");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1069980672, iIntValue10, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ComposableSingletons$ChaloCardTransactionsScreenKt.lambda$-1069980672.<anonymous> (ChaloCardTransactionsScreen.kt:334)");
                    }
                    ChaloCardTransactionsScreenKt.i(composer10, 0);
                    if (gf.x(Modifier.INSTANCE, ChaloTheme.b(composer10, 0).d, composer10, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 18:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$ChaloCardTransactionsScreenKt.f6441a;
                Intrinsics.i(item3, "$this$item");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-377614523, iIntValue11, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ComposableSingletons$ChaloCardTransactionsScreenKt.lambda$-377614523.<anonymous> (ChaloCardTransactionsScreen.kt:361)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer11, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer11, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloCircularProgressIndicatorKt.b(null, 0.0f, composer11, 0, 3);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 19:
                int iIntValue12 = ((Integer) obj).intValue();
                Composer composer12 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$ChaloGridLayoutKt.f1829a;
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= composer12.changed(iIntValue12) ? 4 : 2;
                }
                if (composer12.shouldExecute((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1313391990, iIntValue13, -1, "app.chalo.compose.components.ComposableSingletons$ChaloGridLayoutKt.lambda$-1313391990.<anonymous> (ChaloGridLayout.kt:129)");
                    }
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer12, 6).A, null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer12, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer12, modifierM264backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor2);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(vo1.j(iIntValue12, "Item "), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 0, 0, 262142);
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 20:
                ToolbarBaseActionUIState it2 = (ToolbarBaseActionUIState) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$ChaloToolBarKt.f1806a;
                Intrinsics.i(it2, "it");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= composer13.changed(it2) ? 4 : 2;
                }
                if (composer13.shouldExecute((iIntValue14 & 19) != 18, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1313253716, iIntValue14, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$1313253716.<anonymous> (ChaloToolBar.kt:64)");
                    }
                    ChaloToolBarKt.h(it2, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer13, 6).f, 0.0f, 2, null), composer13, iIntValue14 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 21:
                Composer composer14 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda10 = app.chalo.compose.components.ComposableSingletons$ChaloToolBarKt.f1835a;
                Intrinsics.i((RowScope) obj, "<this>");
                if (composer14.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1083999576, iIntValue15, -1, "app.chalo.compose.components.ComposableSingletons$ChaloToolBarKt.lambda$1083999576.<anonymous> (ChaloToolBar.kt:32)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 22:
                ToolbarBaseActionUIState it3 = (ToolbarBaseActionUIState) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$ChaloToolBarKt.f1806a;
                Intrinsics.i(it3, "it");
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= composer15.changed(it3) ? 4 : 2;
                }
                if (composer15.shouldExecute((iIntValue16 & 19) != 18, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1319320582, iIntValue16, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$-1319320582.<anonymous> (ChaloToolBar.kt:119)");
                    }
                    ChaloToolBarKt.h(it3, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer15, 6).f, 0.0f, 2, null), composer15, iIntValue16 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 23:
                Composer composer16 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$ChaloToolBarKt.f1806a;
                Intrinsics.i((RowScope) obj, "<this>");
                if (composer16.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-737030163, iIntValue17, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$-737030163.<anonymous> (ChaloToolBar.kt:167)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 24:
                CheckoutParentComponent.CheckoutChild child = (CheckoutParentComponent.CheckoutChild) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$CheckoutParentScreenKt.f2030a;
                Intrinsics.i(child, "child");
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= composer17.changed(child) ? 4 : 2;
                }
                if (composer17.shouldExecute((iIntValue18 & 19) != 18, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(514913437, iIntValue18, -1, "app.chalo.core.compose.ComposableSingletons$CheckoutParentScreenKt.lambda$514913437.<anonymous> (CheckoutParentScreen.kt:23)");
                    }
                    if (child instanceof CheckoutParentComponent.CheckoutChild.PaymentMain) {
                        composer17.startReplaceGroup(-1836877405);
                        PaymentMainScreenKt.b(((CheckoutParentComponent.CheckoutChild.PaymentMain) child).f2164a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.CheckoutCard) {
                        composer17.startReplaceGroup(-1836742462);
                        CheckoutCardScreenKt.a(((CheckoutParentComponent.CheckoutChild.CheckoutCard) child).f2159a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.InaiCheckout) {
                        composer17.startReplaceGroup(-1836606558);
                        InaiCheckoutScreenKt.a(((CheckoutParentComponent.CheckoutChild.InaiCheckout) child).f2162a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.PhonePeCheckout) {
                        composer17.startReplaceGroup(-1836467585);
                        PhonePeCheckoutScreenKt.a(((CheckoutParentComponent.CheckoutChild.PhonePeCheckout) child).f2165a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.RazorpayCheckout) {
                        composer17.startReplaceGroup(-1836321668);
                        CheckoutComponent checkoutComponent = ((CheckoutParentComponent.CheckoutChild.RazorpayCheckout) child).f2167a;
                        composer17.startReplaceGroup(-1168520582);
                        Scope scopeB = KoinApplicationKt.b(composer17);
                        composer17.startReplaceGroup(-1633490746);
                        boolean zChanged = composer17.changed((Object) null) | composer17.changed(scopeB);
                        Object objRememberedValue = composer17.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = scopeB.d(Reflection.a(RazorPaySdkProvider.class), null, null);
                            composer17.updateRememberedValue(objRememberedValue);
                        }
                        composer17.endReplaceGroup();
                        composer17.endReplaceGroup();
                        CheckoutScreenKt.a(checkoutComponent, (RazorPaySdkProvider) objRememberedValue, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.NetBanking) {
                        composer17.startReplaceGroup(-1836089540);
                        CheckoutNetBankingScreenKt.a(((CheckoutParentComponent.CheckoutChild.NetBanking) child).f2163a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.PostPayment) {
                        composer17.startReplaceGroup(-1835948645);
                        PostPaymentMainScreenKt.a(((CheckoutParentComponent.CheckoutChild.PostPayment) child).f2166a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.UpiApps) {
                        composer17.startReplaceGroup(-1835811129);
                        UpiAppScreenKt.c(((CheckoutParentComponent.CheckoutChild.UpiApps) child).f2168a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else if (child instanceof CheckoutParentComponent.CheckoutChild.CheckoutWallet) {
                        composer17.startReplaceGroup(-1835677891);
                        WalletAppsPaymentScreenKt.a(((CheckoutParentComponent.CheckoutChild.CheckoutWallet) child).f2160a, composer17, 8);
                        composer17.endReplaceGroup();
                    } else {
                        if (!(child instanceof CheckoutParentComponent.CheckoutChild.CustomUrl)) {
                            throw pk0.p(composer17, 910576037);
                        }
                        composer17.startReplaceGroup(-1835540003);
                        CustomUrlCheckoutScreenKt.a(((CheckoutParentComponent.CheckoutChild.CustomUrl) child).f2161a, composer17, 8);
                        composer17.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 25:
                CitySelectionParentComponent.CitySelectionChild child2 = (CitySelectionParentComponent.CitySelectionChild) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda14 = ComposableSingletons$CitySelectionParentScreenKt.f2031a;
                Intrinsics.i(child2, "child");
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= composer18.changed(child2) ? 4 : 2;
                }
                if (composer18.shouldExecute((iIntValue19 & 19) != 18, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1717055602, iIntValue19, -1, "app.chalo.core.compose.ComposableSingletons$CitySelectionParentScreenKt.lambda$-1717055602.<anonymous> (CitySelectionParentScreen.kt:14)");
                    }
                    if (child2 instanceof CitySelectionParentComponent.CitySelectionChild.CityLocationSelection) {
                        composer18.startReplaceGroup(257179560);
                        CityLocationSelectionScreenKt.c(((CitySelectionParentComponent.CitySelectionChild.CityLocationSelection) child2).f2170a, composer18, 8);
                        composer18.endReplaceGroup();
                    } else {
                        if (!(child2 instanceof CitySelectionParentComponent.CitySelectionChild.CitySelection)) {
                            throw pk0.p(composer18, -822990912);
                        }
                        composer18.startReplaceGroup(257335056);
                        CitySelectionScreenKt.e(((CitySelectionParentComponent.CitySelectionChild.CitySelection) child2).f2171a, composer18, 8);
                        composer18.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 26:
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda15 = ComposableSingletons$CitySelectionUniversalPickerScreenKt.f5092a;
                Intrinsics.i(item4, "$this$item");
                if (composer19.shouldExecute((iIntValue20 & 17) != 16, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1673888399, iIntValue20, -1, "app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$CitySelectionUniversalPickerScreenKt.lambda$1673888399.<anonymous> (CitySelectionUniversalPickerScreen.kt:302)");
                    }
                    CitySelectionUniversalPickerScreenKt.a(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer19, 0).h, 0.0f, 2, null), composer19, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
            case 27:
                return ComposableSingletons$ContextMenuUiKt.lambda__1455401925$lambda$0((ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return ComposableSingletons$CoreTextFieldKt.lambda_559628295$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                Child.Created it4 = (Child.Created) obj;
                Composer composer20 = (Composer) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ComposableLambda composableLambda16 = ComposableSingletons$DecomposeAppKt.f2032a;
                Intrinsics.i(it4, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1342562006, iIntValue21, -1, "app.chalo.core.compose.ComposableSingletons$DecomposeAppKt.lambda$-1342562006.<anonymous> (DecomposeApp.kt:106)");
                }
                DecomposeScreensKt.a(it4, composer20, iIntValue21 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
        }
    }
}
