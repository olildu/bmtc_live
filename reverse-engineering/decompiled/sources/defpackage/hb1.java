package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreenKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.OriginDestinationSearchCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerResultBottomSheetUiStateType;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerResultScreenState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hb1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15810a;
    public final /* synthetic */ StopBasedTripPlannerUiState b;

    public /* synthetic */ hb1(StopBasedTripPlannerUiState stopBasedTripPlannerUiState, int i) {
        this.f15810a = i;
        this.b = stopBasedTripPlannerUiState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15810a) {
            case 0:
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1031266879, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:254)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    StopBasedTripPlannerUiState stopBasedTripPlannerUiState = this.b;
                    OriginDestinationSearchCardKt.a(ChaloThemeKt.c(modifierFillMaxWidth$default, stopBasedTripPlannerUiState.f4615a.c), stopBasedTripPlannerUiState.d, composer, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 1:
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-900035926, iIntValue2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:263)");
                    }
                    ChaloSpacersKt.a(this.b.f4615a.e, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 2:
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1737823113, iIntValue3, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:271)");
                    }
                    ChaloSpacersKt.a(this.b.f4615a.f, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 3:
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(item4, "$this$item");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1001480198, iIntValue4, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:276)");
                    }
                    StandardErrorScreenKt.c(((TripPlannerResultScreenState.Results) this.b.e).d, SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f), composer4, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 4:
                LazyItemScope item5 = (LazyItemScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(item5, "$this$item");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(422652373, iIntValue5, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:301)");
                    }
                    DividerUIState dividerUIState = ((TripPlannerResultScreenState.Results) this.b.e).b;
                    if (dividerUIState == null) {
                        composer5.startReplaceGroup(-1607179943);
                    } else {
                        composer5.startReplaceGroup(-1607179942);
                        DividerUIStateKt.a(null, dividerUIState, composer5, 0, 1);
                    }
                    composer5.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                ColumnScope ModalBottomSheet = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(598440923, iIntValue6, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopBasedTripPlannerResultScreen.<anonymous> (StopBasedTripPlannerResultScreen.kt:182)");
                    }
                    StopBasedTripPlannerResultBottomSheetUiStateType stopBasedTripPlannerResultBottomSheetUiStateType = this.b.f;
                    if (Intrinsics.d(stopBasedTripPlannerResultBottomSheetUiStateType, StopBasedTripPlannerResultBottomSheetUiStateType.None.b)) {
                        composer6.startReplaceGroup(-255588507);
                        composer6.endReplaceGroup();
                    } else if (stopBasedTripPlannerResultBottomSheetUiStateType instanceof StopBasedTripPlannerResultBottomSheetUiStateType.NearestStops) {
                        composer6.startReplaceGroup(-255494174);
                        StopBasedTripPlannerSearchScreenKt.b(((StopBasedTripPlannerResultBottomSheetUiStateType.NearestStops) stopBasedTripPlannerResultBottomSheetUiStateType).c, composer6, 0);
                        composer6.endReplaceGroup();
                    } else if (stopBasedTripPlannerResultBottomSheetUiStateType instanceof StopBasedTripPlannerResultBottomSheetUiStateType.NearestStopFetchError) {
                        composer6.startReplaceGroup(-255142138);
                        StopBasedTripPlannerResultScreenKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((StopBasedTripPlannerResultBottomSheetUiStateType.NearestStopFetchError) stopBasedTripPlannerResultBottomSheetUiStateType).b, composer6, 6);
                        composer6.endReplaceGroup();
                    } else if (stopBasedTripPlannerResultBottomSheetUiStateType instanceof StopBasedTripPlannerResultBottomSheetUiStateType.NoNearestStops) {
                        composer6.startReplaceGroup(-254831456);
                        StopBasedTripPlannerResultScreenKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((StopBasedTripPlannerResultBottomSheetUiStateType.NoNearestStops) stopBasedTripPlannerResultBottomSheetUiStateType).b, composer6, 6);
                        composer6.endReplaceGroup();
                    } else {
                        if (!(stopBasedTripPlannerResultBottomSheetUiStateType instanceof StopBasedTripPlannerResultBottomSheetUiStateType.LiveTrackingNotSupported)) {
                            throw pk0.p(composer6, -423888775);
                        }
                        composer6.startReplaceGroup(-254505057);
                        StopBasedTripPlannerResultScreenKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ((StopBasedTripPlannerResultBottomSheetUiStateType.LiveTrackingNotSupported) stopBasedTripPlannerResultBottomSheetUiStateType).b, composer6, 6);
                        composer6.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }
}
