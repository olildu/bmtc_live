package app.chalo.livetracking.stoptripplannerresult.compose.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUIKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabsUiState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.rd0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripPlannerTabUIKt {
    public static final void a(final TabsUiState state, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Object next;
        Intrinsics.i(state, "state");
        List list = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1077034186);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1077034186, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUI (TripPlannerTabUI.kt:26)");
            }
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((TabItemUiState) next).d);
                Intrinsics.i(list, "<this>");
                objRememberedValue = Integer.valueOf(list.indexOf(next));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final int iIntValue = ((Number) objRememberedValue).intValue();
            if (iIntValue < 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: yl1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj2).intValue();
                                TripPlannerTabUIKt.a(state, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            case 1:
                                Composer composer2 = (Composer) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                boolean z = true;
                                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1787870050, iIntValue2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUI.<anonymous> (TripPlannerTabUI.kt:44)");
                                    }
                                    int i4 = 0;
                                    for (Object obj3 : state.b) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        TabItemUiState tabItemUiState = (TabItemUiState) obj3;
                                        boolean z2 = i == i4 ? z : false;
                                        boolean zChanged2 = composer2.changed(tabItemUiState);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new yh1(tabItemUiState, 7);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        TabKt.m2513TabbogVsAg(z2, (Function0) objRememberedValue2, null, false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1355038199, z, new ti1(tabItemUiState, 8), composer2, 54), composer2, 12582912, 124);
                                        i4 = i5;
                                        z = z;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            default:
                                ((Integer) obj2).intValue();
                                TripPlannerTabUIKt.a(state, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                final int i4 = 1;
                TabRowKt.m2534TabRowpAZo6Ak(iIntValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(state.f4624a.f4621a), 0L, ComposableLambdaKt.rememberComposableLambda(-2052508002, true, new rd0(state, iIntValue, 2), composerStartRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1787870050, true, new Function2() { // from class: yl1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).intValue();
                                TripPlannerTabUIKt.a(state, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(iIntValue | 1));
                                break;
                            case 1:
                                Composer composer2 = (Composer) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                boolean z = true;
                                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1787870050, iIntValue2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUI.<anonymous> (TripPlannerTabUI.kt:44)");
                                    }
                                    int i5 = 0;
                                    for (Object obj3 : state.b) {
                                        int i6 = i5 + 1;
                                        if (i5 < 0) {
                                            CollectionsKt.z0();
                                            throw null;
                                        }
                                        TabItemUiState tabItemUiState = (TabItemUiState) obj3;
                                        boolean z2 = iIntValue == i5 ? z : false;
                                        boolean zChanged2 = composer2.changed(tabItemUiState);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new yh1(tabItemUiState, 7);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        TabKt.m2513TabbogVsAg(z2, (Function0) objRememberedValue2, null, false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1355038199, z, new ti1(tabItemUiState, 8), composer2, 54), composer2, 12582912, 124);
                                        i5 = i6;
                                        z = z;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            default:
                                ((Integer) obj2).intValue();
                                TripPlannerTabUIKt.a(state, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(iIntValue | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597488, 40);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 2;
            function2 = new Function2() { // from class: yl1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).intValue();
                            TripPlannerTabUIKt.a(state, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        case 1:
                            Composer composer2 = (Composer) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            boolean z = true;
                            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787870050, iIntValue2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUI.<anonymous> (TripPlannerTabUI.kt:44)");
                                }
                                int i6 = 0;
                                for (Object obj3 : state.b) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        CollectionsKt.z0();
                                        throw null;
                                    }
                                    TabItemUiState tabItemUiState = (TabItemUiState) obj3;
                                    boolean z2 = i == i6 ? z : false;
                                    boolean zChanged2 = composer2.changed(tabItemUiState);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new yh1(tabItemUiState, 7);
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    TabKt.m2513TabbogVsAg(z2, (Function0) objRememberedValue2, null, false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1355038199, z, new ti1(tabItemUiState, 8), composer2, 54), composer2, 12582912, 124);
                                    i6 = i7;
                                    z = z;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        default:
                            ((Integer) obj2).intValue();
                            TripPlannerTabUIKt.a(state, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
