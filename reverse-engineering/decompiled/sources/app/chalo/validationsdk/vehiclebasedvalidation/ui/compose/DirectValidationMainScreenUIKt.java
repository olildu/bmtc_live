package app.chalo.validationsdk.vehiclebasedvalidation.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloAlertTextKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.shape.TicketShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerToolbarUISpecs;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerToolbarUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerUISpecs;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerSpec;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerUiState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardContentSpec;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketExpiryContainer;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketExpiryContainerSpec;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.ValidationBottomCtaContainerUiState;
import defpackage.c0;
import defpackage.c6;
import defpackage.cy;
import defpackage.dq;
import defpackage.gf;
import defpackage.i41;
import defpackage.ir;
import defpackage.ox;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DirectValidationMainScreenUIKt {
    public static final void a(QRScannerToolbarUIState uiState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f10722a;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1373127319);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1373127319, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.ChaloToolBarNewWithRightItem (DirectValidationMainScreenUI.kt:352)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            QRScannerToolbarUISpecs qRScannerToolbarUISpecs = (QRScannerToolbarUISpecs) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(qRScannerToolbarUISpecs.b), null, 2, null), qRScannerToolbarUISpecs.f10721a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(qRScannerToolbarUISpecs.c), composerStartRestartGroup, 0);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = i2;
            ImageUIState imageUIState = uiState.b;
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new cy(2, uiState, sendIntent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CommonImageKt.a(imageUIState, ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue2, 28, null), false, composerStartRestartGroup, 0, 4);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, qRScannerToolbarUISpecs.f), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), uiState.c, null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(uiState, sendIntent, i, 12));
        }
    }

    public static final void b(QRScannerViewState state, SheetState modelBottomSheerState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        LoadingDialogUIState loadingDialogUIState = state.d;
        Intrinsics.i(modelBottomSheerState, "modelBottomSheerState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-674703907);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modelBottomSheerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-674703907, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.DirectValidationMainScreenUI (DirectValidationMainScreenUI.kt:66)");
            }
            if (loadingDialogUIState != null) {
                t8.m(composerStartRestartGroup, 343044293, loadingDialogUIState, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(339795493);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i3 = i2 >> 3;
            f(state, sendIntent, composerStartRestartGroup, (i2 & 14) | (i3 & 112));
            StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = state.g;
            if (errorWithMsgAndRetry == null) {
                composerStartRestartGroup.startReplaceGroup(343237081);
            } else {
                composerStartRestartGroup.startReplaceGroup(343237082);
                ChaloRoundedBottomSheetKt.a(modelBottomSheerState, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1878021490, true, new c6(errorWithMsgAndRetry, 21), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 196992, 26);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 4, state, modelBottomSheerState, sendIntent));
        }
    }

    public static final void c(Modifier modifier, QRScannerViewState state, Composer composer, int i) {
        Modifier modifier2;
        Object obj;
        Intrinsics.i(state, "state");
        TicketCardUIState ticketCardUIState = state.e;
        QrContainerUiState qrContainerUiState = state.f;
        Object obj2 = state.f10730a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1741377731);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741377731, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.ProductDetails (DirectValidationMainScreenUI.kt:156)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue;
            }
            QRScannerUISpecs qRScannerUISpecs = (QRScannerUISpecs) obj2;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            if (qrContainerUiState == null) {
                composerStartRestartGroup.startReplaceGroup(123481514);
            } else {
                composerStartRestartGroup.startReplaceGroup(123481515);
                d(ChaloThemeKt.c(modifier2, qRScannerUISpecs.c), qrContainerUiState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(qRScannerUISpecs.f10723a, composerStartRestartGroup, 0);
            if (ticketCardUIState == null) {
                composerStartRestartGroup.startReplaceGroup(123783733);
                composerStartRestartGroup.endReplaceGroup();
                obj = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(123783734);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                obj = null;
                e(null, ticketCardUIState, composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceGroup();
            }
            ImageUIState imageUIState = state.h;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(123927542);
            } else {
                composerStartRestartGroup.startReplaceGroup(123927543);
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, obj), qRScannerUISpecs.d);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier2, state, i, 11));
        }
    }

    public static final void d(Modifier modifier, QrContainerUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        QrContainerSpec qrContainerSpec = uiState.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(524075664);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(524075664, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.QrContainerUi (DirectValidationMainScreenUI.kt:198)");
            }
            boolean zChanged = composerStartRestartGroup.changed(qrContainerSpec);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(qrContainerSpec);
                objRememberedValue = qrContainerSpec;
            }
            QrContainerSpec qrContainerSpec2 = (QrContainerSpec) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(qrContainerSpec2.b);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Brush.Companion companion = Brush.INSTANCE;
                List list = qrContainerSpec2.b;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
                }
                objRememberedValue2 = Brush.Companion.m4566verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), (Brush) objRememberedValue2, ChaloTheme.d(composerStartRestartGroup, 0).c, 0.0f, 4, null), qrContainerSpec.f10732a);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, uiState.c, null, null, composerStartRestartGroup, 0, 13);
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.d;
            composerStartRestartGroup.startReplaceGroup(-621491724);
            ChaloSpacersKt.a(qrContainerSpec.c, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(qrContainerSpec.d, composerStartRestartGroup, 0);
            ChaloRoundedCardKt.a(uiState.f10733a, null, ComposableLambdaKt.rememberComposableLambda(-1920924171, true, new c6(uiState, 23), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            TicketExpiryContainer ticketExpiryContainer = uiState.f;
            if (ticketExpiryContainer == null) {
                composerStartRestartGroup.startReplaceGroup(-620706154);
            } else {
                composerStartRestartGroup.startReplaceGroup(-620706153);
                TicketExpiryContainerSpec ticketExpiryContainerSpec = ticketExpiryContainer.f10739a;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, qrContainerSpec.e), composerStartRestartGroup, 0);
                Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloColorTokenKt.c(ticketExpiryContainerSpec.b), ChaloThemeKt.d(ticketExpiryContainerSpec.c)), ticketExpiryContainerSpec.f10740a);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ChaloAlertTextKt.a(null, ticketExpiryContainer.b, composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, uiState, i, 13));
        }
    }

    public static final void e(Modifier modifier, TicketCardUIState uiState, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.b;
        Object obj2 = uiState.f10738a;
        Composer composerStartRestartGroup = composer.startRestartGroup(515697046);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(515697046, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.TicketCardUi (DirectValidationMainScreenUI.kt:274)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(obj2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue2;
            }
            boolean zChanged2 = composerStartRestartGroup.changed(obj);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue3;
            }
            TicketCardContentSpec ticketCardContentSpec = (TicketCardContentSpec) obj;
            ChaloPadding chaloPadding = ticketCardContentSpec.f10737a;
            boolean zChanged3 = composerStartRestartGroup.changed(chaloPadding.d);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = Dp.m7276boximpl(Dp.m7278constructorimpl(chaloPadding.d + ticketCardContentSpec.b));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(modifier2, chaloPadding), 0.0f, 1, null), new TicketShape(ChaloThemeHelper.a().g, Dp.m7278constructorimpl(((Dp) mutableState.getValue()).m7292unboximpl() + ((Dp) objRememberedValue4).m7292unboximpl()), ChaloThemeHelper.a().f), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1707017973, true, new c0(ticketCardContentSpec, uiState, density, mutableState, 8), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier2, uiState, i, 9));
        }
    }

    public static final void f(QRScannerViewState qRScannerViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1668644546);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(qRScannerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1668644546, i2, -1, "app.chalo.validationsdk.vehiclebasedvalidation.ui.compose.ValidationScreenContent (DirectValidationMainScreenUI.kt:93)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = qRScannerViewState.b;
            ValidationBottomCtaContainerUiState validationBottomCtaContainerUiState = qRScannerViewState.i;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = i2;
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            Modifier modifierA = dq.a(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            a(qRScannerViewState.c, function1, composerStartRestartGroup, i3 & 112);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            c(null, qRScannerViewState, composerStartRestartGroup, (i3 << 3) & 112);
            ChaloSpacersKt.a(qRScannerViewState.f10730a.b, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), validationBottomCtaContainerUiState.f10743a.b.c), 0L, 0L, composerStartRestartGroup, 0, 6);
            ChaloRoundedCardKt.a(validationBottomCtaContainerUiState.f10743a.b, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(825299244, true, new c6(qRScannerViewState, 22), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
            composer2 = composerStartRestartGroup;
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(qRScannerViewState, function1, i, 10));
        }
    }
}
