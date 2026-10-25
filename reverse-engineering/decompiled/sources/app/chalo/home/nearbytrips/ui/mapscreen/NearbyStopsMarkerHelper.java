package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.wb;
import defpackage.zf0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMarkerHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyStopsMarkerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyStopsMapMarkerIconHelper f3166a;

    public NearbyStopsMarkerHelper(NearbyStopsMapMarkerIconHelper nearbyStopsMapMarkerIconHelper) {
        this.f3166a = nearbyStopsMapMarkerIconHelper;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(StopAppModel stopAppModel, boolean z, float f, zf0 zf0Var, ContinuationImpl continuationImpl) {
        NearbyStopsMarkerHelper$getNearbyStopMarker$1 nearbyStopsMarkerHelper$getNearbyStopMarker$1;
        float f2;
        boolean z2;
        Function0 function0;
        if (continuationImpl instanceof NearbyStopsMarkerHelper$getNearbyStopMarker$1) {
            nearbyStopsMarkerHelper$getNearbyStopMarker$1 = (NearbyStopsMarkerHelper$getNearbyStopMarker$1) continuationImpl;
            int i = nearbyStopsMarkerHelper$getNearbyStopMarker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyStopsMarkerHelper$getNearbyStopMarker$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyStopsMarkerHelper$getNearbyStopMarker$1 = new NearbyStopsMarkerHelper$getNearbyStopMarker$1(this, continuationImpl);
            }
        } else {
            nearbyStopsMarkerHelper$getNearbyStopMarker$1 = new NearbyStopsMarkerHelper$getNearbyStopMarker$1(this, continuationImpl);
        }
        NearbyStopsMarkerHelper$getNearbyStopMarker$1 nearbyStopsMarkerHelper$getNearbyStopMarker$2 = nearbyStopsMarkerHelper$getNearbyStopMarker$1;
        Object objA = nearbyStopsMarkerHelper$getNearbyStopMarker$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyStopsMarkerHelper$getNearbyStopMarker$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloTransitMode chaloTransitMode = stopAppModel.d;
            String str = stopAppModel.b;
            nearbyStopsMarkerHelper$getNearbyStopMarker$2.L$0 = stopAppModel;
            nearbyStopsMarkerHelper$getNearbyStopMarker$2.L$1 = zf0Var;
            nearbyStopsMarkerHelper$getNearbyStopMarker$2.Z$0 = z;
            nearbyStopsMarkerHelper$getNearbyStopMarker$2.F$0 = f;
            nearbyStopsMarkerHelper$getNearbyStopMarker$2.label = 1;
            objA = this.f3166a.a(z, chaloTransitMode, f, str, nearbyStopsMarkerHelper$getNearbyStopMarker$2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            f2 = f;
            z2 = z;
            function0 = zf0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f3 = nearbyStopsMarkerHelper$getNearbyStopMarker$2.F$0;
            boolean z3 = nearbyStopsMarkerHelper$getNearbyStopMarker$2.Z$0;
            Function0 function1 = (Function0) nearbyStopsMarkerHelper$getNearbyStopMarker$2.L$1;
            stopAppModel = (StopAppModel) nearbyStopsMarkerHelper$getNearbyStopMarker$2.L$0;
            ResultKt.b(objA);
            z2 = z3;
            f2 = f3;
            function0 = function1;
        }
        StopAppModel stopAppModel2 = stopAppModel;
        String str2 = stopAppModel2.f1727a;
        ChaloMapMarkerUIEventHandler.Companion companion = ChaloMapMarkerUIEventHandler.f1869a;
        wb wbVar = new wb(8);
        wb wbVar2 = new wb(8);
        companion.getClass();
        return new NearbyStopsMapMarkerUIState(str2, stopAppModel2, z2, f2, (PlatformMapMarkerBitmap) objA, ChaloMapMarkerUIEventHandler.Companion.a(function0, wbVar, wbVar2));
    }
}
