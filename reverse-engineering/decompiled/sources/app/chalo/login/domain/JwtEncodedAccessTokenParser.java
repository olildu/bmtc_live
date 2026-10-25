package app.chalo.login.domain;

import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okio.internal._Utf8Kt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/domain/JwtEncodedAccessTokenParser;", "", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JwtEncodedAccessTokenParser {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/domain/JwtEncodedAccessTokenParser$Companion;", "", "", "KEY_TOKEN_EXPIRY", "Ljava/lang/String;", "KEY_TOKEN_ISSUED_AT", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(String str) {
        Base64.f.getClass();
        Base64 base64 = Base64.h;
        Base64.PaddingOption option = Base64.PaddingOption.PRESENT_OPTIONAL;
        base64.getClass();
        Intrinsics.i(option, "option");
        if (base64.d != option) {
            base64 = new Base64(base64.f17595a, base64.b, base64.c, option);
        }
        return _Utf8Kt.a(Base64.b(base64, str, 0, 6));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public static ParsedTokenResult b(String accessToken) {
        String c;
        JsonPrimitive jsonPrimitiveA;
        JsonPrimitive jsonPrimitiveA2;
        Intrinsics.i(accessToken, "accessToken");
        try {
            String strA = a((String) StringsKt.U(accessToken, new String[]{CLConstants.DOT_SALT_DELIMETER}, 6).get(1));
            ChaloJson chaloJson = ChaloJson.f6455a;
            JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(strA));
            JsonElement jsonElement = (JsonElement) jsonObjectG.get("exp");
            String c2 = null;
            String str = "";
            if (jsonElement == null || (jsonPrimitiveA2 = ChaloJson.a(jsonElement)) == null) {
                c = "";
            } else {
                c = jsonPrimitiveA2 instanceof JsonNull ? null : jsonPrimitiveA2.getC();
                if (c == null) {
                    c = "";
                }
            }
            JsonElement jsonElement2 = (JsonElement) jsonObjectG.get("iat");
            if (jsonElement2 != null && (jsonPrimitiveA = ChaloJson.a(jsonElement2)) != null) {
                if (!(jsonPrimitiveA instanceof JsonNull)) {
                    c2 = jsonPrimitiveA.getC();
                }
                if (c2 != null) {
                    str = c2;
                }
            }
            return new ParsedTokenResult(StringsKt.t0(c), StringsKt.t0(str));
        } catch (Exception e) {
            throw new AccessTokenParseFailedException(e.getMessage());
        }
    }
}
