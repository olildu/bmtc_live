package app.chalo.usercommutepreference.data.models.app;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/DeleteRideResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteRideResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10244a;

    public DeleteRideResponseAppModel(boolean z) {
        this.f10244a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteRideResponseAppModel) && this.f10244a == ((DeleteRideResponseAppModel) obj).f10244a;
    }

    public final int hashCode() {
        return this.f10244a ? 1231 : 1237;
    }

    public final String toString() {
        return cb0.k("DeleteRideResponseAppModel(success=", ")", this.f10244a);
    }
}
