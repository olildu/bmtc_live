package app.chalo.usercommutepreference.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/CreateRideResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreateRideResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10242a;
    public final String b;

    public CreateRideResponseAppModel(boolean z, String str) {
        this.f10242a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateRideResponseAppModel)) {
            return false;
        }
        CreateRideResponseAppModel createRideResponseAppModel = (CreateRideResponseAppModel) obj;
        return this.f10242a == createRideResponseAppModel.f10242a && Intrinsics.d(this.b, createRideResponseAppModel.b);
    }

    public final int hashCode() {
        int i = (this.f10242a ? 1231 : 1237) * 31;
        String str = this.b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CreateRideResponseAppModel(success=" + this.f10242a + ", rideId=" + this.b + ")";
    }
}
