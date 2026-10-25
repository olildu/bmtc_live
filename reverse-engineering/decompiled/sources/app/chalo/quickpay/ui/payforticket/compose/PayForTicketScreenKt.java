package app.chalo.quickpay.ui.payforticket.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.quickpay.ui.payforticket.PayForTicketComponent;
import app.chalo.quickpay.ui.payforticket.PayForTicketViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.cb;
import defpackage.eq0;
import defpackage.fk0;
import defpackage.fq0;
import defpackage.gf;
import defpackage.nb;
import defpackage.pk0;
import defpackage.qm0;
import defpackage.u50;
import defpackage.zc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PayForTicketScreenKt {
    public static final void a(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(470785549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470785549, i2, -1, "app.chalo.quickpay.ui.payforticket.compose.ChaloPayCard (PayForTicketScreen.kt:93)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, 2, null);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qm0(function1, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(ClickableKt.m299clickableoSLSa3U$default(modifierM786paddingVpY3zN4$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.d(composerStartRestartGroup, 0).c, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, ComposableSingletons$PayForTicketScreenKt.f8891a, composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 5, function1));
        }
    }

    public static final void b(Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(344369091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(344369091, i2, -1, "app.chalo.quickpay.ui.payforticket.compose.FindMyFareCard (PayForTicketScreen.kt:121)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fq0(function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(ClickableKt.m299clickableoSLSa3U$default(modifierM784padding3ABfNKs, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.d(composerStartRestartGroup, 0).c, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, ComposableSingletons$PayForTicketScreenKt.b, composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 6, function1));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-851025464);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851025464, i2, -1, "app.chalo.quickpay.ui.payforticket.compose.MenuWalletIcon (PayForTicketScreen.kt:152)");
            }
            Painter painterA = PainterResourceHelperKt.a(IconType.WALLET_MENU_ICON, composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m2070Iconww6aTOc(painterA, (String) null, (Modifier) null, ChaloTheme.a(composerStartRestartGroup, 0).g, composerStartRestartGroup, Painter.$stable | 48, 4);
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(1672923324);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1672923325);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).d), composerStartRestartGroup, 0);
                i3 = 0;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i3).h), composerStartRestartGroup, i3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(modifier, str, i, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(PayForTicketComponent payForTicketComponent, Composer composer, int i) {
        int i2;
        PayForTicketComponent payForTicketComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818905859);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(payForTicketComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818905859, i2, -1, "app.chalo.quickpay.ui.payforticket.compose.PayForTicketMainScreen (PayForTicketScreen.kt:40)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(payForTicketComponent.t0(), composerStartRestartGroup);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (((PayForTicketViewState) mutableStateA.getValue()).f8890a) {
                composerStartRestartGroup.startReplaceGroup(1649619603);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.endReplaceGroup();
                payForTicketComponent2 = payForTicketComponent;
            } else {
                composerStartRestartGroup.startReplaceGroup(1649672365);
                PayForTicketViewState payForTicketViewState = (PayForTicketViewState) mutableStateA.getValue();
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(payForTicketComponent);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    payForTicketComponent2 = payForTicketComponent;
                    PayForTicketScreenKt$PayForTicketMainScreen$1$1$1 payForTicketScreenKt$PayForTicketMainScreen$1$1$1 = new PayForTicketScreenKt$PayForTicketMainScreen$1$1$1(1, payForTicketComponent2, PayForTicketComponent.class, "processIntent", "processIntent(Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;)V", 0);
                    composerStartRestartGroup.updateRememberedValue(payForTicketScreenKt$PayForTicketMainScreen$1$1$1);
                    objRememberedValue = payForTicketScreenKt$PayForTicketMainScreen$1$1$1;
                } else {
                    payForTicketComponent2 = payForTicketComponent;
                }
                f(payForTicketViewState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            payForTicketComponent2 = payForTicketComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(payForTicketComponent2, i, 16));
        }
    }

    public static final void e(Modifier modifier, Composer composer, int i) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(848005032);
        int i2 = i | 6;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(848005032, i2, -1, "app.chalo.quickpay.ui.payforticket.compose.PayForTicketMainScreenHeading (PayForTicketScreen.kt:172)");
            }
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.PAY_FOR_TICKET_ICON, composerStartRestartGroup, 6), "", PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PAY_FOR_TICKET, new Object[0], composerStartRestartGroup, 6), rowScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 14, null), companion2.getCenterVertically()), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131064);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier2, i, 14));
        }
    }

    public static final void f(PayForTicketViewState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1456957318);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1456957318, i3, -1, "app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreen (PayForTicketScreen.kt:60)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.a(null, null, 0.0f, 0L, ComposableLambdaKt.rememberComposableLambda(-3496411, true, new u50(21, sendIntent, viewState), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24576, 47);
            i4 = 0;
            PlotlineComposeWidgetKt.a(54, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "pay_for_ticket_screen_banner");
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            e(null, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).j), composerStartRestartGroup, 0);
            if (viewState.b) {
                composerStartRestartGroup.startReplaceGroup(347034808);
                a(sendIntent, composerStartRestartGroup, (i3 >> 3) & 14);
                gf.r(companion, ChaloTheme.b(composerStartRestartGroup, 0).g, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(343916146);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (viewState.c) {
                composerStartRestartGroup.startReplaceGroup(347200224);
                b(sendIntent, composerStartRestartGroup, (i3 >> 3) & 14);
            } else {
                composerStartRestartGroup.startReplaceGroup(343916146);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(viewState, sendIntent, i, i4));
        }
    }
}
