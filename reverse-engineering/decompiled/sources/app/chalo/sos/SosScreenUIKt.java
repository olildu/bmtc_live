package app.chalo.sos;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.uistate.dialog.DropDownMenuUIStateKt;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.a31;
import defpackage.am;
import defpackage.dq;
import defpackage.g61;
import defpackage.i41;
import defpackage.k31;
import defpackage.n61;
import defpackage.pk0;
import defpackage.sa1;
import defpackage.ta1;
import defpackage.zt0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "expanded", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SosScreenUIKt {
    public static final void a(SendSosConfirmationDialog sendSosConfirmationDialog, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1607451560);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sendSosConfirmationDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1607451560, i2, -1, "app.chalo.sos.SendSosConfirmationDialog (SosScreenUI.kt:311)");
            }
            boolean zChanged = composerStartRestartGroup.changed(sendSosConfirmationDialog.f9397a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = sendSosConfirmationDialog.f9397a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloLoadingDialogKt.c(sendSosConfirmationDialog.b, ComposableLambdaKt.rememberComposableLambda(617834050, true, new zt0(9, (SendSosConfirmationDialogUISpecs) objRememberedValue, sendSosConfirmationDialog), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(sendSosConfirmationDialog, i, 24));
        }
    }

    public static final void b(ImageUIState imageUIState, TextUIState textUIState, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-367803243);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-367803243, i2, -1, "app.chalo.sos.SosAddContactBtn (SosScreenUI.kt:252)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, i2 & 14, 6);
            ChaloSpacersKt.a(f, composerStartRestartGroup, (i2 >> 6) & 14);
            TextKt.c(textUIState, null, null, null, composerStartRestartGroup, (i2 >> 3) & 14, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new am(imageUIState, textUIState, f, modifier, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ImageUIState imageUIState, DropDownMenuUIState dropDownMenuUIState, Composer composer, int i) {
        int i2;
        ImageUIState imageUIState2;
        DropDownMenuUIState dropDownMenuUIState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-107128553);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(dropDownMenuUIState) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-107128553, i3, -1, "app.chalo.sos.SosContactDropDown (SosScreenUI.kt:228)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new n61(mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CommonImageKt.a(imageUIState, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue2, 15, null), false, composerStartRestartGroup, i3 & 14, 4);
            imageUIState2 = imageUIState;
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new n61(mutableState, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            dropDownMenuUIState2 = dropDownMenuUIState;
            DropDownMenuUIStateKt.a(zBooleanValue, (Function0) objRememberedValue3, dropDownMenuUIState2, null, composerStartRestartGroup, ((i3 << 3) & 896) | 48, 8);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            imageUIState2 = imageUIState;
            dropDownMenuUIState2 = dropDownMenuUIState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(imageUIState2, dropDownMenuUIState2, i, 29));
        }
    }

    public static final void d(SosContactItemUIState sosContactItemUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-240628742);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sosContactItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-240628742, i2, -1, "app.chalo.sos.SosContactItem (SosScreenUI.kt:185)");
            }
            ChaloColorToken chaloColorToken = sosContactItemUIState.j;
            DropDownMenuUIState dropDownMenuUIState = sosContactItemUIState.d;
            ImageUIState imageUIState = sosContactItemUIState.e;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), sosContactItemUIState.i);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            CommonImageKt.a(sosContactItemUIState.f9399a, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierC2 = ChaloThemeKt.c(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), sosContactItemUIState.h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(sosContactItemUIState.b, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, composerStartRestartGroup, 48, 12);
            TextKt.c(sosContactItemUIState.c, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), sosContactItemUIState.g), null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endNode();
            if (imageUIState == null || dropDownMenuUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-550939316);
            } else {
                composerStartRestartGroup.startReplaceGroup(-544316104);
                c(imageUIState, dropDownMenuUIState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(sosContactItemUIState, modifier, i, 1));
        }
    }

    public static final void e(SosScreenTypeUIState.DisplayScreenUIState displayScreenUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1640304966);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(displayScreenUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640304966, i3, -1, "app.chalo.sos.SosDisplayScreenContent (SosScreenUI.kt:83)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ToolbarUIState toolbarUIState = displayScreenUIState.b;
            SosDisplayScreenUISpecs sosDisplayScreenUISpecs = displayScreenUIState.f9419a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ChaloToolBarKt.b(toolbarUIState, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, composerStartRestartGroup, 48, 12);
            f(displayScreenUIState, dq.a(columnScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, i3 & 14);
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloColorTokenKt.c(sosDisplayScreenUISpecs.h), null, 2, null), sosDisplayScreenUISpecs.i);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), displayScreenUIState.m);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ta1(displayScreenUIState, modifier, i, 0));
        }
    }

    public static final void f(SosScreenTypeUIState.DisplayScreenUIState displayScreenUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1360134291);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(displayScreenUIState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1360134291, i3, -1, "app.chalo.sos.SosDisplayScreenItems (SosScreenUI.kt:115)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            SosDisplayScreenUISpecs sosDisplayScreenUISpecs = displayScreenUIState.f9419a;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierVerticalScroll$default, ChaloColorTokenKt.c(sosDisplayScreenUISpecs.f9400a), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState textUIState = displayScreenUIState.c;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            i2 = 1;
            TextKt.c(textUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), sosDisplayScreenUISpecs.b), null, null, composerStartRestartGroup, 0, 12);
            j(displayScreenUIState.d, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            TextKt.c(displayScreenUIState.e, ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(sosDisplayScreenUISpecs.d), null, 2, null), sosDisplayScreenUISpecs.c), null, null, composerStartRestartGroup, 0, 12);
            DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), displayScreenUIState.f, composerStartRestartGroup, 6, 0);
            j(displayScreenUIState.g, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceGroup(82420717);
            for (SosContactItemUIState sosContactItemUIState : displayScreenUIState.h) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                d(sosContactItemUIState, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 48);
                DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), sosContactItemUIState.f, composerStartRestartGroup, 6, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ImageUIState imageUIState = displayScreenUIState.j;
            TextUIState textUIState2 = displayScreenUIState.i;
            float f = sosDisplayScreenUISpecs.e;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            b(imageUIState, textUIState2, f, ChaloThemeKt.c(ComposeUtilsKt.b(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloColorTokenKt.c(sosDisplayScreenUISpecs.g), null, 2, null), displayScreenUIState.k, composerStartRestartGroup, 0, 6), sosDisplayScreenUISpecs.f), composerStartRestartGroup, 0);
            DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), displayScreenUIState.l, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i2 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ta1(displayScreenUIState, modifier, i, i2));
        }
    }

    public static final void g(SosScreenTypeUIState.EditMsgUIState editMsgUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-816339674);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(editMsgUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-816339674, i2, -1, "app.chalo.sos.SosEditMsgScreenContent (SosScreenUI.kt:292)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            ToolbarUIState toolbarUIState = editMsgUIState.f9420a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloToolBarKt.b(toolbarUIState, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, composerStartRestartGroup, 48, 12);
            BaseChaloTextFieldKt.a(editMsgUIState.b, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), editMsgUIState.c), null, null, null, null, composerStartRestartGroup, 0, 124);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(editMsgUIState, modifier, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(SosScreenComponent sosScreenComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1363262822);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(sosScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1363262822, i2, -1, "app.chalo.sos.SosMainScreen (SosScreenUI.kt:41)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(sosScreenComponent.t0(), composerStartRestartGroup);
            i((SosScreenUIState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            SendSosConfirmationDialog sendSosConfirmationDialog = ((SosScreenUIState) mutableStateA.getValue()).b;
            if (sendSosConfirmationDialog == null) {
                composerStartRestartGroup.startReplaceGroup(-247846398);
            } else {
                composerStartRestartGroup.startReplaceGroup(-247846397);
                a(sendSosConfirmationDialog, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sosScreenComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new g61(sosScreenComponent, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            Boolean boolValueOf = Boolean.valueOf(((SosScreenUIState) mutableStateA.getValue()).c);
            SendSosConfirmationDialog sendSosConfirmationDialog2 = ((SosScreenUIState) mutableStateA.getValue()).b;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changedInstance(sosScreenComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SosScreenUIKt$SosMainScreen$3$1(sosScreenComponent, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, sendSosConfirmationDialog2, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(sosScreenComponent, i, 23));
        }
    }

    public static final void i(SosScreenUIState sosScreenUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-34379428);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sosScreenUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34379428, i2, -1, "app.chalo.sos.SosScreenContent (SosScreenUI.kt:62)");
            }
            SosScreenTypeUIState sosScreenTypeUIState = sosScreenUIState.f9421a;
            if (sosScreenTypeUIState instanceof SosScreenTypeUIState.DisplayScreenUIState) {
                composerStartRestartGroup.startReplaceGroup(-1995173678);
                e((SosScreenTypeUIState.DisplayScreenUIState) sosScreenTypeUIState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(sosScreenTypeUIState instanceof SosScreenTypeUIState.EditMsgUIState)) {
                    throw pk0.p(composerStartRestartGroup, 1321110171);
                }
                composerStartRestartGroup.startReplaceGroup(-1994976270);
                g((SosScreenTypeUIState.EditMsgUIState) sosScreenTypeUIState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(sosScreenUIState, i, 25));
        }
    }

    public static final void j(SosScreenSectionHeader sosScreenSectionHeader, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(587765733);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sosScreenSectionHeader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(587765733, i2, -1, "app.chalo.sos.SosSectionHeader (SosScreenUI.kt:271)");
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, sosScreenSectionHeader.d);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.c(sosScreenSectionHeader.f9418a, null, null, null, composerStartRestartGroup, 0, 14);
            if (sosScreenSectionHeader.b == null) {
                composerStartRestartGroup.startReplaceGroup(-1021031046);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1021031045);
                TextKt.c(sosScreenSectionHeader.b, ChaloThemeKt.c(Modifier.INSTANCE, sosScreenSectionHeader.c), null, null, composerStartRestartGroup, 0, 12);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(sosScreenSectionHeader, modifier, i, 2));
        }
    }
}
