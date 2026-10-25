package app.chalo.checkout.ui.payment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.payment.IndividualModeUiState;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiState;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiState;
import app.chalo.checkout.ui.screen.payment.PaymentModeCardHeaderUiSpec;
import app.chalo.checkout.ui.screen.payment.PaymentModeCardHeaderUiState;
import app.chalo.compose.ChaloErrorBannerKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextWithSpecialFeaturesTagsKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloShape;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.error.ErrorBannerUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.ao;
import defpackage.b3;
import defpackage.bo;
import defpackage.fi;
import defpackage.mk;
import defpackage.na;
import defpackage.pk0;
import defpackage.s4;
import defpackage.u;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckoutItemListKt {
    public static final void a(final PaymentCardUiState paymentCardUiState, Composer composer, final int i) {
        int i2;
        Function2<? super Composer, ? super Integer, Unit> function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.i(paymentCardUiState, "paymentCardUiState");
        PaymentCardUiSpec paymentCardUiSpec = paymentCardUiState.f1529a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-576316259);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        final int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-576316259, i3, -1, "app.chalo.checkout.ui.payment.CheckoutItemCard (CheckoutItemList.kt:41)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(paymentCardUiSpec.e), null, 2, null), paymentCardUiSpec.f1528a), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(452408406);
            if (paymentCardUiState.g == null) {
                composerStartRestartGroup.startReplaceGroup(452425392);
                composerStartRestartGroup.endReplaceGroup();
                d(paymentCardUiState.b, composerStartRestartGroup, 0);
                ErrorBannerUiState errorBannerUiState = paymentCardUiState.c;
                if (errorBannerUiState == null) {
                    composerStartRestartGroup.startReplaceGroup(452737500);
                } else {
                    composerStartRestartGroup.startReplaceGroup(452737501);
                    ChaloErrorBannerKt.a(ChaloThemeKt.c(companion, paymentCardUiSpec.b), errorBannerUiState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                b(paymentCardUiState.f1529a, paymentCardUiState.d, paymentCardUiState.f, false, composerStartRestartGroup, (i3 << 6) & 7168, 0);
                if (b3.t(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(452425393);
                c(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloThemeHelper.a().h, 0.0f, 2, null), null, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: co
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    CheckoutItemListKt.a(paymentCardUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    CheckoutItemListKt.a(paymentCardUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i6 = 1;
            function2 = new Function2() { // from class: co
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            CheckoutItemListKt.a(paymentCardUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            CheckoutItemListKt.a(paymentCardUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void b(PaymentCardUiSpec specs, List checkoutItems, ClickableTextUiState clickableTextUiState, boolean z, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        Object obj2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.i(specs, "specs");
        Intrinsics.i(checkoutItems, "checkoutItems");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937632073);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(specs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(checkoutItems) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                obj = clickableTextUiState;
                i3 |= composerStartRestartGroup.changed(obj) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i6 != 0) {
                        obj = null;
                    }
                    boolean z5 = i4 == 0 ? z2 : false;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1937632073, i3, -1, "app.chalo.checkout.ui.payment.CheckoutItemList (CheckoutItemList.kt:115)");
                    }
                    boolean z6 = z5;
                    ChaloRoundedCardKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), specs.c), ChaloThemeKt.d(specs.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1160995656, true, new ao(z6, specs, checkoutItems, obj, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj2 = obj;
                    z4 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    obj2 = obj;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new na(specs, checkoutItems, obj2, z4, i, i2, 2));
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i6 != 0) {
                    obj = null;
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1937632073, i3, -1, "app.chalo.checkout.ui.payment.CheckoutItemList (CheckoutItemList.kt:115)");
                }
                boolean z7 = z5;
                ChaloRoundedCardKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), specs.c), ChaloThemeKt.d(specs.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1160995656, true, new ao(z7, specs, checkoutItems, obj, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                obj2 = obj;
                z4 = z7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                obj2 = obj;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new na(specs, checkoutItems, obj2, z4, i, i2, 2));
            }
        }
        i3 |= 384;
        obj = clickableTextUiState;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i6 != 0) {
                    obj = null;
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1937632073, i3, -1, "app.chalo.checkout.ui.payment.CheckoutItemList (CheckoutItemList.kt:115)");
                }
                boolean z8 = z5;
                ChaloRoundedCardKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), specs.c), ChaloThemeKt.d(specs.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1160995656, true, new ao(z8, specs, checkoutItems, obj, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                obj2 = obj;
                z4 = z8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                obj2 = obj;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new na(specs, checkoutItems, obj2, z4, i, i2, 2));
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i6 != 0) {
                obj = null;
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937632073, i3, -1, "app.chalo.checkout.ui.payment.CheckoutItemList (CheckoutItemList.kt:115)");
            }
            boolean z9 = z5;
            ChaloRoundedCardKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), specs.c), ChaloThemeKt.d(specs.d), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1160995656, true, new ao(z9, specs, checkoutItems, obj, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj2 = obj;
            z4 = z9;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            obj2 = obj;
            z4 = z2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new na(specs, checkoutItems, obj2, z4, i, i2, 2));
        }
    }

    public static final void c(Modifier modifier, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2, Composer composer, int i) {
        int i2;
        ChaloColorToken chaloColorToken3;
        ChaloColorToken chaloColorToken4;
        Composer composerStartRestartGroup = composer.startRestartGroup(536658764);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(536658764, i3, -1, "app.chalo.checkout.ui.payment.CheckoutPaymentMethodShimmer (CheckoutItemList.kt:229)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m814height3ABfNKs(companion2, ChaloThemeHelper.a().j), 0.4f);
            ProvidableCompositionLocal providableCompositionLocal = ChaloThemeKt.d;
            Modifier modifierClip = ClipKt.clip(modifierFillMaxWidth, ((ChaloShape) composerStartRestartGroup.consume(providableCompositionLocal)).c);
            ChaloColorToken.ShimmerBackground shimmerBackground = ChaloColorToken.ShimmerBackground.f9852a;
            Color colorM4595boximpl = Color.m4595boximpl(ChaloColorTokenKt.c(shimmerBackground));
            ChaloColorToken.ShimmerColor shimmerColor = ChaloColorToken.ShimmerColor.f9853a;
            BoxKt.Box(ShimmerEffectKt.b(modifierClip, colorM4595boximpl, Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composerStartRestartGroup, 0);
            ChaloSpacersKt.a(ChaloThemeHelper.a().h, composerStartRestartGroup, 0);
            BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion2, ChaloThemeHelper.a().n), 0.0f, 1, null), ((ChaloShape) composerStartRestartGroup.consume(providableCompositionLocal)).c), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerBackground)), Color.m4595boximpl(ChaloColorTokenKt.c(shimmerColor)), 4), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chaloColorToken3 = shimmerBackground;
            chaloColorToken4 = shimmerColor;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            chaloColorToken3 = chaloColorToken;
            chaloColorToken4 = chaloColorToken2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 24, modifier, chaloColorToken3, chaloColorToken4));
        }
    }

    public static final void d(PaymentModeCardHeaderUiState paymentModeCardHeaderUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1506241);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentModeCardHeaderUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1506241, i2, -1, "app.chalo.checkout.ui.payment.CheckoutPaymentModeHeaderView (CheckoutItemList.kt:77)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            PaymentModeCardHeaderUiSpec paymentModeCardHeaderUiSpec = paymentModeCardHeaderUiState.f1545a;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, paymentModeCardHeaderUiSpec.f1544a);
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
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            TextWithSpecialFeaturesTagsKt.a(paymentModeCardHeaderUiState.b, rowScopeInstance.alignByBaseline(rowScopeInstance.weight(companion, 1.0f, false)), composerStartRestartGroup, 0, 0);
            ClickableTextUiState clickableTextUiState = paymentModeCardHeaderUiState.c;
            if (clickableTextUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1483628491);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1483628490);
                ChaloSpacersKt.a(paymentModeCardHeaderUiSpec.c, composerStartRestartGroup, 0);
                ChaloFilledButtonKt.d(rowScopeInstance.alignByBaseline(companion), clickableTextUiState, composerStartRestartGroup, 0, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            TextUIState.ChaloTextUIState chaloTextUIState = paymentModeCardHeaderUiState.d;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(292181668);
            } else {
                composerStartRestartGroup.startReplaceGroup(292181669);
                ChaloSpacersKt.a(paymentModeCardHeaderUiSpec.b, composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(paymentModeCardHeaderUiState, i, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(PaymentCardUiSpec paymentCardUiSpec, List list, ClickableTextUiState clickableTextUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1592408978);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentCardUiSpec) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(clickableTextUiState) ? 256 : 128;
        }
        boolean z = true;
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1592408978, i2, -1, "app.chalo.checkout.ui.payment.PaymentMethodListView (CheckoutItemList.kt:143)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(37556531);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IndividualModeUiState individualModeUiState = (IndividualModeUiState) it.next();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = individualModeUiState.d;
                ModeItemDetailsUiState modeItemDetailsUiState = individualModeUiState.b;
                boolean z2 = uiEventHandler$Companion$fromLambda$1 != null ? z : i3;
                boolean zChanged = composerStartRestartGroup.changed(individualModeUiState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new fi(individualModeUiState, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i5 = i3;
                Iterator it2 = it;
                PaymentMethodListItemKt.b(ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(companion2, z2, null, null, null, (Function0) objRememberedValue, 14, null), paymentCardUiSpec.c), modeItemDetailsUiState.f1518a, modeItemDetailsUiState.b, modeItemDetailsUiState.f, modeItemDetailsUiState.g, modeItemDetailsUiState.d, modeItemDetailsUiState.e, modeItemDetailsUiState.c, composerStartRestartGroup, 0);
                DividerUIState dividerUIState = individualModeUiState.c;
                if (dividerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(540206112);
                } else {
                    composerStartRestartGroup.startReplaceGroup(540206113);
                    DividerUIStateKt.a(ChaloThemeKt.c(companion2, modeItemDetailsUiState.f1518a.g), dividerUIState, composerStartRestartGroup, i5, i5);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i5;
                it = it2;
                z = true;
            }
            int i6 = i3;
            composerStartRestartGroup.endReplaceGroup();
            if (clickableTextUiState == null) {
                composerStartRestartGroup.startReplaceGroup(1165305346);
            } else {
                composerStartRestartGroup.startReplaceGroup(1165305347);
                if (clickableTextUiState.b == null) {
                    composerStartRestartGroup.startReplaceGroup(334428957);
                } else {
                    composerStartRestartGroup.startReplaceGroup(334428958);
                    ChaloFilledButtonKt.d(ChaloThemeKt.c(Modifier.INSTANCE, paymentCardUiSpec.c), clickableTextUiState, composerStartRestartGroup, i6, i6);
                }
                composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bo(paymentCardUiSpec, list, clickableTextUiState, i, 1));
        }
    }

    public static final void f(PaymentCardUiSpec paymentCardUiSpec, List list, ClickableTextUiState clickableTextUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1751260117);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentCardUiSpec) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(clickableTextUiState) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1751260117, i2, -1, "app.chalo.checkout.ui.payment.ScrollablePaymentMethodListView (CheckoutItemList.kt:185)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean zChangedInstance = ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(list) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u(13, list, paymentCardUiSpec, clickableTextUiState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bo(paymentCardUiSpec, list, clickableTextUiState, i, 0));
        }
    }
}
