package app.chalo.metro.ui.landing.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.metro.ui.landing.uistate.LineSelectionBottomSheetSpec;
import app.chalo.metro.ui.landing.uistate.LineSelectionBottomSheetUIState;
import app.chalo.metro.ui.landing.uistate.LineSelectionItemSpec;
import app.chalo.metro.ui.landing.uistate.LineSelectionItemUIState;
import app.chalo.metro.ui.landing.uistate.LineTypeIndicatorUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.b3;
import defpackage.fc0;
import defpackage.gd0;
import defpackage.i41;
import defpackage.pk0;
import defpackage.v60;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LineSelectionBottomSheetContentKt {
    public static final void a(LineTypeIndicatorUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-23562444);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-23562444, i2, -1, "app.chalo.metro.ui.landing.compose.components.LineIndicator (LineSelectionBottomSheetContent.kt:126)");
            }
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, uiState.b), ChaloColorTokenKt.c(uiState.f5520a), ChaloThemeKt.d(uiState.c)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(uiState, i, 7));
        }
    }

    public static final void b(Modifier modifier, LineSelectionBottomSheetUIState uiState, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        List list = uiState.d;
        Object obj = uiState.f5517a;
        Composer composerStartRestartGroup = composer.startRestartGroup(2001624070);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2001624070, i2, -1, "app.chalo.metro.ui.landing.compose.components.LineSelectionBottomSheetContent (LineSelectionBottomSheetContent.kt:32)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            LineSelectionBottomSheetSpec lineSelectionBottomSheetSpec = (LineSelectionBottomSheetSpec) obj;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), lineSelectionBottomSheetSpec.f5516a);
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
                composer2.startReplaceGroup(7965311);
            } else {
                composer2.startReplaceGroup(7965312);
                CommonImageKt.a(imageUIState, null, false, composer2, 0, 6);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            ChaloSpacersKt.a(lineSelectionBottomSheetSpec.b, composer2, 0);
            composer2.startReplaceGroup(-785827464);
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                LineSelectionItemUIState lineSelectionItemUIState = (LineSelectionItemUIState) obj2;
                c(null, lineSelectionItemUIState, composer2, 0);
                if (i5 != CollectionsKt.K(list)) {
                    composer2.startReplaceGroup(980579552);
                    DividerUIState dividerUIState = lineSelectionItemUIState.f;
                    if (dividerUIState == null) {
                        composer2.startReplaceGroup(333195041);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(333195042);
                        DividerUIStateKt.a(Modifier.INSTANCE, dividerUIState, composer2, 6, 0);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(330822209);
                }
                composer2.endReplaceGroup();
                i5 = i6;
            }
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier2, uiState, i, 14));
        }
    }

    public static final void c(Modifier modifier, LineSelectionItemUIState uiState, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(uiState, "uiState");
        RadioButtonUIState radioButtonUIState = uiState.e;
        Object obj = uiState.f5519a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1972508689);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(uiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1972508689, i2, -1, "app.chalo.metro.ui.landing.compose.components.LineSelectionItem (LineSelectionBottomSheetContent.kt:78)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            LineSelectionItemSpec lineSelectionItemSpec = (LineSelectionItemSpec) obj;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            boolean z = radioButtonUIState.f10065a;
            Role roleM6505boximpl = Role.m6505boximpl(Role.INSTANCE.m6517getRadioButtono7Vup1c());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new gd0(uiState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC = ChaloThemeKt.c(SelectableKt.m1041selectableoSLSa3U$default(modifierFillMaxWidth$default, z, false, roleM6505boximpl, null, (Function0) objRememberedValue2, 10, null), lineSelectionItemSpec.f5518a);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), UiAlignmentKt.b(lineSelectionItemSpec.d), composerStartRestartGroup, 6);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, modifier2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(UiAlignment.Vertical.Center.f9888a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            LineTypeIndicatorUIState lineTypeIndicatorUIState = uiState.b;
            UIShape.Rectangle rectangle = UIShape.f1926a;
            a(lineTypeIndicatorUIState, composerStartRestartGroup, 0);
            ChaloSpacersKt.a(lineSelectionItemSpec.b, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, uiState.c, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.d;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-798131099);
            } else {
                composerStartRestartGroup.startReplaceGroup(-798131098);
                ChaloSpacersKt.a(lineSelectionItemSpec.c, composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ChaloRadioButtonKt.a(null, radioButtonUIState, composerStartRestartGroup, 0, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier2, uiState, i, 15));
        }
    }
}
