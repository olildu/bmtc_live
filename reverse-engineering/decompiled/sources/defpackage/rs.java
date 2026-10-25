package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.qr.QrCodeComponentKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.history.compose.components.ChaloBusTicketViewKt;
import app.chalo.home.ui.history.compose.components.ChaloPassViewKt;
import app.chalo.home.ui.history.compose.components.RegularBusActiveTicketViewKt;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketsUiState;
import app.chalo.home.ui.history.uistate.pass.BusPassUiState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseBanner;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRCodeUISpecs;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRCodeUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.TicketValidationInfoUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rs implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19239a;
    public final /* synthetic */ List b;

    public /* synthetic */ rs(List list, int i) {
        this.f19239a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        TextStyle headlineSmall;
        int i = this.f19239a;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        Unit unit = Unit.f17538a;
        List list = this.b;
        switch (i) {
            case 0:
                PagerScope HorizontalPager = (PagerScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-983022326, iIntValue2, -1, "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassBannersSection.<anonymous>.<anonymous> (ConfirmSuperPassScreen.kt:867)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ConfirmSuperPassPurchaseBanner confirmSuperPassPurchaseBanner = (ConfirmSuperPassPurchaseBanner) list.get(iIntValue);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                ConfirmSuperPassScreenKt.a(modifierFillMaxWidth$default, confirmSuperPassPurchaseBanner, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 1:
                LazyItemScope items = (LazyItemScope) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                Intrinsics.i(items, "$this$items");
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if (composer2.shouldExecute((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1648213304, iIntValue4, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:358)");
                    }
                    BusTicketsUiState busTicketsUiState = (BusTicketsUiState) list.get(iIntValue3);
                    if (busTicketsUiState instanceof BusTicketsUiState.ChaloBus) {
                        composer2.startReplaceGroup(-1856244717);
                        ChaloBusTicketViewKt.a(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(white), null, 2, null), ((BusTicketsUiState.ChaloBus) busTicketsUiState).f3496a, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(busTicketsUiState instanceof BusTicketsUiState.RegularBus)) {
                            throw pk0.p(composer2, 909949518);
                        }
                        composer2.startReplaceGroup(-1855812484);
                        RegularBusActiveTicketViewKt.a(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(white), null, 2, null), ((BusTicketsUiState.RegularBus) busTicketsUiState).f3497a, composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                LazyItemScope items2 = (LazyItemScope) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                Intrinsics.i(items2, "$this$items");
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= composer3.changed(iIntValue5) ? 32 : 16;
                }
                if (composer3.shouldExecute((iIntValue6 & 145) != 144, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(690607079, iIntValue6, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:428)");
                    }
                    ChaloPassViewKt.b(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(white), null, 2, null), (BusPassUiState) list.get(iIntValue5), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                Modifier unused$var$ = (Modifier) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                Intrinsics.i(unused$var$, "$unused$var$");
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= composer4.changed(iIntValue7) ? 32 : 16;
                }
                if (composer4.shouldExecute((iIntValue8 & 145) != 144, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1031707377, iIntValue8, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusRouteListDialogue.<anonymous>.<anonymous>.<anonymous> (PremiumBusRouteListDialogue.kt:106)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (iIntValue7 == 0 || iIntValue7 == CollectionsKt.K(list)) {
                        composer4.startReplaceGroup(329172550);
                        headlineSmall = ChaloTheme.e(composer4, 0).getHeadlineSmall();
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(329174723);
                        headlineSmall = ChaloTheme.e(composer4, 0).getBodyMedium();
                        composer4.endReplaceGroup();
                    }
                    TextKt.m2623TextNvy7gAk((String) list.get(iIntValue7), null, ChaloTheme.a(composer4, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, headlineSmall, composer4, 0, 0, 131066);
                    if (iIntValue7 < CollectionsKt.K(list)) {
                        composer4.startReplaceGroup(1614775548);
                        gf.r(companion, ChaloTheme.b(composer4, 0).i, composer4, 0);
                    } else {
                        composer4.startReplaceGroup(1610091913);
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            default:
                PagerScope HorizontalPager2 = (PagerScope) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager2, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(379645982, iIntValue10, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.SwipeableQrCodes.<anonymous>.<anonymous> (QRValidationScreen.kt:609)");
                }
                QRCodeUIState qRCodeUIState = ((TicketValidationInfoUIState) list.get(iIntValue9)).f10659a;
                QRCodeUISpecs qRCodeUISpecs = qRCodeUIState.f10631a;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                QrCodeComponentKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ComposeUtilsKt.b(SizeKt.m828size3ABfNKs(companion3, qRCodeUISpecs.f10630a), qRCodeUIState.d, composer5, 0, 6), qRCodeUIState.b, composer5, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
        }
    }
}
