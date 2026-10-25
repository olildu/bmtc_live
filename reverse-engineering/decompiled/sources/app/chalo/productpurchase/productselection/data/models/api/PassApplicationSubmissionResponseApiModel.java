package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassApplicationSubmissionResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8589a;
    public final JsonElement b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassApplicationSubmissionResponseApiModel> serializer() {
            return PassApplicationSubmissionResponseApiModel$$serializer.f8590a;
        }
    }

    public /* synthetic */ PassApplicationSubmissionResponseApiModel(int i, String str, JsonElement jsonElement, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PassApplicationSubmissionResponseApiModel$$serializer.f8590a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8589a = str;
        this.b = jsonElement;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassApplicationSubmissionResponseApiModel)) {
            return false;
        }
        PassApplicationSubmissionResponseApiModel passApplicationSubmissionResponseApiModel = (PassApplicationSubmissionResponseApiModel) obj;
        return Intrinsics.d(this.f8589a, passApplicationSubmissionResponseApiModel.f8589a) && Intrinsics.d(this.b, passApplicationSubmissionResponseApiModel.b) && Intrinsics.d(this.c, passApplicationSubmissionResponseApiModel.c);
    }

    public final int hashCode() {
        String str = this.f8589a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JsonElement jsonElement = this.b;
        int iHashCode2 = (iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassApplicationSubmissionResponseApiModel(status=");
        sb.append(this.f8589a);
        sb.append(", userProfile=");
        sb.append(this.b);
        sb.append(", message=");
        return vo1.p(sb, this.c, ")");
    }
}
