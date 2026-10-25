package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.carousel.CarouselItemDrawInfoImpl;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselState;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.home.HomeTabUnifiedAdRenderer_androidKt;
import app.chalo.home.ui.home.HomeUnifiedAdUiState;
import app.chalo.home.ui.home.HomeUnifiedAdUiStateTracker;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bg implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11194a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bg(int i, List list, PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType, Function1 function1, MutableState mutableState) {
        this.b = i;
        this.c = list;
        this.d = pbBulkBookingRideDetailsTabType;
        this.e = function1;
        this.f = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f11194a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                return CarouselKt.carouselItem$lambda$26((Function0) obj7, (CarouselState) obj6, this.b, (CarouselItemDrawInfoImpl) obj5, (Shape) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 1:
                String str = (String) obj7;
                MutableState mutableState = (MutableState) obj6;
                HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker = (HomeUnifiedAdUiStateTracker) obj5;
                Function1 function1 = (Function1) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1103587489, iIntValue, -1, "app.chalo.home.ui.home.HomeScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeTabScaffold.kt:639)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m833width3ABfNKs(companion, Dp.m7278constructorimpl(((HomeUnifiedAdUiState) mutableState.getValue()).c)), 0.0f, 1, null);
                    int i3 = this.b;
                    boolean zChanged = composer.changed(i3) | composer.changed(mutableState) | composer.changedInstance(homeUnifiedAdUiStateTracker) | composer.changed(str);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ir(i3, homeUnifiedAdUiStateTracker, str, mutableState);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function2 function2 = (Function2) objRememberedValue;
                    boolean zChanged2 = composer.changed(mutableState) | composer.changedInstance(homeUnifiedAdUiStateTracker) | composer.changed(str);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new u(27, homeUnifiedAdUiStateTracker, str, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function3 = (Function1) objRememberedValue2;
                    boolean zChanged3 = composer.changed(mutableState) | composer.changedInstance(homeUnifiedAdUiStateTracker) | composer.changed(str);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new m(14, homeUnifiedAdUiStateTracker, str, mutableState);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    boolean zChanged4 = composer.changed(function1);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new nu(function1, 12);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    HomeTabUnifiedAdRenderer_androidKt.a(str, modifierFillMaxHeight$default, function2, function3, function0, (Function1) objRememberedValue4, composer, 0);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            default:
                List list = (List) obj7;
                PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType = (PbBulkBookingRideDetailsTabType) obj6;
                Function1 function4 = (Function1) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(209530605, iIntValue2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.UpcomingAndPastRidesFilterTab.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1146)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(companion3, "PL_Upcoming_Past_Ride_Tab"), 0.0f, 1, null), ChaloTheme.b(composer2, 0).h);
                    int i5 = this.b;
                    TabRowKt.m2534TabRowpAZo6Ak(i5, modifierM784padding3ABfNKs, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1901148677, true, new zq0(i5, 0), composer2, 54), ComposableSingletons$PbBulkBookingRideDetailsScreenKt.g, ComposableLambdaKt.rememberComposableLambda(-507381765, true, new l9(list, columnScopeInstance, pbBulkBookingRideDetailsTabType, function4, 6), composer2, 54), composer2, 1794048, 12);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(1560412991);
                    } else {
                        composer2.startReplaceGroup(1608453691);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ bg(String str, int i, MutableState mutableState, HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker, Function1 function1) {
        this.c = str;
        this.b = i;
        this.d = mutableState;
        this.e = homeUnifiedAdUiStateTracker;
        this.f = function1;
    }

    public /* synthetic */ bg(Function0 function0, CarouselState carouselState, int i, CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, Shape shape) {
        this.c = function0;
        this.d = carouselState;
        this.b = i;
        this.e = carouselItemDrawInfoImpl;
        this.f = shape;
    }
}
