package app.chalo.onboarding.cityprovider;

import defpackage.dd;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/IncompleteCityChangeOperations;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IncompleteCityChangeOperations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6611a;
    public final String b;
    public final List c;

    public IncompleteCityChangeOperations(String str, String str2, List incompleteOperations) {
        Intrinsics.i(incompleteOperations, "incompleteOperations");
        this.f6611a = str;
        this.b = str2;
        this.c = incompleteOperations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompleteCityChangeOperations)) {
            return false;
        }
        IncompleteCityChangeOperations incompleteCityChangeOperations = (IncompleteCityChangeOperations) obj;
        return Intrinsics.d(this.f6611a, incompleteCityChangeOperations.f6611a) && Intrinsics.d(this.b, incompleteCityChangeOperations.b) && Intrinsics.d(this.c, incompleteCityChangeOperations.c);
    }

    public final int hashCode() {
        String str = this.f6611a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return xs.l(dd.e("IncompleteCityChangeOperations(fromCity=", this.f6611a, ", toCity=", this.b, ", incompleteOperations="), this.c, ")");
    }
}
