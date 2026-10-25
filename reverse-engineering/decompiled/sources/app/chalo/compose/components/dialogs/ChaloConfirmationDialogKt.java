package app.chalo.compose.components.dialogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.dialog.ConfirmationDialogActionCtaContainerUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUISpec;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogueCtaUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.e0;
import defpackage.lj;
import defpackage.pk0;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfirmationDialogKt {
    public static final void a(final ConfirmationDialogUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f9974a;
        Composer composerStartRestartGroup = composer.startRestartGroup(906398993);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(906398993, i2, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:42)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            final ConfirmationDialogUISpec confirmationDialogUISpec = (ConfirmationDialogUISpec) obj;
            ChaloLoadingDialogKt.c(uiState.e, ComposableLambdaKt.rememberComposableLambda(120965223, true, new Function2() { // from class: app.chalo.compose.components.dialogs.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ConfirmationDialogActionCtaContainerUiState confirmationDialogActionCtaContainerUiState;
                    ConfirmationDialogUISpec confirmationDialogUISpec2;
                    ComposeUiNode.Companion companion;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(120965223, iIntValue, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog.<anonymous> (ChaloConfirmationDialog.kt:48)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        ConfirmationDialogUISpec confirmationDialogUISpec3 = confirmationDialogUISpec;
                        Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(confirmationDialogUISpec3.f9973a), null, 2, null), confirmationDialogUISpec3.b);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierC);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ConfirmationDialogUiState confirmationDialogUiState = uiState;
                        TextUIState.ChaloTextUIState chaloTextUIState = confirmationDialogUiState.b;
                        ConfirmationDialogActionCtaContainerUiState confirmationDialogActionCtaContainerUiState2 = confirmationDialogUiState.d;
                        if (chaloTextUIState == null) {
                            composer2.startReplaceGroup(-1745659510);
                            composer2.endReplaceGroup();
                            confirmationDialogUISpec2 = confirmationDialogUISpec3;
                            confirmationDialogActionCtaContainerUiState = confirmationDialogActionCtaContainerUiState2;
                        } else {
                            composer2.startReplaceGroup(-1745659509);
                            confirmationDialogActionCtaContainerUiState = confirmationDialogActionCtaContainerUiState2;
                            confirmationDialogUISpec2 = confirmationDialogUISpec3;
                            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                            ChaloSpacersKt.a(confirmationDialogUISpec2.c, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        TextUIState.ChaloTextUIState chaloTextUIState2 = confirmationDialogUiState.c;
                        if (chaloTextUIState2 == null) {
                            composer2.startReplaceGroup(-1745503828);
                        } else {
                            composer2.startReplaceGroup(-1745503827);
                            ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composer2, 0, 13);
                            ChaloSpacersKt.a(confirmationDialogUISpec2.d, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion3.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        DialogueCtaUiState dialogueCtaUiState = confirmationDialogActionCtaContainerUiState.c;
                        DialogueCtaUiState dialogueCtaUiState2 = confirmationDialogActionCtaContainerUiState.b;
                        if (dialogueCtaUiState == null) {
                            composer2.startReplaceGroup(1148553774);
                            composer2.endReplaceGroup();
                            companion = companion4;
                        } else {
                            composer2.startReplaceGroup(1148553775);
                            Modifier modifierC2 = ChaloThemeKt.c(companion2, dialogueCtaUiState.f9991a.f9990a);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierC2);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
                            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer2);
                            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer2);
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = dialogueCtaUiState.c;
                            boolean zChangedInstance = composer2.changedInstance(uiEventHandler$Companion$fromLambda$1);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new ChaloConfirmationDialogKt$ChaloConfirmationDialog$1$1$3$1$1$1$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            companion = companion4;
                            confirmationDialogActionCtaContainerUiState = confirmationDialogActionCtaContainerUiState;
                            ChaloTextViewKt.a(ClickableKt.m295clickableO2vRcR0$default(companion2, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) ((KFunction) objRememberedValue2), 28, null), dialogueCtaUiState.b, null, null, composer2, 0, 12);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        ChaloSpacersKt.a(confirmationDialogActionCtaContainerUiState.f9972a.b, composer2, 0);
                        Modifier modifierC3 = ChaloThemeKt.c(companion2, dialogueCtaUiState2.f9991a.f9990a);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierC3);
                        Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composer2);
                        IndicationNodeFactory indicationNodeFactoryA2 = RippleEffectKt.a(composer2);
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = dialogueCtaUiState2.c;
                        boolean zChangedInstance2 = composer2.changedInstance(uiEventHandler$Companion$fromLambda$2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            ChaloConfirmationDialogKt$ChaloConfirmationDialog$1$1$3$2$1$1 chaloConfirmationDialogKt$ChaloConfirmationDialog$1$1$3$2$1$1 = new ChaloConfirmationDialogKt$ChaloConfirmationDialog$1$1$3$2$1$1(0, uiEventHandler$Companion$fromLambda$2, UiEventHandler.class, "onClick", "onClick()V", 0);
                            composer2.updateRememberedValue(chaloConfirmationDialogKt$ChaloConfirmationDialog$1$1$3$2$1$1);
                            objRememberedValue3 = chaloConfirmationDialogKt$ChaloConfirmationDialog$1$1$3$2$1$1;
                        }
                        ChaloTextViewKt.a(ClickableKt.m295clickableO2vRcR0$default(companion2, mutableInteractionSourceB2, indicationNodeFactoryA2, false, null, null, (Function0) ((KFunction) objRememberedValue3), 28, null), dialogueCtaUiState2.b, null, null, composer2, 0, 12);
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(uiState, i, 28));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:105:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x019f  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    public static final void b(String str, final String str2, final String positiveBtnText, final Function0 onPositiveBtnClick, String str3, Function0 function0, DialogProperties dialogProperties, Function0 function1, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        String str5;
        int i4;
        Function0 function2;
        int i5;
        int i6;
        DialogProperties dialogProperties2;
        int i7;
        int i8;
        int i9;
        boolean z;
        Composer composer2;
        final Function0 function3;
        final String str6;
        final String str7;
        final DialogProperties dialogProperties3;
        final Function0 function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function5;
        final String str8;
        final String str9;
        Object objRememberedValue;
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        Intrinsics.i(onPositiveBtnClick, "onPositiveBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(999333740);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            str4 = str;
        } else if ((i & 6) == 0) {
            str4 = str;
            i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(positiveBtnText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPositiveBtnClick) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                str5 = str3;
                i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        dialogProperties2 = dialogProperties;
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i9 = 8388608;
                            } else {
                                i9 = 4194304;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 4793491) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                            if (i10 != 0) {
                                str8 = null;
                            } else {
                                str8 = str4;
                            }
                            if (i11 != 0) {
                                str9 = null;
                            } else {
                                str9 = str5;
                            }
                            if (i4 != 0) {
                                function2 = null;
                            }
                            if (i6 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                            }
                            if (i8 != 0) {
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new wb(8);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function3 = (Function0) objRememberedValue;
                            } else {
                                function3 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                            }
                            if (str8 == null || str2 != null) {
                                String str10 = str9;
                                int i12 = i3;
                                String str11 = str8;
                                composer2 = composerStartRestartGroup;
                                DialogProperties dialogProperties4 = dialogProperties2;
                                AndroidDialog_androidKt.Dialog(function3, dialogProperties4, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str10, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i12 >> 21) & 14) | 384 | ((i12 >> 15) & 112), 0);
                                dialogProperties3 = dialogProperties4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                str6 = str11;
                                str7 = str10;
                            } else {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    return;
                                }
                                final int i13 = 0;
                                final Function0 function6 = function2;
                                final DialogProperties dialogProperties5 = dialogProperties2;
                                function5 = new Function2() { // from class: kj
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        switch (i13) {
                                            case 0:
                                                ((Integer) obj2).getClass();
                                                ChaloConfirmationDialogKt.b(str8, str2, positiveBtnText, onPositiveBtnClick, str9, function6, dialogProperties5, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                                break;
                                            default:
                                                ((Integer) obj2).getClass();
                                                ChaloConfirmationDialogKt.b(str8, str2, positiveBtnText, onPositiveBtnClick, str9, function6, dialogProperties5, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(function5);
                        }
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        function3 = function1;
                        str6 = str4;
                        str7 = str5;
                        dialogProperties3 = dialogProperties2;
                        function4 = function2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final int i14 = 1;
                            function5 = new Function2() { // from class: kj
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i14) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            scopeUpdateScopeEndRestartGroup.updateScope(function5);
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        if (i10 != 0) {
                            str8 = null;
                        } else {
                            str8 = str4;
                        }
                        if (i11 != 0) {
                            str9 = null;
                        } else {
                            str9 = str5;
                        }
                        if (i4 != 0) {
                            function2 = null;
                        }
                        if (i6 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                        }
                        if (i8 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wb(8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function3 = (Function0) objRememberedValue;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                        }
                        if (str8 == null) {
                        }
                        String str12 = str9;
                        int i15 = i3;
                        String str13 = str8;
                        composer2 = composerStartRestartGroup;
                        DialogProperties dialogProperties6 = dialogProperties2;
                        AndroidDialog_androidKt.Dialog(function3, dialogProperties6, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str12, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i15 >> 21) & 14) | 384 | ((i15 >> 15) & 112), 0);
                        dialogProperties3 = dialogProperties6;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str13;
                        str7 = str12;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        function3 = function1;
                        str6 = str4;
                        str7 = str5;
                        dialogProperties3 = dialogProperties2;
                    }
                    function4 = function2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final int i16 = 1;
                        function5 = new Function2() { // from class: kj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i16) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        scopeUpdateScopeEndRestartGroup.updateScope(function5);
                    }
                }
                i3 |= 1572864;
                dialogProperties2 = dialogProperties;
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        if (i10 != 0) {
                            str8 = null;
                        } else {
                            str8 = str4;
                        }
                        if (i11 != 0) {
                            str9 = null;
                        } else {
                            str9 = str5;
                        }
                        if (i4 != 0) {
                            function2 = null;
                        }
                        if (i6 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                        }
                        if (i8 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wb(8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function3 = (Function0) objRememberedValue;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                        }
                        if (str8 == null) {
                        }
                        String str14 = str9;
                        int i17 = i3;
                        String str15 = str8;
                        composer2 = composerStartRestartGroup;
                        DialogProperties dialogProperties7 = dialogProperties2;
                        AndroidDialog_androidKt.Dialog(function3, dialogProperties7, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str14, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i17 >> 21) & 14) | 384 | ((i17 >> 15) & 112), 0);
                        dialogProperties3 = dialogProperties7;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str15;
                        str7 = str14;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        function3 = function1;
                        str6 = str4;
                        str7 = str5;
                        dialogProperties3 = dialogProperties2;
                    }
                    function4 = function2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final int i18 = 1;
                        function5 = new Function2() { // from class: kj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i18) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        scopeUpdateScopeEndRestartGroup.updateScope(function5);
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i10 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i4 != 0) {
                        function2 = null;
                    }
                    if (i6 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function3 = (Function0) objRememberedValue;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                    }
                    if (str8 == null) {
                    }
                    String str16 = str9;
                    int i19 = i3;
                    String str17 = str8;
                    composer2 = composerStartRestartGroup;
                    DialogProperties dialogProperties8 = dialogProperties2;
                    AndroidDialog_androidKt.Dialog(function3, dialogProperties8, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str16, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i19 >> 21) & 14) | 384 | ((i19 >> 15) & 112), 0);
                    dialogProperties3 = dialogProperties8;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str17;
                    str7 = str16;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function3 = function1;
                    str6 = str4;
                    str7 = str5;
                    dialogProperties3 = dialogProperties2;
                }
                function4 = function2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i110 = 1;
                    function5 = new Function2() { // from class: kj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i110) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function2 = function0;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        if (i10 != 0) {
                            str8 = null;
                        } else {
                            str8 = str4;
                        }
                        if (i11 != 0) {
                            str9 = null;
                        } else {
                            str9 = str5;
                        }
                        if (i4 != 0) {
                            function2 = null;
                        }
                        if (i6 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                        }
                        if (i8 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wb(8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function3 = (Function0) objRememberedValue;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                        }
                        if (str8 == null) {
                        }
                        String str18 = str9;
                        int i111 = i3;
                        String str19 = str8;
                        composer2 = composerStartRestartGroup;
                        DialogProperties dialogProperties9 = dialogProperties2;
                        AndroidDialog_androidKt.Dialog(function3, dialogProperties9, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str18, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i111 >> 21) & 14) | 384 | ((i111 >> 15) & 112), 0);
                        dialogProperties3 = dialogProperties9;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str19;
                        str7 = str18;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        function3 = function1;
                        str6 = str4;
                        str7 = str5;
                        dialogProperties3 = dialogProperties2;
                    }
                    function4 = function2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final int i112 = 1;
                        function5 = new Function2() { // from class: kj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i112) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        scopeUpdateScopeEndRestartGroup.updateScope(function5);
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i10 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i4 != 0) {
                        function2 = null;
                    }
                    if (i6 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function3 = (Function0) objRememberedValue;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                    }
                    if (str8 == null) {
                    }
                    String str110 = str9;
                    int i113 = i3;
                    String str111 = str8;
                    composer2 = composerStartRestartGroup;
                    DialogProperties dialogProperties10 = dialogProperties2;
                    AndroidDialog_androidKt.Dialog(function3, dialogProperties10, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str110, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i113 >> 21) & 14) | 384 | ((i113 >> 15) & 112), 0);
                    dialogProperties3 = dialogProperties10;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str111;
                    str7 = str110;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function3 = function1;
                    str6 = str4;
                    str7 = str5;
                    dialogProperties3 = dialogProperties2;
                }
                function4 = function2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i114 = 1;
                    function5 = new Function2() { // from class: kj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i114) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= 1572864;
            dialogProperties2 = dialogProperties;
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i10 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i4 != 0) {
                        function2 = null;
                    }
                    if (i6 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function3 = (Function0) objRememberedValue;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                    }
                    if (str8 == null) {
                    }
                    String str112 = str9;
                    int i115 = i3;
                    String str113 = str8;
                    composer2 = composerStartRestartGroup;
                    DialogProperties dialogProperties11 = dialogProperties2;
                    AndroidDialog_androidKt.Dialog(function3, dialogProperties11, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str112, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i115 >> 21) & 14) | 384 | ((i115 >> 15) & 112), 0);
                    dialogProperties3 = dialogProperties11;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str113;
                    str7 = str112;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function3 = function1;
                    str6 = str4;
                    str7 = str5;
                    dialogProperties3 = dialogProperties2;
                }
                function4 = function2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i116 = 1;
                    function5 = new Function2() { // from class: kj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i116) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i10 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i4 != 0) {
                    function2 = null;
                }
                if (i6 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (i8 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function3 = (Function0) objRememberedValue;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                }
                if (str8 == null) {
                }
                String str114 = str9;
                int i117 = i3;
                String str115 = str8;
                composer2 = composerStartRestartGroup;
                DialogProperties dialogProperties12 = dialogProperties2;
                AndroidDialog_androidKt.Dialog(function3, dialogProperties12, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str114, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i117 >> 21) & 14) | 384 | ((i117 >> 15) & 112), 0);
                dialogProperties3 = dialogProperties12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str115;
                str7 = str114;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function3 = function1;
                str6 = str4;
                str7 = str5;
                dialogProperties3 = dialogProperties2;
            }
            function4 = function2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i118 = 1;
                function5 = new Function2() { // from class: kj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i118) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
        }
        i3 |= 24576;
        str5 = str3;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    dialogProperties2 = dialogProperties;
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        if (i10 != 0) {
                            str8 = null;
                        } else {
                            str8 = str4;
                        }
                        if (i11 != 0) {
                            str9 = null;
                        } else {
                            str9 = str5;
                        }
                        if (i4 != 0) {
                            function2 = null;
                        }
                        if (i6 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                        }
                        if (i8 != 0) {
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new wb(8);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function3 = (Function0) objRememberedValue;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                        }
                        if (str8 == null) {
                        }
                        String str116 = str9;
                        int i119 = i3;
                        String str117 = str8;
                        composer2 = composerStartRestartGroup;
                        DialogProperties dialogProperties13 = dialogProperties2;
                        AndroidDialog_androidKt.Dialog(function3, dialogProperties13, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str116, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i119 >> 21) & 14) | 384 | ((i119 >> 15) & 112), 0);
                        dialogProperties3 = dialogProperties13;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str6 = str117;
                        str7 = str116;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        function3 = function1;
                        str6 = str4;
                        str7 = str5;
                        dialogProperties3 = dialogProperties2;
                    }
                    function4 = function2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final int i1110 = 1;
                        function5 = new Function2() { // from class: kj
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i1110) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        scopeUpdateScopeEndRestartGroup.updateScope(function5);
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i10 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i4 != 0) {
                        function2 = null;
                    }
                    if (i6 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function3 = (Function0) objRememberedValue;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                    }
                    if (str8 == null) {
                    }
                    String str118 = str9;
                    int i1111 = i3;
                    String str119 = str8;
                    composer2 = composerStartRestartGroup;
                    DialogProperties dialogProperties14 = dialogProperties2;
                    AndroidDialog_androidKt.Dialog(function3, dialogProperties14, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str118, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i1111 >> 21) & 14) | 384 | ((i1111 >> 15) & 112), 0);
                    dialogProperties3 = dialogProperties14;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str119;
                    str7 = str118;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function3 = function1;
                    str6 = str4;
                    str7 = str5;
                    dialogProperties3 = dialogProperties2;
                }
                function4 = function2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i1112 = 1;
                    function5 = new Function2() { // from class: kj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i1112) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= 1572864;
            dialogProperties2 = dialogProperties;
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i10 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i4 != 0) {
                        function2 = null;
                    }
                    if (i6 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function3 = (Function0) objRememberedValue;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                    }
                    if (str8 == null) {
                    }
                    String str1110 = str9;
                    int i1113 = i3;
                    String str1111 = str8;
                    composer2 = composerStartRestartGroup;
                    DialogProperties dialogProperties15 = dialogProperties2;
                    AndroidDialog_androidKt.Dialog(function3, dialogProperties15, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str1110, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i1113 >> 21) & 14) | 384 | ((i1113 >> 15) & 112), 0);
                    dialogProperties3 = dialogProperties15;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str1111;
                    str7 = str1110;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function3 = function1;
                    str6 = str4;
                    str7 = str5;
                    dialogProperties3 = dialogProperties2;
                }
                function4 = function2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i1114 = 1;
                    function5 = new Function2() { // from class: kj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i1114) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i10 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i4 != 0) {
                    function2 = null;
                }
                if (i6 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (i8 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function3 = (Function0) objRememberedValue;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                }
                if (str8 == null) {
                }
                String str1112 = str9;
                int i1115 = i3;
                String str1113 = str8;
                composer2 = composerStartRestartGroup;
                DialogProperties dialogProperties16 = dialogProperties2;
                AndroidDialog_androidKt.Dialog(function3, dialogProperties16, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str1112, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i1115 >> 21) & 14) | 384 | ((i1115 >> 15) & 112), 0);
                dialogProperties3 = dialogProperties16;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str1113;
                str7 = str1112;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function3 = function1;
                str6 = str4;
                str7 = str5;
                dialogProperties3 = dialogProperties2;
            }
            function4 = function2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i1116 = 1;
                function5 = new Function2() { // from class: kj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i1116) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function2 = function0;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                dialogProperties2 = dialogProperties;
                if (composerStartRestartGroup.changed(dialogProperties2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i10 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    if (i11 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i4 != 0) {
                        function2 = null;
                    }
                    if (i6 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                    }
                    if (i8 != 0) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new wb(8);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function3 = (Function0) objRememberedValue;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                    }
                    if (str8 == null) {
                    }
                    String str1114 = str9;
                    int i1117 = i3;
                    String str1115 = str8;
                    composer2 = composerStartRestartGroup;
                    DialogProperties dialogProperties17 = dialogProperties2;
                    AndroidDialog_androidKt.Dialog(function3, dialogProperties17, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str1114, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i1117 >> 21) & 14) | 384 | ((i1117 >> 15) & 112), 0);
                    dialogProperties3 = dialogProperties17;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str6 = str1115;
                    str7 = str1114;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function3 = function1;
                    str6 = str4;
                    str7 = str5;
                    dialogProperties3 = dialogProperties2;
                }
                function4 = function2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i1118 = 1;
                    function5 = new Function2() { // from class: kj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i1118) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function5);
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i10 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i4 != 0) {
                    function2 = null;
                }
                if (i6 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (i8 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function3 = (Function0) objRememberedValue;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                }
                if (str8 == null) {
                }
                String str1116 = str9;
                int i1119 = i3;
                String str1117 = str8;
                composer2 = composerStartRestartGroup;
                DialogProperties dialogProperties18 = dialogProperties2;
                AndroidDialog_androidKt.Dialog(function3, dialogProperties18, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str1116, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i1119 >> 21) & 14) | 384 | ((i1119 >> 15) & 112), 0);
                dialogProperties3 = dialogProperties18;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str1117;
                str7 = str1116;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function3 = function1;
                str6 = str4;
                str7 = str5;
                dialogProperties3 = dialogProperties2;
            }
            function4 = function2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i11110 = 1;
                function5 = new Function2() { // from class: kj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i11110) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
        }
        i3 |= 1572864;
        dialogProperties2 = dialogProperties;
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i10 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                if (i11 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i4 != 0) {
                    function2 = null;
                }
                if (i6 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (i8 != 0) {
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function3 = (Function0) objRememberedValue;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
                }
                if (str8 == null) {
                }
                String str1118 = str9;
                int i11111 = i3;
                String str1119 = str8;
                composer2 = composerStartRestartGroup;
                DialogProperties dialogProperties19 = dialogProperties2;
                AndroidDialog_androidKt.Dialog(function3, dialogProperties19, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str1118, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i11111 >> 21) & 14) | 384 | ((i11111 >> 15) & 112), 0);
                dialogProperties3 = dialogProperties19;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str1119;
                str7 = str1118;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function3 = function1;
                str6 = str4;
                str7 = str5;
                dialogProperties3 = dialogProperties2;
            }
            function4 = function2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i11112 = 1;
                function5 = new Function2() { // from class: kj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i11112) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                scopeUpdateScopeEndRestartGroup.updateScope(function5);
            }
        }
        i3 |= 12582912;
        if ((i3 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i10 != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            if (i11 != 0) {
                str9 = null;
            } else {
                str9 = str5;
            }
            if (i4 != 0) {
                function2 = null;
            }
            if (i6 != 0) {
                dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
            }
            if (i8 != 0) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function3 = (Function0) objRememberedValue;
            } else {
                function3 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999333740, i3, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog (ChaloConfirmationDialog.kt:114)");
            }
            if (str8 == null) {
            }
            String str11110 = str9;
            int i11113 = i3;
            String str11111 = str8;
            composer2 = composerStartRestartGroup;
            DialogProperties dialogProperties110 = dialogProperties2;
            AndroidDialog_androidKt.Dialog(function3, dialogProperties110, ComposableLambdaKt.rememberComposableLambda(-799593739, true, new lj(str8, str2, str11110, positiveBtnText, function2, onPositiveBtnClick), composerStartRestartGroup, 54), composer2, ((i11113 >> 21) & 14) | 384 | ((i11113 >> 15) & 112), 0);
            dialogProperties3 = dialogProperties110;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str6 = str11111;
            str7 = str11110;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function3 = function1;
            str6 = str4;
            str7 = str5;
            dialogProperties3 = dialogProperties2;
        }
        function4 = function2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11114 = 1;
            function5 = new Function2() { // from class: kj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i11114) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ChaloConfirmationDialogKt.b(str6, str2, positiveBtnText, onPositiveBtnClick, str7, function4, dialogProperties3, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
    }
}
