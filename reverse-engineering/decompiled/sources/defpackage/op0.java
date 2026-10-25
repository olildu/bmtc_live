package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.premiumbus.compose.ProductOfferBadgeKt;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.productpurchase.passselection.ui.BookableConfigItemUISpec;
import app.chalo.productpurchase.passselection.ui.PassCategorySectionItemUIState;
import app.chalo.productpurchase.productselection.ui.RecentProductItemTagText;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.text.TextUIState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class op0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18661a;
    public final /* synthetic */ PassCategorySectionItemUIState.BookableConfigItemUIState b;

    public /* synthetic */ op0(PassCategorySectionItemUIState.BookableConfigItemUIState bookableConfigItemUIState, int i) {
        this.f18661a = i;
        this.b = bookableConfigItemUIState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        int i;
        int i2 = this.f18661a;
        Unit unit = Unit.f17538a;
        int i3 = 0;
        PassCategorySectionItemUIState.BookableConfigItemUIState bookableConfigItemUIState = this.b;
        char c = 1;
        switch (i2) {
            case 0:
                ColumnScope Card = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1788879124, iIntValue, -1, "app.chalo.productpurchase.passselection.ui.BookablePassConfigItem.<anonymous> (PassSelectionScreen.kt:307)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    float f = bookableConfigItemUIState.k;
                    TextUIState textUIState = bookableConfigItemUIState.f;
                    TextUIState textUIState2 = bookableConfigItemUIState.g;
                    OfferTagUIState offerTagUIState = bookableConfigItemUIState.e;
                    BookableConfigItemUISpec bookableConfigItemUISpec = bookableConfigItemUIState.f8525a;
                    Modifier modifierC = ChaloThemeKt.c(ComposeUtilsKt.b(ClipKt.clip(AlphaKt.alpha(modifierFillMaxWidth$default, f), ChaloThemeKt.d(bookableConfigItemUISpec.f8522a.f9924a)), bookableConfigItemUIState.j, composer, 0, 6), bookableConfigItemUISpec.b);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    FlowLayoutKt.FlowRow(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), null, null, null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1120986541, true, new op0(bookableConfigItemUIState, c == true ? 1 : 0), composer, 54), composer, 1572864, 62);
                    Composer composer2 = composer;
                    TextUIState textUIState3 = bookableConfigItemUIState.d;
                    if (textUIState3 == null) {
                        composer2.startReplaceGroup(938775936);
                    } else {
                        composer2.startReplaceGroup(938775937);
                        TextKt.c(textUIState3, ChaloThemeKt.c(companion2, bookableConfigItemUISpec.c), null, null, composer2, 0, 12);
                    }
                    composer2.endReplaceGroup();
                    TextKt.c(bookableConfigItemUIState.c, null, null, null, composer2, 0, 14);
                    composer2.endNode();
                    if (textUIState2 == null && textUIState == null && offerTagUIState == null) {
                        composer2.startReplaceGroup(1356047864);
                        composer2.endReplaceGroup();
                        companion = companion2;
                    } else {
                        composer2.startReplaceGroup(1367407132);
                        Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bookableConfigItemUISpec.d);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i6 = (int) ((currentCompositeKeyHashCode3 >>> 32) ^ currentCompositeKeyHashCode3);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierC2);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                        pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                        if (textUIState2 != null) {
                            composer2.startReplaceGroup(1453669849);
                            TextKt.c(bookableConfigItemUIState.g, null, null, null, composer2, 0, 14);
                            composer2.endReplaceGroup();
                            companion = companion2;
                            i = 0;
                        } else {
                            composer2.startReplaceGroup(1453739630);
                            companion = companion2;
                            i = 0;
                            SpacerKt.Spacer(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        if (offerTagUIState != null) {
                            composer2.startReplaceGroup(1453869427);
                            Modifier modifierC3 = ChaloThemeKt.c(companion, bookableConfigItemUISpec.f);
                            int i7 = OfferTagUIState.e;
                            ProductOfferBadgeKt.a(offerTagUIState, modifierC3, composer2, i, i);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1454146691);
                            if (textUIState == null) {
                                composer2.startReplaceGroup(1454146690);
                            } else {
                                composer2.startReplaceGroup(1454146691);
                                TextKt.c(bookableConfigItemUIState.f, null, null, null, composer2, 0, 14);
                            }
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    if (bookableConfigItemUIState.h == null) {
                        composer2.startReplaceGroup(1368334372);
                    } else {
                        composer2.startReplaceGroup(1368334373);
                        TextKt.c(bookableConfigItemUIState.h, ChaloThemeKt.c(companion, bookableConfigItemUISpec.e), null, null, composer2, 0, 12);
                    }
                    composer2.endReplaceGroup();
                    List list = bookableConfigItemUIState.l;
                    if (list == null) {
                        composer2.startReplaceGroup(1368569197);
                    } else {
                        composer2.startReplaceGroup(1368569198);
                        if (list.isEmpty()) {
                            composer2.startReplaceGroup(1053825554);
                        } else {
                            composer2.startReplaceGroup(1066397387);
                            ChaloSpacersKt.o(composer2, 0);
                            FlowLayoutKt.FlowRow(null, arrangement.m672spacedBy0680j_4(ChaloTheme.b(composer2, 0).f), arrangement.m672spacedBy0680j_4(ChaloTheme.b(composer2, 0).f), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(395124816, true, new si0(list, 1), composer2, 54), composer2, 1572864, 57);
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer3.changed(FlowRow) ? 4 : 2;
                }
                if (!composer3.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1120986541, iIntValue2, -1, "app.chalo.productpurchase.passselection.ui.BookablePassConfigItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:317)");
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState = bookableConfigItemUIState.b;
                    BookableConfigItemUISpec bookableConfigItemUISpec2 = bookableConfigItemUIState.f8525a;
                    TextKt.c(chaloTextUIState, null, null, null, composer3, 0, 14);
                    ChaloSpacersKt.a(bookableConfigItemUISpec2.g, composer3, 0);
                    ArrayList arrayList = bookableConfigItemUIState.i;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj4 = arrayList.get(i3);
                        i3++;
                        RecentProductItemTagText recentProductItemTagText = (RecentProductItemTagText) obj4;
                        TextKt.c(recentProductItemTagText.f8700a, ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(FlowRow.align(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, bookableConfigItemUISpec2.h, 0.0f, 2, null), Alignment.INSTANCE.getCenterVertically()), ChaloColorTokenKt.c(recentProductItemTagText.b), null, 2, null), recentProductItemTagText.c), null, null, composer3, 0, 12);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
