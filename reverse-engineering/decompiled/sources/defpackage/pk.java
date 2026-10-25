package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.ui.faredetails.compose.FareRouteAndStopDetailsViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19043a;
    public final /* synthetic */ String b;

    public /* synthetic */ pk(String str, int i) {
        this.f19043a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19043a;
        String str = this.b;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-410831238, iIntValue, -1, "app.chalo.compose.components.ChaloLoadingDialog.<anonymous> (ChaloLoadingDialog.kt:87)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null), ChaloTheme.b(composer, 6).j);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 6).i, 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM786paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2278CircularProgressIndicator4lLiAd8(null, ChaloTheme.a(composer, 6).f1915a, 0.0f, 0L, 0, 0.0f, composer, 0, 61);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer, 6).k), composer, 0);
                    TextKt.m2623TextNvy7gAk(this.b, null, ChaloTheme.a(composer, 6).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 6).getBodyMedium(), composer, 0, 0, 131066);
                    if (r1.k(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(173181267, iIntValue2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsScreen.<anonymous>.<anonymous> (FareDetailsScreen.kt:51)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2053705046, iIntValue3, -1, "app.chalo.instantticket.ui.faredetails.compose.RouteAndStopDetailsCard.<anonymous>.<anonymous>.<anonymous> (FareRouteAndStopDetailsView.kt:87)");
                    }
                    FareRouteAndStopDetailsViewKt.a(composer3, 0, str);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    composer4.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(153788567, iIntValue4, -1, "app.chalo.instantticket.ui.faredetails.compose.RouteAndStopDetailsCard.<anonymous>.<anonymous>.<anonymous> (FareRouteAndStopDetailsView.kt:88)");
                    }
                    FareRouteAndStopDetailsViewKt.a(composer4, 0, str);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    composer5.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1564385388, iIntValue5, -1, "app.chalo.ads.NativeInlineCardAd.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeInlineAdTemplates.kt:364)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, ChaloTheme.a(composer5, 6).v0, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTheme.e(composer5, 6).getBodySmall(), composer5, 0, 24960, 110586);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    composer6.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(925797580, iIntValue6, -1, "app.chalo.ads.NativeInlineCardAd.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeInlineAdTemplates.kt:379)");
                    }
                    TextKt.m2623TextNvy7gAk(str.concat(" >"), null, ChaloTheme.a(composer6, 6).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer6, 6).getLabelMedium(), composer6, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    composer7.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1472544181, iIntValue7, -1, "app.chalo.ads.NativeInlineHeroAd.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeInlineAdTemplates.kt:207)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer7, 6).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTheme.e(composer7, 6).getBodySmall(), composer7, 48, 24960, 109560);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    composer8.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1241948285, iIntValue8, -1, "app.chalo.ads.NativeInlineCardAd.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeInlineAdTemplates.kt:352)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, ChaloTheme.a(composer8, 6).g, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTheme.e(composer8, 6).getTitleSmall(), composer8, 0, 24960, 110586);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    composer9.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1113882251, iIntValue9, -1, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.EnterAmountField.<anonymous>.<anonymous> (NcmcOnlineRechargeScreen.kt:300)");
                    }
                    String str2 = this.b;
                    if (str2 == null) {
                        composer9.startReplaceGroup(-748768949);
                        composer9.endReplaceGroup();
                    } else {
                        composer9.startReplaceGroup(-748768948);
                        TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composer9, 0).k, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer9, 0)), composer9, 0, 0, 131066);
                        composer9.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    composer10.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1443986982, iIntValue10, -1, "app.chalo.core.compose.DetailRow.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:283)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer10, MaterialTheme.$stable).getBodyMedium(), composer10, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
