package app.chalo.home.data.model.app.response;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/CheckAppUpdateResponseAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckAppUpdateResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2957a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/CheckAppUpdateResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/CheckAppUpdateResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckAppUpdateResponseAppModel> serializer() {
            return CheckAppUpdateResponseAppModel$$serializer.f2958a;
        }
    }

    public /* synthetic */ CheckAppUpdateResponseAppModel(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.f2957a = false;
        } else {
            this.f2957a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAppUpdateResponseAppModel)) {
            return false;
        }
        CheckAppUpdateResponseAppModel checkAppUpdateResponseAppModel = (CheckAppUpdateResponseAppModel) obj;
        return this.f2957a == checkAppUpdateResponseAppModel.f2957a && this.b == checkAppUpdateResponseAppModel.b;
    }

    public final int hashCode() {
        return ((this.f2957a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "CheckAppUpdateResponseAppModel(forceUpdate=" + this.f2957a + ", recommendedUpdate=" + this.b + ")";
    }

    public CheckAppUpdateResponseAppModel(boolean z, boolean z2) {
        this.f2957a = z;
        this.b = z2;
    }
}
