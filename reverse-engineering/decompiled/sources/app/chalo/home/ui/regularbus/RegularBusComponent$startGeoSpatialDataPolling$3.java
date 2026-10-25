package app.chalo.home.ui.regularbus;

import app.chalo.constants.Source;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import defpackage.ud;
import defpackage.vo1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RegularBusComponent$startGeoSpatialDataPolling$3<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RegularBusComponent f3626a;

    public RegularBusComponent$startGeoSpatialDataPolling$3(RegularBusComponent regularBusComponent) {
        this.f3626a = regularBusComponent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(List list, Continuation continuation) {
        RegularBusComponent$startGeoSpatialDataPolling$3$emit$1 regularBusComponent$startGeoSpatialDataPolling$3$emit$1;
        if (continuation instanceof RegularBusComponent$startGeoSpatialDataPolling$3$emit$1) {
            regularBusComponent$startGeoSpatialDataPolling$3$emit$1 = (RegularBusComponent$startGeoSpatialDataPolling$3$emit$1) continuation;
            int i = regularBusComponent$startGeoSpatialDataPolling$3$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                regularBusComponent$startGeoSpatialDataPolling$3$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                regularBusComponent$startGeoSpatialDataPolling$3$emit$1 = new RegularBusComponent$startGeoSpatialDataPolling$3$emit$1(this, continuation);
            }
        } else {
            regularBusComponent$startGeoSpatialDataPolling$3$emit$1 = new RegularBusComponent$startGeoSpatialDataPolling$3$emit$1(this, continuation);
        }
        Object objG0 = regularBusComponent$startGeoSpatialDataPolling$3$emit$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = regularBusComponent$startGeoSpatialDataPolling$3$emit$1.label;
        RegularBusComponent regularBusComponent = this.f3626a;
        if (i2 == 0) {
            ResultKt.b(objG0);
            if (regularBusComponent.b0) {
                HomeScreenAnalyticsHelper.DefaultImpls.a(regularBusComponent.F, "new geo query manager data received", vo1.s("count", String.valueOf(list.size())), Source.REGULAR_BUS_SCREEN_TAB, 12);
            }
            regularBusComponent.b0 = false;
            List list2 = ((RegularBusViewState) regularBusComponent.t0().a()).f.f3616a.size() > 100 ? EmptyList.f17557a : ((RegularBusViewState) regularBusComponent.t0().a()).f.f3616a;
            Map map = ((RegularBusViewState) regularBusComponent.t0().a()).f.b;
            regularBusComponent$startGeoSpatialDataPolling$3$emit$1.label = 1;
            objG0 = RegularBusComponent.G0(regularBusComponent, list2, list, map, regularBusComponent$startGeoSpatialDataPolling$3$emit$1);
            if (objG0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG0);
        }
        regularBusComponent.E0(new ud((List) objG0, 28));
        return Unit.f17538a;
    }
}
