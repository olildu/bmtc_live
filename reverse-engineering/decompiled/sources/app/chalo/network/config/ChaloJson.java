package app.chalo.network.config;

import defpackage.bj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/config/ChaloJson;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloJson f6455a = new ChaloJson();
    public static final Json b = JsonKt.a(Json.d, new bj(20));
    public static final JsonObject c = new JsonObject(new JsonObjectBuilder().f18199a);

    public static JsonPrimitive a(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "<this>");
        try {
            return JsonElementKt.h(jsonElement);
        } catch (Exception unused) {
            return null;
        }
    }
}
