package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabsUiState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19199a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ rd0(Object obj, int i, int i2) {
        this.f19199a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19199a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return LazyGridIntervalContent.stickyHeader$lambda$2((Function4) this.b, this.c, (LazyGridItemScope) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return LazyListIntervalContent.stickyHeader$lambda$1((Function4) this.b, this.c, (LazyItemScope) obj, (Composer) obj2, iIntValue2);
            default:
                TabsUiState tabsUiState = (TabsUiState) this.b;
                List tabPositions = (List) obj;
                Composer composer = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(tabPositions, "tabPositions");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2052508002, iIntValue3, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUI.<anonymous> (TripPlannerTabUI.kt:36)");
                }
                List list = tabsUiState.b;
                int i = this.c;
                TabItemUiState tabItemUiState = (TabItemUiState) list.get(i);
                TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                tabRowDefaults.m2520Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, (TabPosition) tabPositions.get(i)), 0.0f, ChaloColorTokenKt.c(tabItemUiState.f4623a.c), composer, TabRowDefaults.$stable << 9, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.f17538a;
        }
    }
}
