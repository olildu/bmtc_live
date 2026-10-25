package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.ads.UnifiedAdSlot;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.base.a;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdRenderer_androidKt;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiStateTracker;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.ridefeedback.data.app.PendingRideFeedbackAppModel;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pr0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19062a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Function g;

    public /* synthetic */ pr0(Object obj, Object obj2, int i, Object obj3, Object obj4, Function function, int i2) {
        this.f19062a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
        this.g = function;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        String strC;
        int i3 = this.f19062a;
        Unit unit = Unit.f17538a;
        Function function = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i3) {
            case 0:
                PagerState pagerState = (PagerState) obj7;
                ArrayList arrayList = (ArrayList) obj6;
                PendingRideFeedbackAppModel pendingRideFeedbackAppModel = (PendingRideFeedbackAppModel) obj5;
                a aVar = (a) obj4;
                n4 n4Var = (n4) function;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (!composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1054164450, iIntValue, -1, "app.chalo.home.ui.common.PendingRideFeedbackCard.<anonymous> (PendingRideFeedbackCard.kt:59)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    StringEnum stringEnum = StringEnum.RATE_YOUR_X_RIDE;
                    if (ComposerKt.isTraceInProgress()) {
                        i = 0;
                        ComposerKt.traceEventStart(76638823, 0, -1, "app.chalo.home.ui.common.productDisplayName (PendingRideFeedbackCard.kt:165)");
                    } else {
                        i = 0;
                    }
                    if (Intrinsics.d(pendingRideFeedbackAppModel.l, "premiumReserveTicket")) {
                        composer.startReplaceGroup(635470315);
                        i2 = 6;
                        strC = StringResourcesHelperKt.c(StringEnum.CHALO_BUS, new Object[i], composer, 6);
                        composer.endReplaceGroup();
                    } else {
                        i2 = 6;
                        composer.startReplaceGroup(635472017);
                        strC = StringResourcesHelperKt.c(StringEnum.RIDE_SMALL_CASE, new Object[i], composer, 6);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Object[] objArr = new Object[1];
                    objArr[i] = strC;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum, objArr, composer, i2), i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.k(ChaloTheme.e(composer, i))), composer, 0, 0, 131068);
                    Modifier modifierClip = ClipKt.clip(SizeKt.wrapContentSize$default(companion, companion2.getTopEnd(), false, 2, null), ChaloTheme.d(composer, 0).b);
                    boolean zChanged = composer.changed(aVar);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new kn0(aVar, 11);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composer, 0).c);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CLOSE, composer, 6), StringResourcesHelperKt.c(StringEnum.CLOSE, new Object[0], composer, 6), SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer, 0).W), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable, 120);
                    composer.endNode();
                    composer.endNode();
                    ChaloSpacersKt.u(composer, 0);
                    PagerKt.m1020HorizontalPager8jOkeI(pagerState, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-721603623, true, new rb(8, arrayList, n4Var), composer, 54), composer, 48, 24576, 16380);
                    if (arrayList.size() > 1) {
                        composer.startReplaceGroup(1253757242);
                        ChaloSpacersKt.t(composer, 0);
                        ChaloDotsIndicatorsKt.a(SizeKt.wrapContentWidth$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getCenterHorizontally(), false, 2, null), ChaloTheme.a(composer, 0).f1915a, ChaloTheme.a(composer, 0).n, arrayList.size(), this.b, composer, 24576);
                    } else {
                        composer.startReplaceGroup(1249533802);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                String str = (String) obj7;
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) obj6;
                MutableState mutableState = (MutableState) obj5;
                RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker = (RegularBusUnifiedAdUiStateTracker) obj4;
                Function1 function1 = (Function1) function;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1318895313, iIntValue2, -1, "app.chalo.home.ui.regularbus.compose.RegularBusScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RegularBusScreenUI.kt:665)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion5, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    UnifiedAdSlot unifiedAdSlot = regularBusPageDisplayItemData.t;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m833width3ABfNKs(companion4, Dp.m7278constructorimpl(((RegularBusUnifiedAdUiState) mutableState.getValue()).c)), 0.0f, 1, null);
                    int i8 = this.b;
                    boolean zChanged2 = composer2.changed(i8) | composer2.changed(mutableState) | composer2.changedInstance(regularBusUnifiedAdUiStateTracker) | composer2.changed(str);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new h01(i8, regularBusUnifiedAdUiStateTracker, str, mutableState);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function2 function2 = (Function2) objRememberedValue2;
                    boolean zChanged3 = composer2.changed(mutableState) | composer2.changedInstance(regularBusUnifiedAdUiStateTracker) | composer2.changed(str);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new rw0(6, regularBusUnifiedAdUiStateTracker, str, mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function3 = (Function1) objRememberedValue3;
                    boolean zChanged4 = composer2.changed(mutableState) | composer2.changedInstance(regularBusUnifiedAdUiStateTracker) | composer2.changed(str);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new m(28, regularBusUnifiedAdUiStateTracker, str, mutableState);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function0 = (Function0) objRememberedValue4;
                    boolean zChanged5 = composer2.changed(function1);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new s01(function1, 5);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    RegularBusUnifiedAdRenderer_androidKt.a(str, unifiedAdSlot, modifierFillMaxHeight$default, function2, function3, function0, (Function1) objRememberedValue5, composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
