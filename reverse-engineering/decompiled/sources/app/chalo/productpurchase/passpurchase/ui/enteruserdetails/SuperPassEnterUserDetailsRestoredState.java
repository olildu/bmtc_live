package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.userprofile.Gender;
import defpackage.nf1;
import defpackage.tf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassEnterUserDetailsRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8421a;
    public final Gender b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final SuperPassBasicUserPurpose f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassEnterUserDetailsRestoredState> serializer() {
            return SuperPassEnterUserDetailsRestoredState$$serializer.f8422a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new tf1(0)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new tf1(1))};
    }

    public /* synthetic */ SuperPassEnterUserDetailsRestoredState(int i, String str, Gender gender, Long l, Long l2, boolean z, SuperPassBasicUserPurpose superPassBasicUserPurpose) {
        this.f8421a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = Gender.MALE;
        } else {
            this.b = gender;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = SuperPassBasicUserPurpose.COMPLETE_DETAILS;
        } else {
            this.f = superPassBasicUserPurpose;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassEnterUserDetailsRestoredState)) {
            return false;
        }
        SuperPassEnterUserDetailsRestoredState superPassEnterUserDetailsRestoredState = (SuperPassEnterUserDetailsRestoredState) obj;
        return Intrinsics.d(this.f8421a, superPassEnterUserDetailsRestoredState.f8421a) && this.b == superPassEnterUserDetailsRestoredState.b && Intrinsics.d(this.c, superPassEnterUserDetailsRestoredState.c) && Intrinsics.d(this.d, superPassEnterUserDetailsRestoredState.d) && this.e == superPassEnterUserDetailsRestoredState.e && this.f == superPassEnterUserDetailsRestoredState.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8421a.hashCode() * 31)) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return this.f.hashCode() + ((((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassEnterUserDetailsRestoredState(fullName=");
        sb.append(this.f8421a);
        sb.append(", gender=");
        sb.append(this.b);
        sb.append(", dobInMillis=");
        nf1.w(sb, this.c, ", passStartTime=", this.d, ", areAllRequiredFieldsSet=");
        sb.append(this.e);
        sb.append(", superPassBasicUserPurpose=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public SuperPassEnterUserDetailsRestoredState(String fullName, Gender gender, Long l, Long l2, boolean z, SuperPassBasicUserPurpose superPassBasicUserPurpose) {
        Intrinsics.i(fullName, "fullName");
        Intrinsics.i(gender, "gender");
        Intrinsics.i(superPassBasicUserPurpose, "superPassBasicUserPurpose");
        this.f8421a = fullName;
        this.b = gender;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = superPassBasicUserPurpose;
    }
}
