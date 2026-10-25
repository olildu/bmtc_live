package app.chalo.extensions;

import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonElementExtensionsKt {
    public static final boolean a(JsonObject jsonObject, String str) throws JsonException {
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            JsonElement jsonElement = (JsonElement) obj;
            Boolean boolD = JsonElementKt.d(JsonElementKt.h(jsonElement));
            return boolD != null ? boolD.booleanValue() : Boolean.parseBoolean(JsonElementKt.h(jsonElement).getC());
        } catch (Exception e) {
            throw new JsonException(e, str);
        }
    }

    public static final double b(JsonObject jsonObject, String name) throws JsonException {
        Intrinsics.i(name, "name");
        try {
            Object obj = jsonObject.get(name);
            Intrinsics.f(obj);
            JsonElement jsonElement = (JsonElement) obj;
            Double dM0 = StringsKt.m0(JsonElementKt.h(jsonElement).getC());
            return dM0 != null ? dM0.doubleValue() : Double.parseDouble(JsonElementKt.h(jsonElement).getC());
        } catch (Exception e) {
            throw new JsonException(e, name);
        }
    }

    public static final int c(JsonObject jsonObject, String str) throws JsonException {
        Intrinsics.i(jsonObject, "<this>");
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            JsonElement jsonElement = (JsonElement) obj;
            Integer numE = JsonElementKt.e(JsonElementKt.h(jsonElement));
            return numE != null ? numE.intValue() : Integer.parseInt(JsonElementKt.h(jsonElement).getC());
        } catch (Exception e) {
            throw new JsonException(e, str);
        }
    }

    public static final JsonArray d(JsonObject jsonObject, String str) throws JsonException {
        Intrinsics.i(jsonObject, "<this>");
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            return JsonElementKt.f((JsonElement) obj);
        } catch (Exception e) {
            throw new JsonException(e, str);
        }
    }

    public static final JsonObject e(String str, JsonElement jsonElement) {
        try {
            Object obj = JsonElementKt.g(jsonElement).get(str);
            Intrinsics.f(obj);
            return JsonElementKt.g((JsonElement) obj);
        } catch (Exception e) {
            throw new JsonException(e, str);
        }
    }

    public static final JsonObject f(JsonArray jsonArray, int i) throws JsonException {
        Intrinsics.i(jsonArray, "<this>");
        try {
            return JsonElementKt.g(jsonArray.get(i));
        } catch (Exception e) {
            throw new JsonException(i, e);
        }
    }

    public static final JsonObject g(JsonObject jsonObject, String name) throws JsonException {
        Intrinsics.i(jsonObject, "<this>");
        Intrinsics.i(name, "name");
        try {
            Object obj = jsonObject.get(name);
            Intrinsics.f(obj);
            return JsonElementKt.g((JsonElement) obj);
        } catch (Exception e) {
            throw new JsonException(e, name);
        }
    }

    public static final long h(JsonObject jsonObject, String str) {
        Long lValueOf;
        Intrinsics.i(jsonObject, "<this>");
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            JsonElement jsonElement = (JsonElement) obj;
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            if (jsonPrimitiveA != null) {
                try {
                    lValueOf = Long.valueOf(JsonElementKt.i(jsonPrimitiveA));
                } catch (JsonDecodingException unused) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    return lValueOf.longValue();
                }
            }
            return Long.parseLong(JsonElementKt.h(jsonElement).getC());
        } catch (Exception e) {
            throw new JsonException(e, str);
        }
    }

    public static final String i(JsonArray jsonArray, int i) throws JsonException {
        Intrinsics.i(jsonArray, "<this>");
        try {
            JsonElement jsonElement = jsonArray.get(i);
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            return jsonPrimitiveA != null ? jsonPrimitiveA.getC() : JsonElementKt.g(jsonElement).toString();
        } catch (Exception e) {
            throw new JsonException(i, e);
        }
    }

    public static final String j(JsonObject jsonObject, String name) {
        Intrinsics.i(jsonObject, "<this>");
        Intrinsics.i(name, "name");
        try {
            Object obj = jsonObject.get(name);
            Intrinsics.f(obj);
            return JsonElementKt.h((JsonElement) obj).getC();
        } catch (Exception e) {
            throw new JsonException(e, name);
        }
    }

    public static final String k(JsonArray jsonArray, int i) {
        try {
            JsonElement jsonElement = jsonArray.get(i);
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            return jsonPrimitiveA != null ? jsonPrimitiveA.getC() : JsonElementKt.g(jsonElement).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean l(String key, JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "<this>");
        Intrinsics.i(key, "key");
        try {
            return JsonElementKt.g(jsonElement).containsKey(key);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean m(JsonObject jsonObject, String str, boolean z) {
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            Boolean boolD = JsonElementKt.d(JsonElementKt.h((JsonElement) obj));
            if (boolD != null) {
                return boolD.booleanValue();
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public static final int n(int i, String str, JsonObject jsonObject) {
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            Integer numE = JsonElementKt.e(JsonElementKt.h((JsonElement) obj));
            return numE != null ? numE.intValue() : i;
        } catch (Exception unused) {
            return i;
        }
    }

    public static final JsonArray o(JsonObject jsonObject, String str) {
        Intrinsics.i(jsonObject, "<this>");
        try {
            return d(jsonObject, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final JsonObject p(JsonObject jsonObject, String name) {
        Intrinsics.i(jsonObject, "<this>");
        Intrinsics.i(name, "name");
        try {
            return g(jsonObject, name);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final long q(JsonObject jsonObject, String str, long j) {
        Long lValueOf;
        Intrinsics.i(jsonObject, "<this>");
        try {
            Object obj = jsonObject.get(str);
            Intrinsics.f(obj);
            JsonElement jsonElement = (JsonElement) obj;
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonPrimitive jsonPrimitiveA = ChaloJson.a(jsonElement);
            if (jsonPrimitiveA != null) {
                try {
                    lValueOf = Long.valueOf(JsonElementKt.i(jsonPrimitiveA));
                } catch (JsonDecodingException unused) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    return lValueOf.longValue();
                }
            }
            return Long.parseLong(JsonElementKt.h(jsonElement).getC());
        } catch (Exception unused2) {
            return j;
        }
    }

    public static final String r(JsonArray jsonArray, int i) {
        Intrinsics.i(jsonArray, "<this>");
        try {
            return i(jsonArray, i);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String s(JsonObject jsonObject, String name, String str) {
        Intrinsics.i(jsonObject, "<this>");
        Intrinsics.i(name, "name");
        try {
            Object obj = jsonObject.get(name);
            Intrinsics.f(obj);
            return JsonElementKt.h((JsonElement) obj).getC();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String t(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "<this>");
        try {
            return s(JsonElementKt.g(jsonElement), "toStopId", "");
        } catch (Exception unused) {
            return "";
        }
    }
}
