package app.chalo.geoquery.domain;

import app.chalo.geoquery.data.GeoFireEvent;
import app.chalo.geoquery.data.LiveTripInfoDataModel;
import app.chalo.geoquery.data.LiveTripInfoGeoLocationAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryBusInfoParametersResponseAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryBusInfoResponseAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryBusInfoSessionResponseAppModel;
import app.chalo.location.LatLng;
import app.chalo.models.RealTimeRouteInfo;
import app.chalo.network.config.ChaloJson;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/geoquery/data/GeoFireEvent;", "accumulator", "value", "Lapp/chalo/geoquery/data/models/app/GeoQueryBusInfoResponseAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1", f = "GeoSpatialLiveBusesDataPollingManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class GeoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1 extends SuspendLambda implements Function3<List<? extends GeoFireEvent>, List<? extends GeoQueryBusInfoResponseAppModel>, Continuation<? super List<? extends GeoFireEvent>>, Object> {
    final /* synthetic */ LatLng $latLng;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2823a;

        static {
            int[] iArr = new int[GeoFireEvent.Type.values().length];
            try {
                iArr[GeoFireEvent.Type.EXITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeoFireEvent.Type.ENTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GeoFireEvent.Type.MOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2823a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1(LatLng latLng, Continuation continuation) {
        super(3, continuation);
        this.$latLng = latLng;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GeoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1 geoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1 = new GeoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1(this.$latLng, (Continuation) obj3);
        geoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1.L$0 = (List) obj;
        geoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1.L$1 = (List) obj2;
        return geoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List<GeoFireEvent> list = (List) this.L$0;
        List list2 = (List) this.L$1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            GeoQueryBusInfoResponseAppModel geoQueryBusInfoResponseAppModel = (GeoQueryBusInfoResponseAppModel) it.next();
            GeoQueryBusInfoSessionResponseAppModel geoQueryBusInfoSessionResponseAppModel = geoQueryBusInfoResponseAppModel.f2814a;
            RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo = new RealTimeRouteInfo.GeoRealTimeInfo(geoQueryBusInfoSessionResponseAppModel.g, geoQueryBusInfoSessionResponseAppModel.f2815a, geoQueryBusInfoSessionResponseAppModel.f, geoQueryBusInfoSessionResponseAppModel.d, geoQueryBusInfoSessionResponseAppModel.e, geoQueryBusInfoSessionResponseAppModel.i.getMode(), geoQueryBusInfoSessionResponseAppModel.b, geoQueryBusInfoSessionResponseAppModel.c);
            Json json = ChaloJson.b;
            json.getClass();
            KSerializer<RealTimeRouteInfo.GeoRealTimeInfo> serializer = RealTimeRouteInfo.GeoRealTimeInfo.INSTANCE.serializer();
            Intrinsics.i(serializer, "serializer");
            String string = TreeJsonEncoderKt.a(json, geoRealTimeInfo, serializer).toString();
            GeoQueryBusInfoSessionResponseAppModel geoQueryBusInfoSessionResponseAppModel2 = geoQueryBusInfoResponseAppModel.f2814a;
            String str = geoQueryBusInfoSessionResponseAppModel2.g;
            String str2 = geoQueryBusInfoSessionResponseAppModel2.f2815a;
            GeoQueryBusInfoParametersResponseAppModel geoQueryBusInfoParametersResponseAppModel = geoQueryBusInfoResponseAppModel.b;
            LatLng latLng = geoQueryBusInfoParametersResponseAppModel.b;
            linkedHashMap2.put(string, new LiveTripInfoDataModel(str, str2, new LiveTripInfoGeoLocationAppModel(latLng.f5134a, latLng.b, geoQueryBusInfoParametersResponseAppModel.f2813a, geoQueryBusInfoParametersResponseAppModel.c, geoQueryBusInfoParametersResponseAppModel.d, geoQueryBusInfoParametersResponseAppModel.e, geoQueryBusInfoParametersResponseAppModel.f), geoRealTimeInfo, string, geoQueryBusInfoParametersResponseAppModel.g));
            list = list;
        }
        LatLng latLng2 = this.$latLng;
        for (GeoFireEvent geoFireEvent : list) {
            LiveTripInfoDataModel liveTripInfoDataModel = geoFireEvent.b;
            String str3 = liveTripInfoDataModel != null ? liveTripInfoDataModel.e : null;
            if (str3 != null) {
                GeoFireEvent.Type type = geoFireEvent.f2790a;
                int i = type == null ? -1 : WhenMappings.f2823a[type.ordinal()];
                if (i != -1 && i != 1) {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LiveTripInfoDataModel liveTripInfoDataModel2 = (LiveTripInfoDataModel) linkedHashMap2.get(str3);
                    if (liveTripInfoDataModel2 != null) {
                        linkedHashMap2.remove(str3);
                        linkedHashMap.put(str3, new GeoFireEvent(GeoFireEvent.Type.MOVED, liveTripInfoDataModel2, latLng2));
                    } else {
                        linkedHashMap.put(str3, new GeoFireEvent(GeoFireEvent.Type.EXITED, geoFireEvent.b, latLng2));
                    }
                }
            }
        }
        LatLng latLng3 = this.$latLng;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap.put(entry.getKey(), new GeoFireEvent(GeoFireEvent.Type.ENTERED, (LiveTripInfoDataModel) entry.getValue(), latLng3));
        }
        return CollectionsKt.D0(linkedHashMap.values());
    }
}
