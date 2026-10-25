package app.chalo.compose.components.dialogs;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.ButtonContainerUISpecs;
import app.chalo.uistate.dialog.ButtonContainerUIState;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.TermTextUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.ag1;
import defpackage.cb0;
import defpackage.cg1;
import defpackage.fb1;
import defpackage.i41;
import defpackage.kf;
import defpackage.pk0;
import defpackage.xm0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TncDialogUIKt {
    public static final void a(final ButtonContainerUIState buttonContainerUIState, Modifier modifier, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        ComposeUiNode.Companion companion;
        Modifier.Companion companion2;
        float f;
        Object obj;
        float f2;
        Modifier.Companion companion3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-274419888);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(buttonContainerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        final int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            final Modifier.Companion companion4 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-274419888, i3, -1, "app.chalo.compose.components.dialogs.ButtonContainer (TncDialogUI.kt:173)");
            }
            ButtonUIState buttonUIState = buttonContainerUIState.b;
            ButtonUIState buttonUIState2 = buttonContainerUIState.c;
            ButtonContainerUISpecs buttonContainerUISpecs = buttonContainerUIState.f9967a;
            boolean zChanged = composerStartRestartGroup.changed(buttonUIState) | composerStartRestartGroup.changed(buttonUIState2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Boolean.valueOf((buttonUIState == null || buttonUIState2 == null) ? false : true);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            if (buttonUIState == null && buttonUIState2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: yj1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    TncDialogUIKt.a(buttonContainerUIState, companion4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    TncDialogUIKt.a(buttonContainerUIState, companion4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            float f3 = buttonContainerUISpecs.d;
            UiAlignment.BiasAlignment biasAlignment = buttonContainerUISpecs.c;
            float f4 = buttonContainerUISpecs.d;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.m814height3ABfNKs(modifierFillMaxWidth$default, f3), buttonContainerUISpecs.f9966a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(buttonContainerUISpecs.b), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1472976821);
                composerStartRestartGroup.endReplaceGroup();
                companion2 = companion4;
                f = f4;
                companion = companion5;
                f2 = 0.0f;
                obj = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1472976822);
                companion = companion5;
                companion2 = companion4;
                Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(i41.a(rowScopeInstance, companion4, 1.0f, false, 2, null), f4, 0.0f, 2, null);
                boolean z = (i3 & 14) == 4;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final int i6 = 0;
                    objRememberedValue2 = new Function0() { // from class: zj1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    buttonContainerUIState.b.f.a();
                                    break;
                                default:
                                    buttonContainerUIState.c.f.a();
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM816heightInVpY3zN4$default, false, null, null, null, (Function0) objRememberedValue2, 15, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(UiAlignmentKt.c(biasAlignment), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
                pk0.v(companion, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                f = f4;
                obj = null;
                f2 = 0.0f;
                TextKt.c(buttonUIState.f9920a, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceGroup(1473429701);
                DividerUIStateKt.a(SizeKt.fillMaxHeight$default(companion2, f2, 1, obj), buttonContainerUIState.d, composerStartRestartGroup, 6, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1466453678);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r34 == 0) {
                composerStartRestartGroup.startReplaceGroup(1473600789);
                composerStartRestartGroup.endReplaceGroup();
                companion3 = companion2;
            } else {
                composerStartRestartGroup.startReplaceGroup(1473600790);
                companion3 = companion2;
                Modifier modifierM816heightInVpY3zN4$default2 = SizeKt.m816heightInVpY3zN4$default(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), f, f2, 2, obj);
                boolean z2 = (i3 & 14) == 4;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final int i8 = 1;
                    objRememberedValue3 = new Function0() { // from class: zj1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    buttonContainerUIState.b.f.a();
                                    break;
                                default:
                                    buttonContainerUIState.c.f.a();
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierM299clickableoSLSa3U$default2 = ClickableKt.m299clickableoSLSa3U$default(modifierM816heightInVpY3zN4$default2, false, null, null, null, (Function0) objRememberedValue3, 15, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(UiAlignmentKt.c(biasAlignment), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default2);
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
                pk0.v(companion, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                TextKt.c(buttonUIState2.f9920a, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i10 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: yj1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = i10;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    switch (i11) {
                        case 0:
                            TncDialogUIKt.a(buttonContainerUIState, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            TncDialogUIKt.a(buttonContainerUIState, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(TermTextUIState termTextUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(455504674);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(termTextUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(455504674, i2, -1, "app.chalo.compose.components.dialogs.TermText (TncDialogUI.kt:157)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), termTextUIState.f10012a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            TextKt.c(termTextUIState.c, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, termTextUIState.b), composerStartRestartGroup, 0);
            TextKt.c(termTextUIState.d, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(termTextUIState, modifier, i, 13));
        }
    }

    public static final void c(Modifier modifier, List tncList, String title, String positiveBtnText, Function0 positiveBtnClick, String negativeBtnText, Function0 negativeBtnClick, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Composer composer3;
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(title, "title");
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        Intrinsics.i(positiveBtnClick, "positiveBtnClick");
        Intrinsics.i(negativeBtnText, "negativeBtnText");
        Intrinsics.i(negativeBtnClick, "negativeBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1930906321);
        int i2 = (i & 48) == 0 ? (composerStartRestartGroup.changedInstance(tncList) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(positiveBtnText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(positiveBtnClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(negativeBtnText) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(negativeBtnClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599185 & i2) != 599184, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1930906321, i2, -1, "app.chalo.compose.components.dialogs.TnCDialog (TncDialogUI.kt:100)");
            }
            int i3 = i2;
            TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(title, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156);
            List list = tncList;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                String strH = cb0.h(i5, ". ");
                UITextStyle uITextStyle = UITextStyle.BodyMedium;
                ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
                arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                i4 = i5;
            }
            UITextStyle uITextStyle2 = UITextStyle.HeadlineMedium;
            UITextAlign uITextAlign = UITextAlign.Center;
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(negativeBtnText, uITextStyle2, ChaloColorToken.Black_87.f9768a, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            boolean z = (i3 & 3670016) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ag1(negativeBtnClick, 7);
                composer3 = composerStartRestartGroup;
                composer3.updateRememberedValue(objRememberedValue);
            } else {
                composer3 = composerStartRestartGroup;
            }
            ButtonUIState buttonUIState = new ButtonUIState(chaloTextUIState2, false, null, null, null, UiEventHandler.Companion.a((Function0) objRememberedValue), 0.0f, null, 222);
            Composer composer4 = composer3;
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(positiveBtnText, uITextStyle2, ChaloColorToken.OrangePrimary.f9835a, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
            boolean z2 = (i3 & 57344) == 16384;
            Object objRememberedValue2 = composer4.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ag1(positiveBtnClick, 8);
                composer2 = composer4;
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                composer2 = composer4;
            }
            d(new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState, arrayList, new ButtonContainerUIState(null, buttonUIState, new ButtonUIState(chaloTextUIState3, false, null, null, null, UiEventHandler.Companion.a((Function0) objRememberedValue2), 0.0f, null, 222), 9), 33), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kf(modifier2, tncList, title, positiveBtnText, positiveBtnClick, negativeBtnText, negativeBtnClick, i, 1));
        }
    }

    public static final void d(TnCDialogUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        DialogUIEventHandler dialogUIEventHandler = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(523578739);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523578739, i2, -1, "app.chalo.compose.components.dialogs.TnCDialog (TncDialogUI.kt:38)");
            }
            DialogDismissRequest dialogDismissRequest = dialogUIEventHandler.c;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(dialogDismissRequest);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                TncDialogUIKt$TnCDialog$1$1 tncDialogUIKt$TnCDialog$1$1 = new TncDialogUIKt$TnCDialog$1$1(0, dialogDismissRequest, DialogDismissRequest.class, "onDismissRequest", "onDismissRequest()V", 0);
                composerStartRestartGroup.updateRememberedValue(tncDialogUIKt$TnCDialog$1$1);
                objRememberedValue = tncDialogUIKt$TnCDialog$1$1;
            }
            AndroidDialog_androidKt.Dialog((Function0) ((KFunction) objRememberedValue), new DialogProperties(dialogUIEventHandler.f9988a, dialogUIEventHandler.b, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1744248964, true, new xm0(state, 24), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fb1(state, i, 28));
        }
    }
}
