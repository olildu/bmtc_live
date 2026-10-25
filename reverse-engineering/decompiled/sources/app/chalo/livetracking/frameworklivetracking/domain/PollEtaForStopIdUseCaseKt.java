package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.livetracking.frameworklivetracking.data.model.StopRouteId;
import app.chalo.livetracking.frameworklivetracking.utils.SocketResponseToAppModelConverterKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PollEtaForStopIdUseCaseKt {
    public static final LinkedHashMap a(JsonObject jsonObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : jsonObject.f18198a.entrySet()) {
            String str = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            List listU = StringsKt.U(str, new String[]{":"}, 6);
            StopRouteId stopRouteId = new StopRouteId((String) listU.get(0), (String) listU.get(1));
            Intrinsics.g(jsonElement, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            linkedHashMap.put(stopRouteId, CollectionsKt.D(SocketResponseToAppModelConverterKt.b((JsonObject) jsonElement).values()));
        }
        return linkedHashMap;
    }
}
