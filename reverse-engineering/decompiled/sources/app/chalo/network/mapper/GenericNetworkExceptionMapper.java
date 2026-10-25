package app.chalo.network.mapper;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkErrorResponseParseException;
import app.chalo.network.model.ChaloError;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.generic.ErrorTypeKt;
import app.chalo.network.rest.response.NetworkResponse;
import defpackage.cg0;
import defpackage.nf1;
import defpackage.t8;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mapper/GenericNetworkExceptionMapper;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenericNetworkExceptionMapper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6468a;

        static {
            int[] iArr = new int[ErrorType.values().length];
            try {
                iArr[ErrorType.TYPE_NO_INTERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorType.TYPE_NO_UPDATE_IN_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorType.TYPE_REQUEST_CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorType.TYPE_SERVER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorType.TYPE_UNAUTHORIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorType.TYPE_UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6468a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    public static Exception a(NetworkResponse networkResponse, cg0 cg0Var, Function1 function1) {
        Object objB;
        GenericChaloErrorResponse genericChaloErrorResponse;
        String c;
        String c2;
        JsonPrimitive jsonPrimitiveA;
        JsonPrimitive jsonPrimitiveA2;
        Intrinsics.i(networkResponse, "networkResponse");
        String str = networkResponse.c;
        ErrorType errorType = networkResponse.b;
        Exception noInternetException = null;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(ChaloError.INSTANCE.serializer()));
            } catch (Exception e) {
                networkResponse.g.b(new NetworkErrorResponseParseException(t8.g(ChaloError.class, e.getMessage(), str)));
                objB = null;
            }
        } else {
            objB = null;
        }
        ChaloError chaloError = (ChaloError) objB;
        if (chaloError == null || (genericChaloErrorResponse = chaloError.f6493a) == null) {
            if (cg0Var != null) {
                genericChaloErrorResponse = (GenericChaloErrorResponse) cg0Var.invoke(str);
            } else {
                try {
                    ChaloJson chaloJson = ChaloJson.f6455a;
                    Json json2 = ChaloJson.b;
                    if (str == null) {
                        str = "";
                    }
                    JsonObject jsonObjectG = JsonElementKt.g(json2.f(str));
                    JsonElement jsonElement = (JsonElement) jsonObjectG.get("errorType");
                    if (jsonElement == null || (jsonPrimitiveA2 = ChaloJson.a(jsonElement)) == null) {
                        c = "UNKNOWN";
                    } else {
                        c = jsonPrimitiveA2 instanceof JsonNull ? null : jsonPrimitiveA2.getC();
                        if (c == null) {
                            c = "UNKNOWN";
                        }
                    }
                    JsonElement jsonElement2 = (JsonElement) jsonObjectG.get("errorMessage");
                    if (jsonElement2 == null || (jsonPrimitiveA = ChaloJson.a(jsonElement2)) == null) {
                        c2 = "";
                    } else {
                        c2 = jsonPrimitiveA instanceof JsonNull ? null : jsonPrimitiveA.getC();
                        if (c2 == null) {
                            c2 = "";
                        }
                    }
                    JsonElement jsonElement3 = (JsonElement) jsonObjectG.get("errorInfo");
                    genericChaloErrorResponse = new GenericChaloErrorResponse(c.equals("AUTHENTICATION_ERROR") ? TypedValues.CycleType.TYPE_CURVE_FIT : -1, c2, jsonElement3 != null ? JsonElementKt.g(jsonElement3) : null);
                } catch (Exception unused) {
                    genericChaloErrorResponse = new GenericChaloErrorResponse(-1, "", null);
                }
            }
        }
        switch (WhenMappings.f6468a[errorType.ordinal()]) {
            case 1:
                noInternetException = new ChaloLocalException.NoInternetException(vo1.j(ErrorTypeKt.a(errorType), "No internet. errorType: "));
                break;
            case 2:
                noInternetException = new ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion(genericChaloErrorResponse, vo1.j(ErrorTypeKt.a(errorType), "No update in requested data based on etag. errorType: "));
                break;
            case 3:
                noInternetException = new ChaloLocalException.RequestCancelledException(vo1.j(ErrorTypeKt.a(errorType), "Request cancelled. errorType: "));
                break;
            case 4:
                noInternetException = new ChaloLocalException.ServerErrorException(genericChaloErrorResponse, nf1.i(ErrorTypeKt.a(errorType), networkResponse.f, "Some server error happened. errorType: ", " and responseCode: "));
                break;
            case 5:
                noInternetException = new ChaloLocalException.SecureCallUnauthorizedAndRefreshTokenServerUnreachableException(genericChaloErrorResponse, vo1.j(ErrorTypeKt.a(errorType), "Unauthorized access, please try again later. errorType: "));
                break;
            case 6:
                noInternetException = new ChaloLocalException.UnexpectedException(genericChaloErrorResponse, vo1.j(ErrorTypeKt.a(errorType), "Something unexpected happened. errorType: "));
                break;
        }
        return noInternetException != null ? noInternetException : (Exception) function1.invoke(genericChaloErrorResponse);
    }
}
