package app.chalo.productbooking.common.data.models.local;

import defpackage.cb0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/local/ProductProofDocumentPropsModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductProofDocumentPropsModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8247a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/productbooking/common/data/models/local/ProductProofDocumentPropsModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/local/ProductProofDocumentPropsModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "PROOF_STR_DELIMINATOR", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductProofDocumentPropsModel> serializer() {
            return ProductProofDocumentPropsModel$$serializer.f8248a;
        }
    }

    public /* synthetic */ ProductProofDocumentPropsModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ProductProofDocumentPropsModel$$serializer.f8248a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8247a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductProofDocumentPropsModel)) {
            return false;
        }
        ProductProofDocumentPropsModel productProofDocumentPropsModel = (ProductProofDocumentPropsModel) obj;
        return Intrinsics.d(this.f8247a, productProofDocumentPropsModel.f8247a) && Intrinsics.d(this.b, productProofDocumentPropsModel.b) && Intrinsics.d(this.c, productProofDocumentPropsModel.c) && Intrinsics.d(this.d, productProofDocumentPropsModel.d) && Intrinsics.d(this.e, productProofDocumentPropsModel.e) && Intrinsics.d(this.f, productProofDocumentPropsModel.f) && Intrinsics.d(this.g, productProofDocumentPropsModel.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f8247a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductProofDocumentPropsModel(proofId=", this.f8247a, ", proofName=", this.b, ", shortDescription=");
        cb0.t(sbE, this.c, ", longDescription=", this.d, ", placeHolderImageUrl=");
        cb0.t(sbE, this.e, ", formUrl=", this.f, ", tutorialUrl=");
        return vo1.p(sbE, this.g, ")");
    }
}
