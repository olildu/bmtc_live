package defpackage;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.livetracking.tripplanner.ui.result.ui.ComposableSingletons$TripPlannerResultsScreenKt;
import app.chalo.titoridedetail.ui.TITORideDetailScreenType;
import app.chalo.titoridedetail.ui.TitoRideDetailsIntent;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.ExoPlayerComposableKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lj1 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18320a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lj1(TitoRideDetailsViewState titoRideDetailsViewState, BottomSheetScaffoldState bottomSheetScaffoldState, Function1 function1, SheetState sheetState, ExoPlayer exoPlayer, boolean z) {
        this.d = titoRideDetailsViewState;
        this.e = bottomSheetScaffoldState;
        this.b = function1;
        this.f = sheetState;
        this.g = exoPlayer;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f18320a) {
            case 0:
                TitoRideDetailsViewState titoRideDetailsViewState = (TitoRideDetailsViewState) this.d;
                BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) this.e;
                SheetState sheetState = (SheetState) this.f;
                final ExoPlayer exoPlayer = (ExoPlayer) this.g;
                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                TITORideDetailScreenType viewType = (TITORideDetailScreenType) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.i(viewType, "viewType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1959799795, iIntValue, -1, "app.chalo.titoridedetail.ui.compose.TitoRideDetailScreen.<anonymous> (TitoRideDataScreen.kt:229)");
                }
                int i = TitoRideDataScreenKt.WhenMappings.f9729a[viewType.ordinal()];
                final Function1 function1 = this.b;
                if (i == 1) {
                    composer.startReplaceGroup(-1389616013);
                    TitoRideDataScreenKt.n(0, bottomSheetScaffoldState, composer, titoRideDetailsViewState, function1);
                    composer.endReplaceGroup();
                } else if (i == 2) {
                    composer.startReplaceGroup(-1389294264);
                    TitoRideDataScreenKt.a(sheetState, titoRideDetailsViewState, function1, composer, 0);
                    composer.endReplaceGroup();
                } else if (i == 3) {
                    composer.startReplaceGroup(-1388995703);
                    ExoPlayerComposableKt.a(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), exoPlayer, this.c, false, composer, 3078);
                    exoPlayer.setPlayWhenReady(true);
                    function1.invoke(TitoRideDetailsIntent.TitoOnboardingTutorialStartedIntent.f9722a);
                    composer.endReplaceGroup();
                } else {
                    if (i != 4) {
                        throw pk0.p(composer, -2123037494);
                    }
                    composer.startReplaceGroup(-1388531695);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zChangedInstance = composer.changedInstance(exoPlayer) | composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final int i2 = 0;
                        objRememberedValue = new Function0() { // from class: mj1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        ExoPlayer exoPlayer2 = exoPlayer;
                                        exoPlayer2.stop();
                                        exoPlayer2.release();
                                        function1.invoke(TitoRideDetailsIntent.TitoOnboardingGotItButtonClickIntent.f9720a);
                                        break;
                                    default:
                                        exoPlayer.seekTo(0L);
                                        function1.invoke(TitoRideDetailsIntent.ReplayTutorialButtonClickIntent.f9715a);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean zChangedInstance2 = composer.changedInstance(exoPlayer) | composer.changed(function1);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final int i3 = 1;
                        objRememberedValue2 = new Function0() { // from class: mj1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        ExoPlayer exoPlayer2 = exoPlayer;
                                        exoPlayer2.stop();
                                        exoPlayer2.release();
                                        function1.invoke(TitoRideDetailsIntent.TitoOnboardingGotItButtonClickIntent.f9720a);
                                        break;
                                    default:
                                        exoPlayer.seekTo(0L);
                                        function1.invoke(TitoRideDetailsIntent.ReplayTutorialButtonClickIntent.f9715a);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    TitoRideDataScreenKt.l(6, composer, modifierFillMaxSize$default, function0, (Function0) objRememberedValue2);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.f17538a;
            default:
                final List list = (List) this.d;
                final TripPlannerTabType tripPlannerTabType = (TripPlannerTabType) this.e;
                Modifier modifier = (Modifier) this.f;
                final Function0 function2 = (Function0) this.g;
                LazyItemScope stickyHeader = (LazyItemScope) obj;
                ((Integer) obj2).getClass();
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader, "$this$stickyHeader");
                if (composer2.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-27858000, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerQuickFilterTab.<anonymous> (TripPlannerResultsScreen.kt:537)");
                    }
                    int iIndexOf = list.indexOf(tripPlannerTabType);
                    if (iIndexOf != -1) {
                        Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composer2, 0).n, null, 2, null), ChaloTheme.b(composer2, 0).h, ChaloTheme.b(composer2, 0).h);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM785paddingVpY3zN4);
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
                        pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                        final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        long j = ChaloTheme.a(composer2, 0).n;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        float f = ChaloTheme.b(composer2, 0).f1916a;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1557994502, true, new zq0(iIndexOf, 1), composer2, 54);
                        ComposableLambda composableLambda = ComposableSingletons$TripPlannerResultsScreenKt.d;
                        final Function1 function3 = this.b;
                        final boolean z = this.c;
                        TabRowKt.m2528ScrollableTabRowsKfQg0A(iIndexOf, modifierFillMaxWidth$default, j, 0L, f, composableLambdaRememberComposableLambda, composableLambda, ComposableLambdaKt.rememberComposableLambda(-271462906, true, new Function2() { // from class: xl1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                int i5 = 2;
                                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-271462906, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerQuickFilterTab.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:562)");
                                    }
                                    int i6 = 0;
                                    for (Object obj7 : list) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        TripPlannerTabType tripPlannerTabType2 = (TripPlannerTabType) obj7;
                                        TripPlannerTabType tripPlannerTabType3 = tripPlannerTabType;
                                        boolean zD = Intrinsics.d(tripPlannerTabType2, tripPlannerTabType3);
                                        Function1 function4 = function3;
                                        boolean zChanged = composer3.changed(function4) | composer3.changed(tripPlannerTabType2);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new da1(27, function4, tripPlannerTabType2);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        TabKt.m2513TabbogVsAg(zD, (Function0) objRememberedValue3, pk0.d("PL_Filter_Tab_", i6, PaddingKt.m786paddingVpY3zN4$default(ClipKt.clip(SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(dq.a(columnScopeInstance, ZIndexModifierKt.zIndex(Modifier.INSTANCE, Intrinsics.d(tripPlannerTabType2, tripPlannerTabType3) ? 2.0f : 0.0f), 1.0f, false, 2, null), ChaloTheme.b(composer3, 0).m, 0.0f, i5, null), ChaloTheme.b(composer3, 0).A, 0.0f, i5, null), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composer3, 0).d, 0.0f, i5, null)), false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1420598670, true, new ao(z, tripPlannerTabType2, tripPlannerTabType3, function2, 4), composer3, 54), composer3, 12582912, 120);
                                        i6 = i7;
                                        i5 = i5;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer2, 54), composer2, 14352432, 8);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ lj1(List list, TripPlannerTabType tripPlannerTabType, Modifier modifier, Function1 function1, boolean z, Function0 function0) {
        this.d = list;
        this.e = tripPlannerTabType;
        this.f = modifier;
        this.b = function1;
        this.c = z;
        this.g = function0;
    }
}
