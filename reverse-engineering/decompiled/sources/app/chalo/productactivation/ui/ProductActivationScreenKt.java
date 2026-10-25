package app.chalo.productactivation.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnVisibilityChangedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.ProductBookingBrandingKt;
import app.chalo.productactivation.ui.uistate.ActivationPassUIState;
import app.chalo.productactivation.ui.uistate.DiscountBannerUISpecs;
import app.chalo.productactivation.ui.uistate.DiscountBannerUIState;
import app.chalo.productactivation.ui.uistate.TopBarUISpecs;
import app.chalo.productactivation.ui.uistate.TopBarUIState;
import app.chalo.productactivation.ui.uistate.UpsellRideSectionUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.image.ImageUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.bu0;
import defpackage.dd;
import defpackage.dq;
import defpackage.la0;
import defpackage.pk0;
import defpackage.qv0;
import defpackage.r1;
import defpackage.xq0;
import defpackage.yu0;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "isBannerMarkedShown", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductActivationScreenKt {
    public static final void a(DiscountBannerUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Object obj = state.f8069a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-559645945);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559645945, i2, -1, "app.chalo.productactivation.ui.DiscountedPriceBannerUI (ProductActivationScreen.kt:220)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            DiscountBannerUISpecs discountBannerUISpecs = (DiscountBannerUISpecs) obj;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.background$default(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), discountBannerUISpecs.b), Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(discountBannerUISpecs.c)), Color.m4595boximpl(ChaloColorTokenKt.c(discountBannerUISpecs.d))), 0.0f, 0.0f, 0, 14, (Object) null), ChaloThemeKt.d(discountBannerUISpecs.e), 0.0f, 4, null), discountBannerUISpecs.f8068a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            CommonImageKt.a(state.b, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.c(state.c, null, null, null, composerStartRestartGroup, 0, 14);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(state, i, 15));
        }
    }

    public static final void b(ProductActivationUIState productActivationUIState, Composer composer, int i) {
        int i2;
        ComposeUiNode.Companion companion;
        ActivationInfoUIState activationInfoUIState;
        Object obj;
        int i3;
        float f;
        int i4;
        Object obj2;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-62839678);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(productActivationUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-62839678, i2, -1, "app.chalo.productactivation.ui.ProductActivationContent (ProductActivationScreen.kt:92)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            ProductActivationUISpec productActivationUISpec = productActivationUIState.e;
            ActivationInfoUIState activationInfoUIState2 = productActivationUIState.f8045a;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(productActivationUISpec.f8044a), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TopBarUIState f8024a = activationInfoUIState2 != null ? activationInfoUIState2.getF8024a() : null;
            if (f8024a == null) {
                composerStartRestartGroup.startReplaceGroup(1189087954);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 1;
                f = 0.0f;
                obj = null;
                companion = companion4;
                activationInfoUIState = activationInfoUIState2;
            } else {
                TopBarUISpecs topBarUISpecs = f8024a.f8081a;
                composerStartRestartGroup.startReplaceGroup(1189087955);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                ChaloPadding chaloPadding = topBarUISpecs.f8080a;
                UiAlignment.Vertical vertical = topBarUISpecs.b;
                Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(UiArrangementKt.a(topBarUISpecs.c), UiAlignmentKt.b(vertical), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(vertical), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                companion = companion4;
                CommonImageKt.a(f8024a.b, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.x(composerStartRestartGroup, 0);
                activationInfoUIState = activationInfoUIState2;
                ChaloTextViewKt.a(null, f8024a.c, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                ImageUIState imageUIState = f8024a.d;
                if (imageUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-205607193);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-205607192);
                    CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                obj = null;
                i3 = 1;
                f = 0.0f;
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion2, f, i3, obj), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, i3), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor4 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
            if (activationInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(978502414);
            } else {
                composerStartRestartGroup.startReplaceGroup(978502415);
                if (activationInfoUIState instanceof ActivationInfoUIState.PassActivationInfo) {
                    composerStartRestartGroup.startReplaceGroup(996018553);
                    ActivationInfoUIState.PassActivationInfo passActivationInfo = (ActivationInfoUIState.PassActivationInfo) activationInfoUIState;
                    ActivationPassUIState activationPassUIState = passActivationInfo.d;
                    if (activationPassUIState.d != null) {
                        composerStartRestartGroup.startReplaceGroup(996090380);
                        ActivationPassComposablesKt.f(activationPassUIState, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(996216798);
                        DiscountBannerUIState discountBannerUIState = passActivationInfo.c;
                        if (discountBannerUIState == null) {
                            composerStartRestartGroup.startReplaceGroup(996267482);
                            composerStartRestartGroup.endReplaceGroup();
                            i4 = 0;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(996267483);
                            UIShape.Rectangle rectangle = UIShape.f1926a;
                            i4 = 0;
                            a(discountBannerUIState, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        ActivationPassComposablesKt.e(null, activationPassUIState, composerStartRestartGroup, i4);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(activationInfoUIState instanceof ActivationInfoUIState.TicketActivationInfo)) {
                        throw pk0.p(composerStartRestartGroup, -1768987997);
                    }
                    composerStartRestartGroup.startReplaceGroup(-1768967276);
                    ActivationTicketComposablesKt.g(null, ((ActivationInfoUIState.TicketActivationInfo) activationInfoUIState).c, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            UpsellRideSectionUIState upsellRideSectionUIState = productActivationUIState.g;
            if (upsellRideSectionUIState == null) {
                composerStartRestartGroup.startReplaceGroup(979285970);
                composerStartRestartGroup.endReplaceGroup();
                obj2 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(979285971);
                obj2 = null;
                UpsellRideSectionComposablesKt.a(upsellRideSectionUIState, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            ProductBookingBranding productBookingBranding = productActivationUIState.b;
            if (productBookingBranding == null) {
                composerStartRestartGroup.startReplaceGroup(979393788);
                composerStartRestartGroup.endReplaceGroup();
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(979393789);
                Modifier modifierAlign = columnScopeInstance.align(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj2), UiAlignmentKt.a(UiAlignment.Horizontal.Center.f9884a));
                ProductBookingBranding.Companion companion5 = ProductBookingBranding.INSTANCE;
                i5 = 0;
                ProductBookingBrandingKt.a(modifierAlign, productBookingBranding, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            UserProfilingTicketActivationBannerUIState userProfilingTicketActivationBannerUIState = productActivationUIState.f;
            if (userProfilingTicketActivationBannerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(979733517);
            } else {
                composerStartRestartGroup.startReplaceGroup(979733518);
                ChaloSpacersKt.g(composerStartRestartGroup, i5);
                d(ChaloThemeKt.c(companion2, productActivationUIState.e.c), userProfilingTicketActivationBannerUIState, composerStartRestartGroup, i5);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(productActivationUIState, i, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ProductActivationComponent productActivationComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1193202847);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(productActivationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1193202847, i2, -1, "app.chalo.productactivation.ui.ProductActivationScreen (ProductActivationScreen.kt:51)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(productActivationComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            BottomSheetStandardContentUiState bottomSheetStandardContentUiState = ((ProductActivationUIState) mutableStateA.getValue()).c;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ProductActivationScreenKt$ProductActivationScreen$1$1(sheetStateRememberModalBottomSheetState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(bottomSheetStandardContentUiState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            b((ProductActivationUIState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            ConfirmationDialogUiState confirmationDialogUiState = ((ProductActivationUIState) mutableStateA.getValue()).d;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1555974447);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -1555974446, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            BottomSheetStandardContentUiState bottomSheetStandardContentUiState2 = ((ProductActivationUIState) mutableStateA.getValue()).c;
            if (bottomSheetStandardContentUiState2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1555875402);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1555875401);
                composer2 = composerStartRestartGroup;
                ChaloRoundedBottomSheetKt.a(sheetStateRememberModalBottomSheetState, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(1413710324, true, new la0(bottomSheetStandardContentUiState2, 26), composerStartRestartGroup, 54), composer2, 196992, 26);
                composer2.endReplaceGroup();
            }
            boolean zChangedInstance = composer2.changedInstance(productActivationComponent);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qv0(productActivationComponent, 7);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composer2, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(productActivationComponent, i, 13));
        }
    }

    public static final void d(Modifier modifier, UserProfilingTicketActivationBannerUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        SetUpProfileBtnUIState setUpProfileBtnUIState = state.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(-821167443);
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
                ComposerKt.traceEventStart(-821167443, i2, -1, "app.chalo.productactivation.ui.UserProfilingTicketActivationBannerComposable (ProductActivationScreen.kt:170)");
            }
            UserProfilingTicketActivationBannerUISpecs userProfilingTicketActivationBannerUISpecs = state.f8049a;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Brush.Companion companion = Brush.INSTANCE;
            List list = userProfilingTicketActivationBannerUISpecs.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Color.m4595boximpl(ChaloColorTokenKt.c((ChaloColorToken) it.next())));
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m4560linearGradientmHitzGk$default(companion, arrayList, 0L, 0L, 0, 14, (Object) null), ChaloThemeKt.d(userProfilingTicketActivationBannerUISpecs.d), 0.0f, 4, null), userProfilingTicketActivationBannerUISpecs.f8048a);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new xq0(mutableState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnVisibilityChanged$default = OnVisibilityChangedModifierKt.onVisibilityChanged$default(modifierC, 0L, 0.0f, null, (Function1) objRememberedValue2, 7, null);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(userProfilingTicketActivationBannerUISpecs.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), horizontalA, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnVisibilityChanged$default);
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
            Alignment.Vertical verticalB = UiAlignmentKt.b(userProfilingTicketActivationBannerUISpecs.c);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            UserProfilePicComposableKt.a(state.b, composerStartRestartGroup, 0);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            TextKt.c(state.c, null, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.s(null, 0, composerStartRestartGroup, 1);
            TextKt.c(state.d, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.b(ChaloTheme.b(composerStartRestartGroup, 0).W, composerStartRestartGroup, 0);
            long jC = ChaloColorTokenKt.c(setUpProfileBtnUIState.f8047a.b);
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(setUpProfileBtnUIState.f8047a.c);
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = setUpProfileBtnUIState.c;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
                ProductActivationScreenKt$UserProfilingTicketActivationBannerComposable$3$2$1 productActivationScreenKt$UserProfilingTicketActivationBannerComposable$3$2$1 = new ProductActivationScreenKt$UserProfilingTicketActivationBannerComposable$3$2$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(productActivationScreenKt$UserProfilingTicketActivationBannerComposable$3$2$1);
                objRememberedValue3 = productActivationScreenKt$UserProfilingTicketActivationBannerComposable$3$2$1;
            }
            ChaloFilledButtonKt.b(null, 0L, jC, roundedCornerShapeD, null, null, (Function0) ((KFunction) objRememberedValue3), ComposableLambdaKt.rememberComposableLambda(9511120, true, new la0(state, 27), composerStartRestartGroup, 54), composerStartRestartGroup, 12607488, 35);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 23, modifier, state));
        }
    }
}
