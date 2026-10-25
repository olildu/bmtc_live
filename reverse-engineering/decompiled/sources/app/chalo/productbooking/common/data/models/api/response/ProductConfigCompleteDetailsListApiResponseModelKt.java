package app.chalo.productbooking.common.data.models.api.response;

import defpackage.cb0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductConfigCompleteDetailsListApiResponseModelKt {
    public static final String a(ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel) {
        String str;
        String str2;
        Intrinsics.i(productConfigDocumentPropsApiResponseModel, "<this>");
        String str3 = productConfigDocumentPropsApiResponseModel.f8159a;
        if (str3 == null || (str = productConfigDocumentPropsApiResponseModel.b) == null || (str2 = productConfigDocumentPropsApiResponseModel.c) == null) {
            return null;
        }
        ProductConfigDocumentPropsApiResponseModel.INSTANCE.getClass();
        return ProductConfigDocumentPropsApiResponseModel.Companion.a(str3, str, str2);
    }

    public static final String b(ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = productConfigDocumentPropsApiResponseModel.c;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        ProductConfigDocumentPropInfoApiResponseModel productConfigDocumentPropInfoApiResponseModel = productConfigDocumentPropsApiResponseModel.d;
        if (productConfigDocumentPropInfoApiResponseModel == null || (str = productConfigDocumentPropInfoApiResponseModel.f8157a) == null) {
            str = "";
        }
        if (productConfigDocumentPropInfoApiResponseModel == null || (str2 = productConfigDocumentPropInfoApiResponseModel.e) == null) {
            str2 = "";
        }
        if (productConfigDocumentPropInfoApiResponseModel == null || (str3 = productConfigDocumentPropInfoApiResponseModel.c) == null) {
            str3 = "";
        }
        if (productConfigDocumentPropInfoApiResponseModel == null || (str4 = productConfigDocumentPropInfoApiResponseModel.g) == null) {
            str4 = "";
        }
        if (productConfigDocumentPropInfoApiResponseModel == null || (str5 = productConfigDocumentPropInfoApiResponseModel.b) == null) {
            str5 = "";
        }
        if (productConfigDocumentPropInfoApiResponseModel != null && (str6 = productConfigDocumentPropInfoApiResponseModel.f) != null) {
            str8 = str6;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str7);
        sb.append("~~~");
        sb.append(str);
        sb.append("~~~");
        sb.append(str2);
        cb0.t(sb, "~~~", str3, "~~~", str4);
        return r30.i(sb, "~~~", str5, "~~~", str8);
    }
}
