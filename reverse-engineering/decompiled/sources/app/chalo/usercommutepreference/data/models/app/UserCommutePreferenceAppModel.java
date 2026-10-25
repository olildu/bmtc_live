package app.chalo.usercommutepreference.data.models.app;

import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10247a;
    public final UserCommutePreferenceDetailsAppModel b;
    public final List c;

    public UserCommutePreferenceAppModel(List places, UserCommutePreferenceDetailsAppModel userCommutePreferenceDetailsAppModel, List savedRides) {
        Intrinsics.i(places, "places");
        Intrinsics.i(savedRides, "savedRides");
        this.f10247a = places;
        this.b = userCommutePreferenceDetailsAppModel;
        this.c = savedRides;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceAppModel)) {
            return false;
        }
        UserCommutePreferenceAppModel userCommutePreferenceAppModel = (UserCommutePreferenceAppModel) obj;
        return Intrinsics.d(this.f10247a, userCommutePreferenceAppModel.f10247a) && Intrinsics.d(this.b, userCommutePreferenceAppModel.b) && Intrinsics.d(this.c, userCommutePreferenceAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10247a.hashCode() * 31;
        UserCommutePreferenceDetailsAppModel userCommutePreferenceDetailsAppModel = this.b;
        return this.c.hashCode() + ((iHashCode + (userCommutePreferenceDetailsAppModel == null ? 0 : userCommutePreferenceDetailsAppModel.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCommutePreferenceAppModel(places=");
        sb.append(this.f10247a);
        sb.append(", commutePreference=");
        sb.append(this.b);
        sb.append(", savedRides=");
        return xs.l(sb, this.c, ")");
    }
}
