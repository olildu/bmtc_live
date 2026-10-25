package app.chalo.livetracking.frameworklivetracking.utils;

import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.RealtimeSocketEtaResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.RealtimeSocketRouteStreamResponseApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketEtaResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import app.chalo.location.LatLng;
import app.chalo.network.config.ChaloJson;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SocketResponseToAppModelConverterKt {
    public static final LinkedHashMap a(JsonObject allRouteStopJsonObject) {
        Intrinsics.i(allRouteStopJsonObject, "allRouteStopJsonObject");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : allRouteStopJsonObject.f18198a.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            List listU = StringsKt.U(str, new String[]{":"}, 6);
            StopRouteId stopRouteId = new StopRouteId((String) listU.get(0), (String) listU.get(1));
            Intrinsics.g(jsonElement, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            linkedHashMap.put(stopRouteId, CollectionsKt.D(b((JsonObject) jsonElement).values()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    public static final LinkedHashMap b(JsonObject etaObject) {
        String string;
        Intrinsics.i(etaObject, "etaObject");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Iterator it = etaObject.f18198a.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry entry = (Map.Entry) it.next();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                if (JsonElementKt.h((JsonElement) entry.getValue()) instanceof JsonNull) {
                    string = null;
                } else {
                    string = JsonElementKt.h((JsonElement) entry.getValue()).getC();
                }
            } else if (jsonElement instanceof JsonObject) {
                string = ((JsonElement) entry.getValue()).toString();
            } else {
                string = null;
            }
            if (string != null) {
                Json json = ChaloJson.b;
                json.getClass();
                RealtimeSocketEtaResponseApiModel realtimeSocketEtaResponseApiModel = (RealtimeSocketEtaResponseApiModel) json.b(string, RealtimeSocketEtaResponseApiModel.INSTANCE.serializer());
                linkedHashMap.put(entry.getKey(), new RealtimeSocketEtaResponseAppModel((String) entry.getKey(), realtimeSocketEtaResponseApiModel.f4286a, realtimeSocketEtaResponseApiModel.b, realtimeSocketEtaResponseApiModel.c, realtimeSocketEtaResponseApiModel.d, realtimeSocketEtaResponseApiModel.e, realtimeSocketEtaResponseApiModel.f, realtimeSocketEtaResponseApiModel.h, realtimeSocketEtaResponseApiModel.i));
            } else {
                linkedHashMap.put(entry.getKey(), null);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static final LinkedHashMap c(JsonObject routeObject) {
        String string;
        Intrinsics.i(routeObject, "routeObject");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : routeObject.f18198a.entrySet()) {
            JsonElement jsonElement = (JsonElement) entry.getValue();
            if (jsonElement instanceof JsonPrimitive) {
                if (JsonElementKt.h((JsonElement) entry.getValue()) instanceof JsonNull) {
                    string = null;
                } else {
                    string = JsonElementKt.h((JsonElement) entry.getValue()).getC();
                }
            } else if (jsonElement instanceof JsonObject) {
                string = ((JsonElement) entry.getValue()).toString();
            } else {
                string = null;
            }
            if (string != null) {
                Json json = ChaloJson.b;
                json.getClass();
                RealtimeSocketRouteStreamResponseApiModel realtimeSocketRouteStreamResponseApiModel = (RealtimeSocketRouteStreamResponseApiModel) json.b(string, RealtimeSocketRouteStreamResponseApiModel.INSTANCE.serializer());
                linkedHashMap.put(entry.getKey(), new RealtimeSocketRouteStreamResponseAppModel((String) entry.getKey(), realtimeSocketRouteStreamResponseApiModel.b, realtimeSocketRouteStreamResponseApiModel.f4288a, realtimeSocketRouteStreamResponseApiModel.f, new LatLng(realtimeSocketRouteStreamResponseApiModel.d, realtimeSocketRouteStreamResponseApiModel.c), realtimeSocketRouteStreamResponseApiModel.e, realtimeSocketRouteStreamResponseApiModel.g, realtimeSocketRouteStreamResponseApiModel.h, realtimeSocketRouteStreamResponseApiModel.j, realtimeSocketRouteStreamResponseApiModel.k, realtimeSocketRouteStreamResponseApiModel.l));
            } else {
                linkedHashMap.put(entry.getKey(), null);
            }
        }
        return linkedHashMap;
    }
}
