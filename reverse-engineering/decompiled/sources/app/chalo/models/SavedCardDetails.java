package app.chalo.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/SavedCardDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SavedCardDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5598a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/SavedCardDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/SavedCardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SavedCardDetails> serializer() {
            return SavedCardDetails$$serializer.f5599a;
        }
    }

    public /* synthetic */ SavedCardDetails(int i, String str, String str2, String str3, String str4, int i2, int i3, boolean z, String str5) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(SavedCardDetails$$serializer.f5599a.getDescriptor(), i, 255);
            throw null;
        }
        this.f5598a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedCardDetails)) {
            return false;
        }
        SavedCardDetails savedCardDetails = (SavedCardDetails) obj;
        return Intrinsics.d(this.f5598a, savedCardDetails.f5598a) && Intrinsics.d(this.b, savedCardDetails.b) && Intrinsics.d(this.c, savedCardDetails.c) && Intrinsics.d(this.d, savedCardDetails.d) && this.e == savedCardDetails.e && this.f == savedCardDetails.f && this.g == savedCardDetails.g && Intrinsics.d(this.h, savedCardDetails.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((((((nf1.e(nf1.e(nf1.e(this.f5598a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + this.e) * 31) + this.f) * 31) + (this.g ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SavedCardDetails(entity=", this.f5598a, ", name=", this.b, ", lastFourDigits=");
        cb0.t(sbE, this.c, ", network=", this.d, ", expiryMonth=");
        hq0.p(this.e, this.f, ", expiryYear=", ", isOnEmi=", sbE);
        sbE.append(this.g);
        sbE.append(", issuer=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
