package app.chalo.productbooking.common.data.models.local;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/local/ProductProofUploadDocumentPropsIdentifier;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductProofUploadDocumentPropsIdentifier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8249a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/productbooking/common/data/models/local/ProductProofUploadDocumentPropsIdentifier$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/local/ProductProofUploadDocumentPropsIdentifier;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "IDENTIFIER_STR_DELIMINATOR", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductProofUploadDocumentPropsIdentifier> serializer() {
            return ProductProofUploadDocumentPropsIdentifier$$serializer.f8250a;
        }
    }

    public /* synthetic */ ProductProofUploadDocumentPropsIdentifier(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ProductProofUploadDocumentPropsIdentifier$$serializer.f8250a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8249a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductProofUploadDocumentPropsIdentifier)) {
            return false;
        }
        ProductProofUploadDocumentPropsIdentifier productProofUploadDocumentPropsIdentifier = (ProductProofUploadDocumentPropsIdentifier) obj;
        return Intrinsics.d(this.f8249a, productProofUploadDocumentPropsIdentifier.f8249a) && Intrinsics.d(this.b, productProofUploadDocumentPropsIdentifier.b) && Intrinsics.d(this.c, productProofUploadDocumentPropsIdentifier.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f8249a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("ProductProofUploadDocumentPropsIdentifier(city=", this.f8249a, ", agency=", this.b, ", documentid="), this.c, ")");
    }
}
