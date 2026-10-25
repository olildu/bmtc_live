package app.chalo.usercommutepreference.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceDetailsAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceStopPlaceAppModel f10248a;
    public final UserCommutePreferenceStopPlaceAppModel b;
    public final UserCommutePreferenceTimingAppModel c;
    public final UserCommutePreferenceTimingAppModel d;
    public final String e;

    public UserCommutePreferenceDetailsAppModel(UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel, UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel2, UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel, UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel2, String str) {
        this.f10248a = userCommutePreferenceStopPlaceAppModel;
        this.b = userCommutePreferenceStopPlaceAppModel2;
        this.c = userCommutePreferenceTimingAppModel;
        this.d = userCommutePreferenceTimingAppModel2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceDetailsAppModel)) {
            return false;
        }
        UserCommutePreferenceDetailsAppModel userCommutePreferenceDetailsAppModel = (UserCommutePreferenceDetailsAppModel) obj;
        return Intrinsics.d(this.f10248a, userCommutePreferenceDetailsAppModel.f10248a) && Intrinsics.d(this.b, userCommutePreferenceDetailsAppModel.b) && Intrinsics.d(this.c, userCommutePreferenceDetailsAppModel.c) && Intrinsics.d(this.d, userCommutePreferenceDetailsAppModel.d) && Intrinsics.d(this.e, userCommutePreferenceDetailsAppModel.e);
    }

    public final int hashCode() {
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel = this.f10248a;
        int iHashCode = (userCommutePreferenceStopPlaceAppModel == null ? 0 : userCommutePreferenceStopPlaceAppModel.hashCode()) * 31;
        UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel2 = this.b;
        int iHashCode2 = (iHashCode + (userCommutePreferenceStopPlaceAppModel2 == null ? 0 : userCommutePreferenceStopPlaceAppModel2.hashCode())) * 31;
        UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel = this.c;
        int iHashCode3 = (iHashCode2 + (userCommutePreferenceTimingAppModel == null ? 0 : userCommutePreferenceTimingAppModel.hashCode())) * 31;
        UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel2 = this.d;
        int iHashCode4 = (iHashCode3 + (userCommutePreferenceTimingAppModel2 == null ? 0 : userCommutePreferenceTimingAppModel2.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCommutePreferenceDetailsAppModel(origin=");
        sb.append(this.f10248a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", originTiming=");
        sb.append(this.c);
        sb.append(", destinationTiming=");
        sb.append(this.d);
        sb.append(", frequency=");
        return vo1.p(sb, this.e, ")");
    }
}
