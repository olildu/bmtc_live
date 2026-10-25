package app.chalo.productbooking.common.data.models.api.response;

import defpackage.vo1;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonNames;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class ProductConfigDisplayPropsApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0 implements JsonNames {
    public final /* synthetic */ String[] b;

    public ProductConfigDisplayPropsApiResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(String[] strArr) {
        this.b = strArr;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return JsonNames.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof JsonNames) && Arrays.equals(this.b, ((JsonNames) obj).names());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ 397397176;
    }

    @Override // kotlinx.serialization.json.JsonNames
    public final /* synthetic */ String[] names() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return vo1.B("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.b), ")");
    }
}
