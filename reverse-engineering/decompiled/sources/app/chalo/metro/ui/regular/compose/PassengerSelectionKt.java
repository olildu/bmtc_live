package app.chalo.metro.ui.regular.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionContainerUiState;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionItemSpec;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionItemUIState;
import app.chalo.metro.ui.regular.uistate.PassengerSelectionUISpec;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.image.ImageUIState;
import defpackage.b3;
import defpackage.i41;
import defpackage.ob;
import defpackage.pk0;
import defpackage.zk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PassengerSelectionKt {
    public static final void a(Modifier modifier, PassengerSelectionContainerUiState uiState, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f5547a;
        Composer composerStartRestartGroup = composer.startRestartGroup(379013897);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(379013897, i2, -1, "app.chalo.metro.ui.regular.compose.PassengerSelectionBottomSheetContent (PassengerSelection.kt:25)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PassengerSelectionUISpec passengerSelectionUISpec = (PassengerSelectionUISpec) obj;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), passengerSelectionUISpec.f5550a);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), UiAlignmentKt.b(UiAlignment.Vertical.Top.f9889a), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            composer2 = composerStartRestartGroup;
            ChaloTextViewKt.a(i41.a(RowScopeInstance.INSTANCE, modifier2, 1.0f, false, 2, null), uiState.b, null, null, composer2, 0, 12);
            ImageUIState imageUIState = uiState.c;
            if (imageUIState == null) {
                composer2.startReplaceGroup(-1062656868);
            } else {
                composer2.startReplaceGroup(-1062656867);
                CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            ChaloSpacersKt.a(passengerSelectionUISpec.b, composer2, 0);
            composer2.startReplaceGroup(-809360971);
            for (PassengerSelectionItemUIState passengerSelectionItemUIState : uiState.d) {
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                b(modifierFillMaxWidth$default2, passengerSelectionItemUIState, composer2, 6);
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.a(passengerSelectionUISpec.d, composer2, 0);
            if (b3.s(6, 0, composer2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), uiState.e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier2, uiState, i, 27));
        }
    }

    public static final void b(Modifier modifier, PassengerSelectionItemUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f5549a;
        Composer composerStartRestartGroup = composer.startRestartGroup(365098929);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(365098929, i2, -1, "app.chalo.metro.ui.regular.compose.PassengerSelectionItem (PassengerSelection.kt:70)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloRoundedCardKt.a(uiState.b, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(-122706206, true, new ob(17, modifier, (PassengerSelectionItemSpec) obj, uiState), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(modifier, uiState, i, 28));
        }
    }
}
