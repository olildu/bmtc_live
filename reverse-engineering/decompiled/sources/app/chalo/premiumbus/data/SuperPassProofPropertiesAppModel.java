package app.chalo.premiumbus.data;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassProofPropertiesAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProofPropertiesAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6965a;
    public final String b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassProofPropertiesAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/SuperPassProofPropertiesAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProofPropertiesAppModel> serializer() {
            return SuperPassProofPropertiesAppModel$$serializer.f6966a;
        }
    }

    public /* synthetic */ SuperPassProofPropertiesAppModel(long j, String str, String str2, int i) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(SuperPassProofPropertiesAppModel$$serializer.f6966a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6965a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofPropertiesAppModel)) {
            return false;
        }
        SuperPassProofPropertiesAppModel superPassProofPropertiesAppModel = (SuperPassProofPropertiesAppModel) obj;
        return Intrinsics.d(this.f6965a, superPassProofPropertiesAppModel.f6965a) && Intrinsics.d(this.b, superPassProofPropertiesAppModel.b) && this.c == superPassProofPropertiesAppModel.c;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6965a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return uf0.m(this.c, ")", dd.e("SuperPassProofPropertiesAppModel(proofName=", this.f6965a, ", proofUrl=", this.b, ", proofExpiryTime="));
    }

    public SuperPassProofPropertiesAppModel(String proofName, String proofUrl, long j) {
        Intrinsics.i(proofName, "proofName");
        Intrinsics.i(proofUrl, "proofUrl");
        this.f6965a = proofName;
        this.b = proofUrl;
        this.c = j;
    }
}
