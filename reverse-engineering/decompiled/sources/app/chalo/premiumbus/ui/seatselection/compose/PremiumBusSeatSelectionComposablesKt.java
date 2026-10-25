package app.chalo.premiumbus.ui.seatselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionComposablesKt;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderSelectionOptionUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PassengerCountSelectionBottomSheetUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PassengerCountSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatChangeDialogTypeUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatSelectionDialogTypeUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeInfoHeaderUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SingleSeatUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.WomenReservedSeatsChoiceBottomSheetUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.ar0;
import defpackage.b3;
import defpackage.bu0;
import defpackage.fu0;
import defpackage.kn0;
import defpackage.pk0;
import defpackage.r1;
import defpackage.wl;
import defpackage.zr0;
import io.github.alexzhirkevich.compottie.LottieAnimationState;
import io.github.alexzhirkevich.compottie.LottieCompositionResultImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSeatSelectionComposablesKt {
    public static final void a(SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.f7787a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-509446431);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-509446431, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.ChangeSeatConfirmationDialogComposable (PremiumBusSeatSelectionComposables.kt:253)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ChaloRoundedCardKt.b(null, ChaloThemeKt.d(ChaloThemeHelper.d.g), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-2119910686, true, new fu0(2, uiState, (SeatChangeDialogTypeUISpecs) obj), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(uiState, i, 21));
        }
    }

    public static final void b(GenderConfirmationBottomSheetUIState uiState, Function0 onGenderConfirmationSuccessAnimationCompletedIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Intrinsics.i(onGenderConfirmationSuccessAnimationCompletedIntent, "onGenderConfirmationSuccessAnimationCompletedIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1912018540);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGenderConfirmationSuccessAnimationCompletedIntent) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1912018540, i3, -1, "app.chalo.premiumbus.ui.seatselection.compose.GenderConfirmationBottomSheetComposable (PremiumBusSeatSelectionComposables.kt:346)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(companion, ChaloThemeHelper.a().h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageUIState imageUIState = null;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z = uiState instanceof GenderConfirmationBottomSheetUIState.PreferenceSelectionOptionUIState;
            if (z) {
                imageUIState = ((GenderConfirmationBottomSheetUIState.PreferenceSelectionOptionUIState) uiState).h;
            } else if (uiState instanceof GenderConfirmationBottomSheetUIState.SuccessUIState) {
                imageUIState = ((GenderConfirmationBottomSheetUIState.SuccessUIState) uiState).d;
            } else if (uiState instanceof GenderConfirmationBottomSheetUIState.FailureUIState) {
                imageUIState = ((GenderConfirmationBottomSheetUIState.FailureUIState) uiState).f;
            } else if (!(uiState instanceof GenderConfirmationBottomSheetUIState.LoadingUIState)) {
                throw new NoWhenBranchMatchedException();
            }
            ImageUIState imageUIState2 = imageUIState;
            if (imageUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1916805915);
            } else {
                composerStartRestartGroup.startReplaceGroup(1916805916);
                CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-289632831);
                f((GenderConfirmationBottomSheetUIState.PreferenceSelectionOptionUIState) uiState, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (uiState instanceof GenderConfirmationBottomSheetUIState.SuccessUIState) {
                composerStartRestartGroup.startReplaceGroup(-388561771);
                GenderConfirmationBottomSheetUIState.SuccessUIState successUIState = (GenderConfirmationBottomSheetUIState.SuccessUIState) uiState;
                boolean z2 = (i3 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ar0(onGenderConfirmationSuccessAnimationCompletedIntent, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                g(successUIState, (Function0) objRememberedValue, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (uiState instanceof GenderConfirmationBottomSheetUIState.FailureUIState) {
                composerStartRestartGroup.startReplaceGroup(-289617403);
                d((GenderConfirmationBottomSheetUIState.FailureUIState) uiState, composerStartRestartGroup, i3 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(uiState instanceof GenderConfirmationBottomSheetUIState.LoadingUIState)) {
                    throw pk0.p(composerStartRestartGroup, -289635967);
                }
                composerStartRestartGroup.startReplaceGroup(-289613595);
                e((GenderConfirmationBottomSheetUIState.LoadingUIState) uiState, composerStartRestartGroup, i3 & 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(uiState, onGenderConfirmationSuccessAnimationCompletedIntent, i, 5));
        }
    }

    public static final void c(GenderPreferenceNudgeCardUIState uiState, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = uiState.c;
        Object obj = uiState.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(-154487983);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154487983, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.GenderPreferenceNudgeCardComposable (PremiumBusSeatSelectionComposables.kt:101)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            GenderPreferenceNudgeCardUISpecs genderPreferenceNudgeCardUISpecs = (GenderPreferenceNudgeCardUISpecs) obj;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(genderPreferenceNudgeCardUISpecs.b), ChaloThemeKt.d(genderPreferenceNudgeCardUISpecs.c)), genderPreferenceNudgeCardUISpecs.f7771a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
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
            ChaloTextViewKt.a(null, uiState.f7772a, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, uiState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new kn0(uiState, 27);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) objRememberedValue2, 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.c(textWithLeftAndRightIconUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            ImageUIState imageUIState = textWithLeftAndRightIconUIState.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-251953825);
            } else {
                composerStartRestartGroup.startReplaceGroup(-251953824);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(uiState, modifier, i, 7));
        }
    }

    public static final void d(GenderConfirmationBottomSheetUIState.FailureUIState failureUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1894502275);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(failureUIState) : composerStartRestartGroup.changedInstance(failureUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1894502275, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.GenderPreferenceSelectionFailureScreen (PremiumBusSeatSelectionComposables.kt:403)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.i(composerStartRestartGroup, 0);
            GifUIKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), failureUIState.g, composerStartRestartGroup, 6, 0);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), failureUIState.b, null, null, composerStartRestartGroup, 6, 12);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), failureUIState.c, null, null, composerStartRestartGroup, 6, 12);
            ChaloSpacersKt.l(composerStartRestartGroup, 0);
            ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), failureUIState.d);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            if (b3.s(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), failureUIState.e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(failureUIState, i, 22));
        }
    }

    public static final void e(GenderConfirmationBottomSheetUIState.LoadingUIState uiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(45383961);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(45383961, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.GenderPreferenceSelectionLoadingScreen (PremiumBusSeatSelectionComposables.kt:386)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.i(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            ProgressIndicatorKt.m2278CircularProgressIndicator4lLiAd8(null, ChaloColorTokenKt.c(uiState.b), 0.0f, 0L, 0, 0.0f, composer2, 0, 61);
            ChaloSpacersKt.p(composer2, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), uiState.c, null, null, composer2, 6, 12);
            ChaloSpacersKt.p(composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(uiState, i, 23));
        }
    }

    public static final void f(GenderConfirmationBottomSheetUIState.PreferenceSelectionOptionUIState preferenceSelectionOptionUIState, Composer composer, int i) {
        char c;
        Composer composerStartRestartGroup = composer.startRestartGroup(115829285);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(preferenceSelectionOptionUIState) ? 4 : 2) | i : i;
        int i3 = 1;
        int i4 = 25;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115829285, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.GenderPreferenceSelectionOptionsUI (PremiumBusSeatSelectionComposables.kt:485)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = preferenceSelectionOptionUIState.b;
            List list = preferenceSelectionOptionUIState.d;
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, preferenceSelectionOptionUIState.c, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1023329246);
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                GenderSelectionOptionUIState genderSelectionOptionUIState = (GenderSelectionOptionUIState) obj;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, i3, null);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(genderSelectionOptionUIState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new kn0(genderSelectionOptionUIState, i4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default2, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, ChaloThemeHelper.a().g, i3, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i9 = i6;
                ChaloTextViewKt.a(null, genderSelectionOptionUIState.f7773a, null, null, composerStartRestartGroup, 0, 13);
                ChaloRadioButtonKt.a(null, genderSelectionOptionUIState.b, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endNode();
                if (i9 != list.size() - 1) {
                    composerStartRestartGroup.startReplaceGroup(170402354);
                    c = 2;
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 2, null), 0.0f, 1, null), ChaloThemeHelper.a().c), ChaloColorTokenKt.c(ChaloColorToken.LightGrey.f9815a), null, 2, null), composerStartRestartGroup, 0);
                } else {
                    c = 2;
                    composerStartRestartGroup.startReplaceGroup(151444397);
                }
                composerStartRestartGroup.endReplaceGroup();
                i6 = i7;
                i3 = 1;
                i4 = 25;
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(null, preferenceSelectionOptionUIState.e, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.f(composerStartRestartGroup, 0);
            ButtonUIState buttonUIState = preferenceSelectionOptionUIState.f;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), buttonUIState);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloThemeHelper.a().g), composerStartRestartGroup, 0);
            if (b3.s(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), preferenceSelectionOptionUIState.g)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(preferenceSelectionOptionUIState, i, 25));
        }
    }

    public static final void g(GenderConfirmationBottomSheetUIState.SuccessUIState successUIState, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-383667497);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(successUIState) : composerStartRestartGroup.changedInstance(successUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-383667497, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.GenderPreferenceSelectionSuccessScreen (PremiumBusSeatSelectionComposables.kt:440)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.i(composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloThemeHelper.a().g), composerStartRestartGroup, 0);
            LottieCompositionResultImpl lottieCompositionResultImplB = LottieResourceHelperKt.b(successUIState.e.f10033a, composerStartRestartGroup, 0);
            LottieAnimationState lottieAnimationStateA = LottieResourceHelperKt.a(lottieCompositionResultImplB, 1, composerStartRestartGroup, 1572864);
            Boolean boolValueOf = Boolean.valueOf(lottieAnimationStateA.h());
            Float fValueOf = Float.valueOf(lottieAnimationStateA.getProgress());
            boolean zChanged = ((i2 & 112) == 32) | composerStartRestartGroup.changed(lottieAnimationStateA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PremiumBusSeatSelectionComposablesKt$GenderPreferenceSelectionSuccessScreen$1$1$1(lottieAnimationStateA, function0, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, fValueOf, (Function2) objRememberedValue, composerStartRestartGroup, 0);
            ImageUISize imageUISize = successUIState.e.c;
            if (imageUISize == null) {
                imageUISize = new ImageUISize(ChaloThemeHelper.a().M);
            }
            ImageKt.Image(LottieResourceHelperKt.c(lottieCompositionResultImplB, 0, false, composerStartRestartGroup, 0, 30), "", ImageUIStateKt.b(companion, imageUISize), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), successUIState.b, null, null, composerStartRestartGroup, 6, 12);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), successUIState.c, null, null, composerStartRestartGroup, 6, 12);
            composer2 = composerStartRestartGroup;
            ChaloSpacersKt.d(composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(successUIState, function0, i, 4));
        }
    }

    public static final void h(PassengerCountSelectionBottomSheetUIState passengerCountSelectionBottomSheetUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj = passengerCountSelectionBottomSheetUIState.g;
        Composer composerStartRestartGroup = composer.startRestartGroup(1289310246);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(passengerCountSelectionBottomSheetUIState) : composerStartRestartGroup.changedInstance(passengerCountSelectionBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1289310246, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.PassengerCountSelectionBottomSheetComposable (PremiumBusSeatSelectionComposables.kt:555)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PassengerCountSelectionBottomSheetUISpecs passengerCountSelectionBottomSheetUISpecs = (PassengerCountSelectionBottomSheetUISpecs) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), passengerCountSelectionBottomSheetUISpecs.f);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeKt.d(ChaloThemeHelper.d.g), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(554302961, true, new fu0(i3, passengerCountSelectionBottomSheetUISpecs, passengerCountSelectionBottomSheetUIState), composerStartRestartGroup, 54), composer2, 24582, 12);
            BookingInfoBannerUIState bookingInfoBannerUIState = passengerCountSelectionBottomSheetUIState.f;
            if (bookingInfoBannerUIState == null) {
                composer2.startReplaceGroup(-1527071359);
            } else {
                BookingInfoBannerUISpecs bookingInfoBannerUISpecs = bookingInfoBannerUIState.c;
                composer2.startReplaceGroup(-1527071358);
                ChaloSpacersKt.n(composer2, 0);
                Modifier modifierC2 = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(bookingInfoBannerUISpecs.b), ChaloThemeKt.d(bookingInfoBannerUISpecs.c)), bookingInfoBannerUISpecs.d);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierC2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (!(composer2.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                CommonImageKt.a(bookingInfoBannerUIState.b, null, false, composer2, 0, 6);
                ChaloSpacersKt.w(composer2, 0);
                ChaloTextViewKt.a(null, bookingInfoBannerUIState.f7765a, null, null, composer2, 0, 13);
                composer2 = composer2;
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.g(composer2, 0);
            if (b3.s(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), passengerCountSelectionBottomSheetUIState.e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(passengerCountSelectionBottomSheetUIState, i, 26));
        }
    }

    public static final void i(Modifier modifier, final SeatLayoutUIState uiState, Composer composer, int i) {
        int i2;
        Integer numValueOf;
        Intrinsics.i(uiState, "uiState");
        List list = uiState.b;
        Object obj = uiState.f7786a;
        Composer composerStartRestartGroup = composer.startRestartGroup(502842002);
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
                ComposerKt.traceEventStart(502842002, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionScreen (PremiumBusSeatSelectionComposables.kt:171)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            final SeatLayoutUISpecs seatLayoutUISpecs = (SeatLayoutUISpecs) obj;
            List list2 = list;
            Iterator it = list2.iterator();
            Integer num = null;
            if (it.hasNext()) {
                numValueOf = Integer.valueOf(((SingleSeatUIState) it.next()).d);
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((SingleSeatUIState) it.next()).d);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            final int iIntValue = numValueOf != null ? numValueOf.intValue() + 1 : 0;
            Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((SingleSeatUIState) it2.next()).c);
                loop0: while (true) {
                    num = numValueOf3;
                    do {
                        if (!it2.hasNext()) {
                            break loop0;
                        } else {
                            numValueOf3 = Integer.valueOf(((SingleSeatUIState) it2.next()).c);
                        }
                    } while (num.compareTo(numValueOf3) >= 0);
                }
            }
            final int iIntValue2 = num != null ? num.intValue() + 1 : 0;
            ChaloRoundedCardKt.b(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloColorTokenKt.c(seatLayoutUISpecs.c), null, 2, null), ChaloThemeKt.d(seatLayoutUISpecs.b), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1220914925, true, new Function3() { // from class: wu0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Object next;
                    ColumnScope ChaloRoundedCard = (ColumnScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    int iIntValue3 = ((Integer) obj4).intValue();
                    Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                    if (composer2.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1220914925, iIntValue3, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionScreen.<anonymous> (PremiumBusSeatSelectionComposables.kt:180)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        SeatLayoutUISpecs seatLayoutUISpecs2 = seatLayoutUISpecs;
                        ChaloPadding chaloPadding = seatLayoutUISpecs2.d;
                        ChaloColorToken chaloColorToken = seatLayoutUISpecs2.g;
                        Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding), ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(seatLayoutUISpecs2.i)), seatLayoutUISpecs2.e);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierC);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                        pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-755266228);
                        SeatLayoutUIState seatLayoutUIState = uiState;
                        Iterator it3 = seatLayoutUIState.c.f7774a.iterator();
                        while (it3.hasNext()) {
                            ChaloTextViewKt.a(null, (TextUIState.ChaloTextUIState) it3.next(), null, null, composer2, 0, 13);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        ChaloSpacersKt.p(composer2, 0);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Horizontal start = arrangement2.getStart();
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, companion5.getTop(), composer2, 0);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                        pk0.v(companion6, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion4);
                        Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion6, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                        Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(448332738);
                        Iterator<Integer> it4 = RangesKt.o(0, iIntValue).iterator();
                        while (((IntProgressionIterator) it4).c) {
                            int iNextInt = ((IntIterator) it4).nextInt();
                            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.94f), 0.0f, seatLayoutUISpecs2.k, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composer2, 6);
                            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i8 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM786paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor6);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer2);
                            pk0.v(companion7, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl6, currentCompositionLocalMap6);
                            Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl6, Integer.valueOf(i8), composerM3915constructorimpl6));
                            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(395331935);
                            Iterator<Integer> it5 = RangesKt.o(0, iIntValue2).iterator();
                            while (((IntProgressionIterator) it5).c) {
                                int iNextInt2 = ((IntIterator) it5).nextInt();
                                Iterator it6 = seatLayoutUIState.b.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it6.next();
                                    SingleSeatUIState singleSeatUIState = (SingleSeatUIState) next;
                                    if (singleSeatUIState.d == iNextInt && singleSeatUIState.c == iNextInt2) {
                                        break;
                                    }
                                }
                                SingleSeatUIState singleSeatUIState2 = (SingleSeatUIState) next;
                                if (singleSeatUIState2 != null) {
                                    composer2.startReplaceGroup(1121500650);
                                    PremiumBusSeatSelectionComposablesKt.l(singleSeatUIState2, composer2, 0);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1121609088);
                                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, seatLayoutUISpecs2.j), composer2, 0);
                                    composer2.endReplaceGroup();
                                }
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(ChaloThemeKt.c(Modifier.INSTANCE, seatLayoutUISpecs2.f), ChaloColorTokenKt.c(chaloColorToken), ChaloThemeKt.d(seatLayoutUISpecs2.h));
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierM263backgroundbw27NRU);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor7);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion8, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl7, currentCompositionLocalMap7);
                        Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl7, Integer.valueOf(i9), composerM3915constructorimpl7));
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-190182384);
                        for (TextUIState.ChaloTextUIState chaloTextUIState : seatLayoutUIState.d.f7774a) {
                            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(ChaloThemeKt.c(Modifier.INSTANCE, seatLayoutUISpecs2.n), seatLayoutUISpecs2.l), seatLayoutUISpecs2.m);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                            long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i10 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM814height3ABfNKs);
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor8 = companion9.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor8);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer2);
                            pk0.v(companion9, composerM3915constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl8, currentCompositionLocalMap8);
                            Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl8, Integer.valueOf(i10), composerM3915constructorimpl8));
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                            composer2.endNode();
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 6, modifier, uiState));
        }
    }

    public static final void j(SeatTypeInfoHeaderUIState seatTypeInfoHeaderUIState, Composer composer, int i) {
        Intrinsics.i(seatTypeInfoHeaderUIState, "seatTypeInfoHeaderUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1691197690);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(seatTypeInfoHeaderUIState) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1691197690, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatTypeInfoHeaderComposable (PremiumBusSeatSelectionComposables.kt:127)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(seatTypeInfoHeaderUIState.b), null, 2, null), seatTypeInfoHeaderUIState.c);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1415089319);
            List<SeatTypeUIState> list = seatTypeInfoHeaderUIState.f7788a;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (SeatTypeUIState seatTypeUIState : list) {
                k(new SeatTypeUIState(seatTypeUIState.b, seatTypeUIState.f7790a), composerStartRestartGroup, 0);
                arrayList.add(Unit.f17538a);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(seatTypeInfoHeaderUIState, i, 28));
        }
    }

    public static final void k(SeatTypeUIState seatTypeUIState, Composer composer, int i) {
        int i2;
        Object obj = seatTypeUIState.c;
        Composer composerStartRestartGroup = composer.startRestartGroup(685124377);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(seatTypeUIState) : composerStartRestartGroup.changedInstance(seatTypeUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(685124377, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatTypeItemComposable (PremiumBusSeatSelectionComposables.kt:147)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            SeatTypeUISpecs seatTypeUISpecs = (SeatTypeUISpecs) obj;
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(companion, seatTypeUISpecs.b), RoundedCornerShapeKt.getCircleShape()), ChaloColorTokenKt.c(seatTypeUIState.b), null, 2, null), composerStartRestartGroup, 0);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, seatTypeUIState.f7790a, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(seatTypeUIState, i, 24));
        }
    }

    public static final void l(SingleSeatUIState singleSeatUIState, Composer composer, int i) {
        int i2;
        float f = singleSeatUIState.f;
        Composer composerStartRestartGroup = composer.startRestartGroup(143884050);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(singleSeatUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143884050, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatUIComposable (PremiumBusSeatSelectionComposables.kt:70)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z = singleSeatUIState.e != null;
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(singleSeatUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kn0(singleSeatUIState, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSourceB, null, z, null, null, (Function0) objRememberedValue, 24, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (singleSeatUIState.f7791a != null) {
                composerStartRestartGroup.startReplaceGroup(-973530679);
                CommonImageKt.a(singleSeatUIState.f7791a, SizeKt.m828size3ABfNKs(companion, f), false, composerStartRestartGroup, 0, 4);
                TextUIState.ChaloTextUIState chaloTextUIState = singleSeatUIState.b;
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-973351283);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-973351282);
                    Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ChaloSpacersKt.m(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-973141226);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, f), composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(singleSeatUIState, i, 27));
        }
    }

    public static final void m(WomenReservedSeatsChoiceBottomSheetUIState womenReservedSeatsChoiceBottomSheetUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1966853510);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(womenReservedSeatsChoiceBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1966853510, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.WomenReservedSeatsChoiceBottomSheetComposable (PremiumBusSeatSelectionComposables.kt:530)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            ChaloTextViewKt.a(null, womenReservedSeatsChoiceBottomSheetUIState.f7792a, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, womenReservedSeatsChoiceBottomSheetUIState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), womenReservedSeatsChoiceBottomSheetUIState.c);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            if (b3.s(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), womenReservedSeatsChoiceBottomSheetUIState.d)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(womenReservedSeatsChoiceBottomSheetUIState, i, 20));
        }
    }

    public static final void n(Composer composer, int i) {
        int i2;
        Intrinsics.i(null, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-191687642);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed((Object) null) : composerStartRestartGroup.changedInstance(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 13));
                return;
            }
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-191687642, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.WomenReservedSeatsUnavailableComposable (PremiumBusSeatSelectionComposables.kt:296)");
        }
        boolean zChanged = composerStartRestartGroup.changed((Object) null);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(null);
            objRememberedValue = null;
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierC = ChaloThemeKt.c(companion, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getTop(), composerStartRestartGroup, 6);
        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
        int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        CommonImageKt.a(null, null, false, composerStartRestartGroup, 0, 6);
        throw null;
    }
}
