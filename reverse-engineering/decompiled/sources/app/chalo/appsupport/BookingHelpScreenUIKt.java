package app.chalo.appsupport;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.app.FrameMetricsAggregator;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.appsupport.uistate.BookingHelpBottomSheetUIStateType;
import app.chalo.appsupport.uistate.BookingHelpDetailsScreenUiSpec;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.appsupport.uistate.FaqItemSpec;
import app.chalo.appsupport.uistate.FaqItemUiState;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import defpackage.b0;
import defpackage.c6;
import defpackage.d0;
import defpackage.e0;
import defpackage.i4;
import defpackage.pk0;
import defpackage.t1;
import defpackage.t8;
import defpackage.tb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isExpanded", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpScreenUIKt {
    public static final void a(BookingHelpScreenViewState bookingHelpScreenViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-695629703);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(bookingHelpScreenViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-695629703, i2, -1, "app.chalo.appsupport.BookingHelpScreenContent (BookingHelpScreenUI.kt:84)");
            }
            LoadingDialogUIState loadingDialogUIState = bookingHelpScreenViewState.c;
            BookingHelpDetailsScreenUiSpec bookingHelpDetailsScreenUiSpec = bookingHelpScreenViewState.f990a;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-287166218);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -287166217, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), bookingHelpDetailsScreenUiSpec.f989a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(bookingHelpScreenViewState.b, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.a(bookingHelpDetailsScreenUiSpec.b, composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(bookingHelpScreenViewState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new tb(bookingHelpScreenViewState, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, FrameMetricsAggregator.EVERY_DURATION);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(bookingHelpScreenViewState, i, 6));
        }
    }

    public static final void b(BookingHelpScreenViewState viewState, SheetState modalBottomSheetState, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        BookingHelpBottomSheetUIStateType bookingHelpBottomSheetUIStateType = viewState.e;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-766333656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-766333656, i3, -1, "app.chalo.appsupport.BookingHelpScreenUI (BookingHelpScreenUI.kt:42)");
            }
            if (Intrinsics.d(bookingHelpBottomSheetUIStateType, BookingHelpBottomSheetUIStateType.None.b)) {
                composerStartRestartGroup.startReplaceGroup(-2096546310);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2094538967);
                BottomSheetEventHandler bottomSheetEventHandler = bookingHelpBottomSheetUIStateType.f988a.b;
                boolean z = bottomSheetEventHandler.e;
                boolean z2 = bottomSheetEventHandler.c;
                boolean z3 = bottomSheetEventHandler.d;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new i4(viewState, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) objRememberedValue, z, z2, z3, ComposableLambdaKt.rememberComposableLambda(1166315817, true, new c6(viewState, 2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            a(viewState, composerStartRestartGroup, i3 & 14);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewState) | ((i3 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new BookingHelpScreenUIKt$BookingHelpScreenUI$3$1(viewState, modalBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(bookingHelpBottomSheetUIStateType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(viewState, modalBottomSheetState, i, 12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Modifier modifier, FaqItemUiState faqItemUiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(faqItemUiState, "faqItemUiState");
        Object obj = faqItemUiState.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-386623032);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(faqItemUiState) : composerStartRestartGroup.changedInstance(faqItemUiState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-386623032, i2, -1, "app.chalo.appsupport.FaqItem (BookingHelpScreenUI.kt:117)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            FaqItemSpec faqItemSpec = (FaqItemSpec) obj;
            Object[] objArr = new Object[0];
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(faqItemUiState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new i4(faqItemUiState, i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            Modifier modifierC = ChaloThemeKt.c(modifier, faqItemSpec.f993a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new t1(mutableState, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue3, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            ChaloTextViewKt.a(null, faqItemUiState.c, null, null, composerStartRestartGroup, 0, 13);
            ImageUIState imageUIState = faqItemUiState.e;
            composerStartRestartGroup.startReplaceGroup(1207096460);
            CommonImageKt.a(imageUIState, RotateKt.rotate(companion3, ((Boolean) mutableState.getValue()).booleanValue() ? 180.0f : 0.0f), false, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, ((Boolean) mutableState.getValue()).booleanValue(), companion3, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1484985066, true, new d0(4, faqItemSpec, faqItemUiState), composerStartRestartGroup, 54), composerStartRestartGroup, 1573254, 28);
            composer2 = composerStartRestartGroup;
            DividerUIState dividerUIState = faqItemUiState.f;
            if (dividerUIState == null) {
                composer2.startReplaceGroup(801855709);
            } else {
                composer2.startReplaceGroup(801855710);
                ChaloSpacersKt.a(faqItemSpec.d, composer2, 0);
                DividerUIStateKt.a(null, dividerUIState, composer2, 0, 1);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 11, modifier, faqItemUiState));
        }
    }
}
