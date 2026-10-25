package app.chalo.home.helper;

import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
import app.chalo.location.LatLng;
import app.chalo.models.RealTimeRouteInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.wb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/NearbyBusMarkerHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyBusMarkerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyBusMarkerIconHelper f3104a;

    public NearbyBusMarkerHelper(NearbyBusMarkerIconHelper nearbyBusMarkerIconHelper) {
        this.f3104a = nearbyBusMarkerIconHelper;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(String str, LatLng latLng, Map map, boolean z, boolean z2, boolean z3, Function0 function0, ContinuationImpl continuationImpl) {
        NearbyBusMarkerHelper$getNearbyBusMarker$1 nearbyBusMarkerHelper$getNearbyBusMarker$1;
        PlatformMapMarkerBitmap platformMapMarkerBitmap;
        Function0 function1;
        LatLng latLng2;
        String str2;
        String str3;
        Map map2 = map;
        if (continuationImpl instanceof NearbyBusMarkerHelper$getNearbyBusMarker$1) {
            nearbyBusMarkerHelper$getNearbyBusMarker$1 = (NearbyBusMarkerHelper$getNearbyBusMarker$1) continuationImpl;
            int i = nearbyBusMarkerHelper$getNearbyBusMarker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyBusMarkerHelper$getNearbyBusMarker$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyBusMarkerHelper$getNearbyBusMarker$1 = new NearbyBusMarkerHelper$getNearbyBusMarker$1(this, continuationImpl);
            }
        } else {
            nearbyBusMarkerHelper$getNearbyBusMarker$1 = new NearbyBusMarkerHelper$getNearbyBusMarker$1(this, continuationImpl);
        }
        NearbyBusMarkerHelper$getNearbyBusMarker$1 nearbyBusMarkerHelper$getNearbyBusMarker$2 = nearbyBusMarkerHelper$getNearbyBusMarker$1;
        Object objA = nearbyBusMarkerHelper$getNearbyBusMarker$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyBusMarkerHelper$getNearbyBusMarker$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            Json json = ChaloJson.b;
            json.getClass();
            RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo = (RealTimeRouteInfo.GeoRealTimeInfo) json.b(str, RealTimeRouteInfo.GeoRealTimeInfo.INSTANCE.serializer());
            ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, geoRealTimeInfo.g);
            String str4 = geoRealTimeInfo.c;
            platformMapMarkerBitmap = (PlatformMapMarkerBitmap) map2.get(str4);
            if (platformMapMarkerBitmap == null) {
                nearbyBusMarkerHelper$getNearbyBusMarker$2.L$0 = str;
                nearbyBusMarkerHelper$getNearbyBusMarker$2.L$1 = latLng;
                nearbyBusMarkerHelper$getNearbyBusMarker$2.L$2 = map2;
                function1 = function0;
                nearbyBusMarkerHelper$getNearbyBusMarker$2.L$3 = function1;
                nearbyBusMarkerHelper$getNearbyBusMarker$2.L$4 = str4;
                nearbyBusMarkerHelper$getNearbyBusMarker$2.label = 1;
                objA = this.f3104a.a(chaloTransitModeB, geoRealTimeInfo, z, z2, z3, nearbyBusMarkerHelper$getNearbyBusMarker$2);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                latLng2 = latLng;
                str3 = str4;
            } else {
                function1 = function0;
                latLng2 = latLng;
            }
            LatLng latLng3 = new LatLng(latLng2.f5134a, latLng2.b);
            ChaloMapMarkerUIEventHandler.Companion companion = ChaloMapMarkerUIEventHandler.f1869a;
            wb wbVar = new wb(8);
            wb wbVar2 = new wb(8);
            companion.getClass();
            return new NearbyBusMarkerUIState(str, latLng3, platformMapMarkerBitmap, ChaloMapMarkerUIEventHandler.Companion.a(function1, wbVar, wbVar2));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str3 = (String) nearbyBusMarkerHelper$getNearbyBusMarker$2.L$4;
        Function0 function2 = (Function0) nearbyBusMarkerHelper$getNearbyBusMarker$2.L$3;
        Map map3 = (Map) nearbyBusMarkerHelper$getNearbyBusMarker$2.L$2;
        LatLng latLng4 = (LatLng) nearbyBusMarkerHelper$getNearbyBusMarker$2.L$1;
        str2 = (String) nearbyBusMarkerHelper$getNearbyBusMarker$2.L$0;
        ResultKt.b(objA);
        function1 = function2;
        map2 = map3;
        latLng2 = latLng4;
        platformMapMarkerBitmap = (PlatformMapMarkerBitmap) objA;
        MapsKt.u(map2).put(str3, platformMapMarkerBitmap);
        str = str2;
        LatLng latLng5 = new LatLng(latLng2.f5134a, latLng2.b);
        ChaloMapMarkerUIEventHandler.Companion companion2 = ChaloMapMarkerUIEventHandler.f1869a;
        wb wbVar3 = new wb(8);
        wb wbVar4 = new wb(8);
        companion2.getClass();
        return new NearbyBusMarkerUIState(str, latLng5, platformMapMarkerBitmap, ChaloMapMarkerUIEventHandler.Companion.a(function1, wbVar3, wbVar4));
    }
}
