package app.chalo.checkout.data.model.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/InaiInstalledUpiAppDetailApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InaiInstalledUpiAppDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalledUpiApps f1282a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/InaiInstalledUpiAppDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/InaiInstalledUpiAppDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InaiInstalledUpiAppDetailApiModel> serializer() {
            return InaiInstalledUpiAppDetailApiModel$$serializer.f1283a;
        }
    }

    public /* synthetic */ InaiInstalledUpiAppDetailApiModel(int i, InstalledUpiApps installedUpiApps) {
        if (1 == (i & 1)) {
            this.f1282a = installedUpiApps;
        } else {
            PluginExceptionsKt.b(InaiInstalledUpiAppDetailApiModel$$serializer.f1283a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InaiInstalledUpiAppDetailApiModel) && Intrinsics.d(this.f1282a, ((InaiInstalledUpiAppDetailApiModel) obj).f1282a);
    }

    public final int hashCode() {
        return this.f1282a.f1284a.hashCode();
    }

    public final String toString() {
        return "InaiInstalledUpiAppDetailApiModel(response=" + this.f1282a + ")";
    }
}
