package app.chalo.premiumbus.ui.seatselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatChangeSuccessScreenUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatChangeSuccessScreenUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatSelectionDialogTypeUIState;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.text.TextUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.c0;
import defpackage.fu0;
import defpackage.pk0;
import defpackage.su0;
import defpackage.wb;
import defpackage.xm0;
import defpackage.xu0;
import defpackage.yu0;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "T", "lastNonNullValue", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSeatSelectionMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534747717);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusSeatSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1534747717, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreen (PremiumBusSeatSelectionMainScreen.kt:73)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(premiumBusSeatSelectionComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusSeatSelectionComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new su0(premiumBusSeatSelectionComponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            PremiumBusSeatSelectionBottomSheetUIState premiumBusSeatSelectionBottomSheetUIState = ((PremiumBusSeatSelectionViewState) mutableStateA.getValue()).j;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1(sheetStateRememberModalBottomSheetState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(premiumBusSeatSelectionBottomSheetUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            PremiumBusSeatSelectionViewState premiumBusSeatSelectionViewState = (PremiumBusSeatSelectionViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(premiumBusSeatSelectionComponent);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new su0(premiumBusSeatSelectionComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            b(premiumBusSeatSelectionViewState, sheetStateRememberModalBottomSheetState, (Function0) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusSeatSelectionComponent, i, 29));
        }
    }

    public static final void b(PremiumBusSeatSelectionViewState state, SheetState modalBottomSheetState, Function0 onGenderConfirmationSuccessAnimationCompletedIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        SeatChangeSuccessScreenUIState seatChangeSuccessScreenUIState = state.l;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Intrinsics.i(onGenderConfirmationSuccessAnimationCompletedIntent, "onGenderConfirmationSuccessAnimationCompletedIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(230663549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onGenderConfirmationSuccessAnimationCompletedIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(230663549, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionScreen (PremiumBusSeatSelectionMainScreen.kt:104)");
            }
            if (seatChangeSuccessScreenUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-249639664);
                c(seatChangeSuccessScreenUIState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-249544153);
                d(state, modalBottomSheetState, onGenderConfirmationSuccessAnimationCompletedIntent, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new xu0(state, modalBottomSheetState, onGenderConfirmationSuccessAnimationCompletedIntent, i, 0));
        }
    }

    public static final void c(SeatChangeSuccessScreenUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Object obj = state.f7784a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1081907214);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081907214, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatChangeSuccessScreen (PremiumBusSeatSelectionMainScreen.kt:117)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            SeatChangeSuccessScreenUISpecs seatChangeSuccessScreenUISpecs = (SeatChangeSuccessScreenUISpecs) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(seatChangeSuccessScreenUISpecs.b), null, 2, null), seatChangeSuccessScreenUISpecs.f7783a);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(LottieType.NEW_PAYMENT_SUCCESS, composerStartRestartGroup, 6), 0, false, composerStartRestartGroup, 0, 30), "", ImageUIStateKt.a(companion, seatChangeSuccessScreenUISpecs.c), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48 | Painter.$stable, 120);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            TextUIState.ChaloTextUIState chaloTextUIState = state.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1116079126);
            } else {
                composerStartRestartGroup.startReplaceGroup(1116079127);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ButtonUIState buttonUIState = state.c;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(805180136);
            } else {
                composerStartRestartGroup.startReplaceGroup(805180137);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), seatChangeSuccessScreenUISpecs.d), buttonUIState);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(state, i, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static final void d(PremiumBusSeatSelectionViewState premiumBusSeatSelectionViewState, SheetState sheetState, Function0 function0, Composer composer, int i) {
        int i2;
        ComposeUiNode.Companion companion;
        int i3;
        int i4;
        float f;
        Object obj;
        ?? r7;
        boolean z;
        Function0 function1 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(103149243);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusSeatSelectionViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(103149243, i2, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionMainScreen (PremiumBusSeatSelectionMainScreen.kt:163)");
            }
            PremiumBusSeatSelectionUISpecs premiumBusSeatSelectionUISpecs = premiumBusSeatSelectionViewState.f7781a;
            SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState seatChangeDialogTypeUIState = premiumBusSeatSelectionViewState.m;
            GenderPreferenceNudgeCardUIState genderPreferenceNudgeCardUIState = premiumBusSeatSelectionViewState.f;
            SeatLayoutUIState seatLayoutUIState = premiumBusSeatSelectionViewState.i;
            StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = premiumBusSeatSelectionViewState.k;
            BookingInfoBannerUIState bookingInfoBannerUIState = premiumBusSeatSelectionViewState.g;
            boolean zChanged = composerStartRestartGroup.changed(premiumBusSeatSelectionUISpecs);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = premiumBusSeatSelectionViewState.f7781a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PremiumBusSeatSelectionUISpecs premiumBusSeatSelectionUISpecs2 = (PremiumBusSeatSelectionUISpecs) objRememberedValue;
            UIShape.Rectangle rectangle = UIShape.f1926a;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(290972165, 0, -1, "app.chalo.premiumbus.ui.seatselection.compose.rememberLastNonNullValue (PremiumBusSeatSelectionMainScreen.kt:365)");
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bookingInfoBannerUIState, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            if (bookingInfoBannerUIState != null) {
                mutableState.setValue(bookingInfoBannerUIState);
            }
            T value = mutableState.getValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            BookingInfoBannerUIState bookingInfoBannerUIState2 = (BookingInfoBannerUIState) value;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i5 = i2;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            Modifier.Companion companion6 = companion3;
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(premiumBusSeatSelectionViewState.b, null, null, composerStartRestartGroup, 0, 14);
            float f2 = premiumBusSeatSelectionUISpecs2.i;
            ChaloPadding chaloPadding = premiumBusSeatSelectionUISpecs2.g;
            ChaloColorToken chaloColorToken = premiumBusSeatSelectionUISpecs2.h;
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion6, f2), 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken), null, 2, null), composerStartRestartGroup, 0);
            if (errorWithMsgAndRetry != null) {
                composerStartRestartGroup.startReplaceGroup(2143826211);
                StandardErrorScreenKt.c(errorWithMsgAndRetry, SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion5;
                i3 = 0;
                i4 = 54;
                f = 0.0f;
                obj = null;
                r7 = 1;
            } else if (premiumBusSeatSelectionViewState.c || seatLayoutUIState == null) {
                companion = companion5;
                i3 = 0;
                i4 = 54;
                f = 0.0f;
                obj = null;
                r7 = 1;
                composerStartRestartGroup.startReplaceGroup(2143832664);
                ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2034546713);
                PremiumBusSeatSelectionComposablesKt.j(premiumBusSeatSelectionViewState.h, composerStartRestartGroup, 0);
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion6, premiumBusSeatSelectionUISpecs2.i), 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken), null, 2, null), composerStartRestartGroup, 0);
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
                PremiumBusSeatSelectionComposablesKt.i(ChaloThemeKt.c(companion6, chaloPadding), seatLayoutUIState, composerStartRestartGroup, 0);
                if (genderPreferenceNudgeCardUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(1057544229);
                    PremiumBusSeatSelectionComposablesKt.c(genderPreferenceNudgeCardUIState, ChaloThemeKt.c(companion6, chaloPadding), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1057855655);
                    ChaloSpacersKt.i(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (bookingInfoBannerUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(1058017506);
                    ChaloSpacersKt.e(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1058116706);
                    ChaloSpacersKt.d(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                ButtonUIState buttonUIState = premiumBusSeatSelectionViewState.d;
                if (buttonUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(852863518);
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion5;
                    i4 = 54;
                    f = 0.0f;
                    obj = null;
                    i3 = 0;
                    z = true;
                } else {
                    composerStartRestartGroup.startReplaceGroup(852863519);
                    Modifier modifierAlign = boxScopeInstance.align(companion6, companion4.getBottomEnd());
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i10 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion5, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl5, Integer.valueOf(i10), composerM3915constructorimpl5));
                    z = true;
                    i3 = 0;
                    ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), premiumBusSeatSelectionUISpecs2.d), 0L, 0L, composerStartRestartGroup, 0, 6);
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusSeatSelectionUISpecs2.e), null, 2, null);
                    Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).f1919a;
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    float f3 = premiumBusSeatSelectionUISpecs2.c;
                    int i11 = CardDefaults.$stable;
                    CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(f3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i11 << 18, 62);
                    CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), 0L, 0L, 0L, composerStartRestartGroup, i11 << 12, 14);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1963722794, true, new c0(premiumBusSeatSelectionViewState, premiumBusSeatSelectionUISpecs2, bookingInfoBannerUIState2, buttonUIState, 13), composerStartRestartGroup, 54);
                    companion6 = companion6;
                    obj = null;
                    i4 = 54;
                    f = 0.0f;
                    companion = companion5;
                    CardKt.Card(modifierM264backgroundbw27NRU$default, shape, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                r7 = z;
            }
            composerStartRestartGroup.endNode();
            if (seatChangeDialogTypeUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1345821825);
                composerStartRestartGroup.startReplaceGroup(1345943438);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue3, new DialogProperties(false, false, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1023713803, r7, new xm0(premiumBusSeatSelectionViewState, 5), composerStartRestartGroup, i4), composerStartRestartGroup, 438, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1332075309);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (premiumBusSeatSelectionViewState.n == null) {
                composerStartRestartGroup.startReplaceGroup(1346456983);
            } else {
                composerStartRestartGroup.startReplaceGroup(1346456984);
                Arrangement.Vertical bottom = arrangement.getBottom();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion6, f, r7, obj);
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(bottom, companion4.getStart(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
                int i12 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
                Function0<ComposeUiNode> constructor6 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl6, Integer.valueOf(i12), composerM3915constructorimpl6));
                String str = premiumBusSeatSelectionViewState.n;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Composer composer2 = composerStartRestartGroup;
                ChaloSnackbarKt.a(null, str, null, (Function0) objRememberedValue4, composer2, 3456, 1);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            PremiumBusSeatSelectionBottomSheetUIState premiumBusSeatSelectionBottomSheetUIState = premiumBusSeatSelectionViewState.j;
            if (premiumBusSeatSelectionBottomSheetUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1346897214);
                composerStartRestartGroup.endReplaceGroup();
                function1 = function0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1346897215);
                function1 = function0;
                Composer composer3 = composerStartRestartGroup;
                ChaloRoundedBottomSheetKt.a(sheetState, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1242418954, r7, new fu0(3, premiumBusSeatSelectionBottomSheetUIState, function1), composerStartRestartGroup, i4), composer3, ((i5 >> 3) & 14) | 196992, 26);
                composerStartRestartGroup = composer3;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new xu0(premiumBusSeatSelectionViewState, sheetState, function1, i, 1));
        }
    }
}
