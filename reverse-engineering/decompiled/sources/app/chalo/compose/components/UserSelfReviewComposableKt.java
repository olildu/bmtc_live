package app.chalo.compose.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.usecase.FeedbackData;
import defpackage.c9;
import defpackage.h01;
import defpackage.pk0;
import defpackage.tn1;
import defpackage.xc;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "userReviewText", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserSelfReviewComposableKt {
    public static final void a(FeedbackData userReviewOptions, Function1 onOptionsClicked, List optionsSelected, Composer composer, int i) {
        int i2;
        Intrinsics.i(userReviewOptions, "userReviewOptions");
        Intrinsics.i(onOptionsClicked, "onOptionsClicked");
        Intrinsics.i(optionsSelected, "optionsSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1890456106);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(userReviewOptions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOptionsClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(optionsSelected) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1890456106, i2, -1, "app.chalo.compose.components.UserReviewCardCollectionComposable (UserSelfReviewComposable.kt:76)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), arrangement.getCenter(), null, null, 2, 0, ComposableLambdaKt.rememberComposableLambda(2016657073, true, new tn1(0, userReviewOptions, optionsSelected, onOptionsClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 1597494, 44);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 29, userReviewOptions, onOptionsClicked, optionsSelected));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02af  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0129  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x016f  */
    /* JADX WARN: Code duplicated, block: B:78:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:87:0x0228  */
    /* JADX WARN: Code duplicated, block: B:90:0x0242  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0296  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0228, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(FeedbackData userReviewOptions, List currentOptionsSelected, Function1 onReviewOptionsClicked, Function1 onTellUsMoreTextChange, boolean z, boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        Composer composer2;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z6;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Modifier.Companion companion2;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        int i4;
        Modifier.Companion companion3;
        int i5;
        int i6;
        Object objRememberedValue2;
        Intrinsics.i(userReviewOptions, "userReviewOptions");
        Intrinsics.i(currentOptionsSelected, "currentOptionsSelected");
        Intrinsics.i(onReviewOptionsClicked, "onReviewOptionsClicked");
        Intrinsics.i(onTellUsMoreTextChange, "onTellUsMoreTextChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1402990777);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(userReviewOptions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(currentOptionsSelected) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReviewOptionsClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTellUsMoreTextChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i3 & 1)) {
                if (i7 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1402990777, i3, -1, "app.chalo.compose.components.UserSelfReviewComposable (UserSelfReviewComposable.kt:32)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                companion2 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                constructor2 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                if (z6) {
                    composerStartRestartGroup.startReplaceGroup(-1975111497);
                    int i10 = i3;
                    String str = userReviewOptions.b;
                    TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 = 0;
                    i4 = i10;
                    companion3 = companion2;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleG, composerStartRestartGroup, 0, 0, 131070);
                    composer2 = composerStartRestartGroup;
                    ChaloSpacersKt.o(composer2, 0);
                } else {
                    int i11 = i3;
                    composer2 = composerStartRestartGroup;
                    i4 = i11;
                    companion3 = companion2;
                    i5 = 0;
                    composer2.startReplaceGroup(-1976650275);
                }
                composer2.endReplaceGroup();
                a(userReviewOptions, onReviewOptionsClicked, currentOptionsSelected, composer2, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896));
                composer2.endNode();
                ChaloSpacersKt.p(composer2, i5);
                if (z) {
                    composer2.startReplaceGroup(372043886);
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    i6 = (i4 & 7168) != 2048 ? i5 : 1;
                    objRememberedValue2 = composer2.rememberedValue();
                    if (i6 == 0 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new xc(onTellUsMoreTextChange, mutableState, 9);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Composer composer3 = composer2;
                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue2, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserSelfReviewComposableKt.f1840a, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 4, 4, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer3, 12583296, 905969664, 0, 7602040);
                    composer2 = composer3;
                } else {
                    composer2.startReplaceGroup(369941683);
                }
                composer2.endReplaceGroup();
                ChaloSpacersKt.n(composer2, i5);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z5 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new c9(userReviewOptions, currentOptionsSelected, onReviewOptionsClicked, onTellUsMoreTextChange, z, z5, i, i2));
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z3 = z2;
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z4, i3 & 1)) {
            if (i7 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402990777, i3, -1, "app.chalo.compose.components.UserSelfReviewComposable (UserSelfReviewComposable.kt:32)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            companion2 = Modifier.INSTANCE;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion7, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i13 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            constructor2 = companion7.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion7, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl4, Integer.valueOf(i13), composerM3915constructorimpl4));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-1975111497);
                int i14 = i3;
                String str2 = userReviewOptions.b;
                TextStyle textStyleG2 = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                i5 = 0;
                i4 = i14;
                companion3 = companion2;
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleG2, composerStartRestartGroup, 0, 0, 131070);
                composer2 = composerStartRestartGroup;
                ChaloSpacersKt.o(composer2, 0);
            } else {
                int i15 = i3;
                composer2 = composerStartRestartGroup;
                i4 = i15;
                companion3 = companion2;
                i5 = 0;
                composer2.startReplaceGroup(-1976650275);
            }
            composer2.endReplaceGroup();
            a(userReviewOptions, onReviewOptionsClicked, currentOptionsSelected, composer2, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896));
            composer2.endNode();
            ChaloSpacersKt.p(composer2, i5);
            if (z) {
                composer2.startReplaceGroup(372043886);
                TextFieldValue textFieldValue2 = (TextFieldValue) mutableState.getValue();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                if ((i4 & 7168) != 2048) {
                }
                objRememberedValue2 = composer2.rememberedValue();
                if (i6 == 0) {
                    objRememberedValue2 = new xc(onTellUsMoreTextChange, mutableState, 9);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new xc(onTellUsMoreTextChange, mutableState, 9);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Composer composer4 = composer2;
                OutlinedTextFieldKt.OutlinedTextField(textFieldValue2, (Function1<? super TextFieldValue, Unit>) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserSelfReviewComposableKt.f1840a, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 4, 4, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer4, 12583296, 905969664, 0, 7602040);
                composer2 = composer4;
            } else {
                composer2.startReplaceGroup(369941683);
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.n(composer2, i5);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z5 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new c9(userReviewOptions, currentOptionsSelected, onReviewOptionsClicked, onTellUsMoreTextChange, z, z5, i, i2));
        }
    }
}
