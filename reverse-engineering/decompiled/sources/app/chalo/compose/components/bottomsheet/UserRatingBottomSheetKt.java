package app.chalo.compose.components.bottomsheet;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.UserReviewRatingBarKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cn;
import defpackage.ia;
import defpackage.ob;
import defpackage.pk0;
import defpackage.rn1;
import defpackage.tn1;
import defpackage.v21;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"", "tellUsMoreText", "", "userTripRating", "Lapp/chalo/usecase/FeedbackData;", "feedbackDataState", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserRatingBottomSheetKt {
    public static final void a(int i, IconType headerImageId, String headerTitle, String headerSubTitle, List feedbackData, String ctaTitle, Function1 onRatingSelected, Function3 onOkayClicked, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Composer composer2;
        Modifier modifier2;
        int i6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        rn1 rn1Var;
        MutableState mutableState;
        MutableIntState mutableIntState;
        Intrinsics.i(headerImageId, "headerImageId");
        Intrinsics.i(headerTitle, "headerTitle");
        Intrinsics.i(headerSubTitle, "headerSubTitle");
        Intrinsics.i(feedbackData, "feedbackData");
        Intrinsics.i(ctaTitle, "ctaTitle");
        Intrinsics.i(onRatingSelected, "onRatingSelected");
        Intrinsics.i(onOkayClicked, "onOkayClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1835049730);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(headerImageId.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(headerTitle) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(headerSubTitle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(feedbackData) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerStartRestartGroup.changed(ctaTitle) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onRatingSelected) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onOkayClicked) ? 8388608 : 4194304;
        }
        int i8 = i5 | 100663296;
        if (composerStartRestartGroup.shouldExecute((38347923 & i8) != 38347922, i8 & 1)) {
            int i9 = i7 != 0 ? 5 : i4;
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1835049730, i8, -1, "app.chalo.compose.components.bottomsheet.UserRatingBottomSheet (UserRatingBottomSheet.kt:49)");
            }
            if (feedbackData.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    rn1Var = new rn1(i9, headerImageId, headerTitle, headerSubTitle, feedbackData, ctaTitle, onRatingSelected, onOkayClicked, companion, i2, i3, 0);
                }
            } else {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState2 = (MutableState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue3;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(feedbackData.get(0), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                MutableState mutableState3 = (MutableState) objRememberedValue4;
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 6).t, null, 2, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
                int i11 = i9;
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, mutableIntState2.getIntValue() == 0, (Modifier) null, (EnterTransition) null, EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1123949492, true, new ob(headerImageId, headerTitle, headerSubTitle), composerStartRestartGroup, 54), composerStartRestartGroup, 1597446, 22);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                int intValue = mutableIntState2.getIntValue();
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(feedbackData) | ((i8 & 3670016) == 1048576);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == companion2.getEmpty()) {
                    mutableState = mutableState3;
                    v21 v21Var = new v21(feedbackData, onRatingSelected, mutableIntState2, mutableState, 8);
                    mutableIntState = mutableIntState2;
                    composerStartRestartGroup.updateRememberedValue(v21Var);
                    objRememberedValue5 = v21Var;
                } else {
                    mutableState = mutableState3;
                    mutableIntState = mutableIntState2;
                }
                UserReviewRatingBarKt.a(i11, intValue, (Function1) objRememberedValue5, composerStartRestartGroup, i8 & 14);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, mutableIntState.getIntValue() != 0, (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1339979773, true, new tn1(1, snapshotStateList, mutableState, mutableState2), composerStartRestartGroup, 54), composerStartRestartGroup, 1575942, 26);
                boolean z = mutableIntState.getIntValue() != 0;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean z2 = (i8 & 29360128) == 8388608;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = new ia(onOkayClicked, snapshotStateList, mutableIntState, mutableState2, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                ChaloFilledButtonKt.j(modifierFillMaxWidth$default, ctaTitle, null, 0L, 0L, 0L, 0L, null, 0.0f, z, null, (Function0) objRememberedValue6, composerStartRestartGroup, ((i8 >> 12) & 112) | 6, 0, 1532);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
                i6 = i11;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(rn1Var);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        modifier2 = modifier;
        i6 = i4;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            rn1Var = new rn1(i6, headerImageId, headerTitle, headerSubTitle, feedbackData, ctaTitle, onRatingSelected, onOkayClicked, modifier2, i2, i3, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(rn1Var);
        }
    }

    public static final void b(IconType iconType, String str, String str2, Composer composer, int i) {
        int i2;
        String str3;
        IconType iconType2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-752474673);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752474673, i2, -1, "app.chalo.compose.components.bottomsheet.UserRatingHeaderComposable (UserRatingBottomSheet.kt:132)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            iconType2 = iconType;
            ImageKt.Image(PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, i2 & 14), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 6)), composer2, (i2 >> 3) & 14, 0, 131070);
            ChaloSpacersKt.m(composer2, 0);
            TextKt.m2623TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 6)), composer2, (i2 >> 6) & 14, 0, 131070);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            iconType2 = iconType;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cn(iconType2, str, str2, i, 2));
        }
    }
}
