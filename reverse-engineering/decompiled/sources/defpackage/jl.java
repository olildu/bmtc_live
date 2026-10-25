package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegInfoCardSectionKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSectionKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jl implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17416a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jl(Object obj, int i, Function function, Object obj2, int i2) {
        this.f17416a = i2;
        this.c = obj;
        this.b = i;
        this.d = function;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM4640getTransparent0d7_KjU;
        Composer composer;
        int i;
        int i2 = this.f17416a;
        Unit unit = Unit.f17538a;
        Function function = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                PagerState pagerState = (PagerState) obj4;
                Function5 function5 = (Function5) function;
                ColumnScope Tab = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Tab, "$this$Tab");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1267357683, iIntValue, -1, "app.chalo.compose.components.ChaloScrollableTabRow.<anonymous>.<anonymous>.<anonymous> (ChaloScrollableTabRow.kt:74)");
                    }
                    Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer2, 6).m, 0.0f, 2, null), ChaloTheme.b(composer2, 6).A, 0.0f, 2, null);
                    int currentPage = pagerState.getCurrentPage();
                    int i3 = this.b;
                    if (currentPage != i3) {
                        composer2.startReplaceGroup(1839989590);
                        jM4640getTransparent0d7_KjU = ChaloTheme.a(composer2, 6).A;
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1839990264);
                        composer2.endReplaceGroup();
                        jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
                    }
                    Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(modifierM835widthInVpY3zN4$default, jM4640getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM263backgroundbw27NRU);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    function5.invoke(BoxScopeInstance.INSTANCE, this.e, Integer.valueOf(i3), composer2, 6);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            default:
                TripPlannerLegUiModel.Bus bus = (TripPlannerLegUiModel.Bus) obj4;
                Function1 function1 = (Function1) function;
                String str = (String) this.e;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (!composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer3.skipToGroupEnd();
                    return unit;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-988091983, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCard.<anonymous> (TripPlannerDetailsBusLegCard.kt:62)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, ChaloTheme.b(composer3, 0).h, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM786paddingVpY3zN4$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i6 = TripPlannerDetailsBusLegCardKt.WhenMappings.f4750a[bus.r.ordinal()];
                int i7 = this.b;
                if (i6 != 1) {
                    if (i6 == 2) {
                        composer3.startReplaceGroup(-759498967);
                        TripPlannerDetailsBusLegCardKt.e(null, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        if (i6 != 3) {
                            throw pk0.p(composer3, -301615343);
                        }
                        composer3.startReplaceGroup(-759397659);
                        composer3.endReplaceGroup();
                    }
                    i = 0;
                    composer = composer3;
                } else {
                    composer3.startReplaceGroup(-760058331);
                    ItineraryLegInfoCardSectionKt.a(bus.b, bus.f, bus.c, bus.d, bus.g, PlotlineComposeWidgetKt.a(companion2, "PL_Bus_Info_Card_" + i7), ComposableLambdaKt.rememberComposableLambda(-597649767, true, new ti1(bus, 3), composer3, 54), composer3, 1572864, 0);
                    composer = composer3;
                    composer.endReplaceGroup();
                    i = 0;
                }
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer, i).g), composer, i);
                TripPlannerDetailsBusLegCardKt.d(bus.h, bus.j, bus.i, bus.q, PaddingKt.m786paddingVpY3zN4$default(companion2, ChaloTheme.b(composer, i).h, 0.0f, 2, null), i7, composer, 0);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer, i).h), composer, i);
                List list = bus.k;
                String str2 = bus.l;
                String str3 = bus.m;
                int i8 = bus.p;
                Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer, i).h, 0.0f, 2, null);
                boolean zChanged = composer.changed(i7);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new wl(i7, 25);
                    composer.updateRememberedValue(objRememberedValue);
                }
                ItineraryLegStopListSectionKt.c(str2, str3, i8, list, modifierM786paddingVpY3zN4$default2, i7, (Function2) objRememberedValue, composer, 0);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer, 0).h), composer, 0);
                RouteServiceType routeServiceType = bus.r;
                String str4 = bus.n;
                String str5 = bus.o;
                boolean zChanged2 = composer.changed(function1) | composer.changed(i7);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new cf(i7, 5, function1);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                boolean zChanged3 = composer.changed(function1) | composer.changed(str);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new w60(10, str, function1);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                TripPlannerDetailsBusLegCardKt.c(routeServiceType, str4, str5, function0, (Function0) objRememberedValue3, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null), i7, composer, 0);
                composer.endNode();
                if (!ComposerKt.isTraceInProgress()) {
                    return unit;
                }
                ComposerKt.traceEventEnd();
                return unit;
        }
    }
}
