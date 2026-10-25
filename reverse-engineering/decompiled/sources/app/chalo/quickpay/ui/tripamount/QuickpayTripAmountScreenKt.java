package app.chalo.quickpay.ui.tripamount;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.YesBankBrandingKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.quickpay.ui.tripamount.QuickpayBottomSheetUIState;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenKt;
import app.chalo.uistate.YesBankBrandingUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ey0;
import defpackage.h01;
import defpackage.j01;
import defpackage.pk0;
import defpackage.rx0;
import defpackage.st0;
import defpackage.t8;
import defpackage.yu0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickPayTripAmountUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickpayTripAmountScreenKt {
    public static final void a(QuickpayBottomSheetUIState.QuickpayConfirmationBottomSheetUIState quickpayConfirmationBottomSheetUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2117125808);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(quickpayConfirmationBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2117125808, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayConfirmationBottomSheetContent (QuickpayTripAmountScreen.kt:221)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            QuickpayConfirmationBottomSheetUISpecs quickpayConfirmationBottomSheetUISpecs = quickpayConfirmationBottomSheetUIState.b;
            QuickpayConfirmationBottomSheetContentUIState quickpayConfirmationBottomSheetContentUIState = quickpayConfirmationBottomSheetUIState.c;
            CircularProgressIndicatorUIState circularProgressIndicatorUIState = quickpayConfirmationBottomSheetUIState.d;
            Modifier modifierC = ChaloThemeKt.c(companion, quickpayConfirmationBottomSheetUISpecs.f8898a);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (circularProgressIndicatorUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-548772519);
                ChaloCircularProgressIndicatorKt.a(null, circularProgressIndicatorUIState, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (quickpayConfirmationBottomSheetContentUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(-548605987);
                    b(quickpayConfirmationBottomSheetContentUIState, quickpayConfirmationBottomSheetUIState.b, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 384);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-555621256);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(quickpayConfirmationBottomSheetUIState, i, 22));
        }
    }

    public static final void b(QuickpayConfirmationBottomSheetContentUIState quickpayConfirmationBottomSheetContentUIState, QuickpayConfirmationBottomSheetUISpecs quickpayConfirmationBottomSheetUISpecs, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(422769064);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(quickpayConfirmationBottomSheetContentUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(quickpayConfirmationBottomSheetUISpecs) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(422769064, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayConfirmationContentUI (QuickpayTripAmountScreen.kt:249)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState textUIState = quickpayConfirmationBottomSheetContentUIState.f8897a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.c(textUIState, ChaloThemeKt.c(companion2, quickpayConfirmationBottomSheetUISpecs.b), null, null, composerStartRestartGroup, 0, 12);
            TextKt.c(quickpayConfirmationBottomSheetContentUIState.b, ChaloThemeKt.c(companion2, quickpayConfirmationBottomSheetUISpecs.c), null, null, composerStartRestartGroup, 0, 12);
            TextKt.c(quickpayConfirmationBottomSheetContentUIState.c, null, null, null, composerStartRestartGroup, 0, 14);
            TextUIState textUIState2 = quickpayConfirmationBottomSheetContentUIState.d;
            if (textUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1370035814);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1370035813);
                TextKt.c(textUIState2, ChaloThemeKt.c(companion2, quickpayConfirmationBottomSheetUISpecs.d), null, null, composerStartRestartGroup, 0, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.c(quickpayConfirmationBottomSheetContentUIState.e, ChaloThemeKt.c(companion2, quickpayConfirmationBottomSheetUISpecs.e), null, null, composerStartRestartGroup, 0, 12);
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), quickpayConfirmationBottomSheetUISpecs.f), quickpayConfirmationBottomSheetContentUIState.f);
            YesBankBrandingUIState yesBankBrandingUIState = quickpayConfirmationBottomSheetContentUIState.g;
            if (yesBankBrandingUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1369548680);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1369548679);
                YesBankBrandingKt.a(yesBankBrandingUIState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 0, quickpayConfirmationBottomSheetContentUIState, quickpayConfirmationBottomSheetUISpecs, modifier));
        }
    }

    public static final void c(SheetState sheetState, final QuickpayBottomSheetUIState quickpayBottomSheetUIState, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-755052150);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(quickpayBottomSheetUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-755052150, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountBottomSheet (QuickpayTripAmountScreen.kt:186)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new QuickpayTripAmountScreenKt$QuickpayTripAmountBottomSheet$1$1(quickpayBottomSheetUIState, sheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(quickpayBottomSheetUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (i2 >> 3) & 14);
            if (quickpayBottomSheetUIState instanceof QuickpayBottomSheetUIState.PrerequisitesBottomSheetUIState) {
                composerStartRestartGroup.startReplaceGroup(-1014484585);
                final int i3 = 0;
                sheetState2 = sheetState;
                BottomSheetUiStateKt.a(null, ((QuickpayBottomSheetUIState.PrerequisitesBottomSheetUIState) quickpayBottomSheetUIState).f8895a, sheetState2, ComposableLambdaKt.rememberComposableLambda(1405764330, true, new Function3() { // from class: i01
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = i3;
                        ColumnScope ModalBottomSheet = (ColumnScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (i4) {
                            case 0:
                                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1405764330, iIntValue, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountBottomSheet.<anonymous> (QuickpayTripAmountScreen.kt:201)");
                                    }
                                    BottomSheetContentWithIconTitleSubTitleKt.a(null, ((QuickpayBottomSheetUIState.PrerequisitesBottomSheetUIState) quickpayBottomSheetUIState).b, composer2, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1355157855, iIntValue, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountBottomSheet.<anonymous> (QuickpayTripAmountScreen.kt:210)");
                                    }
                                    QuickpayTripAmountScreenKt.a((QuickpayBottomSheetUIState.QuickpayConfirmationBottomSheetUIState) quickpayBottomSheetUIState, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 6) & 896) | 24576, 9);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                sheetState2 = sheetState;
                if (quickpayBottomSheetUIState instanceof QuickpayBottomSheetUIState.QuickpayConfirmationBottomSheetUIState) {
                    composerStartRestartGroup.startReplaceGroup(-1014104866);
                    final int i4 = 1;
                    BottomSheetUiStateKt.a(null, ((QuickpayBottomSheetUIState.QuickpayConfirmationBottomSheetUIState) quickpayBottomSheetUIState).f8896a, sheetState2, ComposableLambdaKt.rememberComposableLambda(-1355157855, true, new Function3() { // from class: i01
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i5 = i4;
                            ColumnScope ModalBottomSheet = (ColumnScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (i5) {
                                case 0:
                                    Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1405764330, iIntValue, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountBottomSheet.<anonymous> (QuickpayTripAmountScreen.kt:201)");
                                        }
                                        BottomSheetContentWithIconTitleSubTitleKt.a(null, ((QuickpayBottomSheetUIState.PrerequisitesBottomSheetUIState) quickpayBottomSheetUIState).b, composer2, 0, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1355157855, iIntValue, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountBottomSheet.<anonymous> (QuickpayTripAmountScreen.kt:210)");
                                        }
                                        QuickpayTripAmountScreenKt.a((QuickpayBottomSheetUIState.QuickpayConfirmationBottomSheetUIState) quickpayBottomSheetUIState, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 6) & 896) | 24576, 9);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (quickpayBottomSheetUIState != null) {
                        throw pk0.p(composerStartRestartGroup, 244367038);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1013837770);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState2 = sheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(sheetState2, quickpayBottomSheetUIState, i, 11));
        }
    }

    public static final void d(QuickpayDisclaimerUIState quickpayDisclaimerUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1316664437);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(quickpayDisclaimerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316664437, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountDisclaimer (QuickpayTripAmountScreen.kt:168)");
            }
            TextKt.c(quickpayDisclaimerUIState.f8899a, ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(quickpayDisclaimerUIState.c), ChaloThemeKt.d(quickpayDisclaimerUIState.d)), quickpayDisclaimerUIState.b), null, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(quickpayDisclaimerUIState, modifier, i, 12));
        }
    }

    public static final void e(ImageUIState imageUIState, TextUIState textUIState, ChaloPadding chaloPadding, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1786535794);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1786535794, i3, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountHeader (QuickpayTripAmountScreen.kt:149)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, i3 & 14, 6);
            TextKt.c(textUIState, ChaloThemeKt.c(companion, chaloPadding), null, null, composerStartRestartGroup, (i3 >> 3) & 14, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 3, imageUIState, textUIState, chaloPadding, modifier2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(QuickpayTripAmountComponent quickpayTripAmountComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1291311263);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(quickpayTripAmountComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1291311263, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreen (QuickpayTripAmountScreen.kt:42)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(quickpayTripAmountComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
            WalletAccessBaseScreenKt.c(quickpayTripAmountComponent, ComposableLambdaKt.rememberComposableLambda(-1725886233, true, new st0(mutableStateA, 1), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 48);
            LoadingDialogUIState loadingDialogUIState = ((QuickPayTripAmountUIState) mutableStateA.getValue()).l;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-567896648);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -567896647, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            c(sheetStateRememberModalBottomSheetState, ((QuickPayTripAmountUIState) mutableStateA.getValue()).m, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(quickpayTripAmountComponent, i, 21));
        }
    }

    public static final void g(QuickPayTripAmountUIState quickPayTripAmountUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-506710102);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(quickPayTripAmountUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-506710102, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenContent (QuickpayTripAmountScreen.kt:75)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            QuickPatTripAmountUISpec quickPatTripAmountUISpec = quickPayTripAmountUIState.f8894a;
            Modifier modifierC = ChaloThemeKt.c(ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(quickPatTripAmountUISpec.b), null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), quickPatTripAmountUISpec.f8892a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            e(quickPayTripAmountUIState.c, quickPayTripAmountUIState.d, quickPatTripAmountUISpec.c, null, composerStartRestartGroup, 0);
            TextKt.c(quickPayTripAmountUIState.e, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), quickPatTripAmountUISpec.d), null, null, composerStartRestartGroup, 0, 12);
            QuickpayDisclaimerUIState quickpayDisclaimerUIState = quickPayTripAmountUIState.f;
            if (quickpayDisclaimerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(985716324);
            } else {
                composerStartRestartGroup.startReplaceGroup(985716325);
                d(quickpayDisclaimerUIState, ChaloThemeKt.c(companion, quickPatTripAmountUISpec.e), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            BaseChaloTextFieldKt.a(quickPayTripAmountUIState.g, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), quickPatTripAmountUISpec.f), null, null, null, null, composerStartRestartGroup, 0, 124);
            composerStartRestartGroup = composerStartRestartGroup;
            TextUIState textUIState = quickPayTripAmountUIState.h;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(986149177);
            } else {
                composerStartRestartGroup.startReplaceGroup(986149178);
                TextKt.c(textUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), quickPatTripAmountUISpec.g), null, null, composerStartRestartGroup, 0, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), quickPatTripAmountUISpec.h), quickPayTripAmountUIState.k);
            TextKt.c(quickPayTripAmountUIState.i, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), quickPatTripAmountUISpec.i), null, null, composerStartRestartGroup, 0, 12);
            DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), quickPatTripAmountUISpec.j), quickPayTripAmountUIState.j, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j01(quickPayTripAmountUIState, i, 1));
        }
    }

    public static final void h(QuickPayTripAmountUIState quickPayTripAmountUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047213333);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(quickPayTripAmountUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047213333, i2, -1, "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountScreenUI (QuickpayTripAmountScreen.kt:65)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(quickPayTripAmountUIState.b, null, null, composerStartRestartGroup, 0, 14);
            g(quickPayTripAmountUIState, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j01(quickPayTripAmountUIState, i, 0));
        }
    }
}
