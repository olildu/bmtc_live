package app.chalo.premiumbus.data.models.productconfig;

import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/productconfig/CategoryApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CategoryApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7146a;
    public final boolean b;
    public final String c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/productconfig/CategoryApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/productconfig/CategoryApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CategoryApiModel> serializer() {
            return CategoryApiModel$$serializer.f7147a;
        }
    }

    public /* synthetic */ CategoryApiModel(int i, String str, boolean z, String str2, int i2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CategoryApiModel$$serializer.f7147a.getDescriptor(), i, 15);
            throw null;
        }
        this.f7146a = str;
        this.b = z;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryApiModel)) {
            return false;
        }
        CategoryApiModel categoryApiModel = (CategoryApiModel) obj;
        return Intrinsics.d(this.f7146a, categoryApiModel.f7146a) && this.b == categoryApiModel.b && Intrinsics.d(this.c, categoryApiModel.c) && this.d == categoryApiModel.d;
    }

    public final int hashCode() {
        return nf1.e(((this.f7146a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c) + this.d;
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("CategoryApiModel(id=", this.f7146a, ", isActive=", ", name=", this.b);
        sbM.append(this.c);
        sbM.append(", pos=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
