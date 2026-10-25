package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.home.ui.history.uistate.MyTicketsLoginNudgeUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.zophop.homescreen.MyTicketsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xk0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20029a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ xk0(float f, int i, Object obj) {
        this.f20029a = i;
        this.c = f;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f20029a;
        Unit unit = Unit.f17538a;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        Object obj4 = this.b;
        float f = this.c;
        switch (i) {
            case 0:
                MyTicketsViewState myTicketsViewState = (MyTicketsViewState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1964594567, iIntValue, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:245)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MyTicketsScreenUIKt.b(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(white), null, 2, null), Dp.m7278constructorimpl(0.7f * f)), myTicketsViewState.i, composer, 64);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, Dp.m7278constructorimpl(f * 0.3f)), 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null), composer, 0);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                MyTicketsViewState myTicketsViewState2 = (MyTicketsViewState) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1358551893, iIntValue2, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:268)");
                    }
                    MyTicketsLoginNudgeUIState myTicketsLoginNudgeUIState = myTicketsViewState2.r;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MyTicketsScreenUIKt.h(myTicketsLoginNudgeUIState, SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion3, ChaloColorTokenKt.c(white), null, 2, null), Dp.m7278constructorimpl(f * 0.6f)), composer2, 0);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion3, Dp.m7278constructorimpl(f * 0.2f)), 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                MyTicketsViewState myTicketsViewState3 = (MyTicketsViewState) obj4;
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1817415631, iIntValue3, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:287)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MyTicketsScreenUIKt.b(SizeKt.m814height3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion4, ChaloColorTokenKt.c(white), null, 2, null), Dp.m7278constructorimpl(f * 0.6f)), myTicketsViewState3.j, composer3, 64);
                    SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion4, Dp.m7278constructorimpl(f * 0.4f)), 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            default:
                return SliderDefaults.TrackImpl_VvwgllI$lambda$29$lambda$28(f, (SliderState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }

    public /* synthetic */ xk0(MyTicketsViewState myTicketsViewState, float f) {
        this.f20029a = 1;
        this.b = myTicketsViewState;
        this.c = f;
    }
}
