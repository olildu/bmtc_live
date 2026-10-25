package app.chalo.instantticket.data.model;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketPassengerDetailsEntity;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketPassengerDetailsEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3841a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final Integer f;
    public final Boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketPassengerDetailsEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/InstantTicketPassengerDetailsEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketPassengerDetailsEntity> serializer() {
            return InstantTicketPassengerDetailsEntity$$serializer.f3842a;
        }
    }

    public /* synthetic */ InstantTicketPassengerDetailsEntity(int i, String str, String str2, int i2, long j, long j2, Integer num, Boolean bool) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(InstantTicketPassengerDetailsEntity$$serializer.f3842a.getDescriptor(), i, 127);
            throw null;
        }
        this.f3841a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = num;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketPassengerDetailsEntity)) {
            return false;
        }
        InstantTicketPassengerDetailsEntity instantTicketPassengerDetailsEntity = (InstantTicketPassengerDetailsEntity) obj;
        return Intrinsics.d(this.f3841a, instantTicketPassengerDetailsEntity.f3841a) && Intrinsics.d(this.b, instantTicketPassengerDetailsEntity.b) && this.c == instantTicketPassengerDetailsEntity.c && this.d == instantTicketPassengerDetailsEntity.d && this.e == instantTicketPassengerDetailsEntity.e && Intrinsics.d(this.f, instantTicketPassengerDetailsEntity.f) && Intrinsics.d(this.g, instantTicketPassengerDetailsEntity.g);
    }

    public final int hashCode() {
        int iE = (nf1.e(this.f3841a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.f;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketPassengerDetailsEntity(id=", this.f3841a, ", name=", this.b, ", count=");
        sbE.append(this.c);
        sbE.append(", actualAmount=");
        sbE.append(this.d);
        xs.r(this.e, ", payableAmount=", ", discountPercentage=", sbE);
        sbE.append(this.f);
        sbE.append(", isDiscountApplicable=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }

    public InstantTicketPassengerDetailsEntity(String id, String name, int i, long j, long j2, Integer num, Boolean bool) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        this.f3841a = id;
        this.b = name;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = num;
        this.g = bool;
    }
}
