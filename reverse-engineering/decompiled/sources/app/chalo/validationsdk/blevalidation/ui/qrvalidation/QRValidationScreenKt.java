package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.ValidationUserDetailsComponentKt;
import app.chalo.compose.components.branding.ProductBookingBrandingKt;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.qr.ChaloQrCodeKt;
import app.chalo.compose.components.qr.QrCodeComponentKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.components.ValidationProductInfoUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import app.chalo.validationsdk.blevalidation.ui.common.PostValidationSuccessBottomSheetKt;
import app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.af;
import defpackage.b3;
import defpackage.cf;
import defpackage.dd;
import defpackage.dq;
import defpackage.ey0;
import defpackage.fr0;
import defpackage.fu0;
import defpackage.gf;
import defpackage.i41;
import defpackage.jk;
import defpackage.kz0;
import defpackage.mz0;
import defpackage.pk0;
import defpackage.pz0;
import defpackage.qz0;
import defpackage.rs;
import defpackage.rx0;
import defpackage.sn0;
import defpackage.sx0;
import defpackage.wm0;
import defpackage.yu0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\b²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "qrInitialPage", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/TicketValidationInfoUIState;", "currentQr", "", "position", "validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QRValidationScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v23, types: [app.chalo.uistate.text.TextUIState] */
    public static final void a(QRValidationScreenUIState.QRWithProductAndUserDetails state, Modifier modifier, int i, Function1 updateQrInitialPage, Composer composer, int i2) {
        QRValidationScreenUIState.QRWithProductAndUserDetails qRWithProductAndUserDetails;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        Throwable th;
        Composer composer3;
        Composer composer4;
        char c;
        Intrinsics.i(state, "state");
        List list = state.m;
        ProductBookingBrandingUIState productBookingBrandingUIState = state.e;
        DividerUIState dividerUIState = state.l;
        QRWithProductAndUserDetailsUISpec qRWithProductAndUserDetailsUISpec = state.b;
        List list2 = state.c;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(updateQrInitialPage, "updateQrInitialPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(528809958);
        int i6 = (i2 & 6) == 0 ? (composerStartRestartGroup.changed(state) ? 4 : 2) | i2 : i2;
        if ((i2 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(updateQrInitialPage) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 1155) != 1154, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(528809958, i6, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRAndProductDetailsCardContent (QRValidationScreen.kt:329)");
            }
            int i7 = i6 & 896;
            boolean zChanged = (i7 == 256) | composerStartRestartGroup.changed(list2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.L(i, list2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1942751021);
            if (productBookingBrandingUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-2041342333);
                i4 = 1;
                i3 = 0;
                ProductBookingBrandingKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), productBookingBrandingUIState, composerStartRestartGroup, 6, 0);
            } else {
                i3 = 0;
                i4 = 1;
                composerStartRestartGroup.startReplaceGroup(-2054950403);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            qRWithProductAndUserDetails = state;
            TextUIState textUIState = qRWithProductAndUserDetails.g;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-95469527);
                composerStartRestartGroup.endReplaceGroup();
                composer3 = composerStartRestartGroup;
                i5 = i3;
                th = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-95469526);
                i5 = 0;
                th = null;
                TextKt.c(textUIState, ChaloThemeKt.c(companion, qRWithProductAndUserDetailsUISpec.f), null, null, composerStartRestartGroup, 0, 12);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            }
            if (list2.isEmpty()) {
                composer3.startReplaceGroup(-95263438);
                composer3.endReplaceGroup();
            } else if (list2.size() > i4) {
                composer3.startReplaceGroup(-95131502);
                int i9 = i5;
                Composer composer5 = composer3;
                f(qRWithProductAndUserDetails.c, ChaloThemeKt.c(companion, qRWithProductAndUserDetailsUISpec.g), i, qRWithProductAndUserDetailsUISpec.h, updateQrInitialPage, composer5, i7 | ((i6 << 3) & 57344));
                composer5.endReplaceGroup();
                qRWithProductAndUserDetails = state;
                companion = companion;
                th = null;
                composer3 = composer5;
                i5 = i9;
            } else {
                Throwable th2 = th;
                int i10 = i5;
                Composer composer6 = composer3;
                composer6.startReplaceGroup(-94776769);
                QRCodeUIState qRCodeUIState = ((TicketValidationInfoUIState) CollectionsKt.F(list2)).f10659a;
                Modifier modifierB = ComposeUtilsKt.b(SizeKt.m828size3ABfNKs(ChaloThemeKt.c(companion, qRWithProductAndUserDetailsUISpec.g), qRCodeUIState.f10631a.f10630a), qRCodeUIState.d, composer6, i10, 6);
                String str = qRCodeUIState.b;
                i5 = i10;
                th = th2;
                qRWithProductAndUserDetails = state;
                QrCodeComponentKt.a(null, modifierB, str, composer6, 0, 1);
                composer3 = composer6;
                composer3.endReplaceGroup();
            }
            if (list2.isEmpty()) {
                composer3.startReplaceGroup(-109298874);
                composer3.endReplaceGroup();
                composer4 = composer3;
            } else {
                composer3.startReplaceGroup(-1942703591);
                composer4 = composer3;
                TextKt.c(qRWithProductAndUserDetails.h, null, null, null, composer4, 0, 14);
                composer4.endReplaceGroup();
            }
            TextKt.c(qRWithProductAndUserDetails.i, null, null, null, composer4, 0, 14);
            composer2 = composer4;
            TicketValidationInfoUIState ticketValidationInfoUIState = (TicketValidationInfoUIState) mutableState.getValue();
            Object obj = ticketValidationInfoUIState != null ? ticketValidationInfoUIState.b : th;
            if (obj == null) {
                composer2.startReplaceGroup(-94145672);
            } else {
                composer2.startReplaceGroup(-94145671);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer2, i5).d), composer2, i5);
                TextKt.c(obj, null, null, null, composer2, 0, 14);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            SwitchToBLECalloutUIState switchToBLECalloutUIState = qRWithProductAndUserDetails.r;
            if (switchToBLECalloutUIState == null) {
                composer2.startReplaceGroup(-93961873);
            } else {
                composer2.startReplaceGroup(-93961872);
                g(ChaloThemeKt.c(companion, qRWithProductAndUserDetailsUISpec.k), switchToBLECalloutUIState, composer2, i5);
            }
            composer2.endReplaceGroup();
            DashedDividerKt.a(qRWithProductAndUserDetails.j, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, th), qRWithProductAndUserDetailsUISpec.i), composer2, i5);
            ValidationProductInfoUIState.ValidationUserDetailsUIState validationUserDetailsUIState = qRWithProductAndUserDetails.k;
            if (validationUserDetailsUIState == null) {
                composer2.startReplaceGroup(-93548674);
            } else {
                composer2.startReplaceGroup(-93548673);
                ValidationUserDetailsComponentKt.a(validationUserDetailsUIState, SizeKt.fillMaxWidth$default(companion, 0.0f, i4, th), composer2, 48);
                DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, th), dividerUIState, composer2, 6, i5);
            }
            composer2.endReplaceGroup();
            ValidationTripDetailsUIState validationTripDetailsUIState = qRWithProductAndUserDetails.n;
            if (validationTripDetailsUIState == null) {
                composer2.startReplaceGroup(-93290723);
            } else {
                composer2.startReplaceGroup(-93290722);
                l(validationTripDetailsUIState, SizeKt.fillMaxWidth$default(companion, 0.0f, i4, th), composer2, 48);
                DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, th), dividerUIState, composer2, 6, i5);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1942663504);
            int i11 = i5;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.z0();
                    throw th;
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                j((ValidationAdditionalInfoUIState) obj2, SizeKt.fillMaxWidth$default(companion3, 0.0f, i4, th), composer2, 48);
                if (i11 != CollectionsKt.K(list)) {
                    composer2.startReplaceGroup(1871441036);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, i4, th);
                    c = 6;
                    DividerUIStateKt.a(modifierFillMaxWidth$default, dividerUIState, composer2, 6, i5);
                } else {
                    c = 6;
                    composer2.startReplaceGroup(1854945998);
                }
                composer2.endReplaceGroup();
                i11 = i12;
            }
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            qRWithProductAndUserDetails = state;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qz0(qRWithProductAndUserDetails, modifier, i, updateQrInitialPage, i2, 1));
        }
    }

    public static final void b(QRValidationBottomSheetUIState validationBottomSheetUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(validationBottomSheetUIState, "validationBottomSheetUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-204723265);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(validationBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204723265, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationBottomSheetContent (QRValidationScreen.kt:127)");
            }
            if (validationBottomSheetUIState instanceof QRValidationBottomSheetUIState.PostValidationSuccessBottomSheetUIState) {
                composerStartRestartGroup.startReplaceGroup(-56999102);
                PostValidationSuccessBottomSheetKt.a((QRValidationBottomSheetUIState.PostValidationSuccessBottomSheetUIState) validationBottomSheetUIState, Modifier.INSTANCE, composerStartRestartGroup, (i2 & 14) | 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(validationBottomSheetUIState instanceof QRValidationBottomSheetUIState.JourneyDetailsBottomSheetUIState)) {
                    throw pk0.p(composerStartRestartGroup, 829441909);
                }
                composerStartRestartGroup.startReplaceGroup(-56756899);
                TripPlannerItineraryUiModel tripPlannerItineraryUiModel = ((QRValidationBottomSheetUIState.JourneyDetailsBottomSheetUIState) validationBottomSheetUIState).b;
                JourneyDetailsBottomSheetKt.c(tripPlannerItineraryUiModel.b, tripPlannerItineraryUiModel.g, Modifier.INSTANCE, composerStartRestartGroup, 384);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(validationBottomSheetUIState, i, 20));
        }
    }

    public static final void c(QRValidationUIState qRValidationUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-180966956);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(qRValidationUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180966956, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationMainContent (QRValidationScreen.kt:146)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            QRValidationScreenUIState qRValidationScreenUIState = qRValidationUIState.b;
            if (qRValidationScreenUIState.f10650a) {
                composerStartRestartGroup.startReplaceGroup(-1002469878);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1009166994);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(qRValidationUIState.e), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(qRValidationUIState.f10652a, null, null, composerStartRestartGroup, 0, 14);
            boolean z = qRValidationScreenUIState instanceof QRValidationScreenUIState.QRWithProductAndUserDetails;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new kz0(13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue2, 1, null);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new kz0(14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue3, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1137295394, true, new fu0(14, qRValidationUIState, mutableIntState), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 16);
            boolean z2 = qRValidationScreenUIState instanceof QRValidationScreenUIState.QRZoomed;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new kz0(14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EnterTransition enterTransitionSlideInHorizontally$default2 = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue4, 1, null);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new kz0(15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z2, (Modifier) null, enterTransitionSlideInHorizontally$default2, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue5, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1543998631, true, new sx0(qRValidationUIState, 5), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(qRValidationUIState, i, 19));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(QRValidationComponent qRValidationComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(835026960);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(qRValidationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(835026960, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreen (QRValidationScreen.kt:87)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(qRValidationComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 6, 2);
            QRValidationScreen_androidKt.a(composerStartRestartGroup, 0);
            ComposeUtils_androidKt.a(composerStartRestartGroup, 0);
            c((QRValidationUIState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            QRValidationBottomSheetUIState qRValidationBottomSheetUIState = ((QRValidationUIState) mutableStateA.getValue()).d;
            if (qRValidationBottomSheetUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-162044047);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-162044046);
                BottomSheetRequestHandler bottomSheetRequestHandler = qRValidationBottomSheetUIState.getF10628a().b.g;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(bottomSheetRequestHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    QRValidationScreenKt$QRValidationScreen$1$1$1 qRValidationScreenKt$QRValidationScreen$1$1$1 = new QRValidationScreenKt$QRValidationScreen$1$1$1(0, bottomSheetRequestHandler, BottomSheetRequestHandler.class, "onDismissRequest", "onDismissRequest()V", 0);
                    composerStartRestartGroup.updateRememberedValue(qRValidationScreenKt$QRValidationScreen$1$1$1);
                    objRememberedValue = qRValidationScreenKt$QRValidationScreen$1$1$1;
                }
                composer2 = composerStartRestartGroup;
                ChaloRoundedBottomSheetKt.a(sheetStateRememberModalBottomSheetState, (Function0) ((KFunction) objRememberedValue), qRValidationBottomSheetUIState instanceof QRValidationBottomSheetUIState.JourneyDetailsBottomSheetUIState, false, false, ComposableLambdaKt.rememberComposableLambda(1555707042, true, new sx0(qRValidationBottomSheetUIState, 3), composerStartRestartGroup, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
                composer2.endReplaceGroup();
            }
            QRValidationBottomSheetUIState qRValidationBottomSheetUIState2 = ((QRValidationUIState) mutableStateA.getValue()).d;
            boolean zChanged = composer2.changed(mutableStateA) | composer2.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new QRValidationScreenKt$QRValidationScreen$2$1(sheetStateRememberModalBottomSheetState, mutableStateA, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(qRValidationBottomSheetUIState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
            boolean zChangedInstance2 = composer2.changedInstance(qRValidationComponent);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new mz0(qRValidationComponent, 21);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue3, 0, 0, composer2, 3);
            ConfirmationDialogUiState confirmationDialogUiState = ((QRValidationUIState) mutableStateA.getValue()).c;
            if (confirmationDialogUiState == null) {
                composer2.startReplaceGroup(-160991442);
                composer2.endReplaceGroup();
            } else {
                dd.l(composer2, -160991441, confirmationDialogUiState, composer2, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(qRValidationComponent, i, 18));
        }
    }

    public static final void e(QRValidationScreenUIState.QRWithProductAndUserDetails qRWithProductAndUserDetails, Modifier modifier, int i, Function1 function1, Composer composer, int i2) {
        int i3;
        QRWithProductAndUserDetailsUISpec qRWithProductAndUserDetailsUISpec;
        Composer composer2;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(2095574879);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(qRWithProductAndUserDetails) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2095574879, i6, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRWithProductDetailsComponent (QRValidationScreen.kt:208)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(columnScopeInstance, modifier, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            QRWithProductAndUserDetailsUISpec qRWithProductAndUserDetailsUISpec2 = qRWithProductAndUserDetails.b;
            ProductBookingBrandingUIState productBookingBrandingUIState = qRWithProductAndUserDetails.f;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierVerticalScroll$default, ChaloColorTokenKt.c(qRWithProductAndUserDetailsUISpec2.f10653a), null, 2, null);
            ChaloPadding chaloPadding = qRWithProductAndUserDetailsUISpec2.b;
            ChaloPadding chaloPadding2 = qRWithProductAndUserDetailsUISpec2.c;
            Modifier modifierC = ChaloThemeKt.c(modifierM264backgroundbw27NRU$default, chaloPadding);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            List list = qRWithProductAndUserDetails.c;
            Intrinsics.i(list, "<this>");
            if (list.size() > 1) {
                composerStartRestartGroup.startReplaceGroup(675885918);
                Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding2);
                List list2 = qRWithProductAndUserDetails.c;
                boolean z = (i6 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new sn0(function1, 25);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i9 = i6 & 14;
                qRWithProductAndUserDetailsUISpec = qRWithProductAndUserDetailsUISpec2;
                composer2 = composerStartRestartGroup;
                i(qRWithProductAndUserDetails, modifierC2, list2, (Function1) objRememberedValue, composer2, i9);
                i4 = 0;
                gf.r(companion, ChaloTheme.b(composer2, 0).h, composer2, 0);
            } else {
                qRWithProductAndUserDetailsUISpec = qRWithProductAndUserDetailsUISpec2;
                composer2 = composerStartRestartGroup;
                i4 = 0;
                composer2.startReplaceGroup(666835375);
                composer2.endReplaceGroup();
            }
            QRWithProductAndUserDetailsUISpec qRWithProductAndUserDetailsUISpec3 = qRWithProductAndUserDetailsUISpec;
            composerStartRestartGroup = composer2;
            ChaloRoundedCardKt.a(qRWithProductAndUserDetailsUISpec.d, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding2), ComposableLambdaKt.rememberComposableLambda(1060408420, true, new pz0(qRWithProductAndUserDetails, i, function1, i4), composer2, 54), composerStartRestartGroup, 384, 0);
            TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = qRWithProductAndUserDetails.q;
            if (textWithLeftAndRightIconUIState == null) {
                composerStartRestartGroup.startReplaceGroup(676904236);
                composerStartRestartGroup.endReplaceGroup();
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(676904237);
                DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), qRWithProductAndUserDetailsUISpec3.m), qRWithProductAndUserDetails.u, composerStartRestartGroup, 0, 0);
                i5 = 0;
                ChaloRoundedCardKt.a(qRWithProductAndUserDetailsUISpec3.l, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding2), ComposableLambdaKt.rememberComposableLambda(-1597282588, true, new sx0(textWithLeftAndRightIconUIState, 4), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (qRWithProductAndUserDetails.t) {
                composerStartRestartGroup.startReplaceGroup(678184227);
                ViewJourneyUIState viewJourneyUIState = qRWithProductAndUserDetails.p;
                ViewJourneyUISpecs viewJourneyUISpecs = viewJourneyUIState.f10664a;
                TextUIState.ChaloTextUIState chaloTextUIState = viewJourneyUIState.c;
                ImageUIState imageUIState = viewJourneyUIState.d;
                ChaloSpacersKt.u(composerStartRestartGroup, i5);
                Modifier modifierC3 = ChaloThemeKt.c(ComposeUtilsKt.b(columnScopeInstance.align(ChaloThemeKt.c(modifier, chaloPadding2), UiAlignmentKt.a(viewJourneyUISpecs.f10663a)), viewJourneyUIState.b, composerStartRestartGroup, 0, 6), viewJourneyUISpecs.c);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(viewJourneyUISpecs.b), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC3);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.c(chaloTextUIState, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup = composerStartRestartGroup;
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(666835375);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(576093612);
            if (productBookingBrandingUIState != null) {
                composerStartRestartGroup.startReplaceGroup(2044718215);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).l + ChaloTheme.b(composerStartRestartGroup, 0).d)), composerStartRestartGroup, 0);
                ProductBookingBrandingKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding2), productBookingBrandingUIState, composerStartRestartGroup, 0, 0);
                gf.r(companion, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(2032465496);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ImageUIState imageUIState2 = qRWithProductAndUserDetails.o;
            if (imageUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1397316335);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1397316334);
                k(imageUIState2, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), qRWithProductAndUserDetailsUISpec3.j), ChaloColorTokenKt.c(qRWithProductAndUserDetailsUISpec3.f10653a), null, 2, null), composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qz0(qRWithProductAndUserDetails, modifier, i, function1, i2, 0));
        }
    }

    public static final void f(List data, Modifier modifier, int i, float f, Function1 updateQrInitialPage, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Intrinsics.i(data, "data");
        Intrinsics.i(updateQrInitialPage, "updateQrInitialPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1033017383);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(updateQrInitialPage) ? 16384 : 8192;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 8339) != 8338, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1033017383, i4, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.SwipeableQrCodes (QRValidationScreen.kt:593)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(data);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new af(data, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = 14 & (i4 >> 6);
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(i, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, i5, 2);
            String message = "cardScrollState " + pagerStateRememberPagerState + " initialPage " + i;
            Intrinsics.i(message, "message");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, ChaloTheme.b(composerStartRestartGroup, 0).h, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(379645982, true, new rs(data, 4), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16350);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            Integer numValueOf = Integer.valueOf(i);
            boolean zChanged = composer2.changed(pagerStateRememberPagerState) | ((i4 & 896) == 256);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new QRValidationScreenKt$SwipeableQrCodes$2$1(i, pagerStateRememberPagerState, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, i5);
            Integer numValueOf2 = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
            boolean zChanged2 = composer2.changed(pagerStateRememberPagerState) | composer2.changedInstance(data) | ((i4 & 57344) == 16384);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new QRValidationScreenKt$SwipeableQrCodes$3$1(pagerStateRememberPagerState, data, updateQrInitialPage, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jk(data, modifier, i, f, updateQrInitialPage, i2));
        }
    }

    public static final void g(Modifier modifier, SwitchToBLECalloutUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(551252142);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(551252142, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.SwitchToBLECalloutComposable (QRValidationScreen.kt:710)");
            }
            SwitchToBLECalloutUISpecs switchToBLECalloutUISpecs = state.f10656a;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(switchToBLECalloutUISpecs.c), ChaloThemeKt.d(switchToBLECalloutUISpecs.d)), switchToBLECalloutUISpecs.f10655a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(switchToBLECalloutUISpecs.b), composerStartRestartGroup, 0);
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
            CommonImageKt.a(state.b, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.c(state.c, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            TextWithLeftAndTrailingRightIconComponentKt.a(ComposeUtilsKt.b(companion2, state.e, composerStartRestartGroup, 6, 6), state.d, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(i, 9, modifier, state));
        }
    }

    public static final void h(TicketGridItemUIState ticketGridItemUIState, Modifier modifier, Function0 updateQrInitialPage, Composer composer, int i) {
        int i2;
        Intrinsics.i(ticketGridItemUIState, "ticketGridItemUIState");
        Intrinsics.i(updateQrInitialPage, "updateQrInitialPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1133745299);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(ticketGridItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(updateQrInitialPage) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133745299, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.TicketItem (QRValidationScreen.kt:638)");
            }
            TicketGridItemUISpecs ticketGridItemUISpecs = ticketGridItemUIState.f10658a;
            boolean z = true;
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ticketGridItemUIState);
            if ((i2 & 896) != 256) {
                z = false;
            }
            boolean z2 = zChangedInstance | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fr0(22, ticketGridItemUIState, updateQrInitialPage);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierC = ChaloThemeKt.c(BorderKt.m275borderxT4_qwU(BackgroundKt.m263backgroundbw27NRU(SizeKt.m816heightInVpY3zN4$default(ClickableKt.m295clickableO2vRcR0$default(modifier, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue, 28, null), ticketGridItemUISpecs.b, 0.0f, 2, null), ChaloColorTokenKt.c(ticketGridItemUISpecs.f), ChaloThemeKt.d(ticketGridItemUISpecs.h)), ticketGridItemUISpecs.d, ChaloColorTokenKt.c(ticketGridItemUISpecs.e), ChaloThemeKt.d(ticketGridItemUISpecs.g)), ticketGridItemUISpecs.f10657a);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(UiAlignmentKt.c(ticketGridItemUISpecs.c), false);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.c(ticketGridItemUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 29, ticketGridItemUIState, modifier, updateQrInitialPage));
        }
    }

    public static final void i(QRValidationScreenUIState.QRWithProductAndUserDetails state, Modifier modifier, List ticketList, Function1 updateQrInitialPage, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Intrinsics.i(ticketList, "ticketList");
        Intrinsics.i(updateQrInitialPage, "updateQrInitialPage");
        Composer composerStartRestartGroup = composer.startRestartGroup(-702795436);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(state) ? 4 : 2) | i : i;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(ticketList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(updateQrInitialPage) ? 2048 : 1024;
        }
        int i4 = 1;
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 1155) != 1154, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-702795436, i3, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.TicketsGrid (QRValidationScreen.kt:674)");
            }
            boolean zChanged = composerStartRestartGroup.changed(ticketList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = CollectionsKt.u(ticketList, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            boolean z = list.size() > 1;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).g);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM672spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1844143181);
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                List list2 = (List) obj;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i4, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, i5).g), Alignment.INSTANCE.getTop(), composerStartRestartGroup, i5);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                boolean z2 = z;
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
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1851801553);
                Iterator it = list2.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    int i12 = (i7 * 3) + i10;
                    TicketGridItemUIState ticketGridItemUIState = (TicketGridItemUIState) state.d.get(i12);
                    Modifier modifierA = i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Iterator it2 = it;
                    boolean zChanged2 = ((i3 & 7168) == 2048) | composerStartRestartGroup.changed(i12);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new cf(i12, 4, updateQrInitialPage);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    h(ticketGridItemUIState, modifierA, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    i10 = i11;
                    it = it2;
                }
                composerStartRestartGroup.endReplaceGroup();
                if (list2.size() >= 3 || !z2) {
                    i2 = 0;
                    composerStartRestartGroup.startReplaceGroup(1547104891);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1571785603);
                    int size = 3 - list2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        SpacerKt.Spacer(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    }
                    i2 = 0;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                i5 = i2;
                i7 = i8;
                z = z2;
                i4 = 1;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 2, state, modifier, ticketList, updateQrInitialPage));
        }
    }

    public static final void j(ValidationAdditionalInfoUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1155994436);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1155994436, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.ValidationAdditionalInfoComponent (QRValidationScreen.kt:437)");
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, state.c);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(state.f10660a, ChaloThemeKt.c(Modifier.INSTANCE, state.d), null, null, composerStartRestartGroup, 0, 12);
            TextKt.c(state.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(state, modifier, i, 10));
        }
    }

    public static final void k(ImageUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(435535653);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435535653, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.ValidationBusAnimation (QRValidationScreen.kt:558)");
            }
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), -200.0f, ComposeUtils_androidKt.c(composerStartRestartGroup), AnimationSpecKt.m174infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(3000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable, 8);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CommonImageKt.a(state, OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m7278constructorimpl(stateAnimateFloat.getValue().floatValue()), 0.0f, 2, null), false, composerStartRestartGroup, i2 & 14, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(state, modifier, i, 7));
        }
    }

    public static final void l(ValidationTripDetailsUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(state, "state");
        TextUIState textUIState = state.d;
        ImageUIState imageUIState = state.c;
        ValidationTripDetailsUISpec validationTripDetailsUISpec = state.f10662a;
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-386025494);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-386025494, i2, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.ValidationTripDetailsComponent (QRValidationScreen.kt:455)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloColorTokenKt.c(validationTripDetailsUISpec.b), null, 2, null), validationTripDetailsUISpec.f10661a);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            TextKt.c(state.b, ChaloThemeKt.c(RowScopeInstance.INSTANCE.weight(companion3, 1.0f, false), validationTripDetailsUISpec.c), null, null, composerStartRestartGroup, 0, 12);
            ValidationTicketStatusUIState validationTicketStatusUIState = state.i;
            if (validationTicketStatusUIState == null) {
                composerStartRestartGroup.startReplaceGroup(2134850647);
            } else {
                composerStartRestartGroup.startReplaceGroup(2134850648);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                MultiProductValidationScreenKt.h(null, validationTicketStatusUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (imageUIState == null && textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1329308082);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2035905585);
                gf.r(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            if (imageUIState != null) {
                composerStartRestartGroup.startReplaceGroup(15577304);
                i3 = 48;
                CommonImageKt.a(state.c, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i3 = 48;
                composerStartRestartGroup.startReplaceGroup(-2459767);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (textUIState != null) {
                composerStartRestartGroup.startReplaceGroup(15735249);
                TextKt.c(state.d, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), validationTripDetailsUISpec.d), null, null, composerStartRestartGroup, 0, 12);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2459767);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-1310827929);
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierC2 = ChaloThemeKt.c(IntrinsicKt.height(companion3, IntrinsicSize.Min), validationTripDetailsUISpec.f);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
            Composer composer2 = composerStartRestartGroup;
            FromAndToStopDetailViewKt.f(0.0f, state.e, state.f, validationTripDetailsUISpec.j, ChaloColorTokenKt.c(validationTripDetailsUISpec.k), composer2, 0);
            composerStartRestartGroup = composer2;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(validationTripDetailsUISpec.g), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
            Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
            TextKt.c(state.g, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            TextKt.c(state.h, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(state, modifier, i, 8));
        }
    }

    public static final void m(String str, ChaloPadding chaloPadding, Modifier modifier, Composer composer, int i) {
        String str2;
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-183569405);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-183569405, i3, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.ZoomedQRComponent (QRValidationScreen.kt:539)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloQrCodeKt.a(str2, ChaloThemeKt.c(companion, chaloPadding), 0.0f, null, composerStartRestartGroup, i3 & 14, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(str, chaloPadding, modifier2, i, 28));
        }
    }
}
