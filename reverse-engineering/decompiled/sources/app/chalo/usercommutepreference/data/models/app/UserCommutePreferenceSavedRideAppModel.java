package app.chalo.usercommutepreference.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceSavedRideAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceSavedRideAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10252a;
    public final UserCommutePreferencePlaceLocationAppModel b;
    public final UserCommutePreferencePlaceLocationAppModel c;
    public final long d;

    public UserCommutePreferenceSavedRideAppModel(String id, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2, long j) {
        Intrinsics.i(id, "id");
        this.f10252a = id;
        this.b = userCommutePreferencePlaceLocationAppModel;
        this.c = userCommutePreferencePlaceLocationAppModel2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceSavedRideAppModel)) {
            return false;
        }
        UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel = (UserCommutePreferenceSavedRideAppModel) obj;
        return Intrinsics.d(this.f10252a, userCommutePreferenceSavedRideAppModel.f10252a) && Intrinsics.d(this.b, userCommutePreferenceSavedRideAppModel.b) && Intrinsics.d(this.c, userCommutePreferenceSavedRideAppModel.c) && this.d == userCommutePreferenceSavedRideAppModel.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f10252a.hashCode() * 31)) * 31)) * 31;
        long j = this.d;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "UserCommutePreferenceSavedRideAppModel(id=" + this.f10252a + ", origin=" + this.b + ", destination=" + this.c + ", time=" + this.d + ")";
    }
}
