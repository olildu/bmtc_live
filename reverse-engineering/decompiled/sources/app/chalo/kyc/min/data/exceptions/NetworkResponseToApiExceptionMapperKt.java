package app.chalo.kyc.min.data.exceptions;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.generic.ErrorType;
import app.chalo.network.rest.generic.ErrorTypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseToApiExceptionMapperKt {
    public static final GenericChaloErrorResponse a(String str) {
        try {
            Json json = ChaloJson.b;
            if (str == null) {
                str = "";
            }
            JsonObject jsonObjectG = JsonElementKt.g(json.f(str));
            String strS = JsonElementExtensionsKt.s(jsonObjectG, "errorType", "UNKNOWN");
            return new GenericChaloErrorResponse(Intrinsics.d(strS, "AUTHENTICATION_ERROR") ? TypedValues.CycleType.TYPE_CURVE_FIT : ErrorTypeKt.a(ErrorType.TYPE_UNKNOWN), JsonElementExtensionsKt.s(jsonObjectG, "errorMessage", ""), null);
        } catch (Exception unused) {
            return new GenericChaloErrorResponse(ErrorTypeKt.a(ErrorType.TYPE_UNKNOWN), "", null);
        }
    }
}
