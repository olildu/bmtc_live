package app.chalo.userprofile;

import defpackage.uf0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ProfileCompletenessResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileCompletenessResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10304a;
    public final int b;
    public final Set c;

    public ProfileCompletenessResult(int i, int i2, Set set) {
        this.f10304a = i;
        this.b = i2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCompletenessResult)) {
            return false;
        }
        ProfileCompletenessResult profileCompletenessResult = (ProfileCompletenessResult) obj;
        return this.f10304a == profileCompletenessResult.f10304a && this.b == profileCompletenessResult.b && Intrinsics.d(this.c, profileCompletenessResult.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f10304a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f10304a, this.b, "ProfileCompletenessResult(completedCount=", ", totalCount=", ", missingFields=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
