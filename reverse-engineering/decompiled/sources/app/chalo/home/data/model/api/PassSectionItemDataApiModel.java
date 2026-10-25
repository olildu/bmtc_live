package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/PassSectionItemDataApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassSectionItemDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2896a;
    public final String b;
    public final String c;
    public final int d;
    public final ItemTextDataApiModel e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/PassSectionItemDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/PassSectionItemDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassSectionItemDataApiModel> serializer() {
            return PassSectionItemDataApiModel$$serializer.f2897a;
        }
    }

    public /* synthetic */ PassSectionItemDataApiModel(int i, String str, String str2, String str3, int i2, ItemTextDataApiModel itemTextDataApiModel, String str4) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.b(PassSectionItemDataApiModel$$serializer.f2897a.getDescriptor(), i, 9);
            throw null;
        }
        this.f2896a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = itemTextDataApiModel;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSectionItemDataApiModel)) {
            return false;
        }
        PassSectionItemDataApiModel passSectionItemDataApiModel = (PassSectionItemDataApiModel) obj;
        return Intrinsics.d(this.f2896a, passSectionItemDataApiModel.f2896a) && Intrinsics.d(this.b, passSectionItemDataApiModel.b) && Intrinsics.d(this.c, passSectionItemDataApiModel.c) && this.d == passSectionItemDataApiModel.d && Intrinsics.d(this.e, passSectionItemDataApiModel.e) && Intrinsics.d(this.f, passSectionItemDataApiModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f2896a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31;
        ItemTextDataApiModel itemTextDataApiModel = this.e;
        int iHashCode4 = (iHashCode3 + (itemTextDataApiModel == null ? 0 : itemTextDataApiModel.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassSectionItemDataApiModel(productConfigId=", this.f2896a, ", itemBgColor=", this.b, ", itemImageUrl=");
        cb0.o(this.d, this.c, ", position=", ", itemTextData=", sbE);
        sbE.append(this.e);
        sbE.append(", itemFallbackImage=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
