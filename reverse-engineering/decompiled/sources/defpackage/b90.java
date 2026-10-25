package defpackage;

import app.chalo.network.CommonHeaderProvider;
import com.android.volley.toolbox.HttpHeaderParser;
import in.juspay.hypersdk.core.PaymentConstants;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.StringValuesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11178a;
    public final /* synthetic */ CommonHeaderProvider b;

    public /* synthetic */ b90(CommonHeaderProvider commonHeaderProvider, int i) {
        this.f11178a = i;
        this.b = commonHeaderProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11178a) {
            case 0:
                DefaultRequest.DefaultRequestBuilder defaultRequest = (DefaultRequest.DefaultRequestBuilder) obj;
                Intrinsics.i(defaultRequest, "$this$defaultRequest");
                HttpRequestKt.a(defaultRequest, new b90(this.b, 1));
                break;
            default:
                HeadersBuilder headers = (HeadersBuilder) obj;
                Intrinsics.i(headers, "$this$headers");
                StringValuesKt.b(headers, HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json");
                StringValuesKt.b(headers, "accept", "application/json");
                CommonHeaderProvider commonHeaderProvider = this.b;
                commonHeaderProvider.getSource();
                StringValuesKt.b(headers, "source", "0");
                StringValuesKt.b(headers, CLConstants.SALT_FIELD_DEVICE_ID, commonHeaderProvider.getDeviceId());
                StringValuesKt.b(headers, "appVer", commonHeaderProvider.a());
                StringValuesKt.b(headers, PaymentConstants.CLIENT_ID_CAMEL, commonHeaderProvider.getClientId());
                if (headers.contains("xTypeHeader")) {
                    headers.f16897a.remove("xTypeHeader");
                    headers.e("x-type", "pass");
                }
                break;
        }
        return Unit.f17538a;
    }
}
