package app.chalo.usercommutepreference.data.models.app;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceStopPlaceAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceStopPlaceAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10253a;
    public final UserCommutePreferenceTag b;
    public final String c;
    public final UserCommutePreferencePlaceLocationAppModel d;

    public UserCommutePreferenceStopPlaceAppModel(String id, UserCommutePreferenceTag tag, String label, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel) {
        Intrinsics.i(id, "id");
        Intrinsics.i(tag, "tag");
        Intrinsics.i(label, "label");
        this.f10253a = id;
        this.b = tag;
        this.c = label;
        this.d = userCommutePreferencePlaceLocationAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceStopPlaceAppModel)) {
            return false;
        }
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel = (UserCommutePreferenceStopPlaceAppModel) obj;
        return Intrinsics.d(this.f10253a, userCommutePreferenceStopPlaceAppModel.f10253a) && this.b == userCommutePreferenceStopPlaceAppModel.b && Intrinsics.d(this.c, userCommutePreferenceStopPlaceAppModel.c) && Intrinsics.d(this.d, userCommutePreferenceStopPlaceAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e((this.b.hashCode() + (this.f10253a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "UserCommutePreferenceStopPlaceAppModel(id=" + this.f10253a + ", tag=" + this.b + ", label=" + this.c + ", stopPlaceModel=" + this.d + ")";
    }
}
