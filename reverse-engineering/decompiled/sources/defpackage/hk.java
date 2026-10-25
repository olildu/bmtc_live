package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.ChaloTextViewStateKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hk implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15834a;
    public final /* synthetic */ ButtonUIState b;

    public /* synthetic */ hk(ButtonUIState buttonUIState, int i) {
        this.f15834a = i;
        this.b = buttonUIState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15834a;
        Unit unit = Unit.f17538a;
        ButtonUIState buttonUIState = this.b;
        switch (i) {
            case 0:
                RowScope Button = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Button, "$this$Button");
                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2126746507, iIntValue, -1, "app.chalo.compose.components.buttons.ChaloButton.<anonymous> (ChaloFilledButton.kt:78)");
                    }
                    TextUIState.ChaloTextUIState chaloTextUIState = buttonUIState.f9920a;
                    String str = chaloTextUIState.b;
                    TextStyle textStyleF = ChaloThemeKt.f(chaloTextUIState.c, composer, 0);
                    UIFontWeight uIFontWeight = chaloTextUIState.h;
                    FontWeight fontWeightC = uIFontWeight != null ? ChaloTextViewStateKt.c(uIFontWeight) : null;
                    ChaloColorToken chaloColorToken = chaloTextUIState.d;
                    TextKt.m2623TextNvy7gAk(str, null, chaloColorToken != null ? ChaloColorTokenKt.c(chaloColorToken) : Color.INSTANCE.m4641getUnspecified0d7_KjU(), null, 0L, null, fontWeightC, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleF, composer, 0, 24960, 110522);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                RowScope ChaloButtonWithCustomContent = (RowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloButtonWithCustomContent, "$this$ChaloButtonWithCustomContent");
                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(688431004, iIntValue2, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PbProductItemCardPlanHighlightComposable.<anonymous>.<anonymous>.<anonymous> (PBProductCardComposable.kt:287)");
                    }
                    ChaloTextViewKt.a(null, buttonUIState.f9920a, null, null, composer2, 0, 13);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                ColumnScope Card = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (!composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-170490719, iIntValue3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusSimpleFareDetailsFooter.<anonymous> (PremiumBusFareDetailsCommonViews.kt:168)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer3, 0).t, null, 2, null), ChaloTheme.b(composer3, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1739727017);
                    composer3.endReplaceGroup();
                    if (b3.s(6, 0, composer3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
