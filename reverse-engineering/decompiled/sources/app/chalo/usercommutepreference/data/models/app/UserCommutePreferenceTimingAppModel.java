package app.chalo.usercommutepreference.data.models.app;

import defpackage.i71;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceTimingAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCommutePreferenceTimingAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10254a;
    public final long b;

    public UserCommutePreferenceTimingAppModel(long j, long j2) {
        this.f10254a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommutePreferenceTimingAppModel)) {
            return false;
        }
        UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel = (UserCommutePreferenceTimingAppModel) obj;
        return this.f10254a == userCommutePreferenceTimingAppModel.f10254a && this.b == userCommutePreferenceTimingAppModel.b;
    }

    public final int hashCode() {
        long j = this.f10254a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return uf0.m(this.b, ")", i71.g(this.f10254a, "UserCommutePreferenceTimingAppModel(time=", ", variation="));
    }
}
