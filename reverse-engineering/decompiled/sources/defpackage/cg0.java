package defpackage;

import app.chalo.login.data.LoginApiCallsType;
import app.chalo.login.data.LoginRemoteExceptionAndErrorHandler;
import app.chalo.login.data.exceptions.RefreshAuthTokensFailedException;
import app.chalo.login.data.exceptions.SendOtpFailedException;
import app.chalo.login.data.exceptions.TruecallerUidFetchFailedException;
import app.chalo.login.data.remote.LoginRemoteDataSourceImpl;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11282a;
    public final /* synthetic */ LoginApiCallsType b;

    public /* synthetic */ cg0(LoginRemoteDataSourceImpl loginRemoteDataSourceImpl, LoginApiCallsType loginApiCallsType, int i) {
        this.f11282a = i;
        this.b = loginApiCallsType;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GenericChaloErrorResponse genericChaloErrorResponse;
        String c;
        JsonPrimitive jsonPrimitiveA;
        JsonPrimitive jsonPrimitiveA2;
        Integer numE;
        Object truecallerUidFetchFailedException;
        int i = this.f11282a;
        LoginApiCallsType apiCallType = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                Intrinsics.i(apiCallType, "apiCallType");
                int i2 = LoginRemoteExceptionAndErrorHandler.WhenMappings.f5188a[apiCallType.ordinal()];
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str != null) {
                    try {
                        ChaloJson chaloJson = ChaloJson.f6455a;
                        JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str));
                        JsonElement jsonElement = (JsonElement) jsonObjectG.get("statusCode");
                        int iIntValue = (jsonElement == null || (jsonPrimitiveA2 = ChaloJson.a(jsonElement)) == null || (numE = JsonElementKt.e(jsonPrimitiveA2)) == null) ? -1 : numE.intValue();
                        JsonElement jsonElement2 = (JsonElement) jsonObjectG.get("message");
                        if (jsonElement2 == null || (jsonPrimitiveA = ChaloJson.a(jsonElement2)) == null) {
                            c = "Something went wrong";
                        } else {
                            c = jsonPrimitiveA instanceof JsonNull ? null : jsonPrimitiveA.getC();
                            if (c == null) {
                                c = "Something went wrong";
                            }
                        }
                        genericChaloErrorResponse = new GenericChaloErrorResponse(iIntValue, c, null);
                    } catch (Exception unused) {
                        genericChaloErrorResponse = null;
                    }
                    if (genericChaloErrorResponse != null) {
                        return genericChaloErrorResponse;
                    }
                    break;
                }
                return new GenericChaloErrorResponse(-1, "", null);
            default:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                Intrinsics.i(apiCallType, "apiCallType");
                int i3 = LoginRemoteExceptionAndErrorHandler.WhenMappings.f5188a[apiCallType.ordinal()];
                if (i3 == 1) {
                    truecallerUidFetchFailedException = new TruecallerUidFetchFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
                } else if (i3 == 2) {
                    truecallerUidFetchFailedException = new SendOtpFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    truecallerUidFetchFailedException = new RefreshAuthTokensFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
                }
                return truecallerUidFetchFailedException;
        }
    }
}
