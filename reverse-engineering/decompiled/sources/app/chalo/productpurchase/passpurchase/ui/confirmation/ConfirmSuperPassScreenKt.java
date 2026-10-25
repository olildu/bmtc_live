package app.chalo.productpurchase.passpurchase.ui.confirmation;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TextWithSpecialFeaturesTagsKt;
import app.chalo.compose.components.bottomsheet.TncBottomSheetKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.bottomsheet.TncBottomSheetUIState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.arkivanov.decompose.value.MutableValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.af;
import defpackage.b3;
import defpackage.bn;
import defpackage.c0;
import defpackage.c6;
import defpackage.dq;
import defpackage.fp;
import defpackage.i41;
import defpackage.ir;
import defpackage.mk;
import defpackage.pk0;
import defpackage.r1;
import defpackage.rs;
import defpackage.t8;
import defpackage.u;
import defpackage.u6;
import defpackage.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmSuperPassPurchaseUIState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "shouldShowBottomSheet", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConfirmSuperPassScreenKt {
    public static final void a(Modifier modifier, ConfirmSuperPassPurchaseBanner confirmSuperPassPurchaseBanner, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112035587);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(confirmSuperPassPurchaseBanner) : composerStartRestartGroup.changedInstance(confirmSuperPassPurchaseBanner) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112035587, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.BannerCard (ConfirmSuperPassScreen.kt:890)");
            }
            ChaloColorToken.LightOrangeSpf lightOrangeSpf = confirmSuperPassPurchaseBanner.f;
            ChaloColorToken.LightOrangeSpfDark lightOrangeSpfDark = confirmSuperPassPurchaseBanner.g;
            UIShape uIShape = confirmSuperPassPurchaseBanner.h;
            Modifier modifierC = ChaloThemeKt.c(ClipKt.clip(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), confirmSuperPassPurchaseBanner.i).then((lightOrangeSpf == null || lightOrangeSpfDark == null) ? BackgroundKt.m263backgroundbw27NRU(Modifier.INSTANCE, ChaloColorTokenKt.c(confirmSuperPassPurchaseBanner.e), ChaloThemeKt.d(uIShape)) : BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(lightOrangeSpf)), Color.m4595boximpl(ChaloColorTokenKt.c(lightOrangeSpfDark))), 0.0f, 0.0f, 0, 14, (Object) null), ChaloThemeKt.d(uIShape), 0.0f, 4, null)), ChaloThemeKt.d(uIShape)), confirmSuperPassPurchaseBanner.d);
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(confirmSuperPassPurchaseBanner.f8363a, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, confirmSuperPassPurchaseBanner.b, null, null, composerStartRestartGroup, 0, 13);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (confirmSuperPassPurchaseBanner.c == null) {
                composer2.startReplaceGroup(465413887);
            } else {
                composer2.startReplaceGroup(465413888);
                ChaloSpacersKt.m(composer2, 0);
                ChaloTextViewKt.a(null, confirmSuperPassPurchaseBanner.c, null, null, composer2, 0, 13);
                composer2 = composer2;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(modifier, confirmSuperPassPurchaseBanner, i, 16));
        }
    }

    public static final void b(List list, ImageUISize imageUISize, ChaloPadding chaloPadding, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-416844522);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUISize) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-416844522, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmPassUploadedProofContent (ConfirmSuperPassScreen.kt:809)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(chaloPadding))) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u(19, list, chaloPadding, imageUISize);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i2 >> 9) & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 16, list, imageUISize, chaloPadding, modifier));
        }
    }

    public static final void c(List list, ConfirmSuperPassPurchaseUISpec confirmSuperPassPurchaseUISpec, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1047223789);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(list) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(confirmSuperPassPurchaseUISpec) ? 32 : 16;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1047223789, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassBannersSection (ConfirmSuperPassScreen.kt:852)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new af(list, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 6, 2);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Integer.valueOf(list.size());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int iIntValue = ((Number) objRememberedValue2).intValue();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, null, null, 0, ChaloTheme.b(composerStartRestartGroup, 0).h, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-983022326, true, new rs(list, i3), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16350);
            composerStartRestartGroup = composerStartRestartGroup;
            if (iIntValue > 1) {
                composerStartRestartGroup.startReplaceGroup(147182162);
                ChaloSpacersKt.u(composerStartRestartGroup, 0);
                ChaloDotsIndicatorsKt.a(SizeKt.wrapContentSize$default(companion, null, false, 3, null), ChaloColorTokenKt.c(confirmSuperPassPurchaseUISpec.p), ChaloColorTokenKt.c(confirmSuperPassPurchaseUISpec.q), iIntValue, pagerStateRememberPagerState.getCurrentPage(), composerStartRestartGroup, 24576);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(120620153);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(list, confirmSuperPassPurchaseUISpec, i, 13));
        }
    }

    public static final void d(final TextUIState textUIState, final TextUIState textUIState2, final DividerUIState dividerUIState, final ChaloPadding chaloPadding, final ChaloPadding chaloPadding2, final ChaloPadding chaloPadding3, final ChaloPadding chaloPadding4, final Modifier modifier, Composer composer, final int i) {
        int i2;
        ChaloPadding chaloPadding5;
        ChaloPadding chaloPadding6;
        ChaloPadding chaloPadding7;
        ChaloPadding chaloPadding8;
        Composer composer2;
        DividerUIState dividerUIState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        float f;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1577872765);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textUIState2) : composerStartRestartGroup.changedInstance(textUIState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(dividerUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding2) : composerStartRestartGroup.changedInstance(chaloPadding2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding3) : composerStartRestartGroup.changedInstance(chaloPadding3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding4) : composerStartRestartGroup.changedInstance(chaloPadding4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1577872765, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassEditUserNameSection (ConfirmSuperPassScreen.kt:670)");
            }
            if (textUIState == null && textUIState2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: ts
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj3).getClass();
                                ConfirmSuperPassScreenKt.d(textUIState, textUIState2, dividerUIState, chaloPadding, chaloPadding2, chaloPadding3, chaloPadding4, modifier, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                ConfirmSuperPassScreenKt.d(textUIState, textUIState2, dividerUIState, chaloPadding, chaloPadding2, chaloPadding3, chaloPadding4, modifier, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                chaloPadding6 = chaloPadding2;
                chaloPadding7 = chaloPadding3;
                chaloPadding8 = chaloPadding4;
                dividerUIState2 = dividerUIState;
                chaloPadding5 = chaloPadding;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (textUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-184947491);
                    composerStartRestartGroup.endReplaceGroup();
                    f = 0.0f;
                    composer2 = composerStartRestartGroup;
                    obj = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-184947490);
                    f = 0.0f;
                    composer2 = composerStartRestartGroup;
                    obj = null;
                    TextKt.c(textUIState, ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding5), chaloPadding7), null, null, composer2, 0, 12);
                    composer2.endReplaceGroup();
                }
                if (textUIState2 == null) {
                    composer2.startReplaceGroup(-184686626);
                } else {
                    composer2.startReplaceGroup(-184686625);
                    TextKt.c(textUIState2, ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, obj), chaloPadding5), chaloPadding6), null, null, composer2, 0, 12);
                }
                composer2.endReplaceGroup();
                DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, obj), chaloPadding8), dividerUIState2, composer2, (i2 >> 3) & 112, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        chaloPadding5 = chaloPadding;
        chaloPadding6 = chaloPadding2;
        chaloPadding7 = chaloPadding3;
        chaloPadding8 = chaloPadding4;
        composer2 = composerStartRestartGroup;
        dividerUIState2 = dividerUIState;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            final DividerUIState dividerUIState3 = dividerUIState2;
            final ChaloPadding chaloPadding9 = chaloPadding5;
            final ChaloPadding chaloPadding10 = chaloPadding6;
            final ChaloPadding chaloPadding11 = chaloPadding7;
            final ChaloPadding chaloPadding12 = chaloPadding8;
            function2 = new Function2() { // from class: ts
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj3).getClass();
                            ConfirmSuperPassScreenKt.d(textUIState, textUIState2, dividerUIState3, chaloPadding9, chaloPadding10, chaloPadding11, chaloPadding12, modifier, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            ConfirmSuperPassScreenKt.d(textUIState, textUIState2, dividerUIState3, chaloPadding9, chaloPadding10, chaloPadding11, chaloPadding12, modifier, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    public static final void e(SuperPassFareDetailsUIState superPassFareDetailsUIState, Modifier modifier, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(490688937);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(superPassFareDetailsUIState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = 1;
        int i4 = 14;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(490688937, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassFareSplit (ConfirmSuperPassScreen.kt:621)");
            }
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(ChaloThemeKt.c(ComposeUtilsKt.b(modifier, superPassFareDetailsUIState.d, composerStartRestartGroup, (i2 >> 3) & 14, 6), superPassFareDetailsUIState.e), null, null, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f = 0.0f;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            TextKt.c(superPassFareDetailsUIState.f8398a, i41.a(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null), null, null, composerStartRestartGroup, 0, 12);
            CommonImageKt.a(superPassFareDetailsUIState.b, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(747092713);
            for (SuperPassFareSplitUIState superPassFareSplitUIState : superPassFareDetailsUIState.c) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion4, f, i3, null), superPassFareDetailsUIState.f);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
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
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                TextKt.c(superPassFareSplitUIState.f8399a, i41.a(RowScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null), null, null, composerStartRestartGroup, 0, 12);
                TextKt.c(superPassFareSplitUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.endNode();
                f = 0.0f;
                i3 = 1;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(superPassFareDetailsUIState, modifier, i, i4));
        }
    }

    public static final void f(ConfirmSuperPassOfferCardUIState confirmSuperPassOfferCardUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1836791517);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(confirmSuperPassOfferCardUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1836791517, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassOfferCard (ConfirmSuperPassScreen.kt:581)");
            }
            Brush.Companion companion = Brush.INSTANCE;
            ChaloColorToken chaloColorToken = confirmSuperPassOfferCardUIState.g;
            UIShape uIShape = confirmSuperPassOfferCardUIState.i;
            Modifier modifierC = ChaloThemeKt.c(ClipKt.clip(BorderUISpecKt.a(BackgroundKt.background$default(modifier, Brush.Companion.m4558horizontalGradient8A3gB4$default(companion, CollectionsKt.S(Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken)), Color.m4595boximpl(ChaloColorTokenKt.c(confirmSuperPassOfferCardUIState.h))), 0.0f, 0.0f, 0, 14, (Object) null), ChaloThemeKt.d(uIShape), 0.0f, 4, null), confirmSuperPassOfferCardUIState.j), ChaloThemeKt.d(uIShape)), confirmSuperPassOfferCardUIState.e);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(confirmSuperPassOfferCardUIState.c, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            Modifier modifierA = i41.a(rowScopeInstance, companion4, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            ChaloTextViewKt.a(null, confirmSuperPassOfferCardUIState.f8361a, null, null, composerStartRestartGroup, 0, 13);
            composer2 = composerStartRestartGroup;
            TextUIState.ChaloTextUIState chaloTextUIState = confirmSuperPassOfferCardUIState.b;
            if (chaloTextUIState == null) {
                composer2.startReplaceGroup(-1199008369);
            } else {
                composer2.startReplaceGroup(-1199008368);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            ChaloSpacersKt.w(composer2, 0);
            CommonImageKt.a(confirmSuperPassOfferCardUIState.d, null, false, composer2, 0, 6);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(confirmSuperPassOfferCardUIState, modifier, i, 15));
        }
    }

    public static final void g(ConfirmSuperPassOffersSectionUIState confirmSuperPassOffersSectionUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1214608295);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(confirmSuperPassOffersSectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214608295, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassOffersSection (ConfirmSuperPassScreen.kt:555)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), confirmSuperPassOffersSectionUIState.d);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = confirmSuperPassOffersSectionUIState.f8362a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.c(chaloTextUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), confirmSuperPassOffersSectionUIState.c), null, null, composerStartRestartGroup, 0, 12);
            f(confirmSuperPassOffersSectionUIState.b, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), confirmSuperPassOffersSectionUIState.e), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(confirmSuperPassOffersSectionUIState, modifier, i, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1143799384);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(confirmSuperPassPurchaseViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1143799384, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreen (ConfirmSuperPassScreen.kt:74)");
            }
            j((ConfirmSuperPassPurchaseUIState) SubscribeAsStateKt.a((MutableValue) confirmSuperPassPurchaseViewModel.g.getValue(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(confirmSuperPassPurchaseViewModel, i, 20));
        }
    }

    public static final void i(ConfirmSuperPassPurchaseUIState confirmSuperPassPurchaseUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        boolean z;
        ChaloPadding chaloPadding;
        int i3;
        int i4;
        ConfirmSuperPassPurchaseUISpec confirmSuperPassPurchaseUISpec;
        float f;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1096014053);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(confirmSuperPassPurchaseUIState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096014053, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenContent (ConfirmSuperPassScreen.kt:284)");
            }
            ConfirmSuperPassPurchaseUISpec confirmSuperPassPurchaseUISpec2 = confirmSuperPassPurchaseUIState.C;
            ArrayList arrayList = confirmSuperPassPurchaseUIState.G;
            DividerUIState dividerUIState = confirmSuperPassPurchaseUIState.e;
            boolean zChanged = composerStartRestartGroup.changed(confirmSuperPassPurchaseUISpec2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(confirmSuperPassPurchaseUISpec2);
                objRememberedValue = confirmSuperPassPurchaseUISpec2;
            }
            ConfirmSuperPassPurchaseUISpec confirmSuperPassPurchaseUISpec3 = (ConfirmSuperPassPurchaseUISpec) objRememberedValue;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = confirmSuperPassPurchaseUISpec2.f8381a;
            ChaloPadding chaloPadding2 = confirmSuperPassPurchaseUISpec2.i;
            ChaloPadding chaloPadding3 = confirmSuperPassPurchaseUISpec2.k;
            ChaloPadding chaloPadding4 = confirmSuperPassPurchaseUISpec2.f;
            ChaloColorToken chaloColorToken2 = confirmSuperPassPurchaseUISpec2.b;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            if (arrayList == null) {
                composerStartRestartGroup.startReplaceGroup(1838102244);
                composerStartRestartGroup.endReplaceGroup();
                z = false;
            } else {
                composerStartRestartGroup.startReplaceGroup(1838102245);
                z = false;
                c(arrayList, confirmSuperPassPurchaseUISpec3, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextUIState textUIState = confirmSuperPassPurchaseUIState.b;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.c(textUIState, ChaloThemeKt.c(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding4), confirmSuperPassPurchaseUISpec2.c), null, null, composerStartRestartGroup, 0, 12);
            m(confirmSuperPassPurchaseUIState.c, confirmSuperPassPurchaseUIState.d, confirmSuperPassPurchaseUIState.e, confirmSuperPassPurchaseUISpec2.f, confirmSuperPassPurchaseUISpec2.g, confirmSuperPassPurchaseUISpec2.h, confirmSuperPassPurchaseUISpec2.i, confirmSuperPassPurchaseUISpec2.d, confirmSuperPassPurchaseUISpec2.e, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composerStartRestartGroup, 0);
            Composer composer2 = composerStartRestartGroup;
            TextKt.c(confirmSuperPassPurchaseUIState.g, ChaloThemeKt.c(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding4), confirmSuperPassPurchaseUISpec2.j), null, null, composer2, 0, 12);
            if (confirmSuperPassPurchaseUIState.h == null) {
                composer2.startReplaceGroup(1839617245);
                composer2.endReplaceGroup();
                chaloPadding = chaloPadding3;
            } else {
                composer2.startReplaceGroup(1839617246);
                chaloPadding = chaloPadding3;
                TextKt.c(confirmSuperPassPurchaseUIState.h, ChaloThemeKt.c(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding4), chaloPadding), null, null, composer2, 0, 12);
                composer2.endReplaceGroup();
            }
            if (confirmSuperPassPurchaseUIState.i == null) {
                composer2.startReplaceGroup(1840012309);
            } else {
                composer2.startReplaceGroup(1840012310);
                TextKt.c(confirmSuperPassPurchaseUIState.i, ChaloThemeKt.c(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding4), chaloPadding), null, null, composer2, 0, 12);
            }
            composer2.endReplaceGroup();
            TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = confirmSuperPassPurchaseUIState.j;
            if (textWithSpecialFeaturesTagsUIState == null) {
                composer2.startReplaceGroup(1840422997);
                composer2.endReplaceGroup();
                i3 = 0;
            } else {
                composer2.startReplaceGroup(1840422998);
                Modifier modifierC = ChaloThemeKt.c(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding4), chaloPadding);
                i3 = 0;
                TextWithSpecialFeaturesTagsKt.a(textWithSpecialFeaturesTagsUIState, modifierC, composer2, 0, 0);
                composer2.endReplaceGroup();
            }
            if (confirmSuperPassPurchaseUIState.l == null || confirmSuperPassPurchaseUIState.m == null) {
                i4 = i3;
                confirmSuperPassPurchaseUISpec = confirmSuperPassPurchaseUISpec2;
                composer2.startReplaceGroup(1828575015);
            } else {
                composer2.startReplaceGroup(1840886386);
                confirmSuperPassPurchaseUISpec = confirmSuperPassPurchaseUISpec2;
                i4 = i3;
                k(confirmSuperPassPurchaseUIState.k, confirmSuperPassPurchaseUIState.l, confirmSuperPassPurchaseUISpec2.f, confirmSuperPassPurchaseUISpec2.l, confirmSuperPassPurchaseUISpec2.m, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), confirmSuperPassPurchaseUIState.m, confirmSuperPassPurchaseUIState.n, confirmSuperPassPurchaseUIState.o, composer2, 0);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            PassStateDateChangeInfoBannerUIState passStateDateChangeInfoBannerUIState = confirmSuperPassPurchaseUIState.B;
            if (passStateDateChangeInfoBannerUIState == null) {
                composer2.startReplaceGroup(1841610793);
            } else {
                composer2.startReplaceGroup(1841610794);
                q(passStateDateChangeInfoBannerUIState, null, composer2, i4);
            }
            composer2.endReplaceGroup();
            DividerUIStateKt.a(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding2), dividerUIState, composer2, i4, i4);
            ConfirmSuperPassPurchaseUISpec confirmSuperPassPurchaseUISpec4 = confirmSuperPassPurchaseUISpec;
            Composer composer3 = composer2;
            d(confirmSuperPassPurchaseUIState.p, confirmSuperPassPurchaseUIState.q, confirmSuperPassPurchaseUIState.e, confirmSuperPassPurchaseUISpec4.f, confirmSuperPassPurchaseUISpec4.o, confirmSuperPassPurchaseUISpec4.n, confirmSuperPassPurchaseUISpec4.i, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composer3, 0);
            composerStartRestartGroup = composer3;
            ConfirmSuperPassOffersSectionUIState confirmSuperPassOffersSectionUIState = confirmSuperPassPurchaseUIState.A;
            if (confirmSuperPassOffersSectionUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1842564508);
                composerStartRestartGroup.endReplaceGroup();
                f = 0.0f;
                i5 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(1842564509);
                f = 0.0f;
                i5 = 1;
                g(confirmSuperPassOffersSectionUIState, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composerStartRestartGroup, i4);
                DividerUIStateKt.a(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), chaloPadding2), dividerUIState, composerStartRestartGroup, i4, i4);
                composerStartRestartGroup.endReplaceGroup();
            }
            e(confirmSuperPassPurchaseUIState.r, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, f, i5, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composerStartRestartGroup, i4);
            DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion2, f, i5, null), dividerUIState, composerStartRestartGroup, 6, i4);
            o(confirmSuperPassPurchaseUIState.s, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, f, i5, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composerStartRestartGroup, i4);
            ImageUrlUIState imageUrlUIState = confirmSuperPassPurchaseUIState.D;
            ImageUIState imageUIState = confirmSuperPassPurchaseUIState.E;
            TextUIState.ChaloTextUIState chaloTextUIState = confirmSuperPassPurchaseUIState.F;
            if (imageUrlUIState == null || chaloTextUIState == null) {
                if (imageUIState == null || chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(1828575015);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1844190025);
                    r(imageUIState, chaloTextUIState, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composerStartRestartGroup, i4);
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1843846979);
                s(imageUrlUIState, chaloTextUIState, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloColorTokenKt.c(chaloColorToken2), null, 2, null), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), confirmSuperPassPurchaseUIState.f, composerStartRestartGroup, 6, i4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(confirmSuperPassPurchaseUIState, modifier, i, 18));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final ConfirmSuperPassPurchaseUIState state, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(state, "state");
        EnlargedProofImageUIState enlargedProofImageUIState = state.u;
        Composer composerStartRestartGroup = composer.startRestartGroup(-885485845);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-885485845, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenMainContent (ConfirmSuperPassScreen.kt:84)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: ss
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1;
                        switch (i5) {
                            case 0:
                                ConfirmSuperPassPurchaseUIState confirmSuperPassPurchaseUIState = state;
                                return Boolean.valueOf((confirmSuperPassPurchaseUIState.x == null && confirmSuperPassPurchaseUIState.y == null && confirmSuperPassPurchaseUIState.z == null) ? false : true);
                            default:
                                EnlargedProofImageUIState enlargedProofImageUIState2 = state.u;
                                if (enlargedProofImageUIState2 != null && (uiEventHandler$Companion$fromLambda$1 = enlargedProofImageUIState2.f8460a.c) != null) {
                                    uiEventHandler$Companion$fromLambda$1.a();
                                }
                                return Unit.f17538a;
                        }
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state2 = (State) objRememberedValue;
            Boolean bool = (Boolean) state2.getValue();
            bool.booleanValue();
            boolean zChanged = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConfirmSuperPassScreenKt$ConfirmSuperPassScreenMainContent$1$1(sheetStateRememberModalBottomSheetState, state2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = i2;
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(state.f8382a, null, null, composerStartRestartGroup, 0, 14);
            int i9 = i6 & 14;
            i(state, dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, i9);
            l(state.t, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            if (enlargedProofImageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1844256248);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1844256247);
                i3 = 0;
                SuperPassProofOverviewScreenKt.d(enlargedProofImageUIState, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            LoadingDialogUIState loadingDialogUIState = state.w;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(181549068);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 181549069, loadingDialogUIState, composerStartRestartGroup, i3);
            }
            DatePickerUIState datePickerUIState = state.v;
            if (datePickerUIState == null) {
                composerStartRestartGroup.startReplaceGroup(181620647);
            } else {
                composerStartRestartGroup.startReplaceGroup(181620648);
                ChaloDatePickerKt.b(datePickerUIState, composerStartRestartGroup, i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            TncBottomSheetUIState tncBottomSheetUIState = state.x;
            if (tncBottomSheetUIState == null) {
                composerStartRestartGroup.startReplaceGroup(181696845);
            } else {
                composerStartRestartGroup.startReplaceGroup(181696846);
                TncBottomSheetKt.a(tncBottomSheetUIState, sheetStateRememberModalBottomSheetState, composerStartRestartGroup, i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            PassAlreadyAvailedBottomSheetUIState passAlreadyAvailedBottomSheetUIState = state.y;
            if (passAlreadyAvailedBottomSheetUIState == null) {
                composerStartRestartGroup.startReplaceGroup(181844126);
            } else {
                composerStartRestartGroup.startReplaceGroup(181844127);
                p(passAlreadyAvailedBottomSheetUIState, sheetStateRememberModalBottomSheetState, composerStartRestartGroup, i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            FareMappingFailedBottomSheetUIState fareMappingFailedBottomSheetUIState = state.z;
            if (fareMappingFailedBottomSheetUIState == null) {
                composerStartRestartGroup.startReplaceGroup(182004799);
            } else {
                composerStartRestartGroup.startReplaceGroup(182004800);
                n(fareMappingFailedBottomSheetUIState, sheetStateRememberModalBottomSheetState, composerStartRestartGroup, i3);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z = enlargedProofImageUIState != null ? 1 : i3;
            int i10 = i9 == 4 ? 1 : i3;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: ss
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1;
                        switch (i4) {
                            case 0:
                                ConfirmSuperPassPurchaseUIState confirmSuperPassPurchaseUIState = state;
                                return Boolean.valueOf((confirmSuperPassPurchaseUIState.x == null && confirmSuperPassPurchaseUIState.y == null && confirmSuperPassPurchaseUIState.z == null) ? false : true);
                            default:
                                EnlargedProofImageUIState enlargedProofImageUIState2 = state.u;
                                if (enlargedProofImageUIState2 != null && (uiEventHandler$Companion$fromLambda$1 = enlargedProofImageUIState2.f8460a.c) != null) {
                                    uiEventHandler$Companion$fromLambda$1.a();
                                }
                                return Unit.f17538a;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.a(z, (Function0) objRememberedValue3, 0, 0, composerStartRestartGroup, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(state, i, 21));
        }
    }

    public static final void k(TextUIState textUIState, TextUIState textUIState2, ChaloPadding chaloPadding, ChaloPadding chaloPadding2, ChaloPadding chaloPadding3, Modifier modifier, TextUIState textUIState3, TextUIState textUIState4, ImageUIState imageUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(263877575);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textUIState2) : composerStartRestartGroup.changedInstance(textUIState2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chaloPadding2) : composerStartRestartGroup.changedInstance(chaloPadding2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding3) : composerStartRestartGroup.changedInstance(chaloPadding3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(textUIState3) : composerStartRestartGroup.changedInstance(textUIState3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(textUIState4) : composerStartRestartGroup.changedInstance(textUIState4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(imageUIState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(263877575, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassStartDateSection (ConfirmSuperPassScreen.kt:716)");
            }
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            TextKt.c(textUIState, ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), chaloPadding), chaloPadding2), null, null, composerStartRestartGroup, i2 & 14, 12);
            composer2 = composerStartRestartGroup;
            FlowLayoutKt.FlowRow(ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), chaloPadding), chaloPadding3), null, null, companion.getCenterVertically(), 0, 0, ComposableLambdaKt.rememberComposableLambda(-512554356, true, new c0(textUIState2, imageUIState, textUIState3, textUIState4, 7), composer2, 54), composer2, 1575936, 54);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bn(textUIState, textUIState2, chaloPadding, chaloPadding2, chaloPadding3, modifier, textUIState3, textUIState4, imageUIState, i));
        }
    }

    public static final void l(SuperPassConfirmBtnUIState superPassConfirmBtnUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2126143843);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(superPassConfirmBtnUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = 17;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2126143843, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassSubmitBtn (ConfirmSuperPassScreen.kt:244)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassConfirmBtnUIState.f.c), 0L, 0L, composerStartRestartGroup, 0, 6);
            modifier2 = modifier;
            ChaloRoundedCardKt.a(superPassConfirmBtnUIState.f, modifier2, ComposableLambdaKt.rememberComposableLambda(-941639144, true, new c6(superPassConfirmBtnUIState, i3), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 112) | 384, 0);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(superPassConfirmBtnUIState, modifier2, i, i3));
        }
    }

    public static final void m(final TextUIState textUIState, final List list, final DividerUIState dividerUIState, final ChaloPadding chaloPadding, final ChaloPadding chaloPadding2, final ChaloPadding chaloPadding3, final ChaloPadding chaloPadding4, final ImageUISize imageUISize, final ChaloPadding chaloPadding5, final Modifier modifier, Composer composer, final int i) {
        int i2;
        ImageUISize imageUISize2;
        ChaloPadding chaloPadding6;
        ChaloPadding chaloPadding7;
        ChaloPadding chaloPadding8;
        Composer composer2;
        Modifier modifier2;
        DividerUIState dividerUIState2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(971119558);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textUIState) : composerStartRestartGroup.changedInstance(textUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(dividerUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding2) : composerStartRestartGroup.changedInstance(chaloPadding2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding3) : composerStartRestartGroup.changedInstance(chaloPadding3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding4) : composerStartRestartGroup.changedInstance(chaloPadding4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            imageUISize2 = imageUISize;
            i2 |= composerStartRestartGroup.changed(imageUISize2) ? 8388608 : 4194304;
        } else {
            imageUISize2 = imageUISize;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(chaloPadding5) : composerStartRestartGroup.changedInstance(chaloPadding5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(971119558, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmUserNameAndProofSection (ConfirmSuperPassScreen.kt:766)");
            }
            if (textUIState == null && list == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i4 = 0;
                    final ImageUISize imageUISize3 = imageUISize2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: us
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ConfirmSuperPassScreenKt.m(textUIState, list, dividerUIState, chaloPadding, chaloPadding2, chaloPadding3, chaloPadding4, imageUISize3, chaloPadding5, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ConfirmSuperPassScreenKt.m(textUIState, list, dividerUIState, chaloPadding, chaloPadding2, chaloPadding3, chaloPadding4, imageUISize3, chaloPadding5, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            chaloPadding6 = chaloPadding;
            chaloPadding7 = chaloPadding3;
            chaloPadding8 = chaloPadding4;
            modifier2 = modifier;
            dividerUIState2 = dividerUIState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-13906037);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 1;
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-13906036);
                composer2 = composerStartRestartGroup;
                i3 = 1;
                TextKt.c(textUIState, ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding6), chaloPadding2), null, null, composer2, 0, 12);
                composer2.endReplaceGroup();
            }
            if (list == null) {
                composer2.startReplaceGroup(-13629517);
            } else {
                composer2.startReplaceGroup(-13629516);
                b(list, imageUISize, chaloPadding5, ChaloThemeKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, r0, i3, null), chaloPadding6), chaloPadding7), composer2, (i2 >> 18) & 1008);
            }
            composer2.endReplaceGroup();
            DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null), chaloPadding8), dividerUIState2, composer2, (i2 >> 3) & 112, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            chaloPadding6 = chaloPadding;
            chaloPadding7 = chaloPadding3;
            chaloPadding8 = chaloPadding4;
            composer2 = composerStartRestartGroup;
            modifier2 = modifier;
            dividerUIState2 = dividerUIState;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i6 = 1;
            final DividerUIState dividerUIState3 = dividerUIState2;
            final ChaloPadding chaloPadding9 = chaloPadding6;
            final ChaloPadding chaloPadding10 = chaloPadding7;
            final ChaloPadding chaloPadding11 = chaloPadding8;
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: us
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ConfirmSuperPassScreenKt.m(textUIState, list, dividerUIState3, chaloPadding9, chaloPadding2, chaloPadding10, chaloPadding11, imageUISize, chaloPadding5, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ConfirmSuperPassScreenKt.m(textUIState, list, dividerUIState3, chaloPadding9, chaloPadding2, chaloPadding10, chaloPadding11, imageUISize, chaloPadding5, modifier3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void n(FareMappingFailedBottomSheetUIState fareMappingFailedBottomSheetUIState, SheetState sheetState, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(853841394);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(fareMappingFailedBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(853841394, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.FareMappingFailedBottomSheet (ConfirmSuperPassScreen.kt:200)");
            }
            sheetState2 = sheetState;
            BottomSheetUiStateKt.a(null, fareMappingFailedBottomSheetUIState.i, sheetState2, ComposableLambdaKt.rememberComposableLambda(-365771830, true, new c6(fareMappingFailedBottomSheetUIState, 19), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 896) | 24576, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState2 = sheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(fareMappingFailedBottomSheetUIState, sheetState2, i, 9));
        }
    }

    public static final void o(SuperPassTncSectionUIState superPassTncSectionUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1920618310);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(superPassTncSectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1920618310, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.HighlightedTncSection (ConfirmSuperPassScreen.kt:524)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), superPassTncSectionUIState.d);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = superPassTncSectionUIState.f8400a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            TextKt.c(chaloTextUIState, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, composerStartRestartGroup, 48, 12);
            TextUIState textUIState = superPassTncSectionUIState.b;
            if (textUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-1181700589);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1181700588);
                TextKt.c(textUIState, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, composerStartRestartGroup, 48, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.c(superPassTncSectionUIState.c, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), superPassTncSectionUIState.e), null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(superPassTncSectionUIState, modifier, i, 11));
        }
    }

    public static final void p(PassAlreadyAvailedBottomSheetUIState passAlreadyAvailedBottomSheetUIState, SheetState sheetState, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1105143304);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(passAlreadyAvailedBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1105143304, i2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.PassAlreadyAvailedBottomSheet (ConfirmSuperPassScreen.kt:162)");
            }
            sheetState2 = sheetState;
            BottomSheetUiStateKt.a(null, passAlreadyAvailedBottomSheetUIState.g, sheetState2, ComposableLambdaKt.rememberComposableLambda(1582906848, true, new c6(passAlreadyAvailedBottomSheetUIState, 18), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 896) | 24576, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState2 = sheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(passAlreadyAvailedBottomSheetUIState, sheetState2, i, 19));
        }
    }

    public static final void q(PassStateDateChangeInfoBannerUIState passStateDateChangeInfoBannerUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-75398660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(passStateDateChangeInfoBannerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-75398660, i3, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.PassStartDateChangeInfoBanner (ConfirmSuperPassScreen.kt:829)");
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(modifier2, ChaloColorTokenKt.c(passStateDateChangeInfoBannerUIState.f), null, 2, null), 0.0f, 1, null), passStateDateChangeInfoBannerUIState.d), ChaloColorTokenKt.c(passStateDateChangeInfoBannerUIState.e), ChaloThemeKt.d(passStateDateChangeInfoBannerUIState.g)), passStateDateChangeInfoBannerUIState.c);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(passStateDateChangeInfoBannerUIState.f8395a, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.c(passStateDateChangeInfoBannerUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(passStateDateChangeInfoBannerUIState, modifier2, i, 12));
        }
    }

    public static final void r(ImageUIState imageUIState, TextUIState titleState, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(imageUIState, "imageUIState");
        Intrinsics.i(titleState, "titleState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332595601);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(titleState) : composerStartRestartGroup.changedInstance(titleState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332595601, i3, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ProductBrandingSection (ConfirmSuperPassScreen.kt:478)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            TextKt.c(titleState, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
            ChaloSpacersKt.u(composerStartRestartGroup, 0);
            CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, i3 & 14, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 1, imageUIState, titleState, modifier));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0172  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void s(ImageUrlUIState imageUrlUIState, TextUIState titleState, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        Function0<ComposeUiNode> constructor;
        Dp dp;
        float fM7292unboximpl;
        Dp dp2;
        float fM7292unboximpl2;
        Intrinsics.i(imageUrlUIState, "imageUrlUIState");
        ImageUISize imageUISize = imageUrlUIState.c;
        Intrinsics.i(titleState, "titleState");
        Composer composerStartRestartGroup = composer.startRestartGroup(380752440);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(imageUrlUIState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(titleState) : composerStartRestartGroup.changedInstance(titleState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(380752440, i3, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ProductBrandingSection (ConfirmSuperPassScreen.kt:498)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
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
                pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ChaloSpacersKt.g(composerStartRestartGroup, 0);
                TextKt.c(titleState, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
                ChaloSpacersKt.u(composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                String str = imageUrlUIState.f10037a;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (imageUISize != null) {
                    dp = imageUISize.b;
                } else {
                    dp = null;
                }
                if (dp == null) {
                    composerStartRestartGroup.startReplaceGroup(-1489763731);
                    fM7292unboximpl = ChaloTheme.b(composerStartRestartGroup, 0).u;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1489765250);
                    composerStartRestartGroup.endReplaceGroup();
                    fM7292unboximpl = dp.m7292unboximpl();
                }
                Modifier modifierM833width3ABfNKs = SizeKt.m833width3ABfNKs(companion2, fM7292unboximpl);
                dp2 = imageUISize != null ? imageUISize.f10034a : null;
                if (dp2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1489760952);
                    fM7292unboximpl2 = ChaloTheme.b(composerStartRestartGroup, 0).k;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1489762502);
                    composerStartRestartGroup.endReplaceGroup();
                    fM7292unboximpl2 = dp2.m7292unboximpl();
                }
                SingletonSubcomposeAsyncImageKt.a(str, null, SizeKt.m814height3ABfNKs(modifierM833width3ABfNKs, fM7292unboximpl2), null, null, null, null, null, null, ContentScale.INSTANCE.getFit(), composerStartRestartGroup, 48, 48, 63480);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new v(imageUrlUIState, titleState, modifier3, i, i2, 10));
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(380752440, i3, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ProductBrandingSection (ConfirmSuperPassScreen.kt:498)");
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            TextKt.c(titleState, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
            ChaloSpacersKt.u(composerStartRestartGroup, 0);
            Modifier modifier6 = modifier4;
            String str2 = imageUrlUIState.f10037a;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            if (imageUISize != null) {
                dp = imageUISize.b;
            } else {
                dp = null;
            }
            if (dp == null) {
                composerStartRestartGroup.startReplaceGroup(-1489763731);
                fM7292unboximpl = ChaloTheme.b(composerStartRestartGroup, 0).u;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1489765250);
                composerStartRestartGroup.endReplaceGroup();
                fM7292unboximpl = dp.m7292unboximpl();
            }
            Modifier modifierM833width3ABfNKs2 = SizeKt.m833width3ABfNKs(companion4, fM7292unboximpl);
            if (imageUISize != null) {
            }
            if (dp2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1489760952);
                fM7292unboximpl2 = ChaloTheme.b(composerStartRestartGroup, 0).k;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1489762502);
                composerStartRestartGroup.endReplaceGroup();
                fM7292unboximpl2 = dp2.m7292unboximpl();
            }
            SingletonSubcomposeAsyncImageKt.a(str2, null, SizeKt.m814height3ABfNKs(modifierM833width3ABfNKs2, fM7292unboximpl2), null, null, null, null, null, null, ContentScale.INSTANCE.getFit(), composerStartRestartGroup, 48, 48, 63480);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(imageUrlUIState, titleState, modifier3, i, i2, 10));
        }
    }
}
