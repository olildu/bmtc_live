package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/EnlargeProofImageSerializable;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EnlargeProofImageSerializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8458a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/EnlargeProofImageSerializable$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/EnlargeProofImageSerializable;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EnlargeProofImageSerializable> serializer() {
            return EnlargeProofImageSerializable$$serializer.f8459a;
        }
    }

    public /* synthetic */ EnlargeProofImageSerializable(int i, String str) {
        if (1 == (i & 1)) {
            this.f8458a = str;
        } else {
            PluginExceptionsKt.b(EnlargeProofImageSerializable$$serializer.f8459a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EnlargeProofImageSerializable) && Intrinsics.d(this.f8458a, ((EnlargeProofImageSerializable) obj).f8458a);
    }

    public final int hashCode() {
        String str = this.f8458a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return vo1.B("EnlargeProofImageSerializable(url=", this.f8458a, ")");
    }

    public EnlargeProofImageSerializable(String str) {
        this.f8458a = str;
    }
}
