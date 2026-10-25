package app.chalo.checkout.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/InstalledUpiDetailApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstalledUpiDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1286a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/InstalledUpiDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/InstalledUpiDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstalledUpiDetailApiModel> serializer() {
            return InstalledUpiDetailApiModel$$serializer.f1287a;
        }
    }

    public /* synthetic */ InstalledUpiDetailApiModel(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(InstalledUpiDetailApiModel$$serializer.f1287a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1286a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledUpiDetailApiModel)) {
            return false;
        }
        InstalledUpiDetailApiModel installedUpiDetailApiModel = (InstalledUpiDetailApiModel) obj;
        return Intrinsics.d(this.f1286a, installedUpiDetailApiModel.f1286a) && Intrinsics.d(this.b, installedUpiDetailApiModel.b) && Intrinsics.d(this.c, installedUpiDetailApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f1286a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("InstalledUpiDetailApiModel(label=", this.f1286a, ", value=", this.b, ", symbolUrl="), this.c, ")");
    }
}
