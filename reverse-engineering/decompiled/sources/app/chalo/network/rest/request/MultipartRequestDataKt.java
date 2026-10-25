package app.chalo.network.rest.request;

import io.ktor.client.request.forms.FormPart;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultipartRequestDataKt {
    public static final FormPart a(MultipartRequestFormDataType multipartRequestFormDataType) {
        Headers headersA;
        String f6518a = multipartRequestFormDataType.getF6518a();
        if (f6518a != null) {
            HeadersBuilder headersBuilder = new HeadersBuilder();
            List list = HttpHeaders.f16799a;
            Set set = HeaderValueWithParametersKt.f16796a;
            if (HeaderValueWithParametersKt.a(f6518a)) {
                f6518a = HeaderValueWithParametersKt.b(f6518a);
            }
            headersBuilder.i("Content-Disposition", "filename=" + f6518a);
            headersA = headersBuilder.l();
        } else {
            Headers.f16797a.getClass();
            headersA = Headers.Companion.a();
        }
        if (multipartRequestFormDataType instanceof MultipartRequestFormDataType.ByteArrayData) {
            return new FormPart("file", ((MultipartRequestFormDataType.ByteArrayData) multipartRequestFormDataType).d, headersA);
        }
        if (multipartRequestFormDataType instanceof MultipartRequestFormDataType.NumberData) {
            new FormPart(null, null, headersA);
            throw null;
        }
        if (multipartRequestFormDataType instanceof MultipartRequestFormDataType.StringData) {
            return new FormPart("info", ((MultipartRequestFormDataType.StringData) multipartRequestFormDataType).c, headersA);
        }
        throw new NoWhenBranchMatchedException();
    }
}
